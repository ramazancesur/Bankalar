/**
 * SGSCvp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class SGSCvp  implements java.io.Serializable {
    private tr.gov.tcmb.bs.services.bankaSubeOku.Sube[] sube;

    private java.lang.Object SGSYok;

    public SGSCvp() {
    }

    public SGSCvp(
           tr.gov.tcmb.bs.services.bankaSubeOku.Sube[] sube,
           java.lang.Object SGSYok) {
           this.sube = sube;
           this.SGSYok = SGSYok;
    }


    /**
     * Gets the sube value for this SGSCvp.
     * 
     * @return sube
     */
    public tr.gov.tcmb.bs.services.bankaSubeOku.Sube[] getSube() {
        return sube;
    }


    /**
     * Sets the sube value for this SGSCvp.
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
     * Gets the SGSYok value for this SGSCvp.
     * 
     * @return SGSYok
     */
    public java.lang.Object getSGSYok() {
        return SGSYok;
    }


    /**
     * Sets the SGSYok value for this SGSCvp.
     * 
     * @param SGSYok
     */
    public void setSGSYok(java.lang.Object SGSYok) {
        this.SGSYok = SGSYok;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SGSCvp)) return false;
        SGSCvp other = (SGSCvp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sube==null && other.getSube()==null) || 
             (this.sube!=null &&
              java.util.Arrays.equals(this.sube, other.getSube()))) &&
            ((this.SGSYok==null && other.getSGSYok()==null) || 
             (this.SGSYok!=null &&
              this.SGSYok.equals(other.getSGSYok())));
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
        if (getSGSYok() != null) {
            _hashCode += getSGSYok().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SGSCvp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "SGSCvp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sube");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "sube"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "Sube"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SGSYok");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "SGSYok"));
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
