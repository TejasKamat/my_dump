#! /bin/bash

echo -e "enter the name of the file : \c" # -e enable \c and \c keeps cursor at same place 
read file_name

if [ -e $file_name ]
then
	echo "$PWD $file_name found"
 else
	echo "$file_name not found"
fi


