


<html>
<title>rsa</title>
<body>
<title>rsa</title>
<?php
$publickey = openssl_pkey_get_public("file://publickey.pem");
$privatekey = openssl_pkey_get_private("file://privatekey.pem");
$mytext = "The quick brown fox jumps over the lazy dog";

echo "Before encryption: ".$mytext."<br><br>";

openssl_public_encrypt($mytext, $encrypted, $publickey);
echo "Encrypted data:<br>".$encrypted."<br><br>";

openssl_private_decrypt($encrypted, $decrypted, $privatekey);
echo $decrypted;
?>
</body>
</html>
