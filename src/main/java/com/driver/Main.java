package com.driver;

public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int z=0;
        double a=0.0;
        double b=0.0;
      Product p=new Product();
      int first=p.Product(x,y);
      int second=p.Product(x,y,z);
      double third=p.Product(a,b);

        }
    public static class Product{
        public int Product(int x, int y) {
            return x*y;
        }

        public int Product(int x, int y, int z) {
            return x*y*z;
        }

        public double Product(double x, double y) {
            return x*y;
        }
    }
}
