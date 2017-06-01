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


import io.altar.jseproject.model.Product;
import io.altar.jseproject.service.ProductService;

@Named("productBean")
@RequestScoped
public class ProductBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private Product product = new Product();

	private boolean disable = true;

	@Inject
	private ProductService productService; 

	private long guardarID = 1; 

	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Produto editado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        ProductService.mergeProd();
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição cancelada");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Produto Selecionado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Produto desselecionado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

   private List<Product> selectedProd;
    
	// Getters & Setters
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Long getGuardarID() {
		return guardarID;
	}

	public void setGuardarID(Long guardarID) {
		this.guardarID = guardarID;
	}

	public List<Product> getSelectedProd() {
		return selectedProd;
	}

	public void setSelectedProd(List<Product> selectedProd) {
		this.selectedProd = selectedProd;
	}		

}
