package control;

import Entity.Vaga;

import java.util.LinkedList;
import Entity.BDVagas;

public class CtrlVagas {
	
    public LinkedList<Vaga> listarVagas() {
        return BDVagas.getInstance().listarVagas();
    }

    public boolean validaVaga(String titulo, String nomeCampanha) {
        for (Vaga vaga : BDVagas.getInstance().listarVagas()) {
            if (vaga.getTitulo().equalsIgnoreCase(titulo) && vaga.getCampanha().equalsIgnoreCase(nomeCampanha)) {
                return true;
            }
        }
        return false;
    }
}
