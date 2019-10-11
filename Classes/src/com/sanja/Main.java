package com.sanja;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car toyota = new Car();

	    //porsche.setModel("Carrera");
        porsche.setModel("911");
        System.out.println("The model is "+porsche.getModel());
    }
}
