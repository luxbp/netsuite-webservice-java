/**
 * PaycheckPayTaxList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.employees_2022_1;

public class PaycheckPayTaxList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayTax[] paycheckPayTax;

    private boolean replaceAll;  // attribute

    public PaycheckPayTaxList() {
    }

    public PaycheckPayTaxList(
           com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayTax[] paycheckPayTax,
           boolean replaceAll) {
           this.paycheckPayTax = paycheckPayTax;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the paycheckPayTax value for this PaycheckPayTaxList.
     * 
     * @return paycheckPayTax
     */
    public com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayTax[] getPaycheckPayTax() {
        return paycheckPayTax;
    }


    /**
     * Sets the paycheckPayTax value for this PaycheckPayTaxList.
     * 
     * @param paycheckPayTax
     */
    public void setPaycheckPayTax(com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayTax[] paycheckPayTax) {
        this.paycheckPayTax = paycheckPayTax;
    }

    public com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayTax getPaycheckPayTax(int i) {
        return this.paycheckPayTax[i];
    }

    public void setPaycheckPayTax(int i, com.netsuite.webservices.transactions.employees_2022_1.PaycheckPayTax _value) {
        this.paycheckPayTax[i] = _value;
    }


    /**
     * Gets the replaceAll value for this PaycheckPayTaxList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this PaycheckPayTaxList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaycheckPayTaxList)) return false;
        PaycheckPayTaxList other = (PaycheckPayTaxList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paycheckPayTax==null && other.getPaycheckPayTax()==null) || 
             (this.paycheckPayTax!=null &&
              java.util.Arrays.equals(this.paycheckPayTax, other.getPaycheckPayTax()))) &&
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
        if (getPaycheckPayTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaycheckPayTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaycheckPayTax(), i);
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
        new org.apache.axis.description.TypeDesc(PaycheckPayTaxList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayTaxList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paycheckPayTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "paycheckPayTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayTax"));
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
