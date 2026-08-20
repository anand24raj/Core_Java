package com.nit.method_overridding;

class RBI {
    protected String ifscCode = "RBIHYD0001";

    public String loan() {
        return "Bank should provide home loan";
    }
}

class SBI extends RBI {
    protected String ifscCode = "SBIHYD0009";

    @Override
    public String loan() {
        return "SBI provides home loan @ 8.2% ROI";
    }
}

public class MethodOverridingDemo3 {
    public static void main(String[] args) {

        RBI rbi = new SBI();

        IO.println("IFSC Code is : " + rbi.ifscCode + 
                   " : " + rbi.loan());
    }
}

