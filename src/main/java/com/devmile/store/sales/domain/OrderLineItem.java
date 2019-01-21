package com.devmile.store.sales.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.devmile.store.common.domain.BaseEntity;
import com.devmile.store.product.domain.Product;

@Entity
@Table(name="order_lineitem")
public class OrderLineItem extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="order_id", nullable=false)
	private Order order;
	
	@OneToOne
    @JoinColumn(name = "product_id", nullable = false)
	private Product product;
	
	private Integer quantity;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	} 

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
