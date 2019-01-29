# grpc-demo
grpc-demo包含三部分grpc，grpc-server，grpc-client。grpc是基础类，由protobuf插件生成代码，被grpc-server，grpc-client引用。

## grpc
在grpc工程运行```clean install```，在target目录下生成源代码。注意：如果之前在src/main/java目录下存在源码，需要删除。将target目录下的源码复制到src/main/java目录下。

## grpc-server和grpc-client
在grpc-server工程和grpc-client工程运行···clean install···，均生成jar包。
在grpc-server工程的DemoServiceServer，运行工程启动server。
在grpc-client工程的DemoServiceClient，运行工程启动client。

```java
//client
Will try to ping a ...
ping: pong => a
Will try to getPersonList ageStart: 5
ageEnd: 50
   ...
items count: 3
name: "test0"
sex: true

age: 1
name: "test1"
sex: true
childrenCount: 1

age: 2
name: "test2"
sex: true
childrenCount: 2

Will try to getPersonList ageStart: 5
ageEnd: 50
   ...
items count: 3
name: "test0"
sex: true

age: 1
name: "test1"
sex: true
childrenCount: 1

age: 2
name: "test2"
sex: true
childrenCount: 2
```
```java
//server
Server started, listening on 50051
```

参考资料
[gRPC 官方文档中文版](http://doc.oschina.net/grpc?t=58008)
[grpc](https://github.com/grpc)

