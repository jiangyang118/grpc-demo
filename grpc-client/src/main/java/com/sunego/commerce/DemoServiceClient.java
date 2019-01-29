/**
 * Copyright (c) 2019,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:grpc-client
 * Package Name:com.sunego.commerce
 * File Name:DemoServiceClient.java
 * Date:2019年1月28日 下午6:36:48
 * 
 */
package com.sunego.commerce;

import java.util.concurrent.TimeUnit;

import com.sunego.commerce.grpc.study.dto.DemoServiceGrpc;
import com.sunego.commerce.grpc.study.dto.Person;
import com.sunego.commerce.grpc.study.dto.PersonList;
import com.sunego.commerce.grpc.study.dto.PingRequest;
import com.sunego.commerce.grpc.study.dto.PingResponse;
import com.sunego.commerce.grpc.study.dto.QueryParameter;

import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;

/**
 * ClassName: DemoServiceClient <br/>
 * Description: TODO <br/>
 * Date: 2019年1月28日 下午6:36:48 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class DemoServiceClient {
    private final ManagedChannel channel;
    private final DemoServiceGrpc.DemoServiceBlockingStub blockingStub;

    public DemoServiceClient(String host, int port) {
        channel = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT).build();

        blockingStub = DemoServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void ping(String name) {
        try {
            System.err.println("Will try to ping " + name + " ...");
            PingRequest request = PingRequest.newBuilder().setIn(name).build();
            PingResponse response = blockingStub.ping(request);
            System.err.println("ping: " + response.getOut());
        } catch (RuntimeException e) {
            System.err.println("RPC failed:" + e.getMessage());
            return;
        }
    }

    public void getPersonList(QueryParameter parameter) {
        try {
            System.err.println("Will try to getPersonList " + parameter + "   ...");
            PersonList response = blockingStub.getPersonList(parameter);
            System.err.println("items count: " + response.getItemsCount());
            for (Person p : response.getItemsList()) {
                System.err.println(p);
            }
        } catch (RuntimeException e) {
            System.err.println("RPC failed:" + e.getMessage());
            return;
        }
    }

    public static void main(String[] args) throws Exception {
        DemoServiceClient client = new DemoServiceClient("localhost", 50051);
        try {
            client.ping("a");

            int max = 100000;
            Long start = System.currentTimeMillis();

            for (int i = 0; i < max; i++) {
                client.getPersonList(getParameter());
            }
            Long end = System.currentTimeMillis();
            Long elapse = end - start;
            int perform = Double.valueOf(max / (elapse / 1000d)).intValue();

            System.err.print("rgpc " + max + " 次NettyServer调用，耗时：" + elapse + "毫秒，平均" + perform + "次/秒");
        } finally {
            client.shutdown();
        }
    }

    private static QueryParameter getParameter() {
        return QueryParameter.newBuilder().setAgeStart(5).setAgeEnd(50).build();
    }
}
