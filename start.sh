#!/bin/bash
#echo '执行jar程序中'
#cd spring/target/
#pwd
#java -jar springApp.jar

source ./build.sh

echo "开始构建容器实例"

docker-compose up -d --build


echo "开始执行curl.sh文件"
. ./curl.sh





