/**
 * AsyncUpdateListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.messages_2022_1;

public class AsyncUpdateListResult  extends com.netsuite.webservices.platform.messages_2022_1.AsyncResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.messages_2022_1.WriteResponseList writeResponseList;

    public AsyncUpdateListResult() {
    }

    public AsyncUpdateListResult(
           com.netsuite.webservices.platform.messages_2022_1.WriteResponseList writeResponseList) {
        this.writeResponseList = writeResponseList;
    }


    /**
     * Gets the writeResponseList value for this AsyncUpdateListResult.
     * 
     * @return writeResponseList
     */
    public com.netsuite.webservices.platform.messages_2022_1.WriteResponseList getWriteResponseList() {
        return writeResponseList;
    }


    /**
     * Sets the writeResponseList value for this AsyncUpdateListResult.
     * 
     * @param writeResponseList
     */
    public void setWriteResponseList(com.netsuite.webservices.platform.messages_2022_1.WriteResponseList writeResponseList) {
        this.writeResponseList = writeResponseList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsyncUpdateListResult)) return false;
        AsyncUpdateListResult other = (AsyncUpdateListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.writeResponseList==null && other.getWriteResponseList()==null) || 
             (this.writeResponseList!=null &&
              this.writeResponseList.equals(other.getWriteResponseList())));
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
        if (getWriteResponseList() != null) {
            _hashCode += getWriteResponseList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AsyncUpdateListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2022_1.platform.webservices.netsuite.com", "AsyncUpdateListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeResponseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2022_1.platform.webservices.netsuite.com", "writeResponseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:messages_2022_1.platform.webservices.netsuite.com", "WriteResponseList"));
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
