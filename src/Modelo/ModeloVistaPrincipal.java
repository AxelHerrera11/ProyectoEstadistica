package Modelo;

import Vistas.VistaPrincipal;

public class ModeloVistaPrincipal {
    VistaPrincipal vistaP;
    private static String textoProblema;


    public ModeloVistaPrincipal() {
    }

    public ModeloVistaPrincipal(VistaPrincipal vistaP) {
        this.vistaP = vistaP;
    }

    public VistaPrincipal getVistaP() {
        return vistaP;
    }

    public void setVistaP(VistaPrincipal vistaP) {
        this.vistaP = vistaP;
    }

    public String getTextoProblema() {
        return textoProblema;
    }

    public void setTextoProblema(String textoProblema) {
        ModeloVistaPrincipal.textoProblema = textoProblema;
    }
    
    
}
