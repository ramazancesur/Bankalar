/**
 * BankaSubeleri.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class BankaSubeleri  implements java.io.Serializable {
    private tr.gov.tcmb.bs.services.bankaSubeOku.Banka banka;

    private tr.gov.tcmb.bs.services.bankaSubeOku.Sube[] sube;

    private java.lang.String bKd;  // attribute

    private org.apache.axis.types.NonNegativeInteger sAdt;  // attribute

    public BankaSubeleri() {
    }

    public BankaSubeleri(
           tr.gov.tcmb.bs.services.bankaSubeOku.Banka banka,
           tr.gov.tcmb.bs.services.bankaSubeOku.Sube[] sube,
           java.lang.String bKd,
           org.apache.axis.types.NonNegativeInteger sAdt) {
           this.banka = banka;
           this.sube = sube;
           this.bKd = bKd;
           this.sAdt = sAdt;
    }


    /**
     * Gets the banka value for this BankaSubeleri.
     * 
     * @return banka
     */
    public tr.gov.tcmb.bs.services.bankaSubeOku.Banka getBanka() {
        return banka;
    }


    /**
     * Sets the banka value for this BankaSubeleri.
     * 
     * @param banka
     */
    public void setBanka(tr.gov.tcmb.bs.services.bankaSubeOku.Banka banka) {
        this.banka = banka;
    }


    /**
     * Gets the sube value for this BankaSubeleri.
     * 
     * @return sube
     */
    public tr.gov.tcmb.bs.services.bankaSubeOku.Sube[] getSube() {
        return sube;
    }


    /**
     * Sets the sube value for this BankaSubeleri.
     * 
     * @param sube
     */
    public void setSube(tr.gov.tcmb.bs.services.bankaSubeOku.Sube[] sube) {
        this.sube = sube;
    }

    public tr.gov.tcmb.bs.services.bankaSubeOku.Sube getSube(int i) {
        return this.sube[i];
    }

    public void setSube(int i, tr.gov.tcmb.bs.services.bankaSubeOku.Sube _value) {
        this.sube[i] = _value;
    }


    /**
     * Gets the bKd value for this BankaSubeleri.
     * 
     * @return bKd
     */
    public java.lang.String getBKd() {
        return bKd;
    }


    /**
     * Sets the bKd value for this BankaSubeleri.
     * 
     * @param bKd
     */
    public void setBKd(java.lang.String bKd) {
        this.bKd = bKd;
    }


    /**
     * Gets the sAdt value for this BankaSubeleri.
     * 
     * @return sAdt
     */
    public org.apache.axis.types.NonNegativeInteger getSAdt() {
        return sAdt;
    }


    /**
     * Sets the sAdt value for this BankaSubeleri.
     * 
     * @param sAdt
     */
    public void setSAdt(org.apache.axis.types.NonNegativeInteger sAdt) {
        this.sAdt = sAdt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankaSubeleri)) return false;
        BankaSubeleri other = (BankaSubeleri) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.banka==null && other.getBanka()==null) || 
             (this.banka!=null &&
              this.banka.equals(other.getBanka()))) &&
            ((this.sube==null && other.getSube()==null) || 
             (this.sube!=null &&
              java.util.Arrays.equals(this.sube, other.getSube()))) &&
            ((this.bKd==null && other.getBKd()==null) || 
             (this.bKd!=null &&
              this.bKd.equals(other.getBKd()))) &&
            ((this.sAdt==null && other.getSAdt()==null) || 
             (this.sAdt!=null &&
              this.sAdt.equals(other.getSAdt())));
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
        if (getBanka() != null) {
            _hashCode += getBanka().hashCode();
        }
        if (getSube() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSube());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSube(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBKd() != null) {
            _hashCode += getBKd().hashCode();
        }
        if (getSAdt() != null) {
            _hashCode += getSAdt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankaSubeleri.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "BankaSubeleri"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("BKd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "bKd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "BankaKodu"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SAdt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "sAdt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banka");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "banka"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "Banka"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sube");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "sube"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "Sube"));
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
