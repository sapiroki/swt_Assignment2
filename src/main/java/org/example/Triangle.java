package org.example;

public class Triangle {
    public static String triangleType(int a, int b, int c) {
        if (a < 1 || a > 200)
            return "Value of a is not in the range of permitted values.";
        if (b < 1 || b > 200)
            return "Value of b is not in the range of permitted values.";
        if (c < 1 || c > 200)
            return "Value of c is not in the range of permitted values.";

        if (a >= b + c || b >= a + c || c >= a + b)
            return "NotATriangle";

        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || c == a)
            return "Isosceles";
        else
            return "Scalene";
    }
}
