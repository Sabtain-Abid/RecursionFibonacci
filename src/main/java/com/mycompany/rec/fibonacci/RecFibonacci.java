/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rec.fibonacci;

/**
 *
 * @author Hp
 */
public class RecFibonacci {
public static void main(String[] args) 
{
        int n = 10;  // Number of Fibonacci terms to generate
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) 
    {
        if (n <= 1)
        {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
