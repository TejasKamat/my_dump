<html>
	<head>
		<title>Substitution Encryption</title>
	</head>
	<h1>Encryption</h1>
<body>
<?php
function shiftLetters($word, $shift) 
{
    $shiftedWord = "";
    
    for ($i = 0; $i < strlen($word); $i++) 
	{
        $ch = $word[$i];
        $shifted = chr(ord($ch) + $shift);
        $shiftedWord .= $shifted;
    }
    
    return $shiftedWord;
}

$word = "MEVAN FERNANDES";
$shift = 3;

$shiftedWord = shiftLetters($word, $shift);

echo "Plain Text: " . $word;
echo "<br>";
echo("Cipher Text: " . $shiftedWord);
echo "<br>";
echo "Key:3";
?>
</body>
</html>
