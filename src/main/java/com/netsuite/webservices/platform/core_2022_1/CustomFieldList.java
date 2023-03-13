/**
 * CustomFieldList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2022_1;

public class CustomFieldList  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2022_1.CustomFieldRef[] customField;

    public CustomFieldList() {
    }

    public CustomFieldList(
           com.netsuite.webservices.platform.core_2022_1.CustomFieldRef[] customField) {
           this.customField = customField;
    }


    /**
     * Gets the customField value for this CustomFieldList.
     * 
     * @return customField
     */
    public com.netsuite.webservices.platform.core_2022_1.CustomFieldRef[] getCustomField() {
        return customField;
    }


    /**
     * Sets the customField value for this CustomFieldList.
     * 
     * @param customField
     */
    public void setCustomField(com.netsuite.webservices.platform.core_2022_1.CustomFieldRef[] customField) {
        this.customField = customField;
    }

    public com.netsuite.webservices.platform.core_2022_1.CustomFieldRef getCustomField(int i) {
        return this.customField[i];
    }

    public void setCustomField(int i, com.netsuite.webservices.platform.core_2022_1.CustomFieldRef _value) {
        this.customField[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldList)) return false;
        CustomFieldList other = (CustomFieldList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customField==null && other.getCustomField()==null) || 
             (this.customField!=null &&
              java.util.Arrays.equals(this.customField, other.getCustomField())));
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
        if (getCustomField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomField(), i);
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
        new org.apache.axis.description.TypeDesc(CustomFieldList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "customField"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldRef"));
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
