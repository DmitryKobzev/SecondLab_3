package com.company;
import java.util.Scanner;

public class Matrix {
    int n,m;
    int [][]arr;
    int []sum_first;
    int []sum_second;
    boolean b=true;

    public Matrix(int m,int n)throws Exception{
        if(n<0 || m<0){
            throw new Exception("Error!!!n,m-натуральное число");
        }
        arr=new int [m][n];
        sum_first=new int [n];
        sum_second=new int [m];
    }

    public void SetMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы матрицы:");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public void GetMatrix() {
        System.out.println("Матрица имеет вид:");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
    }
    }

    public void Result(){
    if(b==true) {
        System.out.println("Матрица ортонормированная .");
    }
        else{
        System.out.println("Матрица не является ортонормированной .");
    }
    }

    public void Task(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum_first[i]+=arr[i][j]*arr[i][j];
                if(i!=arr.length-1) {
                    sum_second[i] += arr[i][j] * arr[i + 1][j];
                }
            }
            if(sum_first[i]==1 && sum_second[i]==0){
                b=true;
            }
            else {
                b=false;
            }
    }
    }
    }