<?php
function railFenceEncrypt($plainText, $rails)
{
    $cipherText = '';
    $matrix ;

    // Initialize the matrix with empty values
    for ($i = 0; $i < $rails; $i++) {
        for ($j = 0; $j < strlen($plainText); $j++) {
            $matrix[$i][$j] = '';
        }
    }

    $row = 0;
    $dir = 1; // Direction variable to control the zigzag pattern

    // Place the characters in the matrix following the zigzag pattern
    for ($i = 0; $i < strlen($plainText); $i++) {
        $matrix[$row][$i] = $plainText[$i];

        // Change direction when reaching the top or bottom rails
        if ($row == 0) {
            $dir = 1;
        } elseif ($row == $rails - 1) {
            $dir = -1;
        }

        $row += $dir;
    }

    // Read the ciphered text row by row
    for ($i = 0; $i < $rails; $i++) {
        for ($j = 0; $j < strlen($plainText); $j++) {
            if ($matrix[$i][$j] != '') {
                $cipherText .= $matrix[$i][$j];
            }
        }
    }

    return $cipherText;
}

function railFenceDecrypt($cipherText, $rails)
{
    $plainText = '';
    $matrix ;

    // Initialize the matrix with empty values
    for ($i = 0; $i < $rails; $i++) {
        for ($j = 0; $j < strlen($cipherText); $j++) {
            $matrix[$i][$j] = '';
        }
    }

    $row = 0;
    $dir = 1; // Direction variable to control the zigzag pattern

    // Place the characters in the matrix following the zigzag pattern
    for ($i = 0; $i < strlen($cipherText); $i++) {
        $matrix[$row][$i] = '*'; // Placeholder to mark positions for decryption

        // Change direction when reaching the top or bottom rails
        if ($row == 0) {
            $dir = 1;
        } elseif ($row == $rails - 1) {
            $dir = -1;
        }

        $row += $dir;
    }

    // Fill the matrix with the ciphered text characters
    $index = 0;
    for ($i = 0; $i < $rails; $i++) {
        for ($j = 0; $j < strlen($cipherText); $j++) {
            if ($matrix[$i][$j] == '*') {
                $matrix[$i][$j] = $cipherText[$index++];
            }
        }
    }

    $row = 0;
    $dir = 1; // Direction variable to control the zigzag pattern

    // Read the matrix column by column to get the original message
    for ($i = 0; $i < strlen($cipherText); $i++) {
        $plainText .= $matrix[$row][$i];

        // Change direction when reaching the top or bottom rails
        if ($row == 0) {
            $dir = 1;
        } elseif ($row == $rails - 1) {
            $dir = -1;
        }

        $row += $dir;
    }

    return $plainText;
}

// Example usage:
$plaintext = "ashutosk kunkalienkar.";
$railCount = 3;

$cipher = railFenceEncrypt($plaintext, $railCount);
echo "Encrypted: " . $cipher . "\n";

$decrypted = railFenceDecrypt($cipher, $railCount);
echo "Decrypted: " . $decrypted . "\n";
?>
