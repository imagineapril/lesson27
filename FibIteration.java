package ru.timokhina.algorithm.lesson27;

public class FibIteration {


    public static void main(String[] args) {
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int [] fib = new int[13];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <=10; i++)  {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
        }
    }
}
