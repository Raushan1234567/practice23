package com.masai;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



interface PrintList {
	void display(List<String> city);

}


public class Main{
	
	
	public static void main(String[] args) {
		
		List<String> p=Arrays.asList("patna","Ranchi","Ludhiyana","Bengal","Kerla");
		
	
			PrintList pus=(city)->{
				
			Consumer<String> b= (c) ->{
				System.out.println(c);
			};
			city.forEach(b);
			};
	
	pus.display(p);
		
		

	}

	

}
