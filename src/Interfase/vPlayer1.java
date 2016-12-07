/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Common.cJuego;
import Dominio.dEmpresa;
import Patrones.Observer.ClaseObservador;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Maxi
 */
public class vPlayer1 extends javax.swing.JFrame implements Observer{
    private dEmpresa laEmpresa;
    private ClaseObservador observer;
    private String Accion;
    private cJuego elJuego;
    /**
     * Creates new form vPlayer1
     */
    public vPlayer1() {
        initComponents();
    }
    public vPlayer1 (dEmpresa pEmpresa , ClaseObservador Observador){
        
        initComponents();
        laEmpresa = pEmpresa;
        observer = Observador;
    }
    public vPlayer1 (ClaseObservador Observador){
        
        initComponents();
        observer = Observador;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxCartones = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnComprarCartones = new javax.swing.JButton();
        btnRetirarse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelCartones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarton1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCarton2 = new javax.swing.JTable();
        lblColor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(409, 639));
        jPanel1.setLayout(null);

        boxCartones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxCartones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        boxCartones.setSelectedIndex(1);
        boxCartones.setToolTipText("");
        jPanel1.add(boxCartones);
        boxCartones.setBounds(210, 60, 50, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Comprar Fichas: ");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "50", "100", "150", "200", "250" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Valor: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("200");
        jLabel10.setFocusable(false);

        btnComprar.setText("Comprar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComprar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(btnComprar)))
                .addGap(1, 1, 1))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 590, 390, 40);

        btnComprarCartones.setText("Comprar");
        jPanel1.add(btnComprarCartones);
        btnComprarCartones.setBounds(270, 60, 73, 23);

        btnRetirarse.setText("Retirarse");
        btnRetirarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetirarseMouseClicked(evt);
            }
        });
        jPanel1.add(btnRetirarse);
        btnRetirarse.setBounds(0, 0, 90, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de Cartones: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 60, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 10, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Saldo Disponible:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 20, 120, 17);

        panelCartones.setOpaque(false);

        tableCarton1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableCarton1);

        tableCarton2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableCarton2);

        javax.swing.GroupLayout panelCartonesLayout = new javax.swing.GroupLayout(panelCartones);
        panelCartones.setLayout(panelCartonesLayout);
        panelCartonesLayout.setHorizontalGroup(
            panelCartonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCartonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCartonesLayout.setVerticalGroup(
            panelCartonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartonesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelCartones);
        panelCartones.setBounds(10, 170, 390, 250);

        lblColor.setText("jLabel2");
        jPanel1.add(lblColor);
        lblColor.setBounds(10, 610, 34, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoVerde.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-6, -6, 420, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetirarseMouseClicked
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_btnRetirarseMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Por Favor, Elije la cantidad de Cartones con los que Jugaras", "Game", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_formWindowOpened
    public void cerrar(){
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea salir de la Partida?","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION)
        {
            dispose();
            //System.exit(0);
        }else{
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look tableCarton1l setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vPlayer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vPlayer1().setVisible(true);
            }
        });
    }
    /*
    //Como Recorrer una tabla buscando numeros
    public void ElegirNumero(){
        int numeroAleatorio = (int) (Math.random()*Numeros.length+1);
        boolean encontro = false;
        DefaultTableModel tm = (DefaultTableModel) this.tableSorteo.getModel();
        
            for (int i = tm.getRowCount() - 1; i >= 0; --i) {
                for (int j = tm.getColumnCount() - 1; j >= 0; --j) {
                    if (tm.getValueAt(i, j).equals(numeroAleatorio)) {
                        // what if value is not unique?
                        int numero = (int)tm.getValueAt(i, j);
                        tm.setValueAt("@", i, j);//"'"+numeroAleatorio +"'"
                        encontro = true;
                        this.lblEncontro.setText(String.valueOf(si++));
                        break;
                    }
                }
            }
        if(!encontro){
            ElegirNumero();
            this.lblNoEncontro.setText(String.valueOf(no++));
        }
        
        
    }*/
    
    /*
    //Cargar Mumeros a una Tabla
    if(this.Numeros == null){
            this.Numeros = new Integer[100]; 
            DefaultTableModel tm = (DefaultTableModel) this.tableSorteo.getModel();
            //Vacio las Rows
            tm.setRowCount(0);
            for(int i = 1; i < 92; i+=10){
                tm.addRow(new Object[]{new Integer(i), new Integer(i+1), new Integer(i+2), new Integer(i+3), new Integer(i+4), new Integer(i+5)
                , new Integer(i+6), new Integer(i+7), new Integer(i+8), new Integer(i+9)});
                tableSorteo.setModel(tm);
            }
        }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxCartones;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnComprarCartones;
    private javax.swing.JButton btnRetirarse;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblColor;
    private javax.swing.JPanel panelCartones;
    private javax.swing.JTable tableCarton1;
    private javax.swing.JTable tableCarton2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Accion = observer.getAccion();
        if(Accion.equalsIgnoreCase("ESPERANDO")){
            
        }
        this.lblColor.setText(Accion);
        /*String accion = observer.getAccion();
        acciones.add(accion);
        cargar();*/
    }
    
}
