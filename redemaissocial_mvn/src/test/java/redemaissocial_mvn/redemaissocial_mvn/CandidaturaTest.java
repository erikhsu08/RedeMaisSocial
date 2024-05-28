package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Candidatura;
import Entity.Vaga;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandidaturaTest {

    private Candidatura candidatura;

    @Before
    public void setUp() {
    	Vaga vaga = new Vaga("Cozinheiro", 5, "Campanha Marmitas pelas Ruas");
        candidatura = new Candidatura("João", "01/01/2000", "Descrição Teste", vaga);
    }

    @Test
    public void testCandidatura() {
        assertEquals("João", candidatura.getNome());
        assertEquals("01/01/2000", candidatura.getData_nascimento());
        assertEquals("Descrição Teste", candidatura.getDescricao());
    }
}
