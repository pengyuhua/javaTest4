FROM registry.saas.hand-china.com/tools/mysql:5.6

#定义工作目录
ENV WORK_PATH /usr/local/work
#定义宏变量
ENV AUTO_RUN_DIR /docker-entrypoint-initdb.d
#定义shell文件名
ENV INSTALL_DB_SHELL install_db.sh

ENV INSTALL_DB_SQL_O1 sakila-schema.sql
ENV INSTALL_DB_SQL_O2 sakila-data.sql

#容器；内部卷绑定
VOLUME /var/lib/mysql

#复制文件到容器内部
COPY ./$INSTALL_DB_SHELL $AUTO_RUN_DIR/
COPY ./$INSTALL_DB_SQL_O1 $WORK_PATH/
COPY ./$INSTALL_DB_SQL_O2 $WORK_PATH/

RUN chmod a+x $AUTO_RUN_DIR/$INSTALL_DB_SHELL 

# CMD [ "sh", "-c", "/usr/local/work/server.sh" ]



