<html>
<title>Substitution cypher</title>
<body>
<title>Substitution cypher</title>
<?php
function shiftLetters($word, $shift) 
{
    $Ciphertext = "";
    
    $length = strlen($word);
    for ($i = 0; $i < $length; $i++)
		{
        $char = $word[$i];
        
        if (ctype_alpha($char)) 
		{
            $ascii = ord($char);
            $shiftedAscii = ($ascii - 65 + $shift) % 26 + 65;
            $shiftedChar = chr($shiftedAscii);
            $Ciphertext .= $shiftedChar;
        } 
		else 
		{
           $Ciphertext .= $char;
        }
    }
    
    return $Ciphertext;
}

$word = "Computer security";
$shift = 7;

$Ciphertext = shiftLetters($word, $shift);
echo "Plaintext: Sunstitution";
echo "<br>";
echo "key=5";
echo "<br>";
echo "Ciphertext: " .$Ciphertext;
?>
</body>
</html>
