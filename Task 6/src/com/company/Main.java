package com.company;

public class Main {
        public static int fact(int n) {
            if (n == 1) {
                return 1;
            } else {
                return fact(n - 1) * n;
            }
        }

        public static int fib(int n) {
            if (n > 1) {
                return fib(n - 1) + fib(n - 2);
            } else {
                return 1;
            }
        }

        public static int fib2(int x1, int x2, int n) {
            int x3;
            if (n > 1) {
                x3 = x1 + x2;
                x1 = x2;
                x2 = x3;
                return fib2(x1, x2, n - 1);
            } else {
                return x2;
            }
        }
    }

