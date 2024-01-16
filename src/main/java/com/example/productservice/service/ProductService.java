package com.example.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productservice.DTO.ProductDTO;
import com.example.productservice.DTO.ProductResponseDTO;
import com.example.productservice.model.Product;
import com.example.productservice.repository.productRepository;

@Service
public class ProductService {
	
	@Autowired
	private productRepository productRepository;
	
	public void createProduct(ProductDTO productDTO) {
		Product product = new Product(productDTO.getName(), productDTO.getDescription(), productDTO.getPrice());
		productRepository.save(product);
	}
	
	public List<ProductResponseDTO> getAllProducts(){
		List<Product> products = productRepository.findAll();
		return products.stream().map(product -> mapToProductResponse(product)).toList();
	}
	
	public ProductResponseDTO mapToProductResponse(Product product) {
		ProductResponseDTO productResponseDTO = new ProductResponseDTO();
		productResponseDTO.setId(product.getId());
		productResponseDTO.setName(product.getName());
		productResponseDTO.setDescription(product.getDescription());
		productResponseDTO.setPrice(product.getPrice());
		
		return productResponseDTO;
	}

}
