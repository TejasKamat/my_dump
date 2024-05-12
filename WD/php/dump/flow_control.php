<html>
<head><title>Flow Control</title></head>

<body>
	<h1 style="text-align: center;">Flow Control Statements</h1>
	<?php
		$temp = 30;
		if ($temp <= 20) {
			echo "Its cold", "<br>";
		} else if ($temp <= 30) {
			echo "Its mild", "<br>";
		} else if ($temp <= 40) {
			echo "Its warm", "<br>";
		} else if ($temp <= 50) {
			echo "Its hot", "<br>";
		} else if ($temp <= 60) {
			echo "Its very hot", "<br>";
		} else {
			echo "Invalid";
		}
		
		$num = 20;
		if ($num > 0) {
			if ($num % 2 == 0) {
				echo "The number is even...!!";
			}
		} else {
			echo "The number is negative..!";
		}
		
		?>
</body>
</html>