package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Candidatura;
import control.CtrlCandidaturas;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class CtrlCandidaturasTest {

    private CtrlCandidaturas controlador;

    @Before
    public void setUp() {
        controlador = new CtrlCandidaturas();
    }

    @Test
    public void testSolicitaCandidatura() {
        controlador.solicitaCandidatura("João", "01/01/2000", "Descrição Teste");
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertFalse(candidaturas.isEmpty());
    }

    @Test
    public void testAceitaCandidatura() {
        controlador.solicitaCandidatura("João", "01/01/2000", "Descrição Teste");
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.aceitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }
}
