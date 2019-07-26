#!/bin/bas
echo 'sql脚本执行shell工作中...'
echo 'sql do'
mysql -uroot -proot <<EOF
source $WORK_PATH/$INSTALL_DB_SQL_O1;
source $WORK_PATH/$INSTALL_DB_SQL_O2;
EOF
echo 'sql脚本文件执行结束'
