package br.ufrj.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.ufrj.model.Patente;

@Component
public class DAOFactory {
	private EntityManager em;

	public DAOFactory(EntityManager em) {
		this.em = em;
	}
	
	public PatenteDAO getPatenteDAO(){
		return new PatenteDAO(em, Patente.class);
	}
	
}
