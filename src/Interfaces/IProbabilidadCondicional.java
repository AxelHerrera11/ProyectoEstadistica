package Interfaces;

import Modelo.ModeloPanelPC;

public interface IProbabilidadCondicional {
    public ModeloPanelPC realizarPC(double nAB, double nN1, double nB, double nN2);
    public ModeloPanelPC exportarPDF(String textoProblema, String nAB, String nN1, String nB, String nN2, String pAB, String pB, String respuesta, String respuestaPorcentaje);
}
