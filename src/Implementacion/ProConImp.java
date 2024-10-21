package Implementacion;

import Interfaces.IProbabilidadCondicional;
import Modelo.ModeloPanelPC;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProConImp implements IProbabilidadCondicional {

    @Override
    public ModeloPanelPC realizarPC(double nAB, double nN1, double nB, double nN2) {
        ModeloPanelPC modelo = new ModeloPanelPC();

        try {
            double iPAB;
            double iPB;
            double iRespuesta;
            double iRespuestaPorcentaje;
            String aproximacion;

            iPAB = nAB / nN1;
            iPB = nB / nN2;

            iRespuesta = iPAB / iPB;
            aproximacion = String.format("%.2f", iRespuesta);
            iRespuestaPorcentaje = ((Double.parseDouble(aproximacion))  * 100);

            modelo.setpAB(iPAB);
            modelo.setpB(iPB);
            modelo.setRespuesta(iRespuesta);
            modelo.setRespuestaPorcentaje(iRespuestaPorcentaje);
        } catch (Exception e) {
            System.out.println("Error al realizar la operacion " + e.getMessage());
        }

        return modelo;
    }

    @Override
    public ModeloPanelPC exportarPDF(String textoProblema, String nAB, String nN1, String nB, String nN2, String pAB, String pB, String respuesta, String respuestaPorcentaje) {
        ModeloPanelPC modelo = new ModeloPanelPC();
        Document documento = new Document();
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Respuesta.pdf"));
            Image header = Image.getInstance("src/ImagenesPDF/EncabezadoPC-PDF.png");
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
            ejercicio.add("P(A|B) = P(A∩B)/P(B) = (nA∩B/N)/(nB/N)\n");
            ejercicio.add("P(A|B) = P(A∩B)/P(B) = (" + nAB + "/"+ nN1 +")/(" + nB + "/"+ nN2 + ") = " + pAB +"/" + pB + " = " + respuesta + " = " + respuestaPorcentaje);
            
            documento.open();
            documento.add(header);
            documento.add(subProblema);
            documento.add(parrafo);
            documento.add(subEjercicio);
            documento.add(ejercicio);
            documento.close();
            System.out.println("PDF creado");
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error al crear el PDF" + e.getMessage());
        } catch (IOException e){
            System.out.println("Error en la imagen" + e.getMessage());
        }
        
        return modelo;
    }

}
