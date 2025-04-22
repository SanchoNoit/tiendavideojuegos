package es.mde.tiendavideojuegos;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import es.mde.entidades.Accesorio;
import es.mde.entidades.Juego;
import es.mde.repositorios.AccesorioDAO;
import es.mde.repositorios.JuegoDAO;

@SpringBootApplication
public class TiendavideojuegosApplication {
	private static final Logger log = LoggerFactory.getLogger(TiendavideojuegosApplication.class);


	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(TiendavideojuegosApplication.class, args);
		
		System.err.println("Está funcionando la aplicación");
		
		// Creando los juegos
		JuegoDAO juegoDAO = context.getBean(JuegoDAO.class);
		juegoDAO.save(generaJuego());
		juegoDAO.save(generaJuego());
		juegoDAO.save(generaJuego());
		juegoDAO.save(generaJuego());
		
		List<Juego> juegos = juegoDAO.findAll();
		juegos.stream().map(Juego::toString).forEach(log::info);
		
		// Creando los accesorios
		AccesorioDAO accesorioDAO = context.getBean(AccesorioDAO.class);
		accesorioDAO.save(generaAccesorio());
		accesorioDAO.save(generaAccesorio());
		accesorioDAO.save(generaAccesorio());
		accesorioDAO.save(generaAccesorio());
		
		List<Accesorio> accesorios = accesorioDAO.findAll();
		accesorios.stream().map(Accesorio::toString).forEach(log::info);
	}

	static Juego generaJuego() {

		int numero = 10000;
		String titulo = "Juego" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		Float precio = ThreadLocalRandom.current().nextFloat(20,100);
		return new Juego(titulo, precio);
	}

	static Accesorio generaAccesorio() {

		int numero = 10000;
		String descripcion = "Accesorio" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		return new Accesorio(descripcion);
	}
}
