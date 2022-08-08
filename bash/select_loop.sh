#!/usr/bin/bash

select name in mark tom jerry kuser kaddu
do
  case $name in
    mark )
    echo mark is selected ;;
    tom )
    echo $name is selected ;;
    jerry )
    echo $name is selected ;;
    kuser )
    echo $name is selected ;;
    kaddu )
    echo $name is selected ;;
    *)
    echo kuch nai
  esac
done
