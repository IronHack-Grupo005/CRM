import crn.app.classes.Pantalla;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMiguel {
    Pantalla pantalla;

    @BeforeEach
    void setUp (){
        pantalla = new Pantalla();
    }

/*
    @Test
    @DisplayName("Probamos busqueda por nombre")
    void testFind_OK(){
        assertEquals("Miguel", personas.findByName("Miguel").getName());
    }

    @Test
    @DisplayName("Edad inferior a Zero")
    void testAdd_KO (){
        System.out.println(
                assertThrows(RuntimeException.class, () -> {
                    personas.añade("Miguelito", -10, "Desconocido");
                    System.out.println( "La excpcion es: ");
                })
                        .getMessage()
        )
        ;
    }
*/


}
