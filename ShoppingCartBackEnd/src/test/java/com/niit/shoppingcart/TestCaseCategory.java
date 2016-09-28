package com.niit.shoppingcart;

import static org.junit.Assert.*;



import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

public class TestCaseCategory {

	@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	ProductDAO productDAO;
	@Autowired
	Category category;
	@Autowired
	Product product;

	
	@Before
	public void init()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		category = (Category)context.getBean("category");
	product = (Product)context.getBean("product");
	;
	}
	
	@Test
	public void categoryAddTestCase()
	{
	
			category.setCaty_id("CAT_01");
			category.setCaty_name("mobiles");
			category.setCaty_description("apple");
		assertEquals(categoryDAO.save(category), true);
	}
	
	
	
	/*@Test
	public void categoryListTestCase()
	{
		List<Category> list = categoryDAO.list();
		int rowCount = list.size();
		assertEquals("Category List Test Case", rowCount,1);
	}*/
/*	
	@Test
	public void deleteTestCase(){
		category.setId("card001");
		assertEquals(categoryDAO.delete(category),true);
	}
*/
	/*
	@Test
	public void updateTestCase(){
		category.setCaty_id("MOB_003");
		category.setCaty_name("asus");
		category.setCaty_description("this is asus phone");
		assertEquals(categoryDAO.update(category),true);
	}*/

	/*@Test
	public void getCategoryTestCase(){
	category=categoryDAO.get("");
	System.out.println(category.getDescription());
	assertEquals(category.getName(), "mobile");
	}*/
	
	
	
	
	
	

}
