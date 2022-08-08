#!/bin/bash

os=('ubuntu' 'Windows' 'arch')
os[3]='mac' ## this adds the object in array

unset os[2] # removes the array
echo "${os[@]}"
echo "${os[0]}" # array starts from 0
echo "${!os[@]}" # shows the array order
echo "${#os[0]}"
