package redemaissocial_mvn.redemaissocial_mvn;

import Entity.BDCandidaturas;
import Entity.BDVagas;
import Entity.Campanha;
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
        BDVagas.getInstance().listarVagas().clear();
        BDCandidaturas.getInstance().listarCandidaturas().clear();
        
        Campanha campanha = new Campanha(0, "Campanha Teste", "Descricao Teste", "Sao Paulo", "01/01/2024",30);
        Vaga vaga = new Vaga(7, "Vaga Teste", 5, campanha);
        BDVagas.getInstance().adicionarVaga(vaga);
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
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertFalse(candidaturas.isEmpty()); // Certifica-se de que a lista não está vazia
        Candidatura candidatura = candidaturas.get(0);
        controlador.aceitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }

    @Test
    public void testRejeitaCandidatura() {
        controlador.solicitaCandidatura(0, "Maria", "02/02/1990", "Descrição de Teste 2", 7);
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertFalse(candidaturas.isEmpty()); // Certifica-se de que a lista não está vazia
        Candidatura candidatura = candidaturas.get(0);
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
