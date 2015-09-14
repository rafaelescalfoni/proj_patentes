package br.ufrj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.ufrj.dao.DAOFactory;
import br.ufrj.model.Patente;

@Resource
public class PatenteController {

	private final Result result;
	//private final DAOFactory daoFactory;
	
	public PatenteController(Result result) {//, DAOFactory daoFactory) {
		this.result = result;
		//this.daoFactory = daoFactory;
	}
	
	@Get @Path("/patentes/query/{keyword}")
	public void list(String keyword){
		System.out.println("entrou no método list");
		String strQuery = "FROM Patente p WHERE p.titulo like :keyword ";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("keyword", keyword);
		
		//List<Patente> list = daoFactory.getPatenteDAO().list(strQuery, params);
		//result.use(Results.json()).from(list).serialize();
		
		
		
	}
 	
}
