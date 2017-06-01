package io.altar.jseproject.view;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.service.ShelfService;

@Named("shelfBean")
@RequestScoped
public class ShelfBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private Shelf shelf = new Shelf();

	private boolean disable = true;

	@Inject
	private ShelfService shelfService; 

	private long guardarID = 1; 

	public void onRowEdit(RowEditEvent event) {
		//System.out.println(ID);
        FacesMessage msg = new FacesMessage("Prateleira editada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição cancelada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Prateleira Selecionado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Prateleira desselecionado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

   private List<Shelf> selectedShelf;

public Shelf getShelf() {
	return shelf;
}

public void setShelf(Shelf shelf) {
	this.shelf = shelf;
}

public boolean isDisable() {
	return disable;
}

public void setDisable(boolean disable) {
	this.disable = disable;
}

public ShelfService getShelfService() {
	return shelfService;
}

public void setShelfService(ShelfService shelfService) {
	this.shelfService = shelfService;
}

public long getGuardarID() {
	return guardarID;
}

public void setGuardarID(long guardarID) {
	this.guardarID = guardarID;
}

public List<Shelf> getSelectedShelf() {
	return selectedShelf;
}

public void setSelectedShelf(List<Shelf> selectedShelf) {
	this.selectedShelf = selectedShelf;
}
   
}
