package io.github.valentyn.nahai.inner.classes.nested;

/**
 * Task:
 * Add more functionality in OuterClass, NestedClass classes.
 * Try to use non-static fields of OuterClass class in NestedClass class.
 * Also, try to use static fields of Outer class in NestedClass class.
 * Then, in the "main" method create several instances of NestedClass class.
 *
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, NestedClass.
 * Попробуйте использовать нестатические поля класса OuterClass в классе NestedClass.
 * Также попробуйте использовать статические поля OuterClass класса в классе NestedClass.
 * Затем в "main" методе создайте несколько экземпляров класса NestedClass.
 */
public class OuterClass {
    private String field1;
    private static String staticField1;
    // add some class members here

    static class InnerClass {
        // add some members here
    }

    public static void main(String[] args) {
        // your code here
    }
}
