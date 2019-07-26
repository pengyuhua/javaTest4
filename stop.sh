#!/bin/bash
echo "stop.sh 正在执行中..."
echo "查看程序运行日志记录:"
docker stop myWebApp
docker stop mysql_hand_test4
echo "查看web应用程序运行记录:"
docker logs -f myWebApp
echo "查看mysql应用程序运行记录:"
docker logs -f mysql_hand_test4

echo "停止容器运行中..."
docker-compose down
echo "容器已停止运行..."
