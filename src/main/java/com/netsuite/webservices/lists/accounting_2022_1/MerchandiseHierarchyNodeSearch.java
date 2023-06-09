/**
 * MerchandiseHierarchyNodeSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2022_1;

public class MerchandiseHierarchyNodeSearch  extends com.netsuite.webservices.platform.core_2022_1.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic basic;

    private com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic parentNodeJoin;

    public MerchandiseHierarchyNodeSearch() {
    }

    public MerchandiseHierarchyNodeSearch(
           com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic basic,
           com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic parentNodeJoin) {
        this.basic = basic;
        this.parentNodeJoin = parentNodeJoin;
    }


    /**
     * Gets the basic value for this MerchandiseHierarchyNodeSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this MerchandiseHierarchyNodeSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the parentNodeJoin value for this MerchandiseHierarchyNodeSearch.
     * 
     * @return parentNodeJoin
     */
    public com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic getParentNodeJoin() {
        return parentNodeJoin;
    }


    /**
     * Sets the parentNodeJoin value for this MerchandiseHierarchyNodeSearch.
     * 
     * @param parentNodeJoin
     */
    public void setParentNodeJoin(com.netsuite.webservices.platform.common_2022_1.MerchandiseHierarchyNodeSearchBasic parentNodeJoin) {
        this.parentNodeJoin = parentNodeJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchandiseHierarchyNodeSearch)) return false;
        MerchandiseHierarchyNodeSearch other = (MerchandiseHierarchyNodeSearch) obj;
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
        new org.apache.axis.description.TypeDesc(MerchandiseHierarchyNodeSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "MerchandiseHierarchyNodeSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNodeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parentNodeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchBasic"));
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
