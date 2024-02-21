/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    @Test
        public void shouldAnswerWithTrue() {
            LOG.info("Iniciado test shouldAnswerWithTrue");
            VideojuegoRPG juego1 = new VideojuegoRPG("Arcangel", null);
            Jugador juga1 = new Jugador("Jaider", null);
            Personaje mago1 = new Mago("Javi", "descripcion", "El rastas", 30, 10, 20, 50);
            Personaje  guerrero1 = new Mago("Javi", "El destructor de mundos", "La bestia",  60, 40, 10, 90);
            guerrero1.registrarPersonaje(guerrero1);
            
            
            assertThrows(Throwable.class, () -> mago1.registrarPersonaje(mago1));
            LOG.info("Finalizando test shouldAnswerWithTrue");
        }
}
