/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertionSort;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(9);
        array.add(7);
        array.add(1);
        array.add(4);
        array.add(3);
        array.add(10);
        array.add(0);
        System.out.println(array);
        InsertionSort.insertionSort(array);
        System.out.println(array);
    }
}
