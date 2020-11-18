package com.mitocode.javaweb.springintro.thymeleaf.infraestructure.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.mitocode.javaweb.springintro.thymeleaf.domain.ProductOwner;

@Repository
public class ProductOwnerInMemoryRepository {

	public Optional<ProductOwner> findAll() {
		return Optional.of(new ProductOwner("Diego Requejo"));
	}

}
