// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo_service_dto.proto

package com.sunego.commerce.grpc.study.dto;

public interface PersonListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sunego.commerce.grpc.study.dto.PersonList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  java.util.List<com.sunego.commerce.grpc.study.dto.Person> 
      getItemsList();
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  com.sunego.commerce.grpc.study.dto.Person getItems(int index);
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  java.util.List<? extends com.sunego.commerce.grpc.study.dto.PersonOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  com.sunego.commerce.grpc.study.dto.PersonOrBuilder getItemsOrBuilder(
      int index);
}