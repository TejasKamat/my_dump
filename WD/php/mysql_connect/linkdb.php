<?php

	// connection 
	$connection = mysqli_connect("localhost", "root", "", "tejas");
	if($connection) {
		echo "connection successful <br>";
	} else {
		die("connection failed : " . mysql_connect_error());
	}
	
	
	/*
	$sql = "DROP DATABASE myDB";
	if (mysqli_query($connection, $sql)) {
		echo "<br> Database dropped successfully";
	} else {
		echo "Error creating database: " . mysqli_error($conn);
	}

	if (mysqli_num_rows($result) > 0) {

		while($row = mysqli_fetch_assoc($result)) {
			echo "Id: " . $row["customer_id"]. "<br> Phone: " . $row["customer_mobile_number"]. " Customer dob" . $row["customer_DOB"]. "<br>";
		}
	} else {
		echo "0 results";
	}
	*/
	$sql = "SELECT * FROM rvs";
	$result = mysqli_query($connection, $sql);
	echo "<table align='center' height='60%' width='60%' border='1'><tr><th>Customer_id</th><th>DOB</th></tr>";

	while($row = mysqli_fetch_array($result)) {
		echo "<tr><td align='center'>" . $row['customer_id'] . "</td>" . "<td align='center'>" . $row['customer_DOB'] . "</td>";
	}
	echo "/<table>";
	
	
	
	
	
	
	mysqli_close($connection);
?>
