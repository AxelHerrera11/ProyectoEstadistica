package Implementacion;

import Interfaces.IProbabilidadCondicional;
import Modelo.ModeloPanelPC;

public class ProConImp implements IProbabilidadCondicional{

    @Override
    public ModeloPanelPC realizarPC(double nAB, double nN1, double nB, double nN2) {
        ModeloPanelPC modelo = new ModeloPanelPC();
        
        double iPAB;
        double iPB;
        double iRespuesta;
        
        iPAB = nAB / nN1;
        iPB = nB / nN2;
        
        iRespuesta = iPAB / iPB;
        
        modelo.setpAB(iPAB);
        modelo.setpB(iPB);
        modelo.setRespuesta(iRespuesta);
        
        return modelo;
    }
    
}
