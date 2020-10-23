package com.google.cj.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateElement {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Lokesh");
		Employee e2 = new Employee(1, "Lokesh");
		Employee e3 = new Employee(2, "Rohit");
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		list.stream().collect(Collectors.groupingBy(Function.identity(),
	            Collectors.counting()))
	            .entrySet().stream()
	            .filter(e -> e.getValue() > 1L)
	            .map(e -> e.getKey())
	            .collect(Collectors.toList())
	            .forEach(e -> System.out.println(e.getId()+"   "
	            		+e.getName()));
		
		/*
		 List<Employee> distinctElements = list.stream()
                 .filter( distinctByKey(p -> p.getId()) )
                 .collect( Collectors.toList() );

     // Let's verify distinct elements
     System.out.println( distinctElements );
		
	      
	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
	
	
*/}	
	
}









class Employee{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
