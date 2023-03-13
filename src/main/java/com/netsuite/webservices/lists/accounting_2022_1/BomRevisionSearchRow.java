/**
 * BomRevisionSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2022_1;

public class BomRevisionSearchRow  extends com.netsuite.webservices.platform.core_2022_1.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2022_1.BomRevisionSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2022_1.BomSearchRowBasic billOfMaterialsJoin;

    private com.netsuite.webservices.platform.common_2022_1.BomRevisionComponentSearchRowBasic componentJoin;

    private com.netsuite.webservices.platform.common_2022_1.TransactionSearchRowBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic[] customSearchJoin;

    public BomRevisionSearchRow() {
    }

    public BomRevisionSearchRow(
           com.netsuite.webservices.platform.common_2022_1.BomRevisionSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2022_1.BomSearchRowBasic billOfMaterialsJoin,
           com.netsuite.webservices.platform.common_2022_1.BomRevisionComponentSearchRowBasic componentJoin,
           com.netsuite.webservices.platform.common_2022_1.TransactionSearchRowBasic transactionJoin,
           com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.billOfMaterialsJoin = billOfMaterialsJoin;
        this.componentJoin = componentJoin;
        this.transactionJoin = transactionJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this BomRevisionSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2022_1.BomRevisionSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this BomRevisionSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2022_1.BomRevisionSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the billOfMaterialsJoin value for this BomRevisionSearchRow.
     * 
     * @return billOfMaterialsJoin
     */
    public com.netsuite.webservices.platform.common_2022_1.BomSearchRowBasic getBillOfMaterialsJoin() {
        return billOfMaterialsJoin;
    }


    /**
     * Sets the billOfMaterialsJoin value for this BomRevisionSearchRow.
     * 
     * @param billOfMaterialsJoin
     */
    public void setBillOfMaterialsJoin(com.netsuite.webservices.platform.common_2022_1.BomSearchRowBasic billOfMaterialsJoin) {
        this.billOfMaterialsJoin = billOfMaterialsJoin;
    }


    /**
     * Gets the componentJoin value for this BomRevisionSearchRow.
     * 
     * @return componentJoin
     */
    public com.netsuite.webservices.platform.common_2022_1.BomRevisionComponentSearchRowBasic getComponentJoin() {
        return componentJoin;
    }


    /**
     * Sets the componentJoin value for this BomRevisionSearchRow.
     * 
     * @param componentJoin
     */
    public void setComponentJoin(com.netsuite.webservices.platform.common_2022_1.BomRevisionComponentSearchRowBasic componentJoin) {
        this.componentJoin = componentJoin;
    }


    /**
     * Gets the transactionJoin value for this BomRevisionSearchRow.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2022_1.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this BomRevisionSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2022_1.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the customSearchJoin value for this BomRevisionSearchRow.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this BomRevisionSearchRow.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2022_1.CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BomRevisionSearchRow)) return false;
        BomRevisionSearchRow other = (BomRevisionSearchRow) obj;
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
            ((this.billOfMaterialsJoin==null && other.getBillOfMaterialsJoin()==null) || 
             (this.billOfMaterialsJoin!=null &&
              this.billOfMaterialsJoin.equals(other.getBillOfMaterialsJoin()))) &&
            ((this.componentJoin==null && other.getComponentJoin()==null) || 
             (this.componentJoin!=null &&
              this.componentJoin.equals(other.getComponentJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBillOfMaterialsJoin() != null) {
            _hashCode += getBillOfMaterialsJoin().hashCode();
        }
        if (getComponentJoin() != null) {
            _hashCode += getComponentJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BomRevisionSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "BomRevisionSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterialsJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billOfMaterialsJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "componentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionComponentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
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
