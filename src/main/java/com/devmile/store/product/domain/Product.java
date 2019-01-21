package com.devmile.store.product.domain;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import com.devmile.store.common.domain.BaseEntity;

@Entity
public class Product extends BaseEntity {
	
	private String name;
	
	private String description;
	
	@ElementCollection
	private Map<String, String> attributes = new HashMap<String, String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	} 
}
