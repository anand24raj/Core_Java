package com.nit.Array.StreamApi.OptionalDemo;

import java.util.Optional;

class Employee 
{
	 private Integer id;
	 private String name;
	
	 public Employee() 
	 {
	     id = null;
	     name = null;
	 }
	
	 public Employee(Integer id, String name)
	 {
	     super();
	     this.id = id;
	     this.name = name;
	 }
	
	 // Different style of getter after Optional
	 public Optional<Integer> getId() 
	 {
	     return Optional.ofNullable(this.id);
	 }
	
	 public Optional<String> getName() 
	 {
	     return Optional.ofNullable(this.name);
	 }
}
	
public class OptionalWithSetterGetter 
{	
	 public static void main(String[] args) 
	 {	
	     Employee emp = new Employee();
	     emp = new Employee(111, "Raj");
	
	     Optional<Integer> id = emp.getId();
	     IO.println(id.orElse(-1));
	
	     Optional<String> name = emp.getName();
	     name.ifPresent(IO::println);
	 }
}
