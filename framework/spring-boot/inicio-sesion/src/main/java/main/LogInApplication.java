package main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogInApplication implements InicioSesionApplication, CommandLineRunner { //CommandLineRunner para poder @override del metodo y ejecutar el "sout" justo despues de iniciar la aplicacion

	public static void main(String[] args) {
		SpringApplication.run(LogInApplication.class, args);
	}

    @Override
    public void run(String args) throws Exception {

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Success");
    }
}
