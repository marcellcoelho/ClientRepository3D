/**
 * Objeto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.repository3d.service;

public class Objeto  extends br.com.repository3d.service.AbstractEntity  implements java.io.Serializable {
    private java.lang.Long idObjeto;

    private java.lang.String nome;

    private java.lang.String objeto;

    public Objeto() {
    }

    public Objeto(
           java.lang.Long idObjeto,
           java.lang.String nome,
           java.lang.String objeto) {
        this.idObjeto = idObjeto;
        this.nome = nome;
        this.objeto = objeto;
    }


    /**
     * Gets the idObjeto value for this Objeto.
     * 
     * @return idObjeto
     */
    public java.lang.Long getIdObjeto() {
        return idObjeto;
    }


    /**
     * Sets the idObjeto value for this Objeto.
     * 
     * @param idObjeto
     */
    public void setIdObjeto(java.lang.Long idObjeto) {
        this.idObjeto = idObjeto;
    }


    /**
     * Gets the nome value for this Objeto.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Objeto.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the objeto value for this Objeto.
     * 
     * @return objeto
     */
    public java.lang.String getObjeto() {
        return objeto;
    }


    /**
     * Sets the objeto value for this Objeto.
     * 
     * @param objeto
     */
    public void setObjeto(java.lang.String objeto) {
        this.objeto = objeto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Objeto)) return false;
        Objeto other = (Objeto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.idObjeto==null && other.getIdObjeto()==null) || 
             (this.idObjeto!=null &&
              this.idObjeto.equals(other.getIdObjeto()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.objeto==null && other.getObjeto()==null) || 
             (this.objeto!=null &&
              this.objeto.equals(other.getObjeto())));
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
        if (getIdObjeto() != null) {
            _hashCode += getIdObjeto().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getObjeto() != null) {
            _hashCode += getObjeto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Objeto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.repository3d.com.br/", "objeto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idObjeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idObjeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objeto"));
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
