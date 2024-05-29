package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Campanha;
import Entity.Candidatura;
import Entity.Vaga;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandidaturaTest {

    private Candidatura candidatura;
    private Campanha campanha;

    @Before
    public void setUp() {
    	Vaga vaga = new Vaga(1, "Cozinheiro", 5, campanha);
        candidatura = new Candidatura(1, "João", "01/01/2000", "Descrição Teste", vaga);
    }

    @Test
    public void testCandidatura() {
        assertEquals("João", candidatura.getNome());
        assertEquals("01/01/2000", candidatura.getData_nascimento());
        assertEquals("Descrição Teste", candidatura.getDescricao());
    }
}
