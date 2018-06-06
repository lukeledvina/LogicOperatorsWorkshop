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
        if (a < b) {
            //Will this method run?
            System.out.println("a < b");
            //Yes, this method will run because the variable related to a is less than the variable related to b.

        }
        //not equal to
        if (x != a) {

            System.out.println("This works great!");
        }
            //greater than
            if (b > a) {
                System.out.println("This works perfect!");
            }
                //greater than or equal to
                if (a >= y + 1) {
                    System.out.println("This works good!");
                }
                    //equal to
                    if (b == 4) {
                        System.out.println("This works nice!");
                    }



        }


    }



