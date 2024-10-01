package Modelo;

import Vistas.VistaPrincipal;

public class ModeloPanelInicial {

    Vistas.VistaPrincipal vistaP;

    public ModeloPanelInicial() {
    }

    public ModeloPanelInicial(VistaPrincipal vistaP) {
        this.vistaP = vistaP;
    }

    public VistaPrincipal getVistaP() {
        return vistaP;
    }

    public void setVistaP(VistaPrincipal vistaP) {
        this.vistaP = vistaP;
    }
    
    
}
