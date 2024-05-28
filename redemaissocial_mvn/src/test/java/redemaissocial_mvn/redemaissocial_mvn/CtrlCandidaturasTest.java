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
        controlador.solicitaCandidatura("João", "01/01/2000", "Descrição Teste", "Cozinheiro");
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertFalse(candidaturas.isEmpty());
    }

    @Test
    public void testAceitaCandidatura() {
        controlador.solicitaCandidatura("João", "01/01/2000", "Descrição Teste", "Engenheiro");
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.aceitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }

    @Test
    public void testRejeitaCandidatura() {
        controlador.solicitaCandidatura("Maria", "02/02/1990", "Descrição de Teste 2", "Desenvolvedor");
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.rejeitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }

    @Test
    public void testListarCandidaturas() {
        controlador.solicitaCandidatura("Ana", "03/03/1985", "Descrição de Teste 3", "Analista");
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertEquals(2, candidaturas.size());
    }

    @Test
    public void testAceitaCandidaturaRemocao() {
        controlador.solicitaCandidatura("Paulo", "05/05/2000", "Descrição de Teste 5", "Designer");
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.aceitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }
}
