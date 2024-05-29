package control;

import Entity.Vaga;

import java.util.LinkedList;
import Entity.BDVagas;

public class CtrlVagas {
	
    public LinkedList<Vaga> listarVagas() {
        return BDVagas.getInstance().listarVagas();
    }

    public boolean validaVaga(int id_vaga, int id_campanha) {
        for (Vaga vaga : BDVagas.getInstance().listarVagas()) {
            if (vaga.getId() == id_vaga && vaga.getCampanha().getId() == id_campanha) {
                return true;
            }
        }
        return false;
    }
}
