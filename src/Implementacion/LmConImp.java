package Implementacion;

import Interfaces.ILeyMultiplicativa;
import Modelo.ModeloPanelLM;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class LmConImp implements ILeyMultiplicativa {

    @Override
    public ModeloPanelLM realizarLM(double nB, double N1, double AB, double N2) {
        ModeloPanelLM modelo = new ModeloPanelLM();

        try {
            double iResultnBnAB;
            double iResultNN;
            double iResultadoDecimal;
            double iResultadoPorcentaje;
            String aproximacion;

            iResultnBnAB = nB * AB;
            iResultNN = N1 * N2;

            iResultadoDecimal = iResultnBnAB / iResultNN;
            aproximacion = String.format("%.2f", iResultadoDecimal);
            iResultadoPorcentaje = ((Double.parseDouble(aproximacion)) * 100);

            modelo.setResultadonBnAB(iResultnBnAB);
            modelo.setResultadoNN(iResultNN);
            modelo.setResultadoDecimal(iResultadoDecimal);
            modelo.setResultadoPorcentaje(iResultadoPorcentaje);

        } catch (Exception e) {
            System.out.println("Error al realizar la operacion " + e.getMessage());
        }

        return modelo;
    }

    @Override
    public ModeloPanelLM exportarPDF(String textoProblema, String nB, String N1, String AB, String nN2, String txtResultnBnAB, String txtResultNN, String txtResultadoDecimal, String txtResultadoPorcentaje) {
        ModeloPanelLM modelo = new ModeloPanelLM();
        Document documento = new Document();
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Respuesta.pdf"));
            
            Paragraph parrafo = new Paragraph();
            
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tw Cen MT", 14, Font.BOLD, BaseColor.BLACK));
            parrafo.add("PROBABILIDAD ");
            
            
            
            
        } catch (Exception e) {
        }

        return modelo;
    }

}
