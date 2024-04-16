package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterdados(String JSON, Class<T> classe);
}
