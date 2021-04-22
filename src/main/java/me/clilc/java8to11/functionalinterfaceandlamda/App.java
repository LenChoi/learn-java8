package me.clilc.java8to11.functionalinterfaceandlamda;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        UnaryOperator<String> hi = (s) -> "hi " + s;
        UnaryOperator<String> hi1 = Greeting::hi; // 메소드 레퍼런스 , static 메소드에 가능

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        Supplier<Greeting> newGreeting = Greeting::new; //아직 아무 기능 못함
        System.out.println(hello.apply("clilc")); //apply 해야지 동작한다.

    }
}
