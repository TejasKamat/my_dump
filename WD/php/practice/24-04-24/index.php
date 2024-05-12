<?php
    function addTwoNum($num1, $num2) {
        return $num1 + $num2;
    }
    const a = 5;
    define("hello", "5");
    echo a;
    echo hello;
    echo a + hello;
    $a = [1, 4, 6, 8];
    // string operators, three types of arrays in php = indexed associative multidimensional
    // data types 6 array functions 6 string functions
    // get vs post , while vs do while, php data types
    echo "<br>";
    foreach($a as $value) {
        echo $value . " ";
    }
    echo "<br>";
    
    echo " the sum of two numbers is : " . addTwoNum(2, 6);
    echo "<br>";
    echo "<br>";
    $students = array(
        array("name" => "jhon", "age" => 12),
        array("name" => "Suman", "age" => 19)
    );
    echo "<table border='1' width='50%' height='20%' align='center' style='text-align: center'>";

    echo "<tr><th>Name</th><th>age</th></tr>";

    foreach($students as $student) {
        echo "<tr><td>$student[name]</td> <td>$student[age]</td> </tr>";

    }
    echo "</table>";

    $server = mysqli_connect("localhost", "root", "", "college") or die("couldnt connect");
    echo $server ? "connection successfull <br>" : "connection failed <br>";
    
    // $query = "create table info (Name varchar(100), rollno int)";
    // if(mysqli_query($server, $query)) {
    //     echo "successfully done";
    // } else {
    //     echo "not done";
    // }
        // storing data in 
    // foreach($students as $student) {
    //     $query = "insert into info values('$student[name]', $student[age])";
    //     mysqli_query($server, $query);
    // }
    $query = "select * from info";
    $result = mysqli_query($server, $query);
    echo "<table border='1'><tr><th>Name</th><th>Roll</th></tr>";
    while($row = mysqli_fetch_array($result)) {
        echo "<tr><td>$row[Name]</td><td>$row[rollno]</td></tr>";
    }
    echo "</table>";

    $b = [1, 4, 2,];
    $c = ["hello" => 3, "world" => 4];
    print_r($c);
    print_r($b);
    define("noob", 5);
    printf("%d", noob);
    $x = chr(94);
    echo $x;
?>