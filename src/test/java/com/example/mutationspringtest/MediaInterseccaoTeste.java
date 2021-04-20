package com.example.mutationspringtest;

import com.example.mutationspringtest.methods.MediaInterseccao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediaInterseccaoTeste {
    @Test
    public void test(){
        int[] v1 = new int[] { 19, 5, 2, 6 };
        int[] v2 = new int[] { 5, 0, 9, 4, 18, 56 };
        Assertions.assertEquals(5, MediaInterseccao.mediaIntersecao(v1, v2));
    }
}
