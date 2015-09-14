package br.ufrj.dao;

import javax.persistence.EntityManager;

import br.ufrj.model.Patente;

public class PatenteDAO extends DAOGenerico<Patente> {

	public PatenteDAO(EntityManager em, Class<Patente> classe) {
		super(em, classe);
	}

}
