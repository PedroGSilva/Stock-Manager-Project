package io.altar.jseproject.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.altar.jseproject.model.Product;

@Named("productService")
@Transactional
@RequestScoped
public class ProductService implements Serializable {  //It's a Entity Manager
	private static final long serialVersionUID = 1L;
	
	// unitName defined in persistence.xml
	@PersistenceContext(name = "repository")
	static EntityManager em;
	
	public String createProd (Product product, String nextPage) {
		em.persist(product);
        return nextPage;
    }
	
	public Collection <Product> listProducts (){
		Query query = em.createQuery("SELECT e FROM Product e");
		return (Collection <Product>) query.getResultList();
	}
	
	public static void mergeProd() {
		
	}
	
	public String removeProd (Long ID, String nextPage){
		Product prodRemoved = em.find(Product.class, ID);
		em.remove(prodRemoved);
		return nextPage;
	}
	
}

