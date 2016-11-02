/**
 * BankaSubeOkuIstem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class BankaSubeOkuIstem  implements java.io.Serializable {
    private java.lang.String blgTur;

    private java.lang.String bKd;

    private java.lang.String sKd;

    public BankaSubeOkuIstem() {
    }

    public BankaSubeOkuIstem(
           java.lang.String blgTur,
           java.lang.String bKd,
           java.lang.String sKd) {
           this.blgTur = blgTur;
           this.bKd = bKd;
           this.sKd = sKd;
    }


    /**
     * Gets the blgTur value for this BankaSubeOkuIstem.
     * 
     * @return blgTur
     */
    public java.lang.String getBlgTur() {
        return blgTur;
    }


    /**
     * Sets the blgTur value for this BankaSubeOkuIstem.
     * 
     * @param blgTur
     */
    public void setBlgTur(java.lang.String blgTur) {
        this.blgTur = blgTur;
    }


    /**
     * Gets the bKd value for this BankaSubeOkuIstem.
     * 
     * @return bKd
     */
    public java.lang.String getBKd() {
        return bKd;
    }


    /**
     * Sets the bKd value for this BankaSubeOkuIstem.
     * 
     * @param bKd
     */
    public void setBKd(java.lang.String bKd) {
        this.bKd = bKd;
    }


    /**
     * Gets the sKd value for this BankaSubeOkuIstem.
     * 
     * @return sKd
     */
    public java.lang.String getSKd() {
        return sKd;
    }


    /**
     * Sets the sKd value for this BankaSubeOkuIstem.
     * 
     * @param sKd
     */
    public void setSKd(java.lang.String sKd) {
        this.sKd = sKd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankaSubeOkuIstem)) return false;
        BankaSubeOkuIstem other = (BankaSubeOkuIstem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blgTur==null && other.getBlgTur()==null) || 
             (this.blgTur!=null &&
              this.blgTur.equals(other.getBlgTur()))) &&
            ((this.bKd==null && other.getBKd()==null) || 
             (this.bKd!=null &&
              this.bKd.equals(other.getBKd()))) &&
            ((this.sKd==null && other.getSKd()==null) || 
             (this.sKd!=null &&
              this.sKd.equals(other.getSKd())));
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
        if (getBlgTur() != null) {
            _hashCode += getBlgTur().hashCode();
        }
        if (getBKd() != null) {
            _hashCode += getBKd().hashCode();
        }
        if (getSKd() != null) {
            _hashCode += getSKd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankaSubeOkuIstem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", ">bankaSubeOkuIstem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blgTur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "blgTur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BKd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "bKd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "sKd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
