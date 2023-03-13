/**
 * BillingScheduleRepeatEvery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2022_1.types;

public class BillingScheduleRepeatEvery implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingScheduleRepeatEvery(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __1 = "_1";
    public static final java.lang.String __2 = "_2";
    public static final java.lang.String __3 = "_3";
    public static final java.lang.String __4 = "_4";
    public static final java.lang.String __6 = "_6";
    public static final BillingScheduleRepeatEvery _1 = new BillingScheduleRepeatEvery(__1);
    public static final BillingScheduleRepeatEvery _2 = new BillingScheduleRepeatEvery(__2);
    public static final BillingScheduleRepeatEvery _3 = new BillingScheduleRepeatEvery(__3);
    public static final BillingScheduleRepeatEvery _4 = new BillingScheduleRepeatEvery(__4);
    public static final BillingScheduleRepeatEvery _6 = new BillingScheduleRepeatEvery(__6);
    public java.lang.String getValue() { return _value_;}
    public static BillingScheduleRepeatEvery fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillingScheduleRepeatEvery enumeration = (BillingScheduleRepeatEvery)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingScheduleRepeatEvery fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingScheduleRepeatEvery.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRepeatEvery"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
