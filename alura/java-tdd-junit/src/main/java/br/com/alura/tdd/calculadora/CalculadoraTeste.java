package br.com.alura.tdd.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void deveriaSomarNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
        Assert.assertEquals(10, soma);
    }
}
