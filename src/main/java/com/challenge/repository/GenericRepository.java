
/**
 * @author Felipe Gouvea
 *
 */
package com.challenge.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public abstract class GenericRepository<Entity extends Serializable, Id extends Serializable> {
	
	private Class<Entity> clazz;
	
	@PersistenceContext
	protected EntityManager em;
	
	public GenericRepository(Class<Entity> clazz){
		this.clazz = clazz; 
	}
	
	@Transactional
	public Entity insert(Entity entity){
		 em.persist(entity);		
		 return entity;
	}
	
	@Transactional
	public Entity update(Entity entity){
		return em.merge(entity);
	}
	
	@Transactional
	public void delete(Entity entity){
		em.remove(entity);
	}
	
	@Transactional(readOnly=true)
	public Entity findById(Id id){
		return em.find(clazz, id);
	}
	
	@Transactional(readOnly=true)
	public List<Entity> findList(int size){
		return em.createQuery("select c from " + clazz.getName() + " c ", clazz).setMaxResults(size).getResultList();
	}
	
}
