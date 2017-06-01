package io.altar.jseproject.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.altar.jseproject.model.Shelf;


@Named("shelfService")
@Transactional
@RequestScoped
public class ShelfService implements Serializable {
	private static final long serialVersionUID = 1L;

	// unitName defined in persistence.xml
	@PersistenceContext(name = "repository")
	static EntityManager em;

//	public List<Shelf> listShelfs() {
//		List<Shelf> shelfList = new ArrayList<Shelf>(ShelfRepository.getInstance().consultAll());
//		return shelfList;
//	}
//
//	public String createShelf(Shelf shelf, String nextPage) {
//		ShelfRepository.getInstance().createEntity(shelf);
//		return nextPage;
//	}
//
//	private List<Shelf> selectedShelf = new ArrayList<Shelf>(ShelfRepository.getInstance().consultAll());
//
//	public String removeShelf2(Long ID, String nextPage) {
//		ShelfRepository.getInstance().removeE(ID);
//		return nextPage;
//	}

//	public void removeShelf() {
//		Shelf shelf = selectedShelf.get(0);
//		Long ID = shelf.getID();
//		int name = shelf.getLocal();
//		System.out.println(ID);
//		System.out.println(name);
//		// ProductRepository.getInstance().removeE(ID);
//	}
//
//	public List<Shelf> getSelectedShelf() {
//		return selectedShelf;
//	}
//
//	public void setSelectedShelf(List<Shelf> selectedShelf) {
//		this.selectedShelf = selectedShelf;
//	}
}
