package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exceptions.ConvertionYearException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reader = new Scanner(System.in);
        var search = "";
        List<Title> movies = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!search.equalsIgnoreCase("exit")) {

            System.out.println("Type a movie to search? ");
            search = reader.nextLine();

            if(search.equalsIgnoreCase("exit")){
                break;
            }

            String address = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=104a081a";
            // https://www.omdbapi.com/

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

//        client.sendAsync(request, BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();

                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

//                FileWriter writer = new FileWriter("movies.txt");
//                writer.write(myTitleOmdb.toString());
//                writer.close();

                System.out.println("Try");
                Title myTitle = new Title(myTitleOmdb);
                System.out.println("My title converted\n" + myTitle);

                movies.add(myTitle);
            } catch (NumberFormatException e) {
                System.out.println("Catch");
                System.out.println("Error - " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Something wrong in searching - " + e.getMessage());
            } catch (ConvertionYearException e) {
                System.out.println("Error info - " + e.getMessage());
            } finally {
                System.out.println("Finally");
            }
        }

        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(movies));
        writer.close();

        System.out.println(movies);
    }
}
