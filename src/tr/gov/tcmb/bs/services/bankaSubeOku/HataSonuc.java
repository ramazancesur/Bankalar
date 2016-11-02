/**
 * HataSonuc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class HataSonuc  implements java.io.Serializable {
    private java.lang.String sonucKodu;

    private java.lang.String aciklama;

    public HataSonuc() {
    }

    public HataSonuc(
           java.lang.String sonucKodu,
           java.lang.String aciklama) {
           this.sonucKodu = sonucKodu;
           this.aciklama = aciklama;
    }


    /**
     * Gets the sonucKodu value for this HataSonuc.
     * 
     * @return sonucKodu
     */
    public java.lang.String getSonucKodu() {
        return sonucKodu;
    }


    /**
     * Sets the sonucKodu value for this HataSonuc.
     * 
     * @param sonucKodu
     */
    public void setSonucKodu(java.lang.String sonucKodu) {
        this.sonucKodu = sonucKodu;
    }


    /**
     * Gets the aciklama value for this HataSonuc.
     * 
     * @return aciklama
     */
    public java.lang.String getAciklama() {
        return aciklama;
    }


    /**
     * Sets the aciklama value for this HataSonuc.
     * 
     * @param aciklama
     */
    public void setAciklama(java.lang.String aciklama) {
        this.aciklama = aciklama;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HataSonuc)) return false;
        HataSonuc other = (HataSonuc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sonucKodu==null && other.getSonucKodu()==null) || 
             (this.sonucKodu!=null &&
              this.sonucKodu.equals(other.getSonucKodu()))) &&
            ((this.aciklama==null && other.getAciklama()==null) || 
             (this.aciklama!=null &&
              this.aciklama.equals(other.getAciklama())));
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
        if (getSonucKodu() != null) {
            _hashCode += getSonucKodu().hashCode();
        }
        if (getAciklama() != null) {
            _hashCode += getAciklama().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HataSonuc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "HataSonuc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonucKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "sonucKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aciklama");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "aciklama"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "KarakterDizgesi"));
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
