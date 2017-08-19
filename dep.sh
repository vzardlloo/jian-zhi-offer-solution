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
git commit -m "$4"
git push -u origin master
