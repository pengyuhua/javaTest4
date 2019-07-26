#!/bin/sh
echo -e "开始执行build.sh \n"
echo 'web程序环境搭建准备中...'
echo '开始构建数据库环境。。。'
pwd
docker build -t mysql_pyh:v2 ./docker/mysql/
echo '数据库镜像打包完成!'
echo "当前目录：  \n"
pwd
echo "打包Springboot项目中... "
#使用mvn 打包springboot项目
mvn clean package
echo "项目打包完成! 复制文件中："
#强制移动文件不提示
cp -f -p Exam1/target/SpringbootApp.jar docker/java/
echo "查看文件,当前目录:"
cd docker/java/
pwd
ls -l
echo '打包Springboot项目完成!'

