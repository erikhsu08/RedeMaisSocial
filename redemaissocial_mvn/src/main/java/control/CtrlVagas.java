package control;

import Entity.Vaga;

import java.util.LinkedList;
import Entity.BDVagas;
import Entity.Vaga;

public class CtrlVagas {
	
    public LinkedList<Vaga> listarVagas() {
        return BDVagas.getInstance().listarVagas();
    }

    public boolean validaVaga(String titulo, String nomeCampanha){
        boolean flag = false;
        for (int i = 0; i < BDVagas.getInstance().listarVagas().size(); i++) {
        	Vaga vaga = BDVagas.getInstance().listarVagas().get(i);
            if (vaga.getTitulo().equals(titulo) && vaga.getCampanha().equals(nomeCampanha)) {
                flag = true;
            }
        }
        return flag;
    }
}