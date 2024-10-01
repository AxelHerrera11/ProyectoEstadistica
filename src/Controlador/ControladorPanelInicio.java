package Controlador;

import Modelo.ModeloPanelInicial;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPanelInicio implements ActionListener, WindowListener, MouseListener{
    
    ModeloPanelInicial modelo;

    public ControladorPanelInicio(ModeloPanelInicial modelo) {
        this.modelo = modelo;
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
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaPanelInicio().btn1)){
            modelo.getVistaPanelInicio().Fondo1.setVisible(true);
            modelo.getVistaPanelInicio().Fondo2.setVisible(false);
            modelo.getVistaPanelInicio().Fondo3.setVisible(false);
        } else if(e.getComponent().equals(modelo.getVistaPanelInicio().btn2)){
            modelo.getVistaPanelInicio().Fondo1.setVisible(false);
            modelo.getVistaPanelInicio().Fondo2.setVisible(true);
            modelo.getVistaPanelInicio().Fondo3.setVisible(false);
        } else if(e.getComponent().equals(modelo.getVistaPanelInicio().btn3)){
            modelo.getVistaPanelInicio().Fondo1.setVisible(false);
            modelo.getVistaPanelInicio().Fondo2.setVisible(false);
            modelo.getVistaPanelInicio().Fondo3.setVisible(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        if(e.getComponent().equals(modelo.getVistaPanelInicio().btn1)){
////            modelo.getVistaPanelInicio().Fondo1.setVisible(false);
//        }
    }
    
}
