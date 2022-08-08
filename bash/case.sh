#!/bin/bash


echo -e "Enter some character : \c"
read value

#echo input

case $value in
	[a-z] )
		echo "user entered $value and i.e small" ;;
	[A-Z] )
		echo "user entered $value and i.e capital" ;;
	[0-69] )
		echo "user entered $value and i.e 0-69" ;;
	? )
		echo "user entered $value and i.e special character" ;;
	* )
		echo "unknown value" ;;
esac
