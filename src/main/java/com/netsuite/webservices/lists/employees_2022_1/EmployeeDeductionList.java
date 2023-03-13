/**
 * EmployeeDeductionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.employees_2022_1;

public class EmployeeDeductionList  implements java.io.Serializable {
    private com.netsuite.webservices.lists.employees_2022_1.EmployeeDeduction[] employeeDeduction;

    private boolean replaceAll;  // attribute

    public EmployeeDeductionList() {
    }

    public EmployeeDeductionList(
           com.netsuite.webservices.lists.employees_2022_1.EmployeeDeduction[] employeeDeduction,
           boolean replaceAll) {
           this.employeeDeduction = employeeDeduction;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the employeeDeduction value for this EmployeeDeductionList.
     * 
     * @return employeeDeduction
     */
    public com.netsuite.webservices.lists.employees_2022_1.EmployeeDeduction[] getEmployeeDeduction() {
        return employeeDeduction;
    }


    /**
     * Sets the employeeDeduction value for this EmployeeDeductionList.
     * 
     * @param employeeDeduction
     */
    public void setEmployeeDeduction(com.netsuite.webservices.lists.employees_2022_1.EmployeeDeduction[] employeeDeduction) {
        this.employeeDeduction = employeeDeduction;
    }

    public com.netsuite.webservices.lists.employees_2022_1.EmployeeDeduction getEmployeeDeduction(int i) {
        return this.employeeDeduction[i];
    }

    public void setEmployeeDeduction(int i, com.netsuite.webservices.lists.employees_2022_1.EmployeeDeduction _value) {
        this.employeeDeduction[i] = _value;
    }


    /**
     * Gets the replaceAll value for this EmployeeDeductionList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this EmployeeDeductionList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeDeductionList)) return false;
        EmployeeDeductionList other = (EmployeeDeductionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeDeduction==null && other.getEmployeeDeduction()==null) || 
             (this.employeeDeduction!=null &&
              java.util.Arrays.equals(this.employeeDeduction, other.getEmployeeDeduction()))) &&
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
        if (getEmployeeDeduction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeDeduction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeDeduction(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeDeductionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeDeductionList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeDeduction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2022_1.lists.webservices.netsuite.com", "employeeDeduction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeDeduction"));
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
