// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo_service_dto.proto

package com.sunego.commerce.grpc.study.dto;

/**
 * Protobuf type {@code com.sunego.commerce.grpc.study.dto.PersonList}
 */
public  final class PersonList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sunego.commerce.grpc.study.dto.PersonList)
    PersonListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonList.newBuilder() to construct.
  private PersonList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonList() {
    items_ = java.util.Collections.emptyList();
  }

 
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonList(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              items_ = new java.util.ArrayList<com.sunego.commerce.grpc.study.dto.Person>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(
                input.readMessage(com.sunego.commerce.grpc.study.dto.Person.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PersonList_descriptor;
  }

 
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PersonList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sunego.commerce.grpc.study.dto.PersonList.class, com.sunego.commerce.grpc.study.dto.PersonList.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private java.util.List<com.sunego.commerce.grpc.study.dto.Person> items_;
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  public java.util.List<com.sunego.commerce.grpc.study.dto.Person> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  public java.util.List<? extends com.sunego.commerce.grpc.study.dto.PersonOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  public com.sunego.commerce.grpc.study.dto.Person getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
   */
  public com.sunego.commerce.grpc.study.dto.PersonOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

 
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

 
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sunego.commerce.grpc.study.dto.PersonList)) {
      return super.equals(obj);
    }
    com.sunego.commerce.grpc.study.dto.PersonList other = (com.sunego.commerce.grpc.study.dto.PersonList) obj;

    boolean result = true;
    result = result && getItemsList()
        .equals(other.getItemsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

 
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sunego.commerce.grpc.study.dto.PersonList parseFrom(
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
  public static Builder newBuilder(com.sunego.commerce.grpc.study.dto.PersonList prototype) {
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
   * Protobuf type {@code com.sunego.commerce.grpc.study.dto.PersonList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sunego.commerce.grpc.study.dto.PersonList)
      com.sunego.commerce.grpc.study.dto.PersonListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PersonList_descriptor;
    }

   
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PersonList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sunego.commerce.grpc.study.dto.PersonList.class, com.sunego.commerce.grpc.study.dto.PersonList.Builder.class);
    }

    // Construct using com.sunego.commerce.grpc.study.dto.PersonList.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
   
    public Builder clear() {
      super.clear();
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

   
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sunego.commerce.grpc.study.dto.DemoServiceDto.internal_static_com_sunego_commerce_grpc_study_dto_PersonList_descriptor;
    }

   
    public com.sunego.commerce.grpc.study.dto.PersonList getDefaultInstanceForType() {
      return com.sunego.commerce.grpc.study.dto.PersonList.getDefaultInstance();
    }

   
    public com.sunego.commerce.grpc.study.dto.PersonList build() {
      com.sunego.commerce.grpc.study.dto.PersonList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

   
    public com.sunego.commerce.grpc.study.dto.PersonList buildPartial() {
      com.sunego.commerce.grpc.study.dto.PersonList result = new com.sunego.commerce.grpc.study.dto.PersonList(this);
      int from_bitField0_ = bitField0_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
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
      if (other instanceof com.sunego.commerce.grpc.study.dto.PersonList) {
        return mergeFrom((com.sunego.commerce.grpc.study.dto.PersonList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sunego.commerce.grpc.study.dto.PersonList other) {
      if (other == com.sunego.commerce.grpc.study.dto.PersonList.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
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
      com.sunego.commerce.grpc.study.dto.PersonList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sunego.commerce.grpc.study.dto.PersonList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sunego.commerce.grpc.study.dto.Person> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        items_ = new java.util.ArrayList<com.sunego.commerce.grpc.study.dto.Person>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sunego.commerce.grpc.study.dto.Person, com.sunego.commerce.grpc.study.dto.Person.Builder, com.sunego.commerce.grpc.study.dto.PersonOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public java.util.List<com.sunego.commerce.grpc.study.dto.Person> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public com.sunego.commerce.grpc.study.dto.Person getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder setItems(
        int index, com.sunego.commerce.grpc.study.dto.Person value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder setItems(
        int index, com.sunego.commerce.grpc.study.dto.Person.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder addItems(com.sunego.commerce.grpc.study.dto.Person value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder addItems(
        int index, com.sunego.commerce.grpc.study.dto.Person value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder addItems(
        com.sunego.commerce.grpc.study.dto.Person.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder addItems(
        int index, com.sunego.commerce.grpc.study.dto.Person.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.sunego.commerce.grpc.study.dto.Person> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public com.sunego.commerce.grpc.study.dto.Person.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public com.sunego.commerce.grpc.study.dto.PersonOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public java.util.List<? extends com.sunego.commerce.grpc.study.dto.PersonOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public com.sunego.commerce.grpc.study.dto.Person.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.sunego.commerce.grpc.study.dto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public com.sunego.commerce.grpc.study.dto.Person.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.sunego.commerce.grpc.study.dto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sunego.commerce.grpc.study.dto.Person items = 1;</code>
     */
    public java.util.List<com.sunego.commerce.grpc.study.dto.Person.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sunego.commerce.grpc.study.dto.Person, com.sunego.commerce.grpc.study.dto.Person.Builder, com.sunego.commerce.grpc.study.dto.PersonOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sunego.commerce.grpc.study.dto.Person, com.sunego.commerce.grpc.study.dto.Person.Builder, com.sunego.commerce.grpc.study.dto.PersonOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
   
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

   
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.sunego.commerce.grpc.study.dto.PersonList)
  }

  // @@protoc_insertion_point(class_scope:com.sunego.commerce.grpc.study.dto.PersonList)
  private static final com.sunego.commerce.grpc.study.dto.PersonList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sunego.commerce.grpc.study.dto.PersonList();
  }

  public static com.sunego.commerce.grpc.study.dto.PersonList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonList>
      PARSER = new com.google.protobuf.AbstractParser<PersonList>() {
   
    public PersonList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonList> parser() {
    return PARSER;
  }

 
  public com.google.protobuf.Parser<PersonList> getParserForType() {
    return PARSER;
  }

 
  public com.sunego.commerce.grpc.study.dto.PersonList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

