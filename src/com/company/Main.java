package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите размер m cтрок матрицы:");
            int m = input.nextInt();
            System.out.println("Введите размер n cтолбцов матрицы:");
            int n = input.nextInt();
            Matrix call = new Matrix(m, n);
            call.SetMatrix();
            call.GetMatrix();
            call.Task();
            call.Result();
        }
        catch(InputMismatchException e){
            System.out.println("Error!!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
}