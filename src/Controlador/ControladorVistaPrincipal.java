package Controlador;

import Modelo.ModeloVistaPrincipal;
import Vistas.PanelInicio;
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
        Vistas.PanelInicio panelI = new PanelInicio();
        MostrarPanel(panelI);
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
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
