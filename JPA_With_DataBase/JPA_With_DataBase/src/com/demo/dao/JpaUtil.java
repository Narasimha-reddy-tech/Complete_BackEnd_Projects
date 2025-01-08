package com.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory factory;
	private static EntityManager entity;
	
	static {
		factory=Persistence.createEntityManagerFactory("narasimha");
	}
	
	
	public static EntityManager getEntityManager() {
		
		if(entity==null || !entity.isOpen()) {
			entity= factory.createEntityManager();
		}
		return entity;
		
	}

}