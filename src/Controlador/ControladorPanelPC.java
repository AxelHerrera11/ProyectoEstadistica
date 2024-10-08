package Controlador;

import Implementacion.ProConImp;
import Modelo.ModeloPanelPC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPanelPC implements ActionListener, WindowListener, MouseListener{
    Modelo.ModeloPanelPC modelo;
    ProConImp implementacion = new ProConImp();
    
    public ControladorPanelPC(ModeloPanelPC modelo) {
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
        if(e.getComponent().equals(modelo.getVistaPC().btnResolver)){
            double nAB = Double.parseDouble(modelo.getVistaPC().txtAB.getText());
            double nN1 = Double.parseDouble(modelo.getVistaPC().txtN1.getText());
            double nb = Double.parseDouble(modelo.getVistaPC().txtB.getText());
            double nN2 = Double.parseDouble(modelo.getVistaPC().txtN2.getText());
            ModeloPanelPC model = implementacion.realizarPC(nAB, nN1, nb, nN2);
            
            modelo.getVistaPC().txtPAB.setText(Double.toString(model.getpAB()));
            modelo.getVistaPC().txtPB.setText(Double.toString(model.getpB()));
            modelo.getVistaPC().txtRespuesta.setText(Double.toString(model.getRespuesta()));
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
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}
