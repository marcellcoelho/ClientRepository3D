package br.com.repository3d.service;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {
		ObjetoService objetoService = new ObjetoServiceProxy();
		try {
			Objeto[] objetoList = objetoService.getAllObjetosPorIdCategoria(2L);
			for (Objeto objeto : objetoList) {
				System.out.println(objeto.getNome());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}


}
