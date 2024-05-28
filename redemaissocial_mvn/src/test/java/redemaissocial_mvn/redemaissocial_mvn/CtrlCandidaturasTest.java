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
    private Vaga vaga1, vaga2, vaga3, vaga4, vaga5;

    @Before
    public void setUp() {
        controlador = new CtrlCandidaturas();
        vaga1 = new Vaga("Cozinheiro", 5, "Campanha Marmitas pelas Ruas");
        vaga2 = new Vaga("Engenheiro", 3, "Campanha Construção Solidária");
        vaga3 = new Vaga("Desenvolvedor", 10, "Campanha Tecnologia para Todos");
        vaga4 = new Vaga("Analista", 4, "Campanha Análise de Dados");
        vaga5 = new Vaga("Designer", 2, "Campanha Design Criativo");
    }

    @Test
    public void testSolicitaCandidatura() {
        controlador.solicitaCandidatura("João", "01/01/2000", "Descrição Teste", vaga1);
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertFalse(candidaturas.isEmpty());
    }

    @Test
    public void testAceitaCandidatura() {
        controlador.solicitaCandidatura("João", "01/01/2000", "Descrição Teste", vaga1);
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.aceitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }

    @Test
    public void testRejeitaCandidatura() {
        controlador.solicitaCandidatura("Maria", "02/02/1990", "Descrição de Teste 2", vaga2);
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.rejeitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }

    @Test
    public void testListarCandidaturas() {
        controlador.solicitaCandidatura("Ana", "03/03/1985", "Descrição de Teste 3", vaga3);
        controlador.solicitaCandidatura("Carlos", "04/04/1995", "Descrição de Teste 4", vaga4);
        LinkedList<Candidatura> candidaturas = controlador.listarCandidaturas();
        assertEquals(2, candidaturas.size());
    }

    @Test
    public void testAceitaCandidaturaRemocao() {
        controlador.solicitaCandidatura("Paulo", "05/05/2000", "Descrição de Teste 5", vaga5);
        Candidatura candidatura = controlador.listarCandidaturas().get(0);
        controlador.aceitaCandidatura(candidatura);
        assertTrue(controlador.listarCandidaturas().isEmpty());
    }
}
