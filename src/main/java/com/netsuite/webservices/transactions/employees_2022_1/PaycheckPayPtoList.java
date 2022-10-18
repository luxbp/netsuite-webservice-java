/**
 * PaycheckPayPtoList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2022_1;

public class PaycheckPayPtoList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayPto[] paycheckPayPto;

    private boolean replaceAll;  // attribute

    public PaycheckPayPtoList() {
    }

    public PaycheckPayPtoList(
           com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayPto[] paycheckPayPto,
           boolean replaceAll) {
           this.paycheckPayPto = paycheckPayPto;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckPayPto value for this PaycheckPayPtoList.
     * 
     * @return paycheckPayPto
     */
    public com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayPto[] getPaycheckPayPto() {
        return paycheckPayPto;
    }


    /**
     * Sets the paycheckPayPto value for this PaycheckPayPtoList.
     * 
     * @param paycheckPayPto
     */
    public void setPaycheckPayPto(com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayPto[] paycheckPayPto) {
        this.paycheckPayPto = paycheckPayPto;
    }

    public com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayPto getPaycheckPayPto(int i) {
        return this.paycheckPayPto[i];
    }

    public void setPaycheckPayPto(int i, com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayPto _value) {
        this.paycheckPayPto[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckPayPtoList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckPayPtoList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayPtoList)) return false;
        PaycheckPayPtoList other = (PaycheckPayPtoList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckPayPto==null && other.getPaycheckPayPto()==null) || 
             (this.paycheckPayPto!=null &&
              java.util.Arrays.equals(this.paycheckPayPto, other.getPaycheckPayPto()))) &&
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
        if (getPaycheckPayPto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckPayPto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckPayPto(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckPayPtoList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayPtoList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckPayPto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "paycheckPayPto"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayPto"));
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
