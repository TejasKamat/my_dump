<html>
<head>
<title>EXOR</title>
</head>
<body>
    <h1> exor </H1>
<?php
function xor_encrypt($data, $key) 
{
    $keyLen = strlen($key);
    $dataLen = strlen($data);
    $encryptedData = '';

    for ($i = 0; $i < $dataLen; $i++) 
	{
        $encryptedData .= $data[$i] ^ $key[$i % $keyLen];
    }

    return $encryptedData;
}
$data = "Hello";
$key = "H";
$encryptedData = xor_encrypt($data, $key);
echo "Plain Text: " . $data . PHP_EOL;
echo"<br>";
echo "Encrypted data: " . bin2hex($encryptedData) . PHP_EOL;
?>
</body>
</html>
