package br.com.example.screenSounds;

import br.com.example.screenSounds.main.Main;
import br.com.example.screenSounds.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSoundsApplication implements CommandLineRunner {

	@Autowired
	private ArtistRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(repository);

		main.showMenu();
	}
}
