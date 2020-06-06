package edu.nyu.cs9053.homework9;

 public class CheeseLatte implements CoffeeDrink {
	    final private boolean Decaf = true;
	    final private boolean Milk = true;
	    // add private keyword

        @Override
	    public boolean isDecaf() {
		    return Decaf;
	    }

	    @Override
	    public boolean containsMilk() {
		    return Milk;
	    }
    }