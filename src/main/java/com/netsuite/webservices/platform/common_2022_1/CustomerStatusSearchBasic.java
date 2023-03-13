/**
 * CustomerStatusSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2022_1;

public class CustomerStatusSearchBasic  extends com.netsuite.webservices.platform.core_2022_1.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2022_1.SearchStringField description;

    private com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField externalId;

    private com.netsuite.webservices.platform.core_2022_1.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2022_1.SearchBooleanField includeInLeadReports;

    private com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField internalId;

    private com.netsuite.webservices.platform.core_2022_1.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2022_1.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2022_1.SearchStringField name;

    private com.netsuite.webservices.platform.core_2022_1.SearchDoubleField probability;

    public CustomerStatusSearchBasic() {
    }

    public CustomerStatusSearchBasic(
           com.netsuite.webservices.platform.core_2022_1.SearchStringField description,
           com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField externalId,
           com.netsuite.webservices.platform.core_2022_1.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2022_1.SearchBooleanField includeInLeadReports,
           com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField internalId,
           com.netsuite.webservices.platform.core_2022_1.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2022_1.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2022_1.SearchStringField name,
           com.netsuite.webservices.platform.core_2022_1.SearchDoubleField probability) {
        this.description = description;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.includeInLeadReports = includeInLeadReports;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.name = name;
        this.probability = probability;
    }


    /**
     * Gets the description value for this CustomerStatusSearchBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomerStatusSearchBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2022_1.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the externalId value for this CustomerStatusSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomerStatusSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this CustomerStatusSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this CustomerStatusSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2022_1.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the includeInLeadReports value for this CustomerStatusSearchBasic.
     * 
     * @return includeInLeadReports
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchBooleanField getIncludeInLeadReports() {
        return includeInLeadReports;
    }


    /**
     * Sets the includeInLeadReports value for this CustomerStatusSearchBasic.
     * 
     * @param includeInLeadReports
     */
    public void setIncludeInLeadReports(com.netsuite.webservices.platform.core_2022_1.SearchBooleanField includeInLeadReports) {
        this.includeInLeadReports = includeInLeadReports;
    }


    /**
     * Gets the internalId value for this CustomerStatusSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomerStatusSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2022_1.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this CustomerStatusSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this CustomerStatusSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2022_1.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this CustomerStatusSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomerStatusSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2022_1.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the name value for this CustomerStatusSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomerStatusSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2022_1.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the probability value for this CustomerStatusSearchBasic.
     * 
     * @return probability
     */
    public com.netsuite.webservices.platform.core_2022_1.SearchDoubleField getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this CustomerStatusSearchBasic.
     * 
     * @param probability
     */
    public void setProbability(com.netsuite.webservices.platform.core_2022_1.SearchDoubleField probability) {
        this.probability = probability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerStatusSearchBasic)) return false;
        CustomerStatusSearchBasic other = (CustomerStatusSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.includeInLeadReports==null && other.getIncludeInLeadReports()==null) || 
             (this.includeInLeadReports!=null &&
              this.includeInLeadReports.equals(other.getIncludeInLeadReports()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getIncludeInLeadReports() != null) {
            _hashCode += getIncludeInLeadReports().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerStatusSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerStatusSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInLeadReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeInLeadReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2022_1.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
