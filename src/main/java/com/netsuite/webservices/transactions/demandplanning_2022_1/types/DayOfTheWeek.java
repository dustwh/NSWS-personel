/**
 * DayOfTheWeek.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.demandplanning_2022_1.types;

public class DayOfTheWeek implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DayOfTheWeek(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __sunday = "_sunday";
    public static final java.lang.String __monday = "_monday";
    public static final java.lang.String __tuesday = "_tuesday";
    public static final java.lang.String __wednesday = "_wednesday";
    public static final java.lang.String __thursday = "_thursday";
    public static final java.lang.String __friday = "_friday";
    public static final java.lang.String __saturday = "_saturday";
    public static final DayOfTheWeek _sunday = new DayOfTheWeek(__sunday);
    public static final DayOfTheWeek _monday = new DayOfTheWeek(__monday);
    public static final DayOfTheWeek _tuesday = new DayOfTheWeek(__tuesday);
    public static final DayOfTheWeek _wednesday = new DayOfTheWeek(__wednesday);
    public static final DayOfTheWeek _thursday = new DayOfTheWeek(__thursday);
    public static final DayOfTheWeek _friday = new DayOfTheWeek(__friday);
    public static final DayOfTheWeek _saturday = new DayOfTheWeek(__saturday);
    public java.lang.String getValue() { return _value_;}
    public static DayOfTheWeek fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DayOfTheWeek enumeration = (DayOfTheWeek)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DayOfTheWeek fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DayOfTheWeek.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.demandplanning_2022_1.transactions.webservices.netsuite.com", "DayOfTheWeek"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}