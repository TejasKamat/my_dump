#!/usr/bin/bash

function hello () {
  echo "hello how are you bitc**"
}

function print (){
  local name=$1
  echo "The name is $name"
}

name="Tom"

echo "The name is $name : before"

hello #hehe
print MAX

echo "The name is $name : After"
