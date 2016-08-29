
/**
 * @author Felipe Gouvea
 *
 */
package com.challenge.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericRepository <Entity> {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Entity entity){
		em.persist(entity);		
	}
	public void delete(Entity entity){
		em.remove(entity);
	}

}
