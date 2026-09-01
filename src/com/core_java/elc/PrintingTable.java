package com.core_java.elc;

import com.core_java.blc.Table;

public class PrintingTable
	{
	void main()
	{
		var no = Integer.parseInt(IO.readln("Enter a Number: "));
		Table.printTable (no);
	}
}