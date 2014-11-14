package br.com.repository3d.managedbean;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.repository3d.service.Objeto;
import br.com.repository3d.service.ObjetoService;
import br.com.repository3d.service.ObjetoServiceProxy;

@RequestScoped
@ManagedBean(name="clientMB")
public class ClientMB implements Serializable {

	private static final long serialVersionUID = -7617713202035357483L;
	
	private Objeto objeto;
	
	private ObjetoService objetoService = new ObjetoServiceProxy();
	
	@PostConstruct
	public void init() {
		try {
			objeto = objetoService.getObjetoPorID(14L);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}
	
	

}
