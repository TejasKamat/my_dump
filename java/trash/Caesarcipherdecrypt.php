<?php
function caesarDecrypt($cipherText, $shift) {
    $decryptedText = "";
    $cipherText = strtoupper($cipherText); // Convert to uppercase
    
    for ($i = 0; $i < strlen($cipherText); $i++) {
        $char = $cipherText[$i];
        
        if ($char >= 'A' && $char <= 'Z') {
            $decryptedChar = chr(((ord($char) - $shift - 65 + 26) % 26) + 65);
            $decryptedText .= $decryptedChar;
        } else {
            $decryptedText .= $char;
        }
    }
    
    return $decryptedText;
}

$cipherText = "VQREQFGT";
$shift = 2;

$decryptedText = caesarDecrypt($cipherText, $shift);
echo "Decrypted Text: " . $decryptedText;
?>
