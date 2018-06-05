package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	    Relational operators
	    <  - less than
	    <= - less than OR equal to
	    >  - greater than
	    >= - greater than OR equal to
	    == - equals
	    != - not equal to

	    Logical operators
	    && - AND
	    || - OR
	    !  - NOT
	 */

        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");

        if (a == x || y + y == a) {
            // will this method run?
            System.out.println("a == x || y + y == a");
            //yes, This will run because one of our conditions is true.
            // With a OR operator you only need one operation to be true.
        }


        if (a != x && y + y == a) {
            // will this method run?
            System.out.println("a != x && y + y == a");
            // Yes this will run because by using the !(not) operator this makes both statements true and makes teh original operation correct.

        }

    }

}

