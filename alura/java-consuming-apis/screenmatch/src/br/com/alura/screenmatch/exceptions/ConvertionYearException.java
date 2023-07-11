package br.com.alura.screenmatch.exceptions;

public class ConvertionYearException extends RuntimeException {
    private String message;
    public ConvertionYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
