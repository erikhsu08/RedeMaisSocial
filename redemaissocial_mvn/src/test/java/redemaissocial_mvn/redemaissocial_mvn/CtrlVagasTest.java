package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Vaga;
import control.CtrlVagas;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CtrlVagasTest {

    private CtrlVagas controlador;

    @Before
    public void setUp() {
        controlador = new CtrlVagas();
    }

    @Test
    public void testListarVagas() {
        Vaga vaga = new Vaga("Vaga Teste", 5, "Campanha Teste");
        controlador.listarVagas().add(vaga);
        LinkedList<Vaga> vagas = controlador.listarVagas();
        assertFalse(vagas.isEmpty());
    }

    @Test
    public void testValidaVaga() {
        Vaga vaga = new Vaga("Vaga Teste", 5, "Campanha Teste");
        controlador.listarVagas().add(vaga);
        assertTrue(controlador.validaVaga("Vaga Teste", "Campanha Teste"));
        assertFalse(controlador.validaVaga("Vaga Invalida", "Campanha Teste"));
    }
}

