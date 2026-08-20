package com.adv_java.atm_project;

class NegativeAmountException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    NegativeAmountException() {
        super();
    }

    NegativeAmountException(String msg) {
        super(msg);
    }
}
