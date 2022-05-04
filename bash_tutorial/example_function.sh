#!/usr/bin/bash

function usage () {
  echo "You need to provide a argument"
}

function exists () {
  local file="$1"
  [[ -f "$file" ]] && return 0 || return 1
}

[[ $# -eq 0 ]] && usage

if ( exists "$1" )
then
  echo "$file found!!!"
else
  echo "$file not found"
fi
