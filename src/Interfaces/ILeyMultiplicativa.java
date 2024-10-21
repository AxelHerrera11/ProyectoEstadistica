package Interfaces;

import Modelo.ModeloPanelLM;

public interface ILeyMultiplicativa {

    public ModeloPanelLM realizarLM(double nB, double N1, double AB, double N2);

    public ModeloPanelLM exportarPDF(String textoProblema, String nB, String N1, String AB, String nN2, String txtResultnBnAB, String txtResultNN, String txtResultadoDecimal, String txtResultadoPorcentaje);
}
