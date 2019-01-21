package com.devmile.store.sales.web.api.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import com.devmile.store.sales.web.api.model.Order;
import com.devmile.store.sales.web.api.model.OrderLineItem;

@Mapper(componentModel="spring", unmappedTargetPolicy=ReportingPolicy.IGNORE)
public interface OrderMapper {

	// Order Mappings
	
	@Mappings({
		@Mapping(dateFormat="yyyy-MM-dd", source="orderPlacedDate", target="orderDate"),
		@Mapping(source="orderItems", target="lineItems")
	})
	Order domainToApi(com.devmile.store.sales.domain.Order domain);
	
	@Mappings({
		@Mapping(dateFormat="yyyy-MM-dd", source="orderDate", target="orderPlacedDate"),
		@Mapping(source="lineItems", target="orderItems")
	})	
	com.devmile.store.sales.domain.Order apiToDomain(Order api);
    
    
    // LineItem Mappings
    
    @Mappings( {
    	@Mapping(source="product.id", target="productId"),
    	@Mapping(source="product.name", target="productName"),
    	@Mapping(source="product.description", target="productDescription")

    })
    OrderLineItem domainToApi(com.devmile.store.sales.domain.OrderLineItem domain);
    
    @Mappings( {
    	@Mapping(source="productId", target="product.id")
    })    
    com.devmile.store.sales.domain.OrderLineItem apiToDomain(OrderLineItem api);
}
