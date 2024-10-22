package Implementacion;

import Interfaces.ILeyMultiplicativa;
import Modelo.ModeloPanelLM;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Solución Ley Multiplicativa.pdf"));
            Image header = Image.getInstance("src/ImagenesPDF/EncabezadoLM-PDF.png");
            header.scaleToFit(595, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph subProblema = new Paragraph();
            Paragraph parrafo = new Paragraph();
            Paragraph subEjercicio = new Paragraph();
            Paragraph ejercicio = new Paragraph();
            
            subProblema.setAlignment(Paragraph.ALIGN_LEFT);
            subProblema.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            subProblema.add("\nProblema:\n");
            
            parrafo.setAlignment(Paragraph.ALIGN_JUSTIFIED);
            parrafo.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            parrafo.add(textoProblema + "\n\n");
            
            subEjercicio.setAlignment(Paragraph.ALIGN_LEFT);
            subEjercicio.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            subEjercicio.add("Solución:\n");
            
            ejercicio.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            ejercicio.add("P(A∩B) = P(B) * P(A|B)\n");
            ejercicio.add("P(A∩B) = nB/N * n(A|B)/N = ("+ nB + "/" + N1 + ") " + "*" + " (" + AB + "/" + nN2 + ") = " + txtResultnBnAB + "/" + txtResultNN + " = " + txtResultadoDecimal + " = " + txtResultadoPorcentaje);
            
            
            documento.open();
            documento.add(header);
            documento.add(subProblema);
            documento.add(parrafo);
            documento.add(subEjercicio);
            documento.add(ejercicio);
            documento.close();
            System.out.println("PDF CREADO");
            JOptionPane.showMessageDialog(null, "<html><p style =\"color:white; font-size: 20px;\">PDF CREADO EXISTOSAMENTE</p></html>", "PDF CREADO", JOptionPane.INFORMATION_MESSAGE);
               
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error al crear el PDF " + e.getMessage());
        } catch (IOException e){
            System.out.println("Error en la imagen" + e.getMessage());
        }
        return modelo;
    }

}
