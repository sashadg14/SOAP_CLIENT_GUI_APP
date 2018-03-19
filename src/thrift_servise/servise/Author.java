/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift_servise.servise;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-03-18")
public class Author implements org.apache.thrift.TBase<Author, Author._Fields>, java.io.Serializable, Cloneable, Comparable<Author> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Author");

  private static final org.apache.thrift.protocol.TField FIRST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("firstName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SECOND_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("secondName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SPECIALITY_FIELD_DESC = new org.apache.thrift.protocol.TField("speciality", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AuthorStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AuthorTupleSchemeFactory();

  public String firstName; // required
  public String secondName; // required
  public String speciality; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIRST_NAME((short)1, "firstName"),
    SECOND_NAME((short)2, "secondName"),
    SPECIALITY((short)3, "speciality");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FIRST_NAME
          return FIRST_NAME;
        case 2: // SECOND_NAME
          return SECOND_NAME;
        case 3: // SPECIALITY
          return SPECIALITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIRST_NAME, new org.apache.thrift.meta_data.FieldMetaData("firstName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECOND_NAME, new org.apache.thrift.meta_data.FieldMetaData("secondName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SPECIALITY, new org.apache.thrift.meta_data.FieldMetaData("speciality", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Author.class, metaDataMap);
  }

  public Author() {
  }

  public Author(
    String firstName,
    String secondName,
    String speciality)
  {
    this();
    this.firstName = firstName;
    this.secondName = secondName;
    this.speciality = speciality;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Author(Author other) {
    if (other.isSetFirstName()) {
      this.firstName = other.firstName;
    }
    if (other.isSetSecondName()) {
      this.secondName = other.secondName;
    }
    if (other.isSetSpeciality()) {
      this.speciality = other.speciality;
    }
  }

  public Author deepCopy() {
    return new Author(this);
  }

  @Override
  public void clear() {
    this.firstName = null;
    this.secondName = null;
    this.speciality = null;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public Author setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public void unsetFirstName() {
    this.firstName = null;
  }

  /** Returns true if field firstName is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstName() {
    return this.firstName != null;
  }

  public void setFirstNameIsSet(boolean value) {
    if (!value) {
      this.firstName = null;
    }
  }

  public String getSecondName() {
    return this.secondName;
  }

  public Author setSecondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  public void unsetSecondName() {
    this.secondName = null;
  }

  /** Returns true if field secondName is set (has been assigned a value) and false otherwise */
  public boolean isSetSecondName() {
    return this.secondName != null;
  }

  public void setSecondNameIsSet(boolean value) {
    if (!value) {
      this.secondName = null;
    }
  }

  public String getSpeciality() {
    return this.speciality;
  }

  public Author setSpeciality(String speciality) {
    this.speciality = speciality;
    return this;
  }

  public void unsetSpeciality() {
    this.speciality = null;
  }

  /** Returns true if field speciality is set (has been assigned a value) and false otherwise */
  public boolean isSetSpeciality() {
    return this.speciality != null;
  }

  public void setSpecialityIsSet(boolean value) {
    if (!value) {
      this.speciality = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIRST_NAME:
      if (value == null) {
        unsetFirstName();
      } else {
        setFirstName((String)value);
      }
      break;

    case SECOND_NAME:
      if (value == null) {
        unsetSecondName();
      } else {
        setSecondName((String)value);
      }
      break;

    case SPECIALITY:
      if (value == null) {
        unsetSpeciality();
      } else {
        setSpeciality((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIRST_NAME:
      return getFirstName();

    case SECOND_NAME:
      return getSecondName();

    case SPECIALITY:
      return getSpeciality();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIRST_NAME:
      return isSetFirstName();
    case SECOND_NAME:
      return isSetSecondName();
    case SPECIALITY:
      return isSetSpeciality();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Author)
      return this.equals((Author)that);
    return false;
  }

  public boolean equals(Author that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_firstName = true && this.isSetFirstName();
    boolean that_present_firstName = true && that.isSetFirstName();
    if (this_present_firstName || that_present_firstName) {
      if (!(this_present_firstName && that_present_firstName))
        return false;
      if (!this.firstName.equals(that.firstName))
        return false;
    }

    boolean this_present_secondName = true && this.isSetSecondName();
    boolean that_present_secondName = true && that.isSetSecondName();
    if (this_present_secondName || that_present_secondName) {
      if (!(this_present_secondName && that_present_secondName))
        return false;
      if (!this.secondName.equals(that.secondName))
        return false;
    }

    boolean this_present_speciality = true && this.isSetSpeciality();
    boolean that_present_speciality = true && that.isSetSpeciality();
    if (this_present_speciality || that_present_speciality) {
      if (!(this_present_speciality && that_present_speciality))
        return false;
      if (!this.speciality.equals(that.speciality))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFirstName()) ? 131071 : 524287);
    if (isSetFirstName())
      hashCode = hashCode * 8191 + firstName.hashCode();

    hashCode = hashCode * 8191 + ((isSetSecondName()) ? 131071 : 524287);
    if (isSetSecondName())
      hashCode = hashCode * 8191 + secondName.hashCode();

    hashCode = hashCode * 8191 + ((isSetSpeciality()) ? 131071 : 524287);
    if (isSetSpeciality())
      hashCode = hashCode * 8191 + speciality.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Author other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFirstName()).compareTo(other.isSetFirstName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstName, other.firstName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecondName()).compareTo(other.isSetSecondName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecondName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secondName, other.secondName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpeciality()).compareTo(other.isSetSpeciality());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpeciality()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.speciality, other.speciality);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Author(");
    boolean first = true;

    sb.append("firstName:");
    if (this.firstName == null) {
      sb.append("null");
    } else {
      sb.append(this.firstName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("secondName:");
    if (this.secondName == null) {
      sb.append("null");
    } else {
      sb.append(this.secondName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("speciality:");
    if (this.speciality == null) {
      sb.append("null");
    } else {
      sb.append(this.speciality);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AuthorStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthorStandardScheme getScheme() {
      return new AuthorStandardScheme();
    }
  }

  private static class AuthorStandardScheme extends org.apache.thrift.scheme.StandardScheme<Author> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Author struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIRST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.firstName = iprot.readString();
              struct.setFirstNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SECOND_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.secondName = iprot.readString();
              struct.setSecondNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPECIALITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.speciality = iprot.readString();
              struct.setSpecialityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Author struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.firstName != null) {
        oprot.writeFieldBegin(FIRST_NAME_FIELD_DESC);
        oprot.writeString(struct.firstName);
        oprot.writeFieldEnd();
      }
      if (struct.secondName != null) {
        oprot.writeFieldBegin(SECOND_NAME_FIELD_DESC);
        oprot.writeString(struct.secondName);
        oprot.writeFieldEnd();
      }
      if (struct.speciality != null) {
        oprot.writeFieldBegin(SPECIALITY_FIELD_DESC);
        oprot.writeString(struct.speciality);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthorTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthorTupleScheme getScheme() {
      return new AuthorTupleScheme();
    }
  }

  private static class AuthorTupleScheme extends org.apache.thrift.scheme.TupleScheme<Author> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Author struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFirstName()) {
        optionals.set(0);
      }
      if (struct.isSetSecondName()) {
        optionals.set(1);
      }
      if (struct.isSetSpeciality()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetFirstName()) {
        oprot.writeString(struct.firstName);
      }
      if (struct.isSetSecondName()) {
        oprot.writeString(struct.secondName);
      }
      if (struct.isSetSpeciality()) {
        oprot.writeString(struct.speciality);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Author struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.firstName = iprot.readString();
        struct.setFirstNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.secondName = iprot.readString();
        struct.setSecondNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.speciality = iprot.readString();
        struct.setSpecialityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
