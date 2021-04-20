package com.example.mutationspringtest;

import com.example.mutationspringtest.methods.NumeroPerfeito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumeroPerfeitoTeste {

    @Test
    public void teste() {
        int n = 0;
        System.out.println("Digite o numero");
        n = 28;
        Assertions.assertTrue(NumeroPerfeito.find(n));
    }

}
