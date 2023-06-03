package com.example.project;

public class Hello {

    public String getMessage() {
        return "Hello, World!";
    }

    public static void main(final String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.getMessage());
    }

}
