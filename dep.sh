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
git commit -m "$2"
git push -u origin master
