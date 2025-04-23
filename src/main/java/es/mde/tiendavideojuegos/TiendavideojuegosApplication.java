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
import es.mde.entidades.Ordenador;
import es.mde.repositorios.AccesorioDAO;
import es.mde.repositorios.JuegoDAO;
import es.mde.repositorios.OrdenadorDAO;

@SpringBootApplication
public class TiendavideojuegosApplication {
	private static final Logger log = LoggerFactory.getLogger(TiendavideojuegosApplication.class);


	public static void main(String[] args) {
            ConfigurableApplicationContext context =
                            SpringApplication.run(TiendavideojuegosApplication.class, args);

            System.err.println("Está funcionando la aplicación");

//            // Creando los juegos
//            JuegoDAO juegoDAO = context.getBean(JuegoDAO.class);
//            juegoDAO.save(generaJuego());
//            juegoDAO.save(generaJuego());
//            juegoDAO.save(generaJuego());
//            juegoDAO.save(generaJuego());
//
//            List<Juego> juegos = juegoDAO.findAll();
//            juegos.stream().map(Juego::toString).forEach(log::info);
//
//            // Creando los accesorios
//            AccesorioDAO accesorioDAO = context.getBean(AccesorioDAO.class);
//            accesorioDAO.save(generaAccesorio());
//            accesorioDAO.save(generaAccesorio());
//            accesorioDAO.save(generaAccesorio());
//            accesorioDAO.save(generaAccesorio());
//
//            List<Accesorio> accesorios = accesorioDAO.findByDescripcionContaining("12");
//            accesorios.stream().map(Accesorio::toString).forEach(log::info);

            // Vamos a crear ordenadores con accesorios.
            AccesorioDAO accesorioDAO = context.getBean(AccesorioDAO.class);
            OrdenadorDAO ordenadorDAO = context.getBean(OrdenadorDAO.class);
            Ordenador ordenador1 = ordenadorDAO.save(generarOrdenador());
            Ordenador ordenador2 = ordenadorDAO.save(generarOrdenador());
            Ordenador ordenador3 = ordenadorDAO.save(generarOrdenador());
            
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador1));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador1));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador1));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador2));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador2));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador2));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador3));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador3));
            accesorioDAO.save(generarAccesorioParaOrdenador(ordenador3));
            
            context.close();
            System.err.println("Está cerrándose la aplicación");

	}

	static Juego generaJuego() {

		int numero = 10000;
		String titulo = "Juego" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		Float precio = ThreadLocalRandom.current().nextFloat(20,100);
		return new Juego(titulo, precio);
	}
        
        static Ordenador generarOrdenador() {
            int numero = 10000;
            String nombreEquipo = "Ordenador" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
            int puntuacionEquipo = ThreadLocalRandom.current().nextInt(0,100);
            return new Ordenador(nombreEquipo, puntuacionEquipo);
        }

	static Accesorio generaAccesorio() {

		int numero = 10000;
		String descripcion = "Accesorio" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		return new Accesorio(descripcion);
	}
        
        static Accesorio generarAccesorioParaOrdenador(Ordenador ordenador) {
                int numero = 10000;
		String accesorio = "Accesorio" + ThreadLocalRandom.current().nextInt(numero, numero * 20);
		return new Accesorio(accesorio, ordenador);
        }
}
