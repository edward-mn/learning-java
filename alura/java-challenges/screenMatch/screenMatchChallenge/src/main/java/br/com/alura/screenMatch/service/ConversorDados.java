package br.com.alura.screenMatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class ConversorDados implements IConversorDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterdados(String JSON, Class<T> classe) {
        try {
            return mapper.readValue(JSON, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> List<T> obterLista(String JSON, Class<T> classe) {
        CollectionType lista = mapper.getTypeFactory()
                .constructCollectionType(List.class, classe);

        try {
            return mapper.readValue(JSON, lista);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
