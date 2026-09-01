package com.core_java.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapDemo02 {
    public static void main(String[] args) {
	HashMap<Integer, String> studentRecords = new HashMap<>();

	studentRecords.put(101, "Scott");
	studentRecords.put(102, "Smith");
	studentRecords.put(103, "Martin");
	studentRecords.put(104, "Anand");

	IO.println("Student Records: " + studentRecords);

	int searchId = Integer.parseInt(IO.readln("Enter the Id : "));
	String studentName = studentRecords.get(searchId);

	Optional<String> container = Optional.ofNullable(studentName);
	IO.println(container.orElse("ID not found"));

	studentRecords.put(103, "Rahul");
	IO.println("Updated: " + studentRecords);

	studentRecords.remove(104);
	IO.println("After removal: " + studentRecords);

	int idToCheck = 101;
	IO.println("Does ID " + idToCheck + " exist ? " + studentRecords.containsKey(idToCheck));

	String nameToCheck = "Anand";
	IO.println("Does Name " + nameToCheck + " exist ? " + studentRecords.containsKey(nameToCheck));

	IO.println("Iteration through record.");
	for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
	    IO.println("ID : " + entry.getKey() + " , Name :  " + entry.getValue());
	}

	studentRecords.clear();
	IO.println("All record Cleared: " + studentRecords);
    }
}