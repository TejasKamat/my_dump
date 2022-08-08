#! /bin/bash

echo 1+1
n1=1
n2=69

echo $(( $n1 + $n2 ))
echo $(expr $n1 \* $n2) # expr used for integers and * needs / to  execute
