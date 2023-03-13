/**
 * PaycheckPayExpList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2022_1;

public class PaycheckPayExpList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayExp[] paycheckPayExp;

    private boolean replaceAll;  // attribute

    public PaycheckPayExpList() {
    }

    public PaycheckPayExpList(
           com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayExp[] paycheckPayExp,
           boolean replaceAll) {
           this.paycheckPayExp = paycheckPayExp;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckPayExp value for this PaycheckPayExpList.
     * 
     * @return paycheckPayExp
     */
    public com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayExp[] getPaycheckPayExp() {
        return paycheckPayExp;
    }


    /**
     * Sets the paycheckPayExp value for this PaycheckPayExpList.
     * 
     * @param paycheckPayExp
     */
    public void setPaycheckPayExp(com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayExp[] paycheckPayExp) {
        this.paycheckPayExp = paycheckPayExp;
    }

    public com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayExp getPaycheckPayExp(int i) {
        return this.paycheckPayExp[i];
    }

    public void setPaycheckPayExp(int i, com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayExp _value) {
        this.paycheckPayExp[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckPayExpList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckPayExpList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayExpList)) return false;
        PaycheckPayExpList other = (PaycheckPayExpList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckPayExp==null && other.getPaycheckPayExp()==null) || 
             (this.paycheckPayExp!=null &&
              java.util.Arrays.equals(this.paycheckPayExp, other.getPaycheckPayExp()))) &&
            this.replaceAll == other.isReplaceAll();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPaycheckPayExp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckPayExp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckPayExp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaycheckPayExpList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayExpList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckPayExp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "paycheckPayExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayExp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
