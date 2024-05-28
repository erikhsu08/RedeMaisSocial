package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Vaga;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VagaTest {

    private Vaga vaga;

    @Before
    public void setUp() {
        vaga = new Vaga("Vaga Teste", 5, "Campanha Teste");
    }

    @Test
    public void testVaga() {
        assertEquals("Vaga Teste", vaga.getTitulo());
        assertEquals(5, vaga.getQtd());
        assertEquals("Campanha Teste", vaga.getCampanha());
    }
}
