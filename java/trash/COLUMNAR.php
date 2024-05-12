<html>
    <body>
        <h1>Simple Columnar</h1>
<?php
function encryptColumnarTransposition($plaintext, $keyword) {
    $keyword = strtoupper(str_replace(' ', '', $keyword));
    $keyword = implode('', array_unique(str_split($keyword)));
    $keywordLength = strlen($keyword);

    // Calculate the number of rows needed
    $numRows = ceil(strlen($plaintext) / $keywordLength);

    // Pad the plaintext to fit into a rectangular matrix
    $plaintext = str_pad($plaintext, $numRows * $keywordLength, ' ');

    // Create the transposition matrix
    $matrix = array();
    for ($i = 0; $i < $numRows; $i++) {
        $matrix[] = str_split(substr($plaintext, $i * $keywordLength, $keywordLength));
    }

    // Create the encrypted message by reading the columns based on the keyword order
    $encrypted = '';
    for ($i = 0; $i < $keywordLength; $i++) {
        $colIndex = strpos($keyword, $keyword[$i]);
        for ($j = 0; $j < $numRows; $j++) {
            $encrypted .= $matrix[$j][$colIndex];
        }
    }

    return $encrypted;
}
$plaintext = "HELLOWORLD";
$keyword = "world";

$encryptedMessage = encryptColumnarTransposition($plaintext, $keyword);
echo "Plain text: " . $plaintext;
echo "<br>";
echo "Encrypted Message: " . $encryptedMessage;
?>
</body>
</html>