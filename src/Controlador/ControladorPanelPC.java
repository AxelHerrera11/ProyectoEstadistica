package Controlador;

import Implementacion.ProConImp;
import Modelo.ModeloPanelPC;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

public class ControladorPanelPC implements ActionListener, WindowListener, MouseListener, KeyListener {

    Modelo.ModeloPanelPC modelo;
    ProConImp implementacion = new ProConImp();
    

    public ControladorPanelPC(ModeloPanelPC modelo) {
        this.modelo = modelo;
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
    
    public void textoPredeterminadoN1(){
        if (modelo.getVistaPC().txtN1.getText().isEmpty()) {
                modelo.getVistaPC().txtN1.setText("Ingrese N");
                modelo.getVistaPC().txtN1.setForeground(new Color(102, 102, 102));
                modelo.getVistaPC().txtN1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
            }
    }
    
    public void textoPredeterminadoN2(){
        if (modelo.getVistaPC().txtN2.getText().isEmpty()) {
                modelo.getVistaPC().txtN2.setText("Ingrese N");
                modelo.getVistaPC().txtN2.setForeground(new Color(102, 102, 102));
                modelo.getVistaPC().txtN2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
            }
    }
    
    public void textoPredeterminadoAB(){
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
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaPC().btnResolver)) {
            realizarProcedimiento();
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

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
            realizarProcedimiento();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
