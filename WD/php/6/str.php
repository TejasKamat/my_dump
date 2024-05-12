<html>
<head><title>HELLO</title></head>
<body>
<?php
	/*
	echo "'No problem' is", strlen("No problem"), " characters long", "<br>";
	echo "The sub string substr('no problem', 3, 7) is : ", substr("no problem", 3, 7), "<br>";
	echo "The word problem is at position : ", strpos("No problem", "problem"), "<br>";
	echo "Replacing 'problem' with 'problems' gives : ", substr_replace("No problem", "problems", 3, 9), "<br>";
	echo "In upper case : ", strtoupper("No problems"), "<br>";
	echo "In lower case : ", strtolower("No problems"), "<br>";
	echo "Reversed string : ", strrev("No problem"), "<br>";
	echo "ASCII value of problem : ", ord("r"), "<br>";
	echo " problems no ", trim(" no problem  "), "<br>";

	Find the length of "hello world"
	Sub string for the same "hello world" 6,5
	Find position of world strpos
	Count how many l are there in hello world (subsrt-count("hello world", "l"))
	Find how to replace world with your name
	Find how to convert to upper case hello world 
	Find how to convert to lower case hello world
	reverse hello world
	count the number of words in "hello! how are you"


	The length of 'hello world' is : 11
	The sub string of substr('hello world', 6, 5) is : world
	The word problem is at position : 6
	The number of 'l' in 'hello world' :3
	Replacing 'world' with 'myname' gives : hello tejas
	In upper case : HELLO WORLD
	In lower case : hello world
	Reversed string : dlrow olleh
	The number of words in 'hello! how are you' are : 4	
	*/

	echo "The length of 'hello world' is : ", strlen("Hello world"), "<br>";
	echo "The sub string of substr('hello world', 6, 5) is : ", substr("hello world", 6, 5), "<br>";
	echo "The word problem is at position : ", strpos("hello world", "world"), "<br>";
	echo "The number of 'l' in 'hello world' : ", substr_count("hello world", "l"), "<br>";
	
	echo "Replacing 'world' with 'myname' gives : ", substr_replace("hello world", "tejas", 6), "<br>";
	echo "In upper case : ", strtoupper("hello world"), "<br>";
	echo "In lower case : ", strtolower("hello world"), "<br>";
	echo "Reversed string : ", strrev("hello world"), "<br>";
	echo "The number of words in 'hello! how are you' are : ", str_word_count("hello! how are you"), "<br>";
?>
</body>
</html>
