/**
 * NonInventoryResaleItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2022_1;

public class NonInventoryResaleItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2022_1.NonInventoryResaleItemHierarchyVersions[] nonInventoryResaleItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public NonInventoryResaleItemHierarchyVersionsList() {
    }

    public NonInventoryResaleItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2022_1.NonInventoryResaleItemHierarchyVersions[] nonInventoryResaleItemHierarchyVersions,
           boolean replaceAll) {
           this.nonInventoryResaleItemHierarchyVersions = nonInventoryResaleItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the nonInventoryResaleItemHierarchyVersions value for this NonInventoryResaleItemHierarchyVersionsList.
     * 
     * @return nonInventoryResaleItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2022_1.NonInventoryResaleItemHierarchyVersions[] getNonInventoryResaleItemHierarchyVersions() {
        return nonInventoryResaleItemHierarchyVersions;
    }


    /**
     * Sets the nonInventoryResaleItemHierarchyVersions value for this NonInventoryResaleItemHierarchyVersionsList.
     * 
     * @param nonInventoryResaleItemHierarchyVersions
     */
    public void setNonInventoryResaleItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2022_1.NonInventoryResaleItemHierarchyVersions[] nonInventoryResaleItemHierarchyVersions) {
        this.nonInventoryResaleItemHierarchyVersions = nonInventoryResaleItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2022_1.NonInventoryResaleItemHierarchyVersions getNonInventoryResaleItemHierarchyVersions(int i) {
        return this.nonInventoryResaleItemHierarchyVersions[i];
    }

    public void setNonInventoryResaleItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2022_1.NonInventoryResaleItemHierarchyVersions _value) {
        this.nonInventoryResaleItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this NonInventoryResaleItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this NonInventoryResaleItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NonInventoryResaleItemHierarchyVersionsList)) return false;
        NonInventoryResaleItemHierarchyVersionsList other = (NonInventoryResaleItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nonInventoryResaleItemHierarchyVersions==null && other.getNonInventoryResaleItemHierarchyVersions()==null) || 
             (this.nonInventoryResaleItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.nonInventoryResaleItemHierarchyVersions, other.getNonInventoryResaleItemHierarchyVersions()))) &&
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
        if (getNonInventoryResaleItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonInventoryResaleItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonInventoryResaleItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(NonInventoryResaleItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "NonInventoryResaleItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonInventoryResaleItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nonInventoryResaleItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "NonInventoryResaleItemHierarchyVersions"));
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
