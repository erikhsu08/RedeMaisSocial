package redemaissocial_mvn.redemaissocial_mvn;

import Entity.Candidatura;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandidaturaTest {

    private Candidatura candidatura;

    @Before
    public void setUp() {
        candidatura = new Candidatura("João", "01/01/2000", "Descrição Teste");
    }

    @Test
    public void testCandidatura() {
        assertEquals("João", candidatura.getNome());
        assertEquals("01/01/2000", candidatura.getData_nascimento());
        assertEquals("Descrição Teste", candidatura.getDescricao());
    }
}
