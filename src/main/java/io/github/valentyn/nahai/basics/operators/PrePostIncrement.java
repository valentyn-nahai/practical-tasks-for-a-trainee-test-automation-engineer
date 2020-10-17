package io.github.valentyn.nahai.basics.operators;

/**
 * Task:
 * In the following program, explain why the value "6" is printed twice in a row.
 * Put the explanation in comments.
 */
public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 10;
        i++;
        System.out.println(i);    // "11"
        ++i;
        System.out.println(i);    // "12"
        System.out.println(++i);  // "13"
        System.out.println(i++);  // "13"
        System.out.println(i);    // "14"
    }
}
