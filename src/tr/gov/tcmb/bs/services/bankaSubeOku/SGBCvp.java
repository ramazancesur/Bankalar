/**
 * SGBCvp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class SGBCvp  implements java.io.Serializable {
    private tr.gov.tcmb.bs.services.bankaSubeOku.Banka[] banka;

    private java.lang.Object SGBYok;

    public SGBCvp() {
    }

    public SGBCvp(
           tr.gov.tcmb.bs.services.bankaSubeOku.Banka[] banka,
           java.lang.Object SGBYok) {
           this.banka = banka;
           this.SGBYok = SGBYok;
    }


    /**
     * Gets the banka value for this SGBCvp.
     * 
     * @return banka
     */
    public tr.gov.tcmb.bs.services.bankaSubeOku.Banka[] getBanka() {
        return banka;
    }


    /**
     * Sets the banka value for this SGBCvp.
     * 
     * @param banka
     */
    public void setBanka(tr.gov.tcmb.bs.services.bankaSubeOku.Banka[] banka) {
        this.banka = banka;
    }

    public tr.gov.tcmb.bs.services.bankaSubeOku.Banka getBanka(int i) {
        return this.banka[i];
    }

    public void setBanka(int i, tr.gov.tcmb.bs.services.bankaSubeOku.Banka _value) {
        this.banka[i] = _value;
    }


    /**
     * Gets the SGBYok value for this SGBCvp.
     * 
     * @return SGBYok
     */
    public java.lang.Object getSGBYok() {
        return SGBYok;
    }


    /**
     * Sets the SGBYok value for this SGBCvp.
     * 
     * @param SGBYok
     */
    public void setSGBYok(java.lang.Object SGBYok) {
        this.SGBYok = SGBYok;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SGBCvp)) return false;
        SGBCvp other = (SGBCvp) obj;
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
              java.util.Arrays.equals(this.banka, other.getBanka()))) &&
            ((this.SGBYok==null && other.getSGBYok()==null) || 
             (this.SGBYok!=null &&
              this.SGBYok.equals(other.getSGBYok())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBanka());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBanka(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSGBYok() != null) {
            _hashCode += getSGBYok().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SGBCvp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "SGBCvp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banka");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "banka"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "Banka"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGBYok");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "SGBYok"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
