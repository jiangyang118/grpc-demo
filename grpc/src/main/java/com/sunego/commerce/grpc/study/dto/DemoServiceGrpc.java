package com.sunego.commerce.grpc.study.dto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: demo_service.proto")
public final class DemoServiceGrpc {

  private DemoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.sunego.commerce.grpc.study.service.DemoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sunego.commerce.grpc.study.dto.PingRequest,
      com.sunego.commerce.grpc.study.dto.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.sunego.commerce.grpc.study.dto.PingRequest.class,
      responseType = com.sunego.commerce.grpc.study.dto.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sunego.commerce.grpc.study.dto.PingRequest,
      com.sunego.commerce.grpc.study.dto.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.sunego.commerce.grpc.study.dto.PingRequest, com.sunego.commerce.grpc.study.dto.PingResponse> getPingMethod;
    if ((getPingMethod = DemoServiceGrpc.getPingMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getPingMethod = DemoServiceGrpc.getPingMethod) == null) {
          DemoServiceGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<com.sunego.commerce.grpc.study.dto.PingRequest, com.sunego.commerce.grpc.study.dto.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.sunego.commerce.grpc.study.service.DemoService", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunego.commerce.grpc.study.dto.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunego.commerce.grpc.study.dto.PingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sunego.commerce.grpc.study.dto.QueryParameter,
      com.sunego.commerce.grpc.study.dto.PersonList> getGetPersonListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPersonList",
      requestType = com.sunego.commerce.grpc.study.dto.QueryParameter.class,
      responseType = com.sunego.commerce.grpc.study.dto.PersonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sunego.commerce.grpc.study.dto.QueryParameter,
      com.sunego.commerce.grpc.study.dto.PersonList> getGetPersonListMethod() {
    io.grpc.MethodDescriptor<com.sunego.commerce.grpc.study.dto.QueryParameter, com.sunego.commerce.grpc.study.dto.PersonList> getGetPersonListMethod;
    if ((getGetPersonListMethod = DemoServiceGrpc.getGetPersonListMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getGetPersonListMethod = DemoServiceGrpc.getGetPersonListMethod) == null) {
          DemoServiceGrpc.getGetPersonListMethod = getGetPersonListMethod = 
              io.grpc.MethodDescriptor.<com.sunego.commerce.grpc.study.dto.QueryParameter, com.sunego.commerce.grpc.study.dto.PersonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.sunego.commerce.grpc.study.service.DemoService", "getPersonList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunego.commerce.grpc.study.dto.QueryParameter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sunego.commerce.grpc.study.dto.PersonList.getDefaultInstance()))
                  .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("getPersonList"))
                  .build();
          }
        }
     }
     return getGetPersonListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoServiceStub newStub(io.grpc.Channel channel) {
    return new DemoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DemoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DemoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DemoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.sunego.commerce.grpc.study.dto.PingRequest request,
        io.grpc.stub.StreamObserver<com.sunego.commerce.grpc.study.dto.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void getPersonList(com.sunego.commerce.grpc.study.dto.QueryParameter request,
        io.grpc.stub.StreamObserver<com.sunego.commerce.grpc.study.dto.PersonList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonListMethod(), responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunego.commerce.grpc.study.dto.PingRequest,
                com.sunego.commerce.grpc.study.dto.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getGetPersonListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sunego.commerce.grpc.study.dto.QueryParameter,
                com.sunego.commerce.grpc.study.dto.PersonList>(
                  this, METHODID_GET_PERSON_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class DemoServiceStub extends io.grpc.stub.AbstractStub<DemoServiceStub> {
    private DemoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

   
    protected DemoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.sunego.commerce.grpc.study.dto.PingRequest request,
        io.grpc.stub.StreamObserver<com.sunego.commerce.grpc.study.dto.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonList(com.sunego.commerce.grpc.study.dto.QueryParameter request,
        io.grpc.stub.StreamObserver<com.sunego.commerce.grpc.study.dto.PersonList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPersonListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DemoServiceBlockingStub extends io.grpc.stub.AbstractStub<DemoServiceBlockingStub> {
    private DemoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

   
    protected DemoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sunego.commerce.grpc.study.dto.PingResponse ping(com.sunego.commerce.grpc.study.dto.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sunego.commerce.grpc.study.dto.PersonList getPersonList(com.sunego.commerce.grpc.study.dto.QueryParameter request) {
      return blockingUnaryCall(
          getChannel(), getGetPersonListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DemoServiceFutureStub extends io.grpc.stub.AbstractStub<DemoServiceFutureStub> {
    private DemoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

   
    protected DemoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunego.commerce.grpc.study.dto.PingResponse> ping(
        com.sunego.commerce.grpc.study.dto.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sunego.commerce.grpc.study.dto.PersonList> getPersonList(
        com.sunego.commerce.grpc.study.dto.QueryParameter request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPersonListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_PERSON_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

   
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.sunego.commerce.grpc.study.dto.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.sunego.commerce.grpc.study.dto.PingResponse>) responseObserver);
          break;
        case METHODID_GET_PERSON_LIST:
          serviceImpl.getPersonList((com.sunego.commerce.grpc.study.dto.QueryParameter) request,
              (io.grpc.stub.StreamObserver<com.sunego.commerce.grpc.study.dto.PersonList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

   
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoServiceBaseDescriptorSupplier() {}

   
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sunego.commerce.grpc.study.dto.DemosService.getDescriptor();
    }

   
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoService");
    }
  }

  private static final class DemoServiceFileDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier {
    DemoServiceFileDescriptorSupplier() {}
  }

  private static final class DemoServiceMethodDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

   
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DemoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getGetPersonListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
