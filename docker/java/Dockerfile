FROM registry.saas.hand-china.com/tools/javabase:0.5.0

WORKDIR /vol/development
ENV work_dir /vol/development

COPY SpringbootApp.jar ${work_dir}/app.jar
COPY listen.sh ${work_dir}/listen.sh

RUN chmod +x ${work_dir}/listen.sh

#监听数据库实例是否启动完成
CMD ["sh", "-c", "${work_dir}/listen.sh"]
