#!/bin/bash
echo "开始执行curl.sh文件"
port=80
#############################################################
#查询网址 http://localhost:18080/v1/films//list?page=1&page_size=3  GET
#添加网址 http://localhost:18080/v1/films/create  POST
#登录网址 http://localhost:18080/v1/customers/login?name=lalla&password=llslsll23  POST

#############################################################
echo "执行film数据添加操作"
curl -X POST \
  http://localhost:${port}/v1/films/create \
  -H 'Accept: */*' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H "Host: localhost:${port}" \
  -H 'Postman-Token: 5e065c0a-4a31-4375-9b7c-a98a06afd9f8,faf94700-c7ef-4f04-a29a-5fae0871d176' \
  -H 'User-Agent: PostmanRuntime/7.15.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache' \
  -H 'content-length: '
#############################################################
echo "执行登录系统操作"
name='pengyuhua'
password='pengyuhua'
echo "用户名:${name} 密码:${password}"
curl -X GET \
  "http://localhost:${port}/v1/customers/login?name=${name}&password=${password}" \
  -H 'Accept: */*' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H "Host: localhost:${port}" \
  -H 'Postman-Token: 8f21ba9d-2a55-4a31-9203-0fb9f4792689,b14bbd6a-f63f-4352-b56f-b13651e8beb6' \
  -H 'User-Agent: PostmanRuntime/7.15.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache'
############################################################
page=3
page_size=5
echo "执行film列表查询操作: 页码: ${page} 每页条数: ${page_size}"
curl -X GET \
  "http://localhost:${port}/v1/films//list?page=${page}&page_size=${page_size}" \
  -H 'Accept: */*' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H "Host: localhost:${port}" \
  -H 'Postman-Token: 81d1146c-5ddf-45ce-87bc-f26c92a9f271,011f4ec3-5b09-4dd1-a4d6-377ccaf21961' \
  -H 'User-Agent: PostmanRuntime/7.15.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache'
############################################################
first_name='pengyuhua'
last_name='pengyuhua01'
email='relaxingchu@qq.com'
address="1913 Hanoi Way"
store_id=1
active=1
curl -X POST \
  "http://localhost:${port}/v1/customers/create?first_name=${first_name}&last_name=${last_name}&email=${email}&address=${address}&store_id=${store_id}&active=${active}" \
  -H 'Accept: */*' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H "Host: localhost:${port}" \
  -H 'Postman-Token: d60fa071-97ab-467d-a7c6-f4cf0002d30b,182968e7-4edf-4b4e-9c02-7553f20acca0' \
  -H 'User-Agent: PostmanRuntime/7.15.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache' \
  -H 'content-length: ' \
  > file
new_id=$(awk -F ','  '{print $2}' file | awk -F ":" '{print $2}')
new_id=${R%'}'*}
echo $new_id

################################################################
echo '更新客户数据信息'
last_name=pengyuhua022

curl -X PUT \
  "http://localhost:${port}/v1/customers/update?first_name=${first_name}&last_name=${last_name}&email=${email}&address=${address}&store_id=${store_id}&active=${active}&customer_id=${new_id}" \
  -H 'Accept: */*' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H "Host: localhost:${port}" \
  -H 'Postman-Token: b17d2a1a-d6cd-4a3f-87e7-c1df99262a49,e70c0cfe-91b7-4510-8ab6-6239c7beeb12' \
  -H 'User-Agent: PostmanRuntime/7.15.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache' \
  -H 'content-length: '
##################################################################
echo '删除客户信息:'
curl -X DELETE \
  "http://localhost:${port}/v1/customers/delete?customer_id=${new_id}" \
  -H 'Accept: */*' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H "Host: localhost:${port}" \
  -H 'Postman-Token: a79e9dd8-5d1b-47ad-a546-dac6ef0fe2fe,398017d7-1472-4a1c-a3ad-9775de8292cb' \
  -H 'User-Agent: PostmanRuntime/7.15.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache' \
  -H 'content-length: '

echo '操作执行完成!'

. ./stop.sh