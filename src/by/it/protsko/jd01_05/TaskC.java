package by.it.protsko.jd01_05;

import java.util.Arrays;

import static java.lang.Math.*;

public class TaskC {

    public static void main(String[] args) {

        //task6
        double[] arrayA = elementArrayFromFunction();
        printArray(arrayA, "A");
        double[] arrayB = createNewArray(arrayA);
        printArray(arrayB, "B");
        getAverageValueArrayElements(arrayB);

        //task7
        System.out.println();
        int[] arrayC = new int[31];///////////////
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = getRundomNumber(103, 450);
        }
        printArrayInTable(arrayC, "C", true, 5);

        int[] arrayD = createNewArray(arrayC);
        Arrays.sort(arrayD);
        printArrayInTable(arrayD, "D", false, 2);
    }

    private static int getRundomNumber(int min, int max) {
        return min + (int) (random() * ((max - min) + 1));
    }

    private static double[] elementArrayFromFunction() {
        int randomNumber = getRundomNumber(20, 40);
        double[] array = new double[randomNumber];

        double rangeOfFunctionValues = (9 - 5.33) / (randomNumber - 1);
        int count = 0;

        for (double x = 5.33; x <= 9; x += rangeOfFunctionValues) {
            double functionZ = pow((x * x + 4.5), (double) 1 / 3);
            array[count] = functionZ;
            count++;
        }
        System.out.println("Сгенерированное случайное число = " + randomNumber);
        return array;
    }

    private static void printArray(double[] array, String nameArray) {
        int count = 0;
        System.out.println("\tArray " + nameArray + "[]");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5s[% -3d] = %-9.8f", nameArray, i, array[i]);
            count++;

            if (count % 5 == 0 || count == array.length) {
                System.out.println();
            }
        }
    }

    private static double[] createNewArray(double[] arrayA) {
        int indexFirstElementArrayB = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > 3.5) {
                indexFirstElementArrayB = i;
                break;
            }
        }

        double[] arrayB = new double[arrayA.length - indexFirstElementArrayB];
        System.arraycopy(arrayA, indexFirstElementArrayB, arrayB, 0, arrayB.length);
        return arrayB;
    }

    private static void getAverageValueArrayElements(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        System.out.println("Среднее арифметическое значение элементов массива = " + sum / array.length);
    }

    private static int[] createNewArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.ceil(array[i] * 0.1) > i) {
                count++;
            }
        }
        int[] newArray = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.ceil(array[i] * 0.1) > i) {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }

    /**
     * @param array:       массив, выводимый на экран
     * @param nameArray:   имя массива, который печатается
     * @param condition:   если передаем true - изменение индкекса элемента массива по строке, false - по столбцу
     * @param countColumn: максимальное количество столбцов вывода
     */
    private static void printArrayInTable(int[] array, String nameArray, boolean condition, int countColumn) {
        System.out.printf("Array %s%n", nameArray);

        int count = 1;
        int rowCount;
        int countIndex = 0;
        int nextIndex;
        if (array.length % countColumn == 0) {
            nextIndex = array.length / countColumn;
        } else {
            nextIndex = array.length / countColumn + 1;
        }

        do {
            rowCount = 0;
            for (int i = 0; i < countColumn; i++) {
                System.out.print(" ------------ ");
            }
            System.out.println();

            if (condition) {
                for (int i = countIndex; i < array.length; i++) {
                    System.out.printf("| %s[% -3d]=%3d |", nameArray, i, array[i]);
                    rowCount++;
                    countIndex++;
                    if (rowCount >= countColumn) {
                        break;
                    }
                }
            }
            if (!condition) {
                for (int i = countIndex; i < array.length; i += nextIndex) {
                    if (countIndex < nextIndex) {
                        System.out.printf("| %s[% -3d]=%3d |", nameArray, i, array[i]);
                    }
                    rowCount++;
                    if (rowCount > countColumn) {
                        break;
                    }
                }
                countIndex++;
            }

            if (countIndex == array.length || rowCount < countColumn && countIndex <= nextIndex) {
                for (int i = array.length % countColumn; i < countColumn; i++)
                    System.out.print("|            |");
            }
            System.out.println();
            count++;
        } while (count <= (nextIndex) || countIndex < nextIndex);

        for (int i = 0; i < countColumn; i++) {
            System.out.print(" ------------ ");
        }
        System.out.println();
    }
}
