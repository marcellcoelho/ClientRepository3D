/**
 * ObjetoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.repository3d.service;

public interface ObjetoService extends java.rmi.Remote {
    public br.com.repository3d.service.Objeto[] getAllObjetosPorIdCategoria(java.lang.Long arg0) throws java.rmi.RemoteException;
    public br.com.repository3d.service.Objeto getObjetoPorID(java.lang.Long arg0) throws java.rmi.RemoteException;
}
