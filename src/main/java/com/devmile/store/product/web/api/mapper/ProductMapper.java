package com.devmile.store.product.web.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.devmile.store.product.web.api.model.Product;

@Mapper(componentModel="spring", unmappedTargetPolicy=ReportingPolicy.IGNORE)
public interface ProductMapper {
	
	Product domainToApi(com.devmile.store.product.domain.Product api);
	com.devmile.store.product.domain.Product apiToDomain(Product domain);

}
