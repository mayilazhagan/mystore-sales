/**
 * 
 */
package com.devmile.store.sales.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.devmile.store.common.domain.BaseEntity;

/**
 * @author mayilazhagan
 *
 */
@Entity
@Table(name="orders")
public class Order extends BaseEntity {
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderPlacedDate;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

	@OneToMany(mappedBy="order", cascade=CascadeType.ALL)
	private List<OrderLineItem> orderItems;

	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}

	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}

	public List<OrderLineItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderLineItem> orderItems) {
		this.orderItems = orderItems;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}
