#! /bin/bash

echo -e "Enter the name of the file : \c" # -e enable \c and \c keeps cu>
read file_name

if [ -f $file_name ]
then
	if [ -w $file_name ]
	then
		echo "Type some text data. To quit press ctrl + d"
		cat >> $file_name
	else
		echo "File dont have write permission"
		read -p "Would you like to give write permission : Y/n " USER_INPUT
	fi
	if [ "$USER_INPUT" = "Y" ]
	then
		chmod +w $file_name
		echo "Type some text data. To quit press ctrl + d"
		cat >> $file_name
	fi
        echo "$PWD $file_name found"
 else
        echo "$file_name not found"
fi
