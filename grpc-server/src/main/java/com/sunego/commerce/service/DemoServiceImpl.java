/**
 * Copyright (c) 2019,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:grpc-server
 * Package Name:com.sunego.commerce.service
 * File Name:DemoServiceImpl.java
 * Date:2019年1月28日 下午6:27:56
 * 
 */
package com.sunego.commerce.service;

import java.util.ArrayList;
import java.util.List;

import com.sunego.commerce.grpc.study.dto.DemoServiceGrpc;
import com.sunego.commerce.grpc.study.dto.Person;
import com.sunego.commerce.grpc.study.dto.PersonList;
import com.sunego.commerce.grpc.study.dto.PingRequest;
import com.sunego.commerce.grpc.study.dto.PingResponse;
import com.sunego.commerce.grpc.study.dto.QueryParameter;

import io.grpc.stub.StreamObserver;

/**
 * ClassName: DemoServiceImpl <br/>
 * Description: TODO <br/>
 * Date: 2019年1月28日 下午6:27:56 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public class DemoServiceImpl  extends DemoServiceGrpc.DemoServiceImplBase {
    
    @Override
    public void ping(PingRequest pingRequest, StreamObserver<PingResponse> streamObserver) {
        PingResponse reply = PingResponse.newBuilder().setOut("pong => " + pingRequest.getIn()).build();
        
        streamObserver.onNext(reply);
        streamObserver.onCompleted();
    }
    @Override
    public void getPersonList(QueryParameter queryParameter, StreamObserver<PersonList> streamObserver) {
        System.out.println(queryParameter.getAgeStart() + "-" + queryParameter.getAgeEnd());
        PersonList.Builder personListBuilder = PersonList.newBuilder();
        Person.Builder builder = Person.newBuilder();
        List<Person> list = new ArrayList<Person>();
        for (short i = 0; i < 3; i++) {
            list.add(builder.setAge(i).setChildrenCount(i).setName("test" + i).setSex(true).build());
        }
        personListBuilder.addAllItems(list);
        streamObserver.onNext(personListBuilder.build());
        streamObserver.onCompleted();
    }
    
}
