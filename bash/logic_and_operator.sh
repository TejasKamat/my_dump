#! /bin/bash

age=25

if [ "$age" -gt 18 ] && [ "$age" -lt 30 ] ## -a can be used instead of "&&"
then
	echo "valid age"
else
	echo "age not valid"
fi

