package me.clilc.java8to11.functionalinterfaceandlamda;

import java.util.function.*;

public class FunctionalInterface {

    private void run() {
        int baseNumber = 10;

        IntConsumer printInt = (baseNumber1) -> { //input 값으로 baseNumber가 들어갈다 수 없
            System.out.println();
        };

        printInt.accept(10);

        //baseNumber++;  final처럼 baseNumber를 사용하는데 벗어나니깐 오류
    }

    public static void main(String[] args) {
        // 익명 내부 클래스
        RunSomething runSomething = number -> number + 10;
        // 함수 밖에 있는 값을 참조하거나 변경하려고 하면안된다
        // 함수가 전달 받은 파라미터 값만 사용해야한다

        Function<Integer, Integer> plus10 = i -> i + 10;
        Function<Integer, Integer> multiply2 = i -> i * 2;

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        //multiply2 결과값으로 plus10 실행

        Function<Integer, Integer> multiply2AndThenPlus10 = plus10.andThen(multiply2);
        //이건 반대로 먼저 plus10 하고 multiply2 실행

        Consumer<Integer> printT = (i) -> System.out.println(i);
        // T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        // T 타입의 값을 제공하는 함수 인터페이스

        Predicate<String> startsWithMino = (s) -> s.startsWith("mino");
        Predicate<Integer> isEven = (i) -> i%2 == 0;
        // T 타입을 받아서 Boolean을 리턴하는 함수 인터페이스

        UnaryOperator<Integer> plus11 = i -> i + 11;
        // 입력 리턴 타입이 같을떄 쓰는 함수 인터페이스

    }
}
