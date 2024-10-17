package Implementacion;

import Interfaces.IProbabilidadCondicional;
import Modelo.ModeloPanelPC;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
            
            Paragraph parrafo = new Paragraph();
            
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tw Cen MT", 14, Font.BOLD, BaseColor.BLACK));
            parrafo.add("PROBABILIDAD CONDICIONAL \n\n");
            parrafo.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            parrafo.add(textoProblema + "\n\n");
            parrafo.add("P(A|B) = P(A∩B)/P(B) = (nA∩B/N)/(nB/N) = (" + nAB + "/"+ nN1 +")/(" + nB + "/"+ nN2 + ") = " + pAB +"/" + pB + " = " + respuesta + " = " + respuestaPorcentaje);
            
            documento.open();
//            documento.add(new Chunk(""));
            documento.add(parrafo);
            documento.close();
            System.out.println("PDF creado");
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error al crear el PDF" + e.getMessage());
        }
        
        return modelo;
    }

}
