package io.github.valentyn.nahai.inner.classes.inner;

/**
 * Task:
 * Add more functionality in OuterClass, InnerClass classes.
 * Then, in the "main" method create several instances of InnerClass class.
 * 
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, InnerClass.
 * Затем в "main" методе создайте несколько экземпляров класса InnerClass.
 */
public class OuterClass {
    private String field1;
    // add some class members here
    
    class InnerClass {
        // add some members here
        
        public String getField1() {
            return field1;
        }
    }
    
    public static void main(String[] args) {
        // your code here
    }
}
