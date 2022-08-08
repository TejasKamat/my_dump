#!/usr/bin/bash

xd=50

readonly xd

echo "$xd"

xd=31

echo "$xd"

# functions 
hello() {
	echo "hello"
}
readonly -f hello

hello() {
	echo "fffffffff"

}

