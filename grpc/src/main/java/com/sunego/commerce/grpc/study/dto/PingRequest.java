// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo_service_dto.proto

package com.sunego.commerce.grpc.study.dto;

/**
 * Protobuf type {@code com.sunego.commerce.grpc.study.dto.PingRequest}
 */
public  final class PingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sunego.commerce.grpc.study.dto.PingRequest)
    PingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PingRequest.newBuilder() to construct.
  private PingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PingRequest() {
    in_ = "";
  }

 
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PingRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            in_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_descriptor;
  }

 
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sunego.commerce.grpc.study.dto.PingRequest.class, com.sunego.commerce.grpc.study.dto.PingRequest.Builder.class);
  }

  public static final int IN_FIELD_NUMBER = 1;
  private volatile java.lang.Object in_;
  /**
   * <code>string in = 1;</code>
   */
  public java.lang.String getIn() {
    java.lang.Object ref = in_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      in_ = s;
      return s;
    }
  }
  /**
   * <code>string in = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInBytes() {
    java.lang.Object ref = in_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      in_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
 
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

 
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getInBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, in_);
    }
    unknownFields.writeTo(output);
  }

 
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, in_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

 
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sunego.commerce.grpc.study.dto.PingRequest)) {
      return super.equals(obj);
    }
    com.sunego.commerce.grpc.study.dto.PingRequest other = (com.sunego.commerce.grpc.study.dto.PingRequest) obj;

    boolean result = true;
    result = result && getIn()
        .equals(other.getIn());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

 
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IN_FIELD_NUMBER;
    hash = (53 * hash) + getIn().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sunego.commerce.grpc.study.dto.PingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

 
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sunego.commerce.grpc.study.dto.PingRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
 
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

 
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.sunego.commerce.grpc.study.dto.PingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sunego.commerce.grpc.study.dto.PingRequest)
      com.sunego.commerce.grpc.study.dto.PingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_descriptor;
    }

   
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sunego.commerce.grpc.study.dto.PingRequest.class, com.sunego.commerce.grpc.study.dto.PingRequest.Builder.class);
    }

    // Construct using com.sunego.commerce.grpc.study.dto.PingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
   
    public Builder clear() {
      super.clear();
      in_ = "";

      return this;
    }

   
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PingRequest_descriptor;
    }

   
    public com.sunego.commerce.grpc.study.dto.PingRequest getDefaultInstanceForType() {
      return com.sunego.commerce.grpc.study.dto.PingRequest.getDefaultInstance();
    }

   
    public com.sunego.commerce.grpc.study.dto.PingRequest build() {
      com.sunego.commerce.grpc.study.dto.PingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

   
    public com.sunego.commerce.grpc.study.dto.PingRequest buildPartial() {
      com.sunego.commerce.grpc.study.dto.PingRequest result = new com.sunego.commerce.grpc.study.dto.PingRequest(this);
      result.in_ = in_;
      onBuilt();
      return result;
    }

   
    public Builder clone() {
      return (Builder) super.clone();
    }
   
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
   
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
   
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
   
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
   
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
   
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sunego.commerce.grpc.study.dto.PingRequest) {
        return mergeFrom((com.sunego.commerce.grpc.study.dto.PingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sunego.commerce.grpc.study.dto.PingRequest other) {
      if (other == com.sunego.commerce.grpc.study.dto.PingRequest.getDefaultInstance()) return this;
      if (!other.getIn().isEmpty()) {
        in_ = other.in_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

   
    public final boolean isInitialized() {
      return true;
    }

   
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.sunego.commerce.grpc.study.dto.PingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sunego.commerce.grpc.study.dto.PingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object in_ = "";
    /**
     * <code>string in = 1;</code>
     */
    public java.lang.String getIn() {
      java.lang.Object ref = in_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        in_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string in = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInBytes() {
      java.lang.Object ref = in_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        in_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string in = 1;</code>
     */
    public Builder setIn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      in_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string in = 1;</code>
     */
    public Builder clearIn() {
      
      in_ = getDefaultInstance().getIn();
      onChanged();
      return this;
    }
    /**
     * <code>string in = 1;</code>
     */
    public Builder setInBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      in_ = value;
      onChanged();
      return this;
    }
   
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

   
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.sunego.commerce.grpc.study.dto.PingRequest)
  }

  // @@protoc_insertion_point(class_scope:com.sunego.commerce.grpc.study.dto.PingRequest)
  private static final com.sunego.commerce.grpc.study.dto.PingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sunego.commerce.grpc.study.dto.PingRequest();
  }

  public static com.sunego.commerce.grpc.study.dto.PingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PingRequest>
      PARSER = new com.google.protobuf.AbstractParser<PingRequest>() {
   
    public PingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PingRequest> parser() {
    return PARSER;
  }

 
  public com.google.protobuf.Parser<PingRequest> getParserForType() {
    return PARSER;
  }

 
  public com.sunego.commerce.grpc.study.dto.PingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

