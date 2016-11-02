/**
 * Banka.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class Banka  implements java.io.Serializable {
    private java.lang.String bKd;

    private java.lang.String bAd;

    private java.lang.String bIlAd;

    private java.lang.String adr;

    private java.lang.String sonIslemTuru;  // attribute

    private java.lang.String sonIslemZamani;  // attribute

    public Banka() {
    }

    public Banka(
           java.lang.String bKd,
           java.lang.String bAd,
           java.lang.String bIlAd,
           java.lang.String adr,
           java.lang.String sonIslemTuru,
           java.lang.String sonIslemZamani) {
           this.bKd = bKd;
           this.bAd = bAd;
           this.bIlAd = bIlAd;
           this.adr = adr;
           this.sonIslemTuru = sonIslemTuru;
           this.sonIslemZamani = sonIslemZamani;
    }


    /**
     * Gets the bKd value for this Banka.
     * 
     * @return bKd
     */
    public java.lang.String getBKd() {
        return bKd;
    }


    /**
     * Sets the bKd value for this Banka.
     * 
     * @param bKd
     */
    public void setBKd(java.lang.String bKd) {
        this.bKd = bKd;
    }


    /**
     * Gets the bAd value for this Banka.
     * 
     * @return bAd
     */
    public java.lang.String getBAd() {
        return bAd;
    }


    /**
     * Sets the bAd value for this Banka.
     * 
     * @param bAd
     */
    public void setBAd(java.lang.String bAd) {
        this.bAd = bAd;
    }


    /**
     * Gets the bIlAd value for this Banka.
     * 
     * @return bIlAd
     */
    public java.lang.String getBIlAd() {
        return bIlAd;
    }


    /**
     * Sets the bIlAd value for this Banka.
     * 
     * @param bIlAd
     */
    public void setBIlAd(java.lang.String bIlAd) {
        this.bIlAd = bIlAd;
    }


    /**
     * Gets the adr value for this Banka.
     * 
     * @return adr
     */
    public java.lang.String getAdr() {
        return adr;
    }


    /**
     * Sets the adr value for this Banka.
     * 
     * @param adr
     */
    public void setAdr(java.lang.String adr) {
        this.adr = adr;
    }


    /**
     * Gets the sonIslemTuru value for this Banka.
     * 
     * @return sonIslemTuru
     */
    public java.lang.String getSonIslemTuru() {
        return sonIslemTuru;
    }


    /**
     * Sets the sonIslemTuru value for this Banka.
     * 
     * @param sonIslemTuru
     */
    public void setSonIslemTuru(java.lang.String sonIslemTuru) {
        this.sonIslemTuru = sonIslemTuru;
    }


    /**
     * Gets the sonIslemZamani value for this Banka.
     * 
     * @return sonIslemZamani
     */
    public java.lang.String getSonIslemZamani() {
        return sonIslemZamani;
    }


    /**
     * Sets the sonIslemZamani value for this Banka.
     * 
     * @param sonIslemZamani
     */
    public void setSonIslemZamani(java.lang.String sonIslemZamani) {
        this.sonIslemZamani = sonIslemZamani;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Banka)) return false;
        Banka other = (Banka) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bKd==null && other.getBKd()==null) || 
             (this.bKd!=null &&
              this.bKd.equals(other.getBKd()))) &&
            ((this.bAd==null && other.getBAd()==null) || 
             (this.bAd!=null &&
              this.bAd.equals(other.getBAd()))) &&
            ((this.bIlAd==null && other.getBIlAd()==null) || 
             (this.bIlAd!=null &&
              this.bIlAd.equals(other.getBIlAd()))) &&
            ((this.adr==null && other.getAdr()==null) || 
             (this.adr!=null &&
              this.adr.equals(other.getAdr()))) &&
            ((this.sonIslemTuru==null && other.getSonIslemTuru()==null) || 
             (this.sonIslemTuru!=null &&
              this.sonIslemTuru.equals(other.getSonIslemTuru()))) &&
            ((this.sonIslemZamani==null && other.getSonIslemZamani()==null) || 
             (this.sonIslemZamani!=null &&
              this.sonIslemZamani.equals(other.getSonIslemZamani())));
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
        if (getBKd() != null) {
            _hashCode += getBKd().hashCode();
        }
        if (getBAd() != null) {
            _hashCode += getBAd().hashCode();
        }
        if (getBIlAd() != null) {
            _hashCode += getBIlAd().hashCode();
        }
        if (getAdr() != null) {
            _hashCode += getAdr().hashCode();
        }
        if (getSonIslemTuru() != null) {
            _hashCode += getSonIslemTuru().hashCode();
        }
        if (getSonIslemZamani() != null) {
            _hashCode += getSonIslemZamani().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Banka.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "Banka"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sonIslemTuru");
        attrField.setXmlName(new javax.xml.namespace.QName("", "sonIslemTuru"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "IslevTuru"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sonIslemZamani");
        attrField.setXmlName(new javax.xml.namespace.QName("", "sonIslemZamani"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "ZamanDamgasi"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BKd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "bKd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "bAd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "KarakterDizgesi"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIlAd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "bIlAd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "KarakterDizgesi"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "adr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "KarakterDizgesi"));
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
