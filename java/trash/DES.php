<html>
    <body>
<?php

function encryptDES($data, $key) {
    $method = 'DES-ECB'; // DES encryption mode (ECB for simplicity, but not recommended for real-world use)
    $options = OPENSSL_RAW_DATA;

    // Perform the encryption
    $encryptedData = openssl_encrypt($data, $method, $key, $options);

    return base64_encode($encryptedData); // Base64 encoding for easy storage and transmission
}

function decryptDES($encryptedData, $key) {
    $method = 'DES-ECB'; // DES encryption mode (ECB for simplicity, but not recommended for real-world use)
    $options = OPENSSL_RAW_DATA;

    // Convert the input from Base64 to binary
    $encryptedData = base64_decode($encryptedData);

    // Perform the decryption
    $decryptedData = openssl_decrypt($encryptedData, $method, $key, $options);

    return $decryptedData;
}

// Example usage:
$plaintext = "Hello, World!";
$key = "secretpassword";

// Encrypt the data
$encryptedText = encryptDES($plaintext, $key);
echo "Encrypted: " . $encryptedText . PHP_EOL;
echo "<br> ";
// Decrypt the data
$decryptedText = decryptDES($encryptedText, $key);
echo "Decrypted: " . $decryptedText . PHP_EOL;
?>
</body>
</html>