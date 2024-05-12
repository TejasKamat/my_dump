<?php
$x = TRUE;
$y = FALSE;

if($x) {
	function normalFunc() {
		echo "This is normal function <br>";
		conditionalFunc();
	}
	$y = TRUE;
}
if($y) {
	function conditionalFunc() {
		echo "This is conditional function <br>";
	}
}
function calculateFactorial($startNumber) {
	$fact = 1;
	for($i = 1; $i <= $startNumber; $i++) {
		$fact *= $i;
	}
	return $fact;
}

// concept of variable functions
$nom = "normalFunc";
$nom();
// Concept of conditional functions
normalFunc();
// Calculate factorial
echo "The factorial of 5 is : " . calculateFactorial(5);
?>