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
            double iRespuestaPorcentaje;
            String aproximacion;

            iPAB = nAB / nN1;
            iPB = nB / nN2;

            iRespuesta = iPAB / iPB;
            aproximacion = String.format("%.2f", iRespuesta);
            iRespuestaPorcentaje = ((Double.parseDouble(aproximacion))  * 100);

            modelo.setpAB(iPAB);
            modelo.setpB(iPB);
            modelo.setRespuesta(iRespuesta);
            modelo.setRespuestaPorcentaje(iRespuestaPorcentaje);
        } catch (Exception e) {
            System.out.println("Error al realizar la operacion " + e.getMessage());
        }

        return modelo;
    }

}
