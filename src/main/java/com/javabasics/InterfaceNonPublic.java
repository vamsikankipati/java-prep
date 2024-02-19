package com.javabasics;

public interface InterfaceNonPublic {

    // private methods (static or non-static) are allowed in interfaces from Java 9 - only visible inside this interface.
    // benefits: code re-usability and encapsulation - to define helpers methods to be re-used only inside the same interface.
    private String getThings() {
        return "private non-static method";
    }

    // private static method
    private static String getStaticThings() {
        return "private static method";
    }
}
