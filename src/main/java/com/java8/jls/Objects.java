package com.java8.jls;

public class Objects {

    public static void main(String[] args) {
        Object obj = null;
        System.out.println("Obj: " + obj);

        Points p = null;
        try {
            // newInstance() is deprecated since Java 9
            p = (Points) Class.forName("Points").newInstance();
            System.out.println("Points obj: " + p);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        // instantiation
        Points po = new Points(1, 2);
    }
}
