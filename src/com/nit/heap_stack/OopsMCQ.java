package com.nit.heap_stack;

class NIT
{
void nit()
{
System.out.print("Welcome");
}
}

class NIT1 extends NIT
{
void nit()
{
System.out.print(" NareshIT");
}
}
public class OopsMCQ
{
static void print(NIT1 n)
{
n.nit();
}

public static void main(String[] args) {
NIT nit1 = new NIT();
NIT1 nit2 = new NIT1();
NIT nit3 = new NIT1();
IO.print(nit1);
IO.print(nit2);
IO.print(nit3);

}
}