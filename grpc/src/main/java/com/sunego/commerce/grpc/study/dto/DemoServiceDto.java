// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo_service_dto.proto

package com.sunego.commerce.grpc.study.dto;

public final class DemoServiceDto {
  private DemoServiceDto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sunego_commerce_grpc_study_dto_PingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sunego_commerce_grpc_study_dto_PingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sunego_commerce_grpc_study_dto_QueryParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sunego_commerce_grpc_study_dto_QueryParameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sunego_commerce_grpc_study_dto_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sunego_commerce_grpc_study_dto_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sunego_commerce_grpc_study_dto_PersonList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sunego_commerce_grpc_study_dto_PersonList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026demo_service_dto.proto\022\"com.sunego.com" +
      "merce.grpc.study.dto\"\031\n\013PingRequest\022\n\n\002i" +
      "n\030\001 \001(\t\"\033\n\014PingResponse\022\013\n\003out\030\001 \001(\t\"2\n\016" +
      "QueryParameter\022\020\n\010ageStart\030\001 \001(\005\022\016\n\006ageE" +
      "nd\030\002 \001(\005\"W\n\006Person\022\013\n\003age\030\001 \001(\005\022\014\n\004name\030" +
      "\002 \001(\t\022\013\n\003sex\030\003 \001(\010\022\016\n\006salary\030\004 \001(\001\022\025\n\rch" +
      "ildrenCount\030\005 \001(\005\"G\n\nPersonList\0229\n\005items" +
      "\030\001 \003(\0132*.com.sunego.commerce.grpc.study." +
      "dto.PersonB6\n\"com.sunego.commerce.grpc.s" +
      "tudy.dtoB\016DemoServiceDtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_descriptor,
        new java.lang.String[] { "In", });
    internal_static_com_sunego_commerce_grpc_study_dto_PingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sunego_commerce_grpc_study_dto_PingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sunego_commerce_grpc_study_dto_PingResponse_descriptor,
        new java.lang.String[] { "Out", });
    internal_static_com_sunego_commerce_grpc_study_dto_QueryParameter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_sunego_commerce_grpc_study_dto_QueryParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sunego_commerce_grpc_study_dto_QueryParameter_descriptor,
        new java.lang.String[] { "AgeStart", "AgeEnd", });
    internal_static_com_sunego_commerce_grpc_study_dto_Person_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_sunego_commerce_grpc_study_dto_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sunego_commerce_grpc_study_dto_Person_descriptor,
        new java.lang.String[] { "Age", "Name", "Sex", "Salary", "ChildrenCount", });
    internal_static_com_sunego_commerce_grpc_study_dto_PersonList_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_sunego_commerce_grpc_study_dto_PersonList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sunego_commerce_grpc_study_dto_PersonList_descriptor,
        new java.lang.String[] { "Items", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
