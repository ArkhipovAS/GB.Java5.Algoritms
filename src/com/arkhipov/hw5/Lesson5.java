package com.arkhipov.hw5;

public class Lesson5 {
    public static void main(String[] args) {
//        double start = System.currentTimeMillis();
//        System.out.println(squaringRec(4, 3) +" to degree Rec");
//        double stop = System.currentTimeMillis();
//        System.out.println((stop - start) / 1000);

        Knapsack knapsack = new Knapsack();
        knapsack.calcTakeItems();
        knapsack.displayPack();

        System.out.println("-------------Rec-------------------");
        Knapsack knapsackRec = new Knapsack();
        knapsackRec.calcTakeItemsRec(0);
        knapsackRec.displayPackRec();
    }
    //n = 88365;
    //f(78365) = [8 + 8 + 3 + 6] + 5
    //[1 + 2 + 3 + 4] = f(1234)
    //f(n) = f(n / 10) + n % 10
    public static int digitSumRec(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return digitSumRec(n / 10) + n % 10;
        }
    }

    public static int squaring(int n, int a){
        int squar = a;
        while (n > 1) {
            squar = squar*a;
            n--;
        }
        return squar;
    }

    public static int squaringRec(int n, int a){
        if(n == 0){return 1;}
        else if (n == 1){return a;}
        else {
            return squaringRec(n-1, a)*a;
        }
    }

    //Дано натуральное число n. Найти сумму цифр числа n;
    // n % 10 - последняя цифра
    // n / 10 - число n без последней цифры
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    //a, b: a * b = [a + a + ... + a] + a = a * (b - 1) + a
    //              ---------------------
    //                    b раз
    //f(a, b) = f(a, b - 1) + a

    public static int productRec(int a, int b) {
        if (b == 1) {
            return a;
        }
        else if (a == 0 || b == 0) {
            return 0;
        }
        else {
            return productRec(a, b - 1) + a;
        }
    }

    public static int product(int a, int b) {
        int sum = 0;
        while (b > 0) {
            sum += a;
            b--;
        }
        return sum;
    }

    //f(n) = f(n - 1) + n

    public static int triangleRec(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return triangleRec(n - 1) + n;
        }
    }

    public static int triangle(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return  sum;
    }

    //Нахождение факториала числа
    //n! = [1*2*..*(n - 1)]*n = (n - 1)! * n
    //f(n) = f(n - 1) * n
    //5! = 1*2*3*4*5 = 120

    public static int factRec(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return factRec(n - 1) * n;
        }
    }

    public static int fact(int n) {
        int product = 1;
        while (n > 0) {
            product *= n;
            n--;
        }
        return product;
    }

    //Числа Фибоначчи
    //f(0) = 0 f(1) = 1, f(2) = 1,
    // f(n) = f(n - 1) + f(n - 2)
    //a(n) = a(n - 1) + d
    //b(n) = b(n - 1) * q
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
    //f(n) / f(n - 1) = 1.618
    //Динамическое программирование

    public static int phiboRec(int n) {
        System.out.println("f(" + n + ")");
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return phiboRec(n - 1) + phiboRec(n - 2);
        }
    }

    public static int phibo(int n) {
        int f_curr = 1, f_prev = 0, i = 1;
        while (i < n) {
            int f_next = f_curr + f_prev;
            f_prev = f_curr;
            f_curr = f_next;
            i++;
        }
        return f_curr;
    }
}
