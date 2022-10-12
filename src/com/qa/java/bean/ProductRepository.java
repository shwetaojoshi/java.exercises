package com.qa.java.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProductRepository {
	
	
	
	public Product[] getDetails () {
		
		Product[] product= new Product[3];
	
	File file  = new File("C:\\Users\\omkar12381\\eclipse-workspace\\Exercise\\file.csv");
	
	FileReader fr = null;
	try {
		
		int index = 0;
		fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println( br.readLine());//headers
		String data = br.readLine();
		
		while(data != null) {
			System.out.println(data);
			
			String array[] = data.split(",");
			int id = Integer.parseInt(array[0]);
			String name = array[1];
			float price  = Float.parseFloat(array[0]);
			
			/*
			 * System.out.println(array[0]); System.out.println(array[1]);
			 * System.out.println(array[2]);
			 */
			
			Product pd = new Product();
			pd.setId(id);
			pd.setName(name);
			pd.setPrice(price);
			
			product[index] = pd;
			index++;
			data = br.readLine();
			
		}
		
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return product;
	
	
	
	
	//String data =  new 
	
	}
}


