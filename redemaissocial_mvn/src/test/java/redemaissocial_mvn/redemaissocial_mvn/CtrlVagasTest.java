package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Campanha; 
import Entity.Vaga;
import control.CtrlVagas;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CtrlVagasTest {

    private CtrlVagas controlador;
    private Campanha campanha;

    @Before
    public void setUp() {
    	campanha = new Campanha(1, "Campanha Teste", "Descrição Teste", "Local Teste", "01/01/2024", 30);
        controlador = new CtrlVagas();
    }

    @Test
    public void testListarVagas() {
        Vaga vaga = new Vaga(4, "Cozinheiro", 5, campanha);
        controlador.adicionarVaga(vaga);
        LinkedList<Vaga> vagas = controlador.listarVagas();
        assertFalse(vagas.isEmpty());
    }

    @Test
    public void testValidaVaga() {
        Vaga vaga = new Vaga(4, "Cozinheiro", 5, campanha);
        controlador.adicionarVaga(vaga);
        assertTrue(controlador.validaVaga(3, 4));
        assertFalse(controlador.validaVaga(5, 6));
    }

    @Test
    public void testVagaInvalida() {
        Vaga vaga = new Vaga(4, "Cozinheiro", 5, campanha);
        controlador.adicionarVaga(vaga);
        // Testando uma vaga que é claramente inválida
        assertFalse(controlador.validaVaga(7, 8));
    }
}
