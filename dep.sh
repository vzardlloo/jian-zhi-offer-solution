#!/bin/bash
echo "                           "
echo "                           "
echo "***************************"
echo "*we will do a deploy soon!*"
echo "***************************"
echo "                           "
echo "                           "
echo "$@"

if ["s2" == ""]
then set "默认提交"


fi

git add "$1"
git commit -m "Add solution"
git push -u origin master
