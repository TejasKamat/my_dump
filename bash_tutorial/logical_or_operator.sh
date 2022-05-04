#! /bin/bash

age=50

if [ "$age" -gt 18 ] || [ "$age" -lt 30 ]
then
	echo "valid age"
else
	echo "invalid age"
