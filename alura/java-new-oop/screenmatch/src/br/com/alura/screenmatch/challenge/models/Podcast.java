package br.com.alura.screenmatch.challenge.models;

import br.com.alura.screenmatch.challenge.models.Audio;

public class Podcast extends Audio {
    private String host, description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getClassifications() {
        if (this.getLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
