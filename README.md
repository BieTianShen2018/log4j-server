# log4j-server log4j集群日志方案demo

## 启动log4j-server
1、本地方式
```shell
./log4j-server-start.sh
```
或者
```shell
nohup java -cp  /usr/log4j-1.2.16.jar org.apache.log4j.net.SimpleSocketServer 4560 /usr/log4j/config/log4j.xml > kevin.log 2>&1 &

```
2、容器方式
- 先执行`./buildimg.sh` 构建镜像
- 执行`docker-compose up -d` 即可

## 启动log4j-client
直接用IDE开发工具启动即可

## 配置文件
- 日志服务端使用的配置文件路径在 `./log4j/config/log4j.xml`
- 客户端使用的配置文件路径在`./log4j-client/src/resources/log4j.properties`








