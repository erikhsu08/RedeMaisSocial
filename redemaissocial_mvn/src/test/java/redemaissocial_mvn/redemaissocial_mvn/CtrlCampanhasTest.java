package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Campanha;
import control.CtrlCampanhas;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CtrlCampanhasTest {

    private CtrlCampanhas controlador;

    @Before
    public void setUp() {
        controlador = new CtrlCampanhas();
    }

    @Test
    public void testCriarCampanha() {
        controlador.criarCampanha(3, "Campanha Marmitas pelas Ruas", "Campanha para realização de entrega de marmitas para moradores em situação de rua", "Praça da Sé - São Paulo - SP", "01/01/2024", 10);
        Campanha campanha = controlador.buscarCampanha(3);
        assertNotNull(campanha);
        assertEquals("Campanha Marmitas pelas Ruas", campanha.getNome());
    }

    @Test
    public void testListarCampanhas() {
        controlador.criarCampanha(4, "Campanha Marmitas pelas Ruas", "Campanha para realização de entrega de marmitas para moradores em situação de rua", "Praça da Sé - São Paulo - SP", "01/01/2024", 10);
        LinkedList<Campanha> campanhas = controlador.listarCampanhas();
        assertFalse(campanhas.isEmpty());
    }

    @Test
    public void testAddVagaCampanha() {
        controlador.criarCampanha(5, "Campanha Marmitas pelas Ruas", "Campanha para realização de entrega de marmitas para moradores em situação de rua", "Praça da Sé - São Paulo - SP", "01/01/2024", 10);
        Campanha campanha = controlador.buscarCampanha(5);
        controlador.addVagaCampanha(3, campanha, "Cozinheiro", 5);
        assertEquals(1, campanha.getVagas().size());
    }
}
