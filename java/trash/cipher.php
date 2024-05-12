<html>
<body>
<?php
function shiftLetters($word, $shift) 
{
    $shiftedWord = "";
    
    $length = strlen($word);
    for ($i = 0; $i < $length; $i++)
		{
        $char = $word[$i];
        
        if (ctype_alpha($char)) 
		{
            $ascii = ord($char);
            $shiftedAscii = ($ascii - 65 + $shift) % 26 + 65;
            $shiftedChar = chr($shiftedAscii);
            $shiftedWord .= $shiftedChar;
        } 
		else 
		{
            $shiftedWord .= $char;
        }
    }
    
    return $shiftedWord;
}

$word = "Mevan";
$shift = 3;

$shiftedWord = shiftLetters($word, $shift);
echo "Shifted Word: " . $shiftedWord;
?>
</body>
</html>