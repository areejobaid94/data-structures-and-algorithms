/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quickSort;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(100);
        arrayList.add(10);
        arrayList.add(10000);
        arrayList.add(0);
        arrayList.add(1000);
        System.out.println(arrayList);
        System.out.println(QuickSort.quickSort(arrayList));
    }
}