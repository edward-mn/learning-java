package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcinario, Desempenho desempenho) {
//        if (desempenho == Desempenho.A_DESEJAR){
//            BigDecimal reajuste = funcinario.getSalario().multiply(new BigDecimal("0.03"));
//            funcinario.reajustarSalario(reajuste);
//        } else if(desempenho == Desempenho.BOM){
//            BigDecimal reajuste = funcinario.getSalario().multiply(new BigDecimal("0.15"));
//            funcinario.reajustarSalario(reajuste);
//        } else if (desempenho == Desempenho.EXCELENTE){
//            BigDecimal reajuste = funcinario.getSalario().multiply(new BigDecimal("0.30"));
//            funcinario.reajustarSalario(reajuste);
//        }

        BigDecimal reajuste = funcinario.getSalario().multiply(desempenho.percentualReajuste());
        funcinario.reajustarSalario(reajuste);
    }
}
