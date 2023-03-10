/*
This file contains the main timing program used to analyze the 
three QuickSort Algorithms. 
*/

//main program
public class Main {
    public static void main(String args[]) {

        int size = 100;
        int[] A = new int[size];
        int[] B = new int[size];
        int n = A.length;


        

        for (int i = 0; i < size; i++) {
            int ran = (int) (Math.random() * 1000 + 1);
            A[i] = ran;
        }

        // get overhead
        double t = System.nanoTime();
        for (int j = 0; j < size; j++) {
            B[j] = A[j];
        }
        double overhead = (System.nanoTime() - t);

        t = System.nanoTime();
        for (int j = 0; j < size; j++) {
            B[j] = A[j];
        }
        /////// QuickSort ///////
        Algorithms.quickSort(B, 0, n - 1);
        t = (System.nanoTime() - t - overhead) / 1000000.0;

        System.out.println("QuickSort: " + t);

        /////// QuickInsertSort1 ///////
        t = System.nanoTime();
        for (int j = 0; j < size; j++) {
            B[j] = A[j];
        }
        Algorithms.quickInsertSort1(B, 0, n - 1);
        t = (System.nanoTime() - t - overhead) / 1000000.0;

        System.out.println("QuickInsertSort1: " + t);

        /////// QuickInsertSort2 ///////
        t = System.nanoTime();
        for (int j = 0; j < size; j++) {
            B[j] = A[j];
        }
        Algorithms.quickInsertSort2(B, 0, n - 1);
     Algorithms.insertionSortNonRecursive(B, 0, n - 1);
        t = (System.nanoTime() - t - overhead) / 1000000.0;

        System.out.println("QuickInsertSort2 Time: " + t);
    }
}