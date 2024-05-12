<html>
<head>
<title>Rail-fence technique</title>
</head>
<body>
<?php
function railFenceEncrypt($text, $rails)
{
    $text = str_replace(' ', '', $text);
    $railFence = array();

    for ($i = 0; $i < $rails; $i++) {
        $railFence[$i] = '';
    }

    $dir_down = true;
    $rail = 0;
    for ($i = 0; $i < strlen($text); $i++) {
        $railFence[$rail] .= $text[$i];

        if ($rail == $rails - 1) {
            $dir_down = false;
        } elseif ($rail == 0) {
            $dir_down = true;
        }

        if ($dir_down) {
            $rail++;
        } else {
            $rail--;
        }
    }
    return implode('', $railFence);
}
$textToEncrypt = "Hello";
$numRails = 3;
$encryptedText = railFenceEncrypt($textToEncrypt, $numRails);

echo "Original Text: " . $textToEncrypt . PHP_EOL;
echo"<br>";
echo "Encrypted Text: " . $encryptedText . PHP_EOL;
?>
</body>
</html>
