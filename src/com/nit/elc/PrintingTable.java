package com.nit.elc;

import com.nit.blc.Table;

public class PrintingTable
	{
	void main()
	{
		var no = Integer.parseInt(IO.readln("Enter a Number: "));
		Table.printTable (no);
	}
}