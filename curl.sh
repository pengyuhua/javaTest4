#!/bin/bash

echo "执行film数据添加操作"
curl +X GET "http://localhost:18080/films/create"



. ./stop.sh