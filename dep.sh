#!/bin/bash
echo "                           "
echo "                           "
echo "***************************"
echo "*we will do a deploy soon!*"
echo "***************************"
echo "                           "
echo "                           "
echo S@

git add $1
git commit -m "$2"
git push -u origin master
