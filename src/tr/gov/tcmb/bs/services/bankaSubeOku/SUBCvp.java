/**
 * SUBCvp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.tcmb.bs.services.bankaSubeOku;

public class SUBCvp  implements java.io.Serializable {
    private tr.gov.tcmb.bs.services.bankaSubeOku.Sube sube;

    public SUBCvp() {
    }

    public SUBCvp(
           tr.gov.tcmb.bs.services.bankaSubeOku.Sube sube) {
           this.sube = sube;
    }


    /**
     * Gets the sube value for this SUBCvp.
     * 
     * @return sube
     */
    public tr.gov.tcmb.bs.services.bankaSubeOku.Sube getSube() {
        return sube;
    }


    /**
     * Sets the sube value for this SUBCvp.
     * 
     * @param sube
     */
    public void setSube(tr.gov.tcmb.bs.services.bankaSubeOku.Sube sube) {
        this.sube = sube;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUBCvp)) return false;
        SUBCvp other = (SUBCvp) obj;
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
              this.sube.equals(other.getSube())));
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
            _hashCode += getSube().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUBCvp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "SUBCvp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sube");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "sube"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bs.tcmb.gov.tr/services/bankaSubeOku/", "Sube"));
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
