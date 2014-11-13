package br.com.repository3d.service;

public class ObjetoServiceProxy implements br.com.repository3d.service.ObjetoService {
  private String _endpoint = null;
  private br.com.repository3d.service.ObjetoService objetoService = null;
  
  public ObjetoServiceProxy() {
    _initObjetoServiceProxy();
  }
  
  public ObjetoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initObjetoServiceProxy();
  }
  
  private void _initObjetoServiceProxy() {
    try {
      objetoService = (new br.com.repository3d.service.ObjetoServiceServiceLocator()).getObjetoServicePort();
      if (objetoService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)objetoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)objetoService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (objetoService != null)
      ((javax.xml.rpc.Stub)objetoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.repository3d.service.ObjetoService getObjetoService() {
    if (objetoService == null)
      _initObjetoServiceProxy();
    return objetoService;
  }
  
  public br.com.repository3d.service.Objeto[] getAllObjetosPorIdCategoria(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (objetoService == null)
      _initObjetoServiceProxy();
    return objetoService.getAllObjetosPorIdCategoria(arg0);
  }
  
  public br.com.repository3d.service.Objeto getObjetoPorID(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (objetoService == null)
      _initObjetoServiceProxy();
    return objetoService.getObjetoPorID(arg0);
  }
  
  
}