<html>
	<body>
		<h2 style="text-align: center">Entered details are</h2>
		<?php
			
			echo "Username : " . $_REQUEST["uname"] . "<br><br>";
			if(strlen($_REQUEST["pass"]) >= 5) {
				echo "Password accepted <br><br>";
			} else {
				echo "Password rejected <br><br>";
			}
			echo "Gender : " . $_REQUEST["gender"] . "<br><br>";
			echo "Semester : " . $_REQUEST["semester"] . "<br><br>";
			$address = $_REQUEST["add"];
			echo "Address : " . str_replace("\n", "<br>", $address) . "<br><br>";
			
			echo "Hobbies : " . "<br>";
			if(isset($_REQUEST["h1"])) {
				echo $_REQUEST["h1"] . "<br>";
			}
			if(isset($_REQUEST["h2"])) {
				echo $_REQUEST["h2"] . "<br>";
			}
			if(isset($_REQUEST["h3"])) {
				echo $_REQUEST["h3"] . "<br>";
			}
			if(isset($_REQUEST["h4"])) {
				echo $_REQUEST["h4"] . "<br>";
			}
		?>
	</body>
</html>