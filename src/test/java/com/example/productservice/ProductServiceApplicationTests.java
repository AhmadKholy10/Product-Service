package com.example.productservice;

//import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
//import org.testcontainers.containers.MySQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.utility.DockerImageName;

import com.example.productservice.DTO.ProductResponseDTO;
import com.example.productservice.model.Product;
import com.example.productservice.service.ProductService;

@SpringBootTest
//@Testcontainers
class ProductServiceApplicationTests {
	
	// will be shared between test methods
//    @Container
//    private static final MySQLContainer MY_SQL_CONTAINER = new MySQLContainer("mysql:latest");
    
//    @Container
//    static MySQLContainer mySQLContainer = new MySQLContainer<>(DockerImageName.parse("mysql:latest"))
//    .withDatabaseName("e-commerce-database")
//    .withUsername("e-commerce-user")
//    .withPassword("dummypassword");
//    
//    @DynamicPropertySource
//    static void setProperties(DynamicPropertyRegistry registry) {
//    	registry.add("spring.datasource.url", () -> mySQLContainer.getJdbcUrl());
//        registry.add("spring.datasource.username", () -> mySQLContainer.getUsername());
//        registry.add("spring.datasource.password", () -> mySQLContainer.getPassword());
//    }
//    
//    @Autowired
//    private ProductService productService;
//    
//    @Test
//    void shouldCreateProduct() {
//    	List<ProductResponseDTO> products = productService.getAllProducts();
//    	
//    	assertNotNull(products.get(1));
//    	
//    }
    
	@Test
	void contextLoads() {
	}

}
