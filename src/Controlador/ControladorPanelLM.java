package Controlador;

import Implementacion.LmConImp;
import Modelo.ModeloPanelLM;
import Modelo.ModeloVistaPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPanelLM implements ActionListener, MouseListener, KeyListener {

    Modelo.ModeloPanelLM modelo;
    LmConImp implementacion = new LmConImp();

    public ControladorPanelLM(ModeloPanelLM modelo) {
        this.modelo = modelo;
    }

    public void realizarProcedimiento() {
        double nB = Double.parseDouble(modelo.getVistaLM().txtnB.getText());
        double N1 = Double.parseDouble(modelo.getVistaLM().txtN1.getText());
        double AB = Double.parseDouble(modelo.getVistaLM().txtnAB.getText());
        double N2 = Double.parseDouble(modelo.getVistaLM().txtN2.getText());
        ModeloPanelLM model = implementacion.realizarLM(nB, N1, AB, N2);

        modelo.getVistaLM().txtResultnBnAB.setText(String.format("%.2f", model.getResultadonBnAB()));
        modelo.getVistaLM().txtResultNN.setText(String.format("%.2f", model.getResultadoNN()));
        modelo.getVistaLM().txtResultadoDecimal.setText(String.format("%.2f", model.getResultadoDecimal()));
        modelo.getVistaLM().txtResultadoPorcentaje.setText(String.format("%.2f", model.getResultadoPorcentaje()));
        modelo.getVistaLM().btnPDF.setVisible(true);
    }

    public void exportarPDF() {

        ModeloVistaPrincipal modeloVP = new ModeloVistaPrincipal();
        String textoProblema = modeloVP.getTextoProblema();

        String nB = modelo.getVistaLM().txtnB.getText();
        String N1 = modelo.getVistaLM().txtN1.getText();
        String AB = modelo.getVistaLM().txtnAB.getText();
        String N2 = modelo.getVistaLM().txtN2.getText();
        String ResultnBnAB = modelo.getVistaLM().txtResultnBnAB.getText();
        String ResultadoNN = modelo.getVistaLM().txtResultNN.getText();
        String RespuestaDecimal = modelo.getVistaLM().txtResultadoDecimal.getText();
        String RespuestaPorcentaje = modelo.getVistaLM().txtResultadoPorcentaje.getText();
        ModeloPanelLM model = implementacion.exportarPDF(textoProblema, nB, N1, AB, N2, ResultnBnAB, ResultadoNN, RespuestaDecimal, RespuestaPorcentaje);

    }

    public void validarNumero(KeyEvent e) {
        int key = e.getKeyChar();

        boolean numero = (key >= 48 && key <= 57) || (key == 46);

        if (!numero) {
            e.consume();
        }
    }

    public void textoPredeterminadonB() {
        if (modelo.getVistaLM().txtnB.getText().isEmpty()) {
            modelo.getVistaLM().txtnB.setText("Ingrese nB");
            modelo.getVistaLM().txtnB.setForeground(new Color(102, 102, 102));
            modelo.getVistaLM().txtnB.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));

        }

    }

    public void textoPredeterminadoN1() {
        if (modelo.getVistaLM().txtN1.getText().isEmpty()) {
            modelo.getVistaLM().txtN1.setText("Ingrese N");
            modelo.getVistaLM().txtN1.setForeground(new Color(102, 102, 102));
            modelo.getVistaLM().txtN1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));

        }
    }

    public void textoPredeterminadoAB() {
        if (modelo.getVistaLM().txtnAB.getText().isEmpty()) {
            modelo.getVistaLM().txtnAB.setText("Ingrese n(A|B)");
            modelo.getVistaLM().txtnAB.setForeground(new Color(102, 102, 102));
            modelo.getVistaLM().txtnAB.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));

        }
    }

    public void textoPrederminadoN2() {
        if (modelo.getVistaLM().txtN2.getText().isEmpty()) {
            modelo.getVistaLM().txtN2.setText("Ingrese N");
            modelo.getVistaLM().txtN2.setForeground(new Color(102, 102, 102));
            modelo.getVistaLM().txtN2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().equals(modelo.getVistaLM().btnResolver)) {
            realizarProcedimiento();
        } else if (e.getComponent().equals(modelo.getVistaLM().btnMostrarProblema)) {
            ModeloVistaPrincipal modeloVP = new ModeloVistaPrincipal();
            modelo.getVistaLM().txtaDescripcionProblema.setText(modeloVP.getTextoProblema());
        } else if (e.getComponent().equals(modelo.getVistaLM().btnPDF)) {
            exportarPDF();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaLM().txtnB)) {
            if (modelo.getVistaLM().txtnB.getText().equals("Ingrese nB")) {
                modelo.getVistaLM().txtnB.setText("");
                modelo.getVistaLM().txtnB.setForeground(Color.BLACK);
                modelo.getVistaLM().txtnB.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadoN1();
            textoPredeterminadoAB();
            textoPrederminadoN2();

        } else if (e.getComponent().equals(modelo.getVistaLM().txtN1)) {
            if (modelo.getVistaLM().txtN1.getText().equals("Ingrese N")) {
                modelo.getVistaLM().txtN1.setText("");
                modelo.getVistaLM().txtN1.setForeground(Color.BLACK);
                modelo.getVistaLM().txtN1.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadonB();
            textoPredeterminadoAB();
            textoPrederminadoN2();

        } else if (e.getComponent().equals(modelo.getVistaLM().txtnAB)) {
            if (modelo.getVistaLM().txtnAB.getText().equals("Ingrese n(A|B)")) {
                modelo.getVistaLM().txtnAB.setText("");
                modelo.getVistaLM().txtnAB.setForeground(Color.BLACK);
                modelo.getVistaLM().txtnAB.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadonB();
            textoPredeterminadoN1();
            textoPrederminadoN2();
        } else if (e.getComponent().equals(modelo.getVistaLM().txtN2)) {
            if (modelo.getVistaLM().txtN2.getText().equals("Ingrese N")) {
                modelo.getVistaLM().txtN2.setText("");
                modelo.getVistaLM().txtN2.setForeground(Color.BLACK);
                modelo.getVistaLM().txtN2.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadonB();
            textoPredeterminadoN1();
            textoPredeterminadonB();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaLM().btnMostrarProblema)) {
            modelo.getVistaLM().btnMostrarProblema.setBackground(new Color(58, 116, 185));
        } else if (e.getComponent().equals(modelo.getVistaLM().btnResolver)) {
            modelo.getVistaLM().btnResolver.setBackground(new Color(58, 116, 185));
        } else if (e.getComponent().equals(modelo.getVistaLM().btnPDF)){
            modelo.getVistaLM().btnPDF.setBackground(new Color(58, 116, 185));        
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaLM().btnMostrarProblema)) {
            modelo.getVistaLM().btnMostrarProblema.setBackground(new Color(74, 144, 226));
        } else if (e.getComponent().equals(modelo.getVistaLM().btnResolver)) {
            modelo.getVistaLM().btnResolver.setBackground(new Color(74, 144, 226));
        } else if (e.getComponent().equals(modelo.getVistaLM().btnPDF)){
            modelo.getVistaLM().btnPDF.setBackground(new Color(74, 144,226));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getComponent().equals(modelo.getVistaLM().txtnB)) {
            validarNumero(e);
        } else if (e.getComponent().equals(modelo.getVistaLM().txtN1)) {
            validarNumero(e);
        } else if (e.getComponent().equals(modelo.getVistaLM().txtnAB)) {
            validarNumero(e);
        } else if (e.getComponent().equals(modelo.getVistaLM().txtN2)) {
            validarNumero(e);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            realizarProcedimiento();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
