package br.com.alura.screenmatch.challenge.models;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        CepConsultor myConsult = new CepConsultor();
        Scanner reader = new Scanner(System.in);

        System.out.println("Please, insert a CEP to consult!");
        var cep = reader.nextLine();

        try {
            Address newAddress = myConsult.searchAddress(cep);
            System.out.println(newAddress);

            FileGenerator generator = new FileGenerator();
            generator.Json(newAddress);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Ending");
        }
    }
}
