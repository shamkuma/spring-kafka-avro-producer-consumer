/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.spring.kafka.avro.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4786162268854796501L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.example.spring.kafka.avro.schema\",\"fields\":[{\"name\":\"userId\",\"type\":\"int\",\"default\":-1},{\"name\":\"userName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userAddress\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"companyName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"salary\",\"type\":\"double\",\"default\":-1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int userId;
  @Deprecated public java.lang.CharSequence userName;
  @Deprecated public java.lang.CharSequence userAddress;
  @Deprecated public java.lang.CharSequence companyName;
  @Deprecated public double salary;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param userId The new value for userId
   * @param userName The new value for userName
   * @param userAddress The new value for userAddress
   * @param companyName The new value for companyName
   * @param salary The new value for salary
   */
  public User(java.lang.Integer userId, java.lang.CharSequence userName, java.lang.CharSequence userAddress, java.lang.CharSequence companyName, java.lang.Double salary) {
    this.userId = userId;
    this.userName = userName;
    this.userAddress = userAddress;
    this.companyName = companyName;
    this.salary = salary;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userId;
    case 1: return userName;
    case 2: return userAddress;
    case 3: return companyName;
    case 4: return salary;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userId = (java.lang.Integer)value$; break;
    case 1: userName = (java.lang.CharSequence)value$; break;
    case 2: userAddress = (java.lang.CharSequence)value$; break;
    case 3: companyName = (java.lang.CharSequence)value$; break;
    case 4: salary = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.Integer getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.Integer value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'userName' field.
   * @return The value of the 'userName' field.
   */
  public java.lang.CharSequence getUserName() {
    return userName;
  }

  /**
   * Sets the value of the 'userName' field.
   * @param value the value to set.
   */
  public void setUserName(java.lang.CharSequence value) {
    this.userName = value;
  }

  /**
   * Gets the value of the 'userAddress' field.
   * @return The value of the 'userAddress' field.
   */
  public java.lang.CharSequence getUserAddress() {
    return userAddress;
  }

  /**
   * Sets the value of the 'userAddress' field.
   * @param value the value to set.
   */
  public void setUserAddress(java.lang.CharSequence value) {
    this.userAddress = value;
  }

  /**
   * Gets the value of the 'companyName' field.
   * @return The value of the 'companyName' field.
   */
  public java.lang.CharSequence getCompanyName() {
    return companyName;
  }

  /**
   * Sets the value of the 'companyName' field.
   * @param value the value to set.
   */
  public void setCompanyName(java.lang.CharSequence value) {
    this.companyName = value;
  }

  /**
   * Gets the value of the 'salary' field.
   * @return The value of the 'salary' field.
   */
  public java.lang.Double getSalary() {
    return salary;
  }

  /**
   * Sets the value of the 'salary' field.
   * @param value the value to set.
   */
  public void setSalary(java.lang.Double value) {
    this.salary = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.example.spring.kafka.avro.schema.User.Builder newBuilder() {
    return new com.example.spring.kafka.avro.schema.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.example.spring.kafka.avro.schema.User.Builder newBuilder(com.example.spring.kafka.avro.schema.User.Builder other) {
    return new com.example.spring.kafka.avro.schema.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.example.spring.kafka.avro.schema.User.Builder newBuilder(com.example.spring.kafka.avro.schema.User other) {
    return new com.example.spring.kafka.avro.schema.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private int userId;
    private java.lang.CharSequence userName;
    private java.lang.CharSequence userAddress;
    private java.lang.CharSequence companyName;
    private double salary;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.spring.kafka.avro.schema.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userName)) {
        this.userName = data().deepCopy(fields()[1].schema(), other.userName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userAddress)) {
        this.userAddress = data().deepCopy(fields()[2].schema(), other.userAddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.companyName)) {
        this.companyName = data().deepCopy(fields()[3].schema(), other.companyName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.salary)) {
        this.salary = data().deepCopy(fields()[4].schema(), other.salary);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.spring.kafka.avro.schema.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userName)) {
        this.userName = data().deepCopy(fields()[1].schema(), other.userName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.userAddress)) {
        this.userAddress = data().deepCopy(fields()[2].schema(), other.userAddress);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.companyName)) {
        this.companyName = data().deepCopy(fields()[3].schema(), other.companyName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.salary)) {
        this.salary = data().deepCopy(fields()[4].schema(), other.salary);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.Integer getUserId() {
      return userId;
    }

    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder setUserId(int value) {
      validate(fields()[0], value);
      this.userId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder clearUserId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userName' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserName() {
      return userName;
    }

    /**
      * Sets the value of the 'userName' field.
      * @param value The value of 'userName'.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder setUserName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.userName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userName' field has been set.
      * @return True if the 'userName' field has been set, false otherwise.
      */
    public boolean hasUserName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userName' field.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder clearUserName() {
      userName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'userAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserAddress() {
      return userAddress;
    }

    /**
      * Sets the value of the 'userAddress' field.
      * @param value The value of 'userAddress'.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder setUserAddress(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.userAddress = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'userAddress' field has been set.
      * @return True if the 'userAddress' field has been set, false otherwise.
      */
    public boolean hasUserAddress() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'userAddress' field.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder clearUserAddress() {
      userAddress = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'companyName' field.
      * @return The value.
      */
    public java.lang.CharSequence getCompanyName() {
      return companyName;
    }

    /**
      * Sets the value of the 'companyName' field.
      * @param value The value of 'companyName'.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder setCompanyName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.companyName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'companyName' field has been set.
      * @return True if the 'companyName' field has been set, false otherwise.
      */
    public boolean hasCompanyName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'companyName' field.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder clearCompanyName() {
      companyName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'salary' field.
      * @return The value.
      */
    public java.lang.Double getSalary() {
      return salary;
    }

    /**
      * Sets the value of the 'salary' field.
      * @param value The value of 'salary'.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder setSalary(double value) {
      validate(fields()[4], value);
      this.salary = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'salary' field has been set.
      * @return True if the 'salary' field has been set, false otherwise.
      */
    public boolean hasSalary() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'salary' field.
      * @return This builder.
      */
    public com.example.spring.kafka.avro.schema.User.Builder clearSalary() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.Integer) defaultValue(fields()[0]);
        record.userName = fieldSetFlags()[1] ? this.userName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.userAddress = fieldSetFlags()[2] ? this.userAddress : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.companyName = fieldSetFlags()[3] ? this.companyName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.salary = fieldSetFlags()[4] ? this.salary : (java.lang.Double) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
