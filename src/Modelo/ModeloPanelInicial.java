package Modelo;

import Vistas.PanelInicio;

public class ModeloPanelInicial {
    PanelInicio vistaPanelInicio;

    public ModeloPanelInicial() {
    }

    public ModeloPanelInicial(PanelInicio vistaPanelInicio) {
        this.vistaPanelInicio = vistaPanelInicio;
    }

    public PanelInicio getVistaPanelInicio() {
        return vistaPanelInicio;
    }

    public void setVistaPanelInicio(PanelInicio vistaPanelInicio) {
        this.vistaPanelInicio = vistaPanelInicio;
    }
    
    
}
