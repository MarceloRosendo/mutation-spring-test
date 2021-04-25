package com.example.mutationspringtest.methods;

public class NumeroPerfeito {
    public static boolean find(int n)
    {
        int soma = 0;
        if(n < 1)
        {
            return false;
        }
        for (int i = n; i > 0; i--)
        {
            if (i != n && n % i ==0 )
            {
                soma += i;
            }
        }
        if (soma == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
