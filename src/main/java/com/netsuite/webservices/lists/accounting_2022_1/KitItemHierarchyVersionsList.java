/**
 * KitItemHierarchyVersionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2022_1;

public class KitItemHierarchyVersionsList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.accounting_2022_1.KitItemHierarchyVersions[] kitItemHierarchyVersions;

    private boolean replaceAll;  // attribute

    public KitItemHierarchyVersionsList() {
    }

    public KitItemHierarchyVersionsList(
           com.netsuite.webservices.lists.accounting_2022_1.KitItemHierarchyVersions[] kitItemHierarchyVersions,
           boolean replaceAll) {
           this.kitItemHierarchyVersions = kitItemHierarchyVersions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the kitItemHierarchyVersions value for this KitItemHierarchyVersionsList.
     * 
     * @return kitItemHierarchyVersions
     */
    public com.netsuite.webservices.lists.accounting_2022_1.KitItemHierarchyVersions[] getKitItemHierarchyVersions() {
        return kitItemHierarchyVersions;
    }


    /**
     * Sets the kitItemHierarchyVersions value for this KitItemHierarchyVersionsList.
     * 
     * @param kitItemHierarchyVersions
     */
    public void setKitItemHierarchyVersions(com.netsuite.webservices.lists.accounting_2022_1.KitItemHierarchyVersions[] kitItemHierarchyVersions) {
        this.kitItemHierarchyVersions = kitItemHierarchyVersions;
    }

    public com.netsuite.webservices.lists.accounting_2022_1.KitItemHierarchyVersions getKitItemHierarchyVersions(int i) {
        return this.kitItemHierarchyVersions[i];
    }

    public void setKitItemHierarchyVersions(int i, com.netsuite.webservices.lists.accounting_2022_1.KitItemHierarchyVersions _value) {
        this.kitItemHierarchyVersions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this KitItemHierarchyVersionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this KitItemHierarchyVersionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KitItemHierarchyVersionsList)) return false;
        KitItemHierarchyVersionsList other = (KitItemHierarchyVersionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kitItemHierarchyVersions==null && other.getKitItemHierarchyVersions()==null) || 
             (this.kitItemHierarchyVersions!=null &&
              java.util.Arrays.equals(this.kitItemHierarchyVersions, other.getKitItemHierarchyVersions()))) &&
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
        if (getKitItemHierarchyVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKitItemHierarchyVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKitItemHierarchyVersions(), i);
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
        new org.apache.axis.description.TypeDesc(KitItemHierarchyVersionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "KitItemHierarchyVersionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kitItemHierarchyVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "kitItemHierarchyVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "KitItemHierarchyVersions"));
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
