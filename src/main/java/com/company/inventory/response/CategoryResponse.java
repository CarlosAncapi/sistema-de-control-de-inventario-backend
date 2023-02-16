package com.company.inventory.response;

import java.util.List;

import com.company.inventory.model.Category;

import lombok.Data;


//clase que respondera con un listado de objetos de tipo categoria almacenadas en bd
@Data
public class CategoryResponse {
	
	//objeto listado de categorias
	private List<Category> category;

}
