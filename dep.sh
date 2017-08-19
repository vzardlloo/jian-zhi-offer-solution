#!/bin/bash
echo "we will do a deploy soon!"
git add $1
git commit -m "$2"
git push -u origin master
