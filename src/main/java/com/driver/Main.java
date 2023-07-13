package com.driver;

public class Main {

    class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }


        public void main(String[] args) {
            A obj = new B(); // Create an object of class B and assign it to a reference of class A

            // Call the method meth() from class A
            System.out.println(obj.meth()); // Output: Method is overridden in Extended class B
        }
}