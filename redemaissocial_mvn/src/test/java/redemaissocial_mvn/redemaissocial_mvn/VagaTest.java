package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Campanha; 
import Entity.Vaga;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VagaTest {

    private Vaga vaga;
    private Campanha campanha;

    @Before
    public void setUp() {
    	campanha = new Campanha(0, "Campanha Teste", "Descricao teste", "Sao Paulo", "01/01/2024", 30);
        vaga = new Vaga(6, "Vaga Teste", 5, campanha);
    }

    @Test
    public void testVaga() {
        assertEquals("Vaga Teste", vaga.getTitulo());
        assertEquals(5, vaga.getQtd());
        assertEquals(campanha, vaga.getCampanha());
    }
}
