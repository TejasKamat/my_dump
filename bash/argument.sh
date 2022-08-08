#! /usr/bin/bash
echo $0 $1 $2 $3 ' > echo $1 $2 $3'

rom=("$@")
echo ${rom[0]} ${rom[1]} ${rom[2]}
echo $@ #print all arguments
echo $# # print the number of total arguments
