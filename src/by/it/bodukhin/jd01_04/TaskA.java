package by.it.bodukhin.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        buildOneDimArray(t);

    }

    static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for(int j = 2; j<10; j++) {
                System.out.printf("%1d*%1d=%-3d", i,j,i*j);
            }
            System.out.println();

        }
    }

    static void buildOneDimArray(String line){
        double[] array = InOut.getArray(line);
        System.out.println("Unsorted array");
        InOut.printArray(array, "V", 5);
        double first=array[0];
        double last=array[array.length-1];
        Helper.sort(array);
        System.out.println("Sorted array");
        InOut.printArray(array, "V", 4);

        System.out.printf("Index of first element=%d\n", Arrays.binarySearch(array,first));

        System.out.printf("Index of last element=%d\n",Arrays.binarySearch(array, last));
    }
}
