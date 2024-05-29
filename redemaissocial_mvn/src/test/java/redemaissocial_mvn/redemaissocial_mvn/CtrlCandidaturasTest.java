package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Candidatura;
import Entity.Vaga;
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
        controlador.solicitaCandidatura(0, "João", "01/01/2000", "Descrição Teste", 7);
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertFalse(candidaturas.isEmpty());
    }

    @Test
    public void testAceitaCandidatura() {
        controlador.solicitaCandidatura(0, "João", "01/01/2000", "Descrição Teste", 7);
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.aceitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }

    @Test
    public void testRejeitaCandidatura() {
        controlador.solicitaCandidatura(0, "Maria", "02/02/1990", "Descrição de Teste 2", 7);
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.rejeitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }

    @Test
    public void testListarCandidaturas() {
        controlador.solicitaCandidatura(0, "Ana", "03/03/1985", "Descrição de Teste 3", 7);
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertEquals(1, candidaturas.size());
    }

}
