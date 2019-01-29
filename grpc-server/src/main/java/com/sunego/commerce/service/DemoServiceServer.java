/**
 * Copyright (c) 2019,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:grpc-server
 * Package Name:com.sunego.commerce.service
 * File Name:DemoServiceServer.java
 * Date:2019年1月28日 下午6:28:52
 * 
 */
package com.sunego.commerce.service;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.netty.NettyServerBuilder;

/**
 * ClassName: DemoServiceServer <br/>
 * Description: TODO <br/>
 * Date: 2019年1月28日 下午6:28:52 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class DemoServiceServer {
    private int port = 50051;
    private Server server;

    private void start() throws IOException   {
        
        server = NettyServerBuilder.forPort(port).addService(new DemoServiceImpl()).build()
                .start();

        server = InProcessServerBuilder.forName("testServer")
                .addService( new DemoServiceImpl()).build().start();

        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("*** shutting down gRPC server since JVM is shutting down");
                DemoServiceServer.this.stop();
                System.out.println("*** server shut down");
            }
        });
    }
    
    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
      if (server != null) {
        server.awaitTermination();
      }
    }
    
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public static void main(String[] args) throws Exception {
        final DemoServiceServer server = new DemoServiceServer();
        server.start();
        server.blockUntilShutdown();
    }
}
