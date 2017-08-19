#!/bin/bash
echo "***************************"
echo "*we will do a deploy soon!*"
echo "***************************"
echo "                           "
echo "                           "

git add $1
git commit -m "$2"
git push -u origin master
