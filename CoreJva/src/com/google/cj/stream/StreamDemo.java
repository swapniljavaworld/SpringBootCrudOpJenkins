package com.google.cj.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> no=Arrays.asList(2,35,32,211,33,12,2,6);
		
		
	/*	List<Integer> dbe=new ArrayList();
				no.stream()
				  .filter(n->n%2==0)
				  .map(n->n*2)
				  .forEach(n->dbe.add(n));
				
		System.out.println("dbe--"+dbe);					
*/	
	//	List<Integer> dbe=new List();
		
		List<Integer> 
		          dbe =
				  no.stream()
				  .filter(n->n%2==0)
				  .map(n->n*2)
				  .collect(Collectors.toList());
				
		System.out.println("dbe--"+dbe);
		List<String> 
                    dbe1 = no.stream()
                    		.filter(e->e%2==0)
                    		.map(String::valueOf)
                    		.collect(Collectors.toList());
		
		System.out.println(dbe1);
		
		}

}
