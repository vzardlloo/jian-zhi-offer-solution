#!/bin/bash
echo "                           "
echo "                           "
echo "***************************"
echo "*we will do a deploy soon!*"
echo "***************************"
echo "                           "
echo "                           "
echo "$@"

git add "$1"
git commit -m "Add solution"
git push -u origin master
