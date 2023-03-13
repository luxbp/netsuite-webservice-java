/**
 * MerchandiseHierarchyNodeSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2022_1;

public class MerchandiseHierarchyNodeSearchRow  extends com.netsuite.webservices.platform.core_2022_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic parentNodeJoin;

    public MerchandiseHierarchyNodeSearchRow() {
    }

    public MerchandiseHierarchyNodeSearchRow(
           com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic parentNodeJoin) {
        this.basic = basic;
        this.parentNodeJoin = parentNodeJoin;
    }


    /**
     * Gets the basic value for this MerchandiseHierarchyNodeSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this MerchandiseHierarchyNodeSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the parentNodeJoin value for this MerchandiseHierarchyNodeSearchRow.
     * 
     * @return parentNodeJoin
     */
    public com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic getParentNodeJoin() {
        return parentNodeJoin;
    }


    /**
     * Sets the parentNodeJoin value for this MerchandiseHierarchyNodeSearchRow.
     * 
     * @param parentNodeJoin
     */
    public void setParentNodeJoin(com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchRowBasic parentNodeJoin) {
        this.parentNodeJoin = parentNodeJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchandiseHierarchyNodeSearchRow)) return false;
        MerchandiseHierarchyNodeSearchRow other = (MerchandiseHierarchyNodeSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.parentNodeJoin==null && other.getParentNodeJoin()==null) || 
             (this.parentNodeJoin!=null &&
              this.parentNodeJoin.equals(other.getParentNodeJoin())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getParentNodeJoin() != null) {
            _hashCode += getParentNodeJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchandiseHierarchyNodeSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNodeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parentNodeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
