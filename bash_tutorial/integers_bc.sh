#!/bin/bash

n1=20.5
n2=5

echo "20.5+5" | bc
echo "scale=2;20.5/5" | bc # we need "scale=2;***" becz idk lol just we need it

num1=4

echo "scale=1;sqrt($num1)" | bc -l
