package Modelo;

import Vistas.PanelLeyMultiplicativa;

public class ModeloPanelLM {

    private PanelLeyMultiplicativa vistaLM;
    private double nB;
    private double N1;
    private double nAB;
    private double N2;
    private double ResultadonBnAB;
    private double ResultadoNN;
    private double ResultadoDecimal;
    private double ResultadoPorcentaje;
    private static String textoProblema;                                                

    public ModeloPanelLM() {
    }

    public ModeloPanelLM(PanelLeyMultiplicativa vistaLM) {
        this.vistaLM = vistaLM;
    }

    public PanelLeyMultiplicativa getVistaLM() {
        return vistaLM;
    }

    public void setVistaLM(PanelLeyMultiplicativa vistaLM) {
        this.vistaLM = vistaLM;
    }

    public double getnB() {
        return nB;
    }

    public void setnB(double nB) {
        this.nB = nB;
    }

    public double getN1() {
        return N1;
    }

    public void setN1(double N1) {
        this.N1 = N1;
    }

    public double getnAB() {
        return nAB;
    }

    public void setnAB(double nAB) {
        this.nAB = nAB;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double N2) {
        this.N2 = N2;
    }

    public double getResultadonBnAB() {
        return ResultadonBnAB;
    }

    public void setResultadonBnAB(double ResultadonBnAB) {
        this.ResultadonBnAB = ResultadonBnAB;
    }

    public double getResultadoNN() {
        return ResultadoNN;
    }

    public void setResultadoNN(double ResultadoNN) {
        this.ResultadoNN = ResultadoNN;
    }

    public double getResultadoDecimal() {
        return ResultadoDecimal;
    }

    public void setResultadoDecimal(double ResultadoDecimal) {
        this.ResultadoDecimal = ResultadoDecimal;
    }

    public double getResultadoPorcentaje() {
        return ResultadoPorcentaje;
    }

    public void setResultadoPorcentaje(double ResultadoPorcentaje) {
        this.ResultadoPorcentaje = ResultadoPorcentaje;
    }

    public static String getTextoProblema() {
        return textoProblema;
    }

    public static void setTextoProblema(String textoProblema) {
        ModeloPanelLM.textoProblema = textoProblema;
    }
    
    
    
}
