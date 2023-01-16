package com.driver;

public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int z=0;
        double a=0.0;
        double b=0.0;
      Product p=new Product();
      int first=p.product(x,y);
      int second=p.product(x,y,z);
      double third=p.product(a,b);

        }
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
}
