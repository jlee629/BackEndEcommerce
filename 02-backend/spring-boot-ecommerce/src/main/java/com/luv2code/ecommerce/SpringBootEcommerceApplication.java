package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEcommerceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}
}

/**
 * Pagination
 *   It is useful for handling large amounts of data
 *   Show the users a small subset of data: "page" of data
 *   The user can click links to view other pages
 *   We will need pagination support on the back-end: Spring Boot
 *   Also need pagination support on the front-end: Angular
 *   By default, Spring Data REST returns: 20 elements.
 *   We can customize this by passing in parameters
 *     page - The page number to access. 0-based ... defaults to 0.
 *     size - The size of the page to return (items per page). Defaults to 20.
 *     Get the first page, with page size of 10
 *     http://localhost:8080/api/products?page=0&size=10
 *     Get the second page, with page size of 10
 *     http://localhost:8080/api/products?page=1&size=10
 *   The response metadata has valuable information
 *     << array of products >>
 *         "page" : {
 *             "size" : 10, //Size of the page
 *             "totalElements" : 200, //Grand total of All elements in the database. But we are not returning all the elements. Just the "count" for informational purposes only.
 *             "totalPages" : 20, //Total pages available
 *             "number" : 0 //Current page number
 *         }
 */
