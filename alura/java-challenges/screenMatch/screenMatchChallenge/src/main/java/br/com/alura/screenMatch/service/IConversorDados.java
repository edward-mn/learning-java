package br.com.alura.screenMatch.service;

import java.util.List;

public interface IConversorDados {
    <T> T obterdados(String JSON, Class<T> classe);
    <T> List<T> obterLista(String JSON, Class <T> classe);
}
