package redemaissocial_mvn.redemaissocial_mvn;


import Entity.Campanha;
import Entity.Vaga;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CampanhaTest {

    private Campanha campanha;

    @Before
    public void setUp() {
        campanha = new Campanha("Campanha Teste", "Descrição Teste", "Local Teste", "01/01/2024", 10);
    }

    @Test
    public void testAdicionarVaga() {
        Vaga vaga = new Vaga("Vaga Teste", 5, "Campanha Teste");
        campanha.adicionarVaga(vaga);
        assertEquals(1, campanha.getVagas().size());
    }
}
