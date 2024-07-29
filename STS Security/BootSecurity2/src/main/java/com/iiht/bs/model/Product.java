package com.iiht.bs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

//POJO
public class Product {

	Integer productId;
	String name;
	String category;
	String brand;
	double price;

}