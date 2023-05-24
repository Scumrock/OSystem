package ru.mkorepanov.matrix;

public class Main {

    public static void main(String[] args) {

        Matrix matr1 = new Matrix(1000, 1000);
        Matrix matr2 = new Matrix(1000);
        matr1.generateRandomValue(-50, 50);
        matr2.generateRandomValue(-50, 50);

        long start = System.currentTimeMillis();
        Matrix result1 = MatrixMultiplication.calculate(matr1, matr2);
        System.out.println("Однопоточно ВРЕМЯ = " + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        Matrix result2 = MatrixMultiplication.calculateMultiThread(matr1, matr2, 10);
        System.out.println("Многопоточно  ВРЕМЯ = " + (System.currentTimeMillis() - start));

        System.out.println("Equals = " + result1.equals(result2));


    }
}
