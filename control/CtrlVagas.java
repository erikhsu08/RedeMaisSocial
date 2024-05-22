package control;

import Entity.Vaga;

import java.util.LinkedList;
import Entity.BDVagas;
import Entity.Vaga;

public class CtrlVagas {
    public LinkedList<Vaga> listarVagas() {
        return BDVagas.getInstance().listarVagas();
    }

    public boolean validaVaga(String titulo, String ong){
        boolean flag = false;
        for (int i = 0; i < BDVagas.getInstance().listarVagas().size(); i++) {
            if (BDVagas.getInstance().listarVagas().get(i).getTitulo().equals(titulo) && BDVagas.getInstance().listarVagas().get(i).getOng().equals(ong)) {
                flag = true;
            }
        }
        return flag;
    }
}
