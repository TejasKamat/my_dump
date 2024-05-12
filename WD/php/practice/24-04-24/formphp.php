<?php
    echo "Entered details are : <br>";

    echo "Name : " . $_REQUEST["name"] . "<br>";

    echo $_REQUEST["pass"] ? "Password accepted !" : "Password denied !";
    echo "<br>";

    echo "your locality : " . $_REQUEST["local"] . "<br>";
    if(isset($_REQUEST["gender"])) {
        echo "Gender  : " . $_REQUEST["gender"] . "<br>";
    }
    
    $info = $_REQUEST["perinfo"];

    echo str_replace("\n", "<br>", $info) . "<br>";
    if(isset($_REQUEST["good"])) {
        echo $_REQUEST["good"];
    }
    if(isset($_REQUEST["bad"])) {
        echo $_REQUEST["bad"];
    }
    if(isset($_REQUEST["okay"])) {
        echo $_REQUEST["okay"];
    }
?>