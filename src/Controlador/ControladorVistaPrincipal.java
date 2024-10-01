package Controlador;

import Modelo.ModeloVistaPrincipal;
import Vistas.PanelProbabilidad1;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;

public class ControladorVistaPrincipal implements ActionListener, WindowListener, MouseListener{
    
    ModeloVistaPrincipal modelo;

    public ControladorVistaPrincipal(ModeloVistaPrincipal modelo) {
        this.modelo = modelo;
    }
    
    public void MostrarPanel(JPanel p){
            p.setSize(1230, 720);
            p.setLocation(0, 0);
            
            modelo.getVistaP().contenedor.removeAll();
            modelo.getVistaP().contenedor.add(p, BorderLayout.CENTER);
            modelo.getVistaP().contenedor.revalidate();
            modelo.getVistaP().contenedor.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
//        Vistas.PanelInicio panelI = new PanelInicio();
//        MostrarPanel(panelI);
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
        if(e.getComponent().equals(modelo.getVistaP().btn1)){
            Vistas.PanelProbabilidad1 panelPro = new PanelProbabilidad1();
            MostrarPanel(panelPro);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaP().btn1)){
            modelo.getVistaP().Fondo1.setVisible(true);
            modelo.getVistaP().Fondo2.setVisible(false);
            modelo.getVistaP().Fondo3.setVisible(false);
            modelo.getVistaP().lbBtn1Degradado.setVisible(true);
            modelo.getVistaP().lbBtn2Degradado.setVisible(true);
            modelo.getVistaP().lbBtn3Degradado.setVisible(true);
            modelo.getVistaP().lbBtn1.setVisible(true);
            modelo.getVistaP().bordeBtn1.setVisible(true);
            modelo.getVistaP().bordeBtn2.setVisible(false);
            modelo.getVistaP().bordeBtn3.setVisible(false);
        } else if(e.getComponent().equals(modelo.getVistaP().btn2)){
            modelo.getVistaP().Fondo1.setVisible(false);
            modelo.getVistaP().Fondo2.setVisible(true);
            modelo.getVistaP().Fondo3.setVisible(false);
            modelo.getVistaP().lbBtn2Degradado.setVisible(true);
            modelo.getVistaP().lbBtn1Degradado.setVisible(true);
            modelo.getVistaP().lbBtn3Degradado.setVisible(true);
            modelo.getVistaP().lbBtn2.setVisible(true);
            modelo.getVistaP().bordeBtn1.setVisible(false);
            modelo.getVistaP().bordeBtn2.setVisible(true);
            modelo.getVistaP().bordeBtn3.setVisible(false);
        } else if(e.getComponent().equals(modelo.getVistaP().btn3)){
            modelo.getVistaP().Fondo1.setVisible(false);
            modelo.getVistaP().Fondo2.setVisible(false);
            modelo.getVistaP().Fondo3.setVisible(true);
            modelo.getVistaP().lbBtn3Degradado.setVisible(true);
            modelo.getVistaP().lbBtn1Degradado.setVisible(true);
            modelo.getVistaP().lbBtn2Degradado.setVisible(true);
            modelo.getVistaP().lbBtn3.setVisible(true);
            modelo.getVistaP().bordeBtn1.setVisible(false);
            modelo.getVistaP().bordeBtn2.setVisible(false);
            modelo.getVistaP().bordeBtn3.setVisible(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaP().btn1)){
            modelo.getVistaP().lbBtn1Degradado.setVisible(false);
            modelo.getVistaP().lbBtn1.setVisible(false);
        } else if(e.getComponent().equals(modelo.getVistaP().btn2)){
            modelo.getVistaP().lbBtn2Degradado.setVisible(false);
            modelo.getVistaP().lbBtn2.setVisible(false);
        } else if(e.getComponent().equals(modelo.getVistaP().btn3)){
            modelo.getVistaP().lbBtn3Degradado.setVisible(false);
            modelo.getVistaP().lbBtn3.setVisible(false);
        }
    }
    
}
