package demo.model.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import demo.model.entities.PK.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;

	// Because this is Composite key helper class; helper = auxiliar
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();

	private Integer quantify;
	private Double price;

	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantify, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantify = quantify;
		this.price = price;
	}
	
	//Cicle reference
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public Integer getQuantify() {
		return quantify;
	}

	public void setQuantify(Integer quantify) {
		this.quantify = quantify;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}

}
