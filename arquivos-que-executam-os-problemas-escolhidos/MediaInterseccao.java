package com.example.mutationspringtest.methods;

public class MediaInterseccao {
    public static float mediaIntersecao(int[] v1, int[] v2)
    {
        float soma = 0;
        int cont = 0;
        float media = 0;
        for(int i=0; i < v1.length; i++)
        {
            for(int j = 0; j < v2.length; j++)
            {
                if(v1[i] == v2[j])
                {
                    cont++;
                    soma += v1[i];
                }
            }
        }

        if (cont > 0)
        {
            media = soma / cont;
        }
        return media;

    }
}
