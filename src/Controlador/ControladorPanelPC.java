package Controlador;

import Implementacion.ProConImp;
import Modelo.ModeloPanelPC;
import Modelo.ModeloVistaPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ControladorPanelPC implements ActionListener, MouseListener, KeyListener {

    Modelo.ModeloPanelPC modelo;
    ProConImp implementacion = new ProConImp();

    public ControladorPanelPC(ModeloPanelPC modelo) {
        this.modelo = modelo;
    }

    public Icon getIcon(String altura, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResource(altura)).getImage().getScaledInstance(w, h, 0));
    }

    public void validarBtnResolver() {
        if (modelo.getVistaPC().lblBtnResolver.getText().equals("Resolver")) {
            if (modelo.getVistaPC().txtAB.getText().equals("Ingrese Interseccion")
                    || modelo.getVistaPC().txtN1.getText().equals("Ingrese N")
                    || modelo.getVistaPC().txtB.getText().equals("Ingrese nB")
                    || modelo.getVistaPC().txtN2.getText().equals("Ingrese N")
                    || modelo.getVistaPC().txtAB.getText().isEmpty()
                    || modelo.getVistaPC().txtN1.getText().isEmpty()
                    || modelo.getVistaPC().txtB.getText().isEmpty()
                    || modelo.getVistaPC().txtN2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "<html><p style = 'font-family: Tw Cen MT;'>PARA CONTINUAR, ES NECESARIO QUE TODOS LOS DATOS SEAN INGRESADOS CORRECTAMENTE</p></html>", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE, getIcon("/Imagenes/iconoError.png", 40, 40));
            } else {
                realizarProcedimiento();
                modelo.getVistaPC().lblBtnResolver.setText("Limpiar");
            }
        } else if (modelo.getVistaPC().lblBtnResolver.getText().equals("Limpiar")) {

            modelo.getVistaPC().txtAB.setText("");
            modelo.getVistaPC().txtN1.setText("");
            modelo.getVistaPC().txtB.setText("");
            modelo.getVistaPC().txtN2.setText("");
            textoPredeterminadoAB();
            textoPredeterminadoN1();
            textoPredeterminadoB();
            textoPredeterminadoN2();
            modelo.getVistaPC().txtPAB.setText("");
            modelo.getVistaPC().txtPB.setText("");
            modelo.getVistaPC().txtRespuesta.setText("");
            modelo.getVistaPC().txtRespuestaPorcentaje.setText("");
            modelo.getVistaPC().btnPDF.setVisible(false);
            modelo.getVistaPC().txtAB.setEditable(true);
            modelo.getVistaPC().txtN1.setEditable(true);
            modelo.getVistaPC().txtB.setEditable(true);
            modelo.getVistaPC().txtN2.setEditable(true);
            modelo.getVistaPC().lblBtnResolver.setText("Resolver");
        }
    }

    public void realizarProcedimiento() {
        double nAB = Double.parseDouble(modelo.getVistaPC().txtAB.getText());
        double nN1 = Double.parseDouble(modelo.getVistaPC().txtN1.getText());
        double nb = Double.parseDouble(modelo.getVistaPC().txtB.getText());
        double nN2 = Double.parseDouble(modelo.getVistaPC().txtN2.getText());
        ModeloPanelPC model = implementacion.realizarPC(nAB, nN1, nb, nN2);

        modelo.getVistaPC().txtPAB.setText(String.format("%.2f", model.getpAB()));
        modelo.getVistaPC().txtPB.setText(String.format("%.2f", model.getpB()));
        modelo.getVistaPC().txtRespuesta.setText(String.format("%.2f", model.getRespuesta()));
        modelo.getVistaPC().txtRespuestaPorcentaje.setText(String.format("%.0f", model.getRespuestaPorcentaje()) + "%");
        modelo.getVistaPC().btnPDF.setVisible(true);
        modelo.getVistaPC().txtAB.setEditable(false);
        modelo.getVistaPC().txtN1.setEditable(false);
        modelo.getVistaPC().txtB.setEditable(false);
        modelo.getVistaPC().txtN2.setEditable(false);
    }

    public void exportarPDF() {
        ModeloVistaPrincipal modeloVP = new ModeloVistaPrincipal();
        String textProblema = modeloVP.getTextoProblema();

        String nAB = modelo.getVistaPC().txtAB.getText();
        String nN1 = modelo.getVistaPC().txtN1.getText();
        String nB = modelo.getVistaPC().txtB.getText();
        String nN2 = modelo.getVistaPC().txtN2.getText();
        String pAB = modelo.getVistaPC().txtPAB.getText();
        String pB = modelo.getVistaPC().txtPB.getText();
        String respuesta = modelo.getVistaPC().txtRespuesta.getText();
        String respuestaDecimal = modelo.getVistaPC().txtRespuestaPorcentaje.getText();
        ModeloPanelPC model = implementacion.exportarPDF(textProblema, nAB, nN1, nB, nN2, pAB, pB, respuesta, respuestaDecimal);
    }

    public void validarNumero(KeyEvent e) {
        int key = e.getKeyChar();

        boolean numero = (key >= 48 && key <= 57) || (key == 46);

        if (!numero) {
            e.consume();
        }
    }

    public void textoPredeterminadoB() {
        if (modelo.getVistaPC().txtB.getText().isEmpty()) {
            modelo.getVistaPC().txtB.setText("Ingrese nB");
            modelo.getVistaPC().txtB.setForeground(new Color(102, 102, 102));
            modelo.getVistaPC().txtB.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        }
    }

    public void textoPredeterminadoN1() {
        if (modelo.getVistaPC().txtN1.getText().isEmpty()) {
            modelo.getVistaPC().txtN1.setText("Ingrese N");
            modelo.getVistaPC().txtN1.setForeground(new Color(102, 102, 102));
            modelo.getVistaPC().txtN1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        }
    }

    public void textoPredeterminadoN2() {
        if (modelo.getVistaPC().txtN2.getText().isEmpty()) {
            modelo.getVistaPC().txtN2.setText("Ingrese N");
            modelo.getVistaPC().txtN2.setForeground(new Color(102, 102, 102));
            modelo.getVistaPC().txtN2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        }
    }

    public void textoPredeterminadoAB() {
        if (modelo.getVistaPC().txtAB.getText().isEmpty()) {
            modelo.getVistaPC().txtAB.setText("Ingrese Interseccion");
            modelo.getVistaPC().txtAB.setForeground(new Color(102, 102, 102));
            modelo.getVistaPC().txtAB.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaPC().btnResolver)) {
            validarBtnResolver();
        } else if (e.getComponent().equals(modelo.getVistaPC().btnMostrarProblema)) {
            ModeloVistaPrincipal modeloVP = new ModeloVistaPrincipal();
            modelo.getVistaPC().txtaDescripcionProblema.setText(modeloVP.getTextoProblema());
        } else if (e.getComponent().equals(modelo.getVistaPC().btnPDF)) {
            exportarPDF();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaPC().txtAB)) {
            if (modelo.getVistaPC().txtAB.getText().equals("Ingrese Interseccion")) {
                modelo.getVistaPC().txtAB.setText("");
                modelo.getVistaPC().txtAB.setForeground(Color.BLACK);
                modelo.getVistaPC().txtAB.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadoN1();
            textoPredeterminadoB();
            textoPredeterminadoN2();

        } else if (e.getComponent().equals(modelo.getVistaPC().txtN1)) {
            if (modelo.getVistaPC().txtN1.getText().equals("Ingrese N")) {
                modelo.getVistaPC().txtN1.setText("");
                modelo.getVistaPC().txtN1.setForeground(Color.BLACK);
                modelo.getVistaPC().txtN1.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadoAB();
            textoPredeterminadoB();
            textoPredeterminadoN2();
        } else if (e.getComponent().equals(modelo.getVistaPC().txtB)) {
            if (modelo.getVistaPC().txtB.getText().equals("Ingrese nB")) {
                modelo.getVistaPC().txtB.setText("");
                modelo.getVistaPC().txtB.setForeground(Color.BLACK);
                modelo.getVistaPC().txtB.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadoAB();
            textoPredeterminadoN1();
            textoPredeterminadoN2();
        } else if (e.getComponent().equals(modelo.getVistaPC().txtN2)) {
            if (modelo.getVistaPC().txtN2.getText().equals("Ingrese N")) {
                modelo.getVistaPC().txtN2.setText("");
                modelo.getVistaPC().txtN2.setForeground(Color.BLACK);
                modelo.getVistaPC().txtN2.setFont(new Font("Tw Cen MT", Font.PLAIN, 36));
            }
            textoPredeterminadoAB();
            textoPredeterminadoN1();
            textoPredeterminadoB();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaPC().btnMostrarProblema)) {
            modelo.getVistaPC().btnMostrarProblema.setBackground(new Color(102, 102, 102));
        } else if (e.getComponent().equals(modelo.getVistaPC().btnResolver)) {
            modelo.getVistaPC().btnResolver.setBackground(new Color(102, 102, 102));
        } else if (e.getComponent().equals(modelo.getVistaPC().btnPDF)) {
            modelo.getVistaPC().btnPDF.setBackground(new Color(102, 102, 102));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaPC().btnMostrarProblema)) {
            modelo.getVistaPC().btnMostrarProblema.setBackground(new Color(51, 51, 51));
        } else if (e.getComponent().equals(modelo.getVistaPC().btnResolver)) {
            modelo.getVistaPC().btnResolver.setBackground(new Color(51, 51, 51));
        } else if (e.getComponent().equals(modelo.getVistaPC().btnPDF)) {
            modelo.getVistaPC().btnPDF.setBackground(new Color(51, 51, 51));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getComponent().equals(modelo.getVistaPC().txtAB)) {
            validarNumero(e);
        } else if (e.getComponent().equals(modelo.getVistaPC().txtN1)) {
            validarNumero(e);
        } else if (e.getComponent().equals(modelo.getVistaPC().txtB)) {
            validarNumero(e);
        } else if (e.getComponent().equals(modelo.getVistaPC().txtN2)) {
            validarNumero(e);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (modelo.getVistaPC().txtRespuestaPorcentaje.getText().isEmpty()) {
                validarBtnResolver();
            } else {
                exportarPDF();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
