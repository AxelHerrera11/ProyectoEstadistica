package Vistas;

import Controlador.ControladorPanelLM;
import Modelo.ModeloPanelLM;
import java.awt.Color;


public class PanelLeyMultiplicativa extends javax.swing.JPanel {

    /**
     * Creates new form PanelLeyMultiplicativa
     */
    public PanelLeyMultiplicativa() {
        initComponents();
        Modelo.ModeloPanelLM modelo = new ModeloPanelLM(this);
        Controlador.ControladorPanelLM controlador = new ControladorPanelLM(modelo);
        setControlador(controlador);

        this.txtnB.setBackground(new Color(0, 0, 0, 1));
        this.txtN1.setBackground(new Color(0, 0, 0, 1));
        this.txtnAB.setBackground(new Color(0, 0, 0, 1));
        this.txtN2.setBackground(new Color(0, 0, 0, 1));
        this.txtResultnBnAB.setBackground(new Color(0, 0, 0, 1));
        this.txtResultNN.setBackground(new Color(0, 0, 0, 1));
        this.txtResultadoDecimal.setBackground(new Color(0, 0, 0, 1));
        this.txtResultadoPorcentaje.setBackground(new Color(0, 0, 0, 1));
        this.btnPDF.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaDescripcionProblema = new javax.swing.JTextArea();
        txtnB = new javax.swing.JTextField();
        txtN1 = new javax.swing.JTextField();
        txtnAB = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        txtResultnBnAB = new javax.swing.JTextField();
        txtResultNN = new javax.swing.JTextField();
        txtResultadoDecimal = new javax.swing.JTextField();
        txtResultadoPorcentaje = new javax.swing.JTextField();
        btnResolver = new javax.swing.JPanel();
        lblResolver = new javax.swing.JLabel();
        btnPDF = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMostrarProblema = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        txtaDescripcionProblema.setBackground(new java.awt.Color(255, 255, 255));
        txtaDescripcionProblema.setColumns(20);
        txtaDescripcionProblema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtaDescripcionProblema.setLineWrap(true);
        txtaDescripcionProblema.setRows(5);
        txtaDescripcionProblema.setWrapStyleWord(true);
        txtaDescripcionProblema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        txtaDescripcionProblema.setOpaque(false);
        jScrollPane2.setViewportView(txtaDescripcionProblema);

        FondoPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 990, 140));

        txtnB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnB.setText("Ingrese nB");
        txtnB.setBorder(null);
        FondoPanel.add(txtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 110, 40));

        txtN1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtN1.setText("Ingrese N");
        txtN1.setBorder(null);
        FondoPanel.add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 110, 40));

        txtnAB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnAB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnAB.setText("Ingrese n(A|B)");
        txtnAB.setBorder(null);
        txtnAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnABActionPerformed(evt);
            }
        });
        FondoPanel.add(txtnAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 110, 40));

        txtN2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtN2.setText("Ingrese N");
        txtN2.setBorder(null);
        FondoPanel.add(txtN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 110, 40));

        txtResultnBnAB.setEditable(false);
        txtResultnBnAB.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        txtResultnBnAB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultnBnAB.setBorder(null);
        FondoPanel.add(txtResultnBnAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 110, 40));

        txtResultNN.setEditable(false);
        txtResultNN.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        txtResultNN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultNN.setBorder(null);
        txtResultNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultNNActionPerformed(evt);
            }
        });
        FondoPanel.add(txtResultNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 110, 40));

        txtResultadoDecimal.setEditable(false);
        txtResultadoDecimal.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        txtResultadoDecimal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultadoDecimal.setBorder(null);
        FondoPanel.add(txtResultadoDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 470, 100, 40));

        txtResultadoPorcentaje.setEditable(false);
        txtResultadoPorcentaje.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        txtResultadoPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultadoPorcentaje.setBorder(null);
        FondoPanel.add(txtResultadoPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 470, 100, 40));

        btnResolver.setBackground(new java.awt.Color(51, 51, 51));
        btnResolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnResolver.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnResolver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResolver.setBackground(new java.awt.Color(255, 255, 255));
        lblResolver.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lblResolver.setForeground(new java.awt.Color(225, 225, 225));
        lblResolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResolver.setText("Resolver");
        btnResolver.add(lblResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        FondoPanel.add(btnResolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 650, 140, 50));

        btnPDF.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnPDF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Exportar PDF");
        btnPDF.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        FondoPanel.add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 170, 50));

        btnMostrarProblema.setBackground(new java.awt.Color(51, 51, 51));
        btnMostrarProblema.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mostrar Problema");
        btnMostrarProblema.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        FondoPanel.add(btnMostrarProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLeyMultiplicativa.png"))); // NOI18N
        FondoPanel.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnABActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnABActionPerformed

    private void txtResultNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultNNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel FondoPanel;
    public javax.swing.JPanel btnMostrarProblema;
    public javax.swing.JPanel btnPDF;
    public javax.swing.JPanel btnResolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblResolver;
    public javax.swing.JTextField txtN1;
    public javax.swing.JTextField txtN2;
    public javax.swing.JTextField txtResultNN;
    public javax.swing.JTextField txtResultadoDecimal;
    public javax.swing.JTextField txtResultadoPorcentaje;
    public javax.swing.JTextField txtResultnBnAB;
    public javax.swing.JTextArea txtaDescripcionProblema;
    public javax.swing.JTextField txtnAB;
    public javax.swing.JTextField txtnB;
    // End of variables declaration//GEN-END:variables

    public void setControlador(ControladorPanelLM controlador) {
        btnResolver.addMouseListener(controlador);
        txtnB.addMouseListener(controlador);
        txtN1.addMouseListener(controlador);
        txtN2.addMouseListener(controlador);
        txtnAB.addMouseListener(controlador);
        txtnB.addKeyListener(controlador);
        txtN1.addKeyListener(controlador);
        txtnAB.addKeyListener(controlador);
        txtN2.addKeyListener(controlador);
        btnResolver.addKeyListener(controlador);
        btnPDF.addMouseListener(controlador);
        btnMostrarProblema.addMouseListener(controlador);
        
    }
}
