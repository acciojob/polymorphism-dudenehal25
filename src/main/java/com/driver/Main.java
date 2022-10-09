package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(2,4));
        System.out.println(p.product(2,3,4));
        System.out.println(p.product(2.2,4.3));
    }

    static class Product{

        public int product(int a,int b){
            return a*b;
        }

        public int product(int a,int b,int c){
            return a*b*c;
        }

        public double product(double x , double y){
            return x*y;
        }

    }

}

