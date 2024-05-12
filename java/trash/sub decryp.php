<html>
	<head>
		<title>Ceasar Cipher</title>
	</head>
<body>
    <h1>Ceasar Cipher  </h1>
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

$word = " ZKDW#DUH#\RX#GRLQJ";
$shift = -3;

$shiftedWord = shiftLetters($word, $shift);
echo "Cipher Text: " . $word;
echo "<br>";
echo("Plain Text: " . $shiftedWord);
echo "<br>";
echo "Key:3";
?>
</body>
</html>
