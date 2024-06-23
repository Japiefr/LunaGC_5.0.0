// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerBirthdayRsp.proto

package emu.grasscutter.net.proto;

public final class SetPlayerBirthdayRspOuterClass {
  private SetPlayerBirthdayRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerBirthdayRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerBirthdayRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.Birthday birthday = 12;</code>
     * @return Whether the birthday field is set.
     */
    boolean hasBirthday();
    /**
     * <code>.Birthday birthday = 12;</code>
     * @return The birthday.
     */
    emu.grasscutter.net.proto.BirthdayOuterClass.Birthday getBirthday();
    /**
     * <code>.Birthday birthday = 12;</code>
     */
    emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder();
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId: 2617
   * </pre>
   *
   * Protobuf type {@code SetPlayerBirthdayRsp}
   */
  public static final class SetPlayerBirthdayRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerBirthdayRsp)
      SetPlayerBirthdayRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerBirthdayRsp.newBuilder() to construct.
    private SetPlayerBirthdayRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerBirthdayRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerBirthdayRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetPlayerBirthdayRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 98: {
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder subBuilder = null;
              if (birthday_ != null) {
                subBuilder = birthday_.toBuilder();
              }
              birthday_ = input.readMessage(emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(birthday_);
                birthday_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.class, emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int BIRTHDAY_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.BirthdayOuterClass.Birthday birthday_;
    /**
     * <code>.Birthday birthday = 12;</code>
     * @return Whether the birthday field is set.
     */
    @java.lang.Override
    public boolean hasBirthday() {
      return birthday_ != null;
    }
    /**
     * <code>.Birthday birthday = 12;</code>
     * @return The birthday.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BirthdayOuterClass.Birthday getBirthday() {
      return birthday_ == null ? emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.getDefaultInstance() : birthday_;
    }
    /**
     * <code>.Birthday birthday = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
      return getBirthday();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (birthday_ != null) {
        output.writeMessage(12, getBirthday());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (birthday_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getBirthday());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp other = (emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasBirthday() != other.hasBirthday()) return false;
      if (hasBirthday()) {
        if (!getBirthday()
            .equals(other.getBirthday())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasBirthday()) {
        hash = (37 * hash) + BIRTHDAY_FIELD_NUMBER;
        hash = (53 * hash) + getBirthday().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 4.7.0
     * CmdId: 2617
     * </pre>
     *
     * Protobuf type {@code SetPlayerBirthdayRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerBirthdayRsp)
        emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.class, emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (birthdayBuilder_ == null) {
          birthday_ = null;
        } else {
          birthday_ = null;
          birthdayBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.internal_static_SetPlayerBirthdayRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp build() {
        emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp buildPartial() {
        emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp result = new emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp(this);
        result.retcode_ = retcode_;
        if (birthdayBuilder_ == null) {
          result.birthday_ = birthday_;
        } else {
          result.birthday_ = birthdayBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp other) {
        if (other == emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasBirthday()) {
          mergeBirthday(other.getBirthday());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.BirthdayOuterClass.Birthday birthday_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BirthdayOuterClass.Birthday, emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder, emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder> birthdayBuilder_;
      /**
       * <code>.Birthday birthday = 12;</code>
       * @return Whether the birthday field is set.
       */
      public boolean hasBirthday() {
        return birthdayBuilder_ != null || birthday_ != null;
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       * @return The birthday.
       */
      public emu.grasscutter.net.proto.BirthdayOuterClass.Birthday getBirthday() {
        if (birthdayBuilder_ == null) {
          return birthday_ == null ? emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.getDefaultInstance() : birthday_;
        } else {
          return birthdayBuilder_.getMessage();
        }
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       */
      public Builder setBirthday(emu.grasscutter.net.proto.BirthdayOuterClass.Birthday value) {
        if (birthdayBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          birthday_ = value;
          onChanged();
        } else {
          birthdayBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       */
      public Builder setBirthday(
          emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder builderForValue) {
        if (birthdayBuilder_ == null) {
          birthday_ = builderForValue.build();
          onChanged();
        } else {
          birthdayBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       */
      public Builder mergeBirthday(emu.grasscutter.net.proto.BirthdayOuterClass.Birthday value) {
        if (birthdayBuilder_ == null) {
          if (birthday_ != null) {
            birthday_ =
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.newBuilder(birthday_).mergeFrom(value).buildPartial();
          } else {
            birthday_ = value;
          }
          onChanged();
        } else {
          birthdayBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       */
      public Builder clearBirthday() {
        if (birthdayBuilder_ == null) {
          birthday_ = null;
          onChanged();
        } else {
          birthday_ = null;
          birthdayBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       */
      public emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder getBirthdayBuilder() {
        
        onChanged();
        return getBirthdayFieldBuilder().getBuilder();
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       */
      public emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
        if (birthdayBuilder_ != null) {
          return birthdayBuilder_.getMessageOrBuilder();
        } else {
          return birthday_ == null ?
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.getDefaultInstance() : birthday_;
        }
      }
      /**
       * <code>.Birthday birthday = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BirthdayOuterClass.Birthday, emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder, emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder> 
          getBirthdayFieldBuilder() {
        if (birthdayBuilder_ == null) {
          birthdayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday, emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder, emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder>(
                  getBirthday(),
                  getParentForChildren(),
                  isClean());
          birthday_ = null;
        }
        return birthdayBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SetPlayerBirthdayRsp)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerBirthdayRsp)
    private static final emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp();
    }

    public static emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerBirthdayRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerBirthdayRsp>() {
      @java.lang.Override
      public SetPlayerBirthdayRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetPlayerBirthdayRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetPlayerBirthdayRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerBirthdayRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetPlayerBirthdayRspOuterClass.SetPlayerBirthdayRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerBirthdayRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerBirthdayRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SetPlayerBirthdayRsp.proto\032\016Birthday.p" +
      "roto\"D\n\024SetPlayerBirthdayRsp\022\017\n\007retcode\030" +
      "\001 \001(\005\022\033\n\010birthday\030\014 \001(\0132\t.BirthdayB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BirthdayOuterClass.getDescriptor(),
        });
    internal_static_SetPlayerBirthdayRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerBirthdayRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerBirthdayRsp_descriptor,
        new java.lang.String[] { "Retcode", "Birthday", });
    emu.grasscutter.net.proto.BirthdayOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
