<html>
	<head><title>hello</title></head>
	
	<body>
		<h1>Implementing math, comparision and logical operators</h1>
		<br>
		
		<?php
		
		$a = 9;
		$b = 2;
		$c = 5;
		
		echo "$a + $b = ", $a + $b, "<br>";
		echo "\$a - \$b = ", $a - $b, "<br>";
		echo "\$a * \$b = ", $a * $b, "<br>";
		echo "\$a / \$b = ", $a / $b, "<br>";
		echo "\$a % \$b = ", $a % $b, "<br>";
		
		if($c < $a && $c < $b) {
			echo "$c is smallest", "<br>";
		} else {
			echo "$c is not smallest", "<br>";
		}
		?>
	</body>
</html>