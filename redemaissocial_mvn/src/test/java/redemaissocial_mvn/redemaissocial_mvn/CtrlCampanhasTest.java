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
        controlador.criarCampanha("Campanha Marmitas pelas Ruas", "Campanha para realização de entrega de marmitas para moradores em situação de rua", "Praça da Sé - São Paulo - SP", "01/01/2024", 10);
        Campanha campanha = controlador.buscarCampanha("Campanha Teste");
        assertNotNull(campanha);
        assertEquals("Campanha Teste", campanha.getNome());
    }

    @Test
    public void testListarCampanhas() {
        controlador.criarCampanha("Campanha Marmitas pelas Ruas", "Campanha para realização de entrega de marmitas para moradores em situação de rua", "Praça da Sé - São Paulo - SP", "01/01/2024", 10);
        LinkedList<Campanha> campanhas = controlador.listarCampanhas();
        assertFalse(campanhas.isEmpty());
    }

    @Test
    public void testAddVagaCampanha() {
        controlador.criarCampanha("Campanha Marmitas pelas Ruas", "Campanha para realização de entrega de marmitas para moradores em situação de rua", "Praça da Sé - São Paulo - SP", "01/01/2024", 10);
        Campanha campanha = controlador.buscarCampanha("Campanha Marmitas pelas Ruas");
        controlador.addVagaCampanha(campanha, "Cozinheiro", 5);
        assertEquals(1, campanha.getVagas().size());
    }
}
