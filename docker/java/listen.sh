#!/bin/bash
while ! nc -z ${MYSQL_IP} ${MYSQL_PORT} ; do
    echo "mysql服务正在监听...地址:${MYSQL_IP} 端口:${MYSQL_PORT}";
    nc -z -v ${MYSQL_IP} ${MYSQL_PORT}
    sleep 1;
done 
echo 'mysql启动完成...'
echo '开始启动web应用程序...'
java -jar ${work_dir}/app.jar
echo '启动web应用程序完成...'

