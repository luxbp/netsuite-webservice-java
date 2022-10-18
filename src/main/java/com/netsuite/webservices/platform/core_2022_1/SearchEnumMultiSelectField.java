/**
 * SearchEnumMultiSelectField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2022_1;

public class SearchEnumMultiSelectField  implements java.io.Serializable {
    private java.lang.String[] searchValue;

    private com.netsuite.webservices.platform.core_2022_1.types.SearchEnumMultiSelectFieldOperator operator;  // attribute

    public SearchEnumMultiSelectField() {
    }

    public SearchEnumMultiSelectField(
           java.lang.String[] searchValue,
           com.netsuite.webservices.platform.core_2022_1.types.SearchEnumMultiSelectFieldOperator operator) {
           this.searchValue = searchValue;
           this.operator = operator;
    }


    /**
     * Gets the searchValue value for this SearchEnumMultiSelectField.
     * 
     * @return searchValue
     */
    public java.lang.String[] getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchEnumMultiSelectField.
     * 
     * @param searchValue
     */
    public void setSearchValue(java.lang.String[] searchValue) {
        this.searchValue = searchValue;
    }

    public java.lang.String getSearchValue(int i) {
        return this.searchValue[i];
    }

    public void setSearchValue(int i, java.lang.String _value) {
        this.searchValue[i] = _value;
    }


    /**
     * Gets the operator value for this SearchEnumMultiSelectField.
     * 
     * @return operator
     */
    public com.netsuite.webservices.platform.core_2022_1.types.SearchEnumMultiSelectFieldOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this SearchEnumMultiSelectField.
     * 
     * @param operator
     */
    public void setOperator(com.netsuite.webservices.platform.core_2022_1.types.SearchEnumMultiSelectFieldOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchEnumMultiSelectField)) return false;
        SearchEnumMultiSelectField other = (SearchEnumMultiSelectField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              java.util.Arrays.equals(this.searchValue, other.getSearchValue()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getSearchValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchEnumMultiSelectField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectFieldOperator"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
