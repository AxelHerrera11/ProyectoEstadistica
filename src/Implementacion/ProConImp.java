package Implementacion;

import Interfaces.IProbabilidadCondicional;
import Modelo.ModeloPanelPC;
import javax.swing.JOptionPane;

public class ProConImp implements IProbabilidadCondicional {

    @Override
    public ModeloPanelPC realizarPC(double nAB, double nN1, double nB, double nN2) {
        ModeloPanelPC modelo = new ModeloPanelPC();

        try {
            double iPAB;
            double iPB;
            double iRespuesta;

            iPAB = nAB / nN1;
            iPB = nB / nN2;

            iRespuesta = iPAB / iPB;

            modelo.setpAB(iPAB);
            modelo.setpB(iPB);
            modelo.setRespuesta(iRespuesta);
        } catch (Exception e) {
            System.out.println("hola");
        }

        return modelo;
    }

}
