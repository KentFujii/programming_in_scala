#!/bin/bash

docker pull hseeberger/scala-sbt
cd `dirname $0`
PROJECT_LIST=`ls -d */`
select PROJECT in $PROJECT_LIST exit
do
  if [ $PROJECT = "exit" ]; then
    exit
  fi
  break
done
docker run -it -v=$(pwd):/root hseeberger/scala-sbt bash -c "cd $PROJECT && sbt"
