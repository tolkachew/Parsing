package com.company;

public class Main {

    public static void main(String[] args) {
	//div[@class="TbwUpd"] search

        /*
Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам
принимать значение null.
Реализуйте методы getFirst(), getSecond(), equals() и hashCode().
Реализуйте статический фабричный метод of(). Конструктор должен быть закрытым (private).
Реализуйте метод ifPresent, аналогичный одноименному методу класса Optional и принимающий java.util.function.BiConsumer
Реализуйте метод empty(), который возвращает экземпляр с нулевыми полями {null,null} (см. реализацию в классе Optional).
Код для проверки:
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        pair.ifPresent((first, second) -> {
            System.out.println(first);
            System.out.println(second);
        });
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        */
    }
}
