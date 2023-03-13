/**
 * VendorBillExpenseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.purchases_2022_1;

public class VendorBillExpenseList  implements java.io.Serializable {
    private com.netsuite.webservices.transactions.purchases_2022_1.VendorBillExpense[] expense;

    private boolean replaceAll;  // attribute

    public VendorBillExpenseList() {
    }

    public VendorBillExpenseList(
           com.netsuite.webservices.transactions.purchases_2022_1.VendorBillExpense[] expense,
           boolean replaceAll) {
           this.expense = expense;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the expense value for this VendorBillExpenseList.
     * 
     * @return expense
     */
    public com.netsuite.webservices.transactions.purchases_2022_1.VendorBillExpense[] getExpense() {
        return expense;
    }


    /**
     * Sets the expense value for this VendorBillExpenseList.
     * 
     * @param expense
     */
    public void setExpense(com.netsuite.webservices.transactions.purchases_2022_1.VendorBillExpense[] expense) {
        this.expense = expense;
    }

    public com.netsuite.webservices.transactions.purchases_2022_1.VendorBillExpense getExpense(int i) {
        return this.expense[i];
    }

    public void setExpense(int i, com.netsuite.webservices.transactions.purchases_2022_1.VendorBillExpense _value) {
        this.expense[i] = _value;
    }


    /**
     * Gets the replaceAll value for this VendorBillExpenseList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this VendorBillExpenseList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorBillExpenseList)) return false;
        VendorBillExpenseList other = (VendorBillExpenseList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expense==null && other.getExpense()==null) || 
             (this.expense!=null &&
              java.util.Arrays.equals(this.expense, other.getExpense()))) &&
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
        if (getExpense() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpense());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpense(), i);
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
        new org.apache.axis.description.TypeDesc(VendorBillExpenseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "VendorBillExpenseList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "expense"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "VendorBillExpense"));
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
