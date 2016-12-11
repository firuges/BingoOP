/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Common.cCarton;
import Common.cConfiguracion;
import Common.cJuego;
import Common.cJugador;
import Dominio.dEmpresa;
import Patrones.Observer.ClaseObservador;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import sun.util.calendar.CalendarDate;
/**
 *
 * @author Maxi
 */
public class vPlayer1 extends javax.swing.JFrame implements Observer{
    private dEmpresa laEmpresa;
    private  ClaseObservador observer;
    private String Accion;
    private  int CantCartones;
    private  ArrayList<Integer> numerosInsertados;
    cConfiguracion laConfig;
    private static boolean borrarBolillero;
    /**
     * Creates new form vPlayer1
     */
    public vPlayer1() {
        initComponents();
    }
    public vPlayer1 (dEmpresa pEmpresa , ClaseObservador Observador) throws Exception{
        
        initComponents();
        laEmpresa = pEmpresa;
        observer = Observador;
        numerosInsertados = new ArrayList<Integer>();
        laConfig= laEmpresa.traerConfiguracion(2);
        numerosInsertados.add(0);
        
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
        jLabel3 = new javax.swing.JLabel();
        panelJugarDeNuevo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        lblBolilla = new javax.swing.JLabel();
        lblPodio = new javax.swing.JLabel();
        btnRetirarse = new javax.swing.JButton();
        lblPozo = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblTitleSaldo = new javax.swing.JLabel();
        panelCartones = new javax.swing.JPanel();
        panelTable1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarton1 = new javax.swing.JTable();
        panelTable2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCarton2 = new javax.swing.JTable();
        panelTable3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCarton3 = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("POZO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 10, 50, 17);

        panelJugarDeNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("hooge 05_54", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MensajeVolver.png"))); // NOI18N
        panelJugarDeNuevo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 20));

        btnNO.setText("Aceptar");
        btnNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOActionPerformed(evt);
            }
        });
        panelJugarDeNuevo.add(btnNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/texturaNegra.jpg"))); // NOI18N
        panelJugarDeNuevo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 90));

        jPanel1.add(panelJugarDeNuevo);
        panelJugarDeNuevo.setBounds(50, 170, 310, 90);
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(100, 40, 210, 90);
        jPanel1.add(lblBolilla);
        lblBolilla.setBounds(170, 150, 60, 50);

        lblPodio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/podio.png"))); // NOI18N
        jPanel1.add(lblPodio);
        lblPodio.setBounds(130, 160, 150, 90);

        btnRetirarse.setText("Retirarse");
        btnRetirarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetirarseMouseClicked(evt);
            }
        });
        jPanel1.add(btnRetirarse);
        btnRetirarse.setBounds(0, 0, 90, 23);

        lblPozo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPozo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblPozo);
        lblPozo.setBounds(280, 30, 50, 30);

        lblSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblSaldo);
        lblSaldo.setBounds(340, 30, 50, 30);

        lblTitleSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitleSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSaldo.setText("Mis Fichas");
        jPanel1.add(lblTitleSaldo);
        lblTitleSaldo.setBounds(340, 10, 60, 17);

        panelCartones.setOpaque(false);

        tableCarton1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCarton1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableCarton1.setName(""); // NOI18N
        jScrollPane1.setViewportView(tableCarton1);

        javax.swing.GroupLayout panelTable1Layout = new javax.swing.GroupLayout(panelTable1);
        panelTable1.setLayout(panelTable1Layout);
        panelTable1Layout.setHorizontalGroup(
            panelTable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelTable1Layout.setVerticalGroup(
            panelTable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        tableCarton2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableCarton2);

        javax.swing.GroupLayout panelTable2Layout = new javax.swing.GroupLayout(panelTable2);
        panelTable2.setLayout(panelTable2Layout);
        panelTable2Layout.setHorizontalGroup(
            panelTable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelTable2Layout.setVerticalGroup(
            panelTable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        tableCarton3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableCarton3);

        javax.swing.GroupLayout panelTable3Layout = new javax.swing.GroupLayout(panelTable3);
        panelTable3.setLayout(panelTable3Layout);
        panelTable3Layout.setHorizontalGroup(
            panelTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        panelTable3Layout.setVerticalGroup(
            panelTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCartonesLayout = new javax.swing.GroupLayout(panelCartones);
        panelCartones.setLayout(panelCartonesLayout);
        panelCartonesLayout.setHorizontalGroup(
            panelCartonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCartonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCartonesLayout.setVerticalGroup(
            panelCartonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartonesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelTable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(panelCartones);
        panelCartones.setBounds(10, 250, 390, 380);

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoVerde.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(-6, -6, 420, 650);

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
        borrarBolillero = true;
        CargarJuego();
    }//GEN-LAST:event_formWindowOpened

    private void btnNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOActionPerformed
        // TODO add your handling code here:
        observer.setCambios("CERRARTODO");
        
        
    }//GEN-LAST:event_btnNOActionPerformed
    private void CargarJuego(){
        cJugador j = this.BuscarJugadorEnJuego(this.getTitle());
        
        this.panelJugarDeNuevo.setVisible(false);
        this.lblPodio.setVisible(true);
        this.lblBolilla.setVisible(true);
        if(j.getCantidadCartones() == 1)
        {
            this.panelTable1.setVisible(true);
            this.panelTable2.setVisible(false);
            this.panelTable3.setVisible(false);
        }else if(j.getCantidadCartones() == 2)
        {
            this.panelTable1.setVisible(true);
            this.panelTable2.setVisible(true);
            this.panelTable3.setVisible(false);
        }else{
            this.panelTable1.setVisible(true);
            this.panelTable2.setVisible(true);
            this.panelTable3.setVisible(true);
        }
        try {
            this.completarCartones();
            } catch (Exception ex) {
                Logger.getLogger(vPlayer1.class.getName()).log(Level.SEVERE, null, ex);
            }
        int saldo = calcularSaldoAmostrar(j);
        this.lblSaldo.setText(String.valueOf(saldo));
        this.lblPozo.setText(String.valueOf(observer.getElJuego().getPozo()));
        
        
    }
    
    public boolean checkReadyAll(String cantidad){
        boolean bandera = true;
        int cant = Integer.parseInt(cantidad);
        int contador = 0;
        for(cJugador u: observer.getElJuego().getJugadores()){
            if(!u.isReady()){
                bandera = false;
            }
            contador ++;
        }
        if(cant == contador && bandera == true){
            return bandera;
        }
        return false;
    }
    private int devolverNumero() {
        //un random de 0 a 100
        int random = ThreadLocalRandom.current().nextInt(0, observer.getNumeros() + 1);
        String nombre = this.getTitle();
        if(!repetido(random, this.numerosInsertados)){
            numerosInsertados.add(random);
            return random;
   }
        else{
            return devolverNumero();
        }
        
    }
    private boolean repetido(int numero, ArrayList<Integer> numeros){
            if(numeros.contains(numero))
                return true;
        return false;

    }
    public cJugador BuscarJugadorEnJuego(String pUserName){
        for (cJugador j : observer.getElJuego().getJugadores()) {
                    if (j.getUserName().equalsIgnoreCase(pUserName)) {
                        return j;
                    }
        }
        return null;
    }
    private int calcularSaldoAmostrar(cJugador j){
        int saldo = 0;
        cConfiguracion c;
        try {
            c = laEmpresa.traerConfiguracion(2);
            saldo = j.getFichas() - j.getCartones().size() * c.getValorCarton();
        } catch (Exception ex) {
            Logger.getLogger(vPlayer1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return saldo;
    }
    private void completarCartones() throws Exception{
        int columnas = laConfig.getColumnasCarton();
        int filas = laConfig.getFilasCarton();
        int NumeroAgregar = -1;
        cJugador jugador = BuscarJugadorEnJuego(this.getTitle());
        
        for(int i =0; i<jugador.getCantidadCartones() ; i++)
        {
            cCarton carton = new cCarton();
            carton.setColumnas(columnas);
            carton.setFilas(filas);
            int numerosXCarton = columnas * filas;
            int[][] losNumeros= new int[filas][columnas];

            for(int j = 0; j<filas; j++){
                for(int k =0; k<columnas; k++){
                    NumeroAgregar= devolverNumero();
                    losNumeros[j][k] = NumeroAgregar;
                    //si el bolillero no tiene ya el numero lo agrego!
                    if(!observer.getElJuego().getBolillero().contains(NumeroAgregar)){
                        observer.getElJuego().getBolillero().add(NumeroAgregar);
                    }
                }

            }
            carton.setNumeros(losNumeros);
            carton.setContCompleto(numerosXCarton);
            carton.setId(i+1);
            jugador.getCartones().add(carton);
        }
        completarTablas(jugador);
    }
    
    private void completarTablas(cJugador jugador){
        for(int i = 0; i<jugador.getCantidadCartones(); i++){
            if(i==0)
            {
                DefaultTableModel modeltbl = (DefaultTableModel) this.tableCarton1.getModel();
                int columnas = laConfig.getColumnasCarton();
                int filas = laConfig.getFilasCarton();
                modeltbl.setColumnCount(columnas);
                modeltbl.setRowCount(filas);
                int[][] losnums = jugador.getCartones().get(0).getNumeros();
                for(int k = 0; k<filas; k++){
                    for(int j =0; j<columnas; j++){
                        tableCarton1.setValueAt(losnums[k][j], k, j);
                    }
            }

            }else if (i==1){
                DefaultTableModel modeltbl = (DefaultTableModel) this.tableCarton2.getModel();
                int columnas = laConfig.getColumnasCarton();
                int filas = laConfig.getFilasCarton();
                modeltbl.setColumnCount(columnas);
                modeltbl.setRowCount(filas);
                int[][] losnums = jugador.getCartones().get(1).getNumeros();
                for(int k = 0; k<filas; k++){
                    for(int j =0; j<columnas; j++){
                        tableCarton2.setValueAt(losnums[k][j], k, j);
                    }
            }
            }
            else{
                DefaultTableModel modeltbl = (DefaultTableModel) this.tableCarton3.getModel();
                int columnas = laConfig.getColumnasCarton();
                int filas = laConfig.getFilasCarton();
                modeltbl.setColumnCount(columnas);
                modeltbl.setRowCount(filas);
                int[][] losnums = jugador.getCartones().get(2).getNumeros();
                for(int k = 0; k<filas; k++){
                    for(int j =0; j<columnas; j++){
                        tableCarton3.setValueAt(losnums[k][j], k, j);
                    }
            }
            }


        }
    }    
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
    public int CalcularValorFichas(int cantidad){
        int unidad = 2;
        return cantidad * 2;
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
    
    
    //Como Recorrer una tabla buscando numeros
    public void MarcarNumero(int numero){
        boolean encontro = false;
        cJugador j = this.BuscarJugadorEnJuego(this.getTitle());
        int cantidadCartones = j.getCantidadCartones();
        int i = 0;
        DefaultTableModel tm  = null;
        //recorrere todos los cartones
        while(i < cantidadCartones){
            if(i == 0)
                tm = (DefaultTableModel) this.tableCarton1.getModel();
            else if(i == 1)
                tm = (DefaultTableModel) this.tableCarton2.getModel();
            else
                tm = (DefaultTableModel) this.tableCarton3.getModel();
            
            for (int s = tm.getRowCount() - 1; s >= 0; --s) {
                for (int k = tm.getColumnCount() - 1; k >= 0; --k) {
                    if (tm.getValueAt(s, k).equals(numero)) {
                        // what if value is not unique?
                        int num = (int)tm.getValueAt(s, k);
                        tm.setValueAt("<html><font color=red><b>"+num +"</b></font></html>", s, k);
                        //cuando llegue a 0 se completo el carton
                        j.getCartones().get(i).setContCompleto(j.getCartones().get(i).getContCompleto()-1);
                        if(j.getCartones().get(i).getContCompleto() == 0){
                            LocalDateTime hoy = LocalDateTime.now();
                            System.out.println(j.getUserName() + " JUGADOR COMPLETO CARTON!: Hora:" + hoy);
                            //Seteo el GANADOR
                            observer.getElJuego().setGanador(j);
                            observer.setCambios("FIN");
                        }
                        break;
                    }
                }
            }
            i++;
        }
    }
    
    public void FinDePartida(){
        cJugador j = this.BuscarJugadorEnJuego(this.getTitle());
        if(observer.getElJuego().getGanador().getUserName().equalsIgnoreCase(j.getUserName())){
            try {
                int pozo = Integer.parseInt(this.lblPozo.getText());
                j.setFichas(Integer.parseInt(this.lblSaldo.getText())+ pozo);
                this.laEmpresa.modificarUsuario(j);
                j.setReady(false);
                
            } catch (Exception ex) {
                Logger.getLogger(vPlayer1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                //al jugador perdedor se le debita en este momento el saldo
                j.setFichas(Integer.parseInt(this.lblSaldo.getText()));
                this.laEmpresa.modificarUsuario(j);
                j.setReady(false);
                
            } catch (Exception ex) {
                Logger.getLogger(vPlayer1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.lblSaldo.setText(String.valueOf(j.getFichas()));
        this.lblPozo.setText("0");
        this.panelJugarDeNuevo.setVisible(true);
        this.lblPodio.setVisible(false);
        this.lblBolilla.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnNO;
    private javax.swing.JButton btnRetirarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBolilla;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPodio;
    private javax.swing.JLabel lblPozo;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTitleSaldo;
    private javax.swing.JPanel panelCartones;
    private javax.swing.JPanel panelJugarDeNuevo;
    private javax.swing.JPanel panelTable1;
    private javax.swing.JPanel panelTable2;
    private javax.swing.JPanel panelTable3;
    private javax.swing.JTable tableCarton1;
    private javax.swing.JTable tableCarton2;
    private javax.swing.JTable tableCarton3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Accion = observer.getAccion();
        if(Accion.equalsIgnoreCase("COMPLETAR")){
            
        }else if(Accion.equalsIgnoreCase("SORTEADO")){
            
            int bolaSorteada = observer.getSorteados().get(observer.getSorteados().size() -1);
            try{
                ImageIcon bola = new ImageIcon(getClass().getResource("/Images/Miniaturas/" + bolaSorteada +".png"));
                MarcarNumero(bolaSorteada);
            this.lblBolilla.setIcon(bola);
            }catch(Exception ex){
                System.out.println("Bola No encontrada "+ bolaSorteada );
            }
            
            /*try {
                ImageIcon lcImage= new ImageIcon(ImageIO.read(getClass().getResource("/Images/Miniaturas/" + bolaSorteada +".png")));
            } catch (IOException ex) {
                Logger.getLogger(vPlayer1.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
        }else if(Accion.equalsIgnoreCase("FIN")){
            cJugador j = observer.getElJuego().getGanador();
            if(this.getTitle().equalsIgnoreCase(j.getUserName())){
                ImageIcon ganaste = new ImageIcon(getClass().getResource("/Images/ganaste.gif"));
                this.lblMensaje.setIcon(ganaste);
            }
            FinDePartida();
            
            
        }else if(Accion.equalsIgnoreCase("POZO")){
             this.lblPozo.setText(String.valueOf(observer.getElJuego().getPozo()));
         }else if(Accion.equalsIgnoreCase("CERRARTODO")){
             if(!this.getTitle().equalsIgnoreCase("Ventana del Juego")){
                 dispose();
             }
         }
    }
    
}
