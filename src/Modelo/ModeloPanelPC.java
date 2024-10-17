package Modelo;

import Vistas.PanelProbabilidadCondicional;

public class ModeloPanelPC {
    private PanelProbabilidadCondicional vistaPC;
    private double nAB;
    private double nN1;
    private double nB;
    private double nN2;
    private double pAB;
    private double pB;
    private double respuesta;
    private double respuestaPorcentaje;
    private static String textoProblema;

    public ModeloPanelPC() {
    }

    public ModeloPanelPC(PanelProbabilidadCondicional vistaPC) {
        this.vistaPC = vistaPC;
    }

    public PanelProbabilidadCondicional getVistaPC() {
        return vistaPC;
    }

    public void setVistaPC(PanelProbabilidadCondicional vistaPC) {
        this.vistaPC = vistaPC;
    }

    public double getnAB() {
        return nAB;
    }

    public void setnAB(double nAB) {
        this.nAB = nAB;
    }

    public double getnN1() {
        return nN1;
    }

    public void setnN1(double nN1) {
        this.nN1 = nN1;
    }

    public double getnB() {
        return nB;
    }

    public void setnB(double nB) {
        this.nB = nB;
    }

    public double getnN2() {
        return nN2;
    }

    public void setnN2(double nN2) {
        this.nN2 = nN2;
    }

    public double getpAB() {
        return pAB;
    }

    public void setpAB(double pAB) {
        this.pAB = pAB;
    }

    public double getpB() {
        return pB;
    }

    public void setpB(double pB) {
        this.pB = pB;
    }

    public double getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(double respuesta) {
        this.respuesta = respuesta;
    }

    public double getRespuestaPorcentaje() {
        return respuestaPorcentaje;
    }

    public void setRespuestaPorcentaje(double respuestaPorcentaje) {
        this.respuestaPorcentaje = respuestaPorcentaje;
    }

    public String getTextoProblema() {
        return textoProblema;
    }

    public void setTextoProblema(String textoProblema) {
        this.textoProblema = textoProblema;
    }
    
    
}
