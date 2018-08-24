/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneles.Z_Compras;

import A_alertas.principal.*;
import componentes.org1.bolivia.combo.SComboBox;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.*;
import paneles.Z_Compras.Opciones;
import static paneles.Z_Compras.Opciones.Consultar_Proveedores;

/**
 *
 * @author jona
 */
public class Registro_Compra extends javax.swing.JDialog {
    int x, y;
    
    Timer timer = null;
    TimerTask task;
    int i = 32;
 
    public Registro_Compra(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Consultar_Proveedores(Proveedor);
        AWTUtilities.setOpaque(this, false);
        this.id.setVisible(false);
        this.txtDescripcion.requestFocus();
        this.Proveedor.setCursor(new Cursor(12));
        Ubicar(0);
        lblfecha.setVisible(false);
        

    }
    
     private void limpiarCampos() {
        this.txtDescripcion.requestFocus();
        this.txtDescripcion.setText("");
        this.Fecha.setDate(null);
        this.txtTotal.setText("");
        this.txtRuta.setText("");
        this.Proveedor.setSelectedIndex(0);
        Opciones.listar("");
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTotal = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRuta = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cargar = new principal.MaterialButtomRectangle();
        jLabel4 = new javax.swing.JLabel();
        Proveedor = new componentes.org1.bolivia.combo.SComboBox();
        Fecha = new com.toedter.calendar.JDateChooser();
        lblfecha = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        id = new javax.swing.JLabel();
        limpiar = new principal.MaterialButton();
        registrar = new principal.MaterialButton();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/GUARDAAAAAAAAA.PNG"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 60, -1));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("Compra");
        jPanel3.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 330, 34));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotal.setBorder(null);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotal.setPlaceholder("Ej. 1890.90");
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("                          Total:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 220, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Descripción de la Compra:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(null);
        txtDescripcion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtDescripcion.setOpaque(false);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 370, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/cuadro-texto.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, 150));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("                    Proveedor:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 30));

        txtRuta.setBorder(null);
        txtRuta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRuta.setPlaceholder("Ej. C:\\Users\\All Users\\Documents\\Miarchivo");
        jPanel2.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 290, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Ruta:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 40, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 220, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 220, -1));

        cargar.setBackground(new java.awt.Color(204, 204, 204));
        cargar.setText("...");
        cargar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Iniciar sesión</h4> </body> </html>");
        cargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel2.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 50, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("      Fecha de Compra:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        Proveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PROVEEDOR" }));
        Proveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 220, 30));

        Fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        Fecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FechaFocusLost(evt);
            }
        });
        Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaMouseClicked(evt);
            }
        });
        jPanel2.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 30));
        jPanel2.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 160, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 32, -1, 440));

        jPanel5.setBackground(new java.awt.Color(210, 210, 214));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMetro1.setText("X");
        rSButtonMetro1.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonMetro1.setColorNormal(new java.awt.Color(210, 210, 214));
        rSButtonMetro1.setColorPressed(new java.awt.Color(136, 0, 0));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        jPanel5.add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 30));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(51, 51, 51));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("id");
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 30, -1));

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 430, -1));

        limpiar.setBackground(new java.awt.Color(204, 204, 204));
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("LIMPIAR CAMPOS");
        limpiar.setToolTipText("<html> <head> <style> #contenedor{background:#3A9FAB;color:white; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Limpiar campos</h4> </body> </html>");
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel6.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 160, 50));

        registrar.setBackground(new java.awt.Color(204, 204, 204));
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        registrar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                registrarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        registrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registrarKeyTyped(evt);
            }
        });
        jPanel6.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 170, 50));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        try{
            String formato = "dd/MM/yyyy";
                Date date = Fecha.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                lblfecha.setText(sdf.format(date));
        }catch(Exception ex)
        {
            
        }
        if (this.txtDescripcion.getText().equals("") || this.Proveedor.getSelectedIndex() == 0 
                ||  this.txtTotal.getText().equals("") 
                || this.txtRuta.getText().equals("") || this.lblfecha.getText().equals(""))  {

            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Mensaje");
            er.msj.setText("Hay campos vacios");
            er.msj1.setText("Favor de llenarlos");
            er.setVisible(true);

        } else {

            if (this.registrar.getText().equals("Guardar")) {

                Sentencias s = new Sentencias();
                s.setDescripcion(this.txtDescripcion.getText());
                s.setIdProveedor(this.Proveedor.getSelectedItem().toString());
                s.setFecha(this.lblfecha.getText());
                s.setTotal(Double.parseDouble(this.txtTotal.getText()));
                s.setPdf(this.txtRuta.getText());
                s.setId(Integer.parseInt(this.id.getText()));

                int opcion = Opciones.actualizar(s);
                if (opcion != 0) {
                    Opciones.listar("");
                    SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                    sa.titulo.setText("Mensaje");
                    sa.msj.setText("Se han guardado los campos");
                    sa.msj1.setText("exitosamente");
                    sa.setVisible(true);
                }

            } else {

                Sentencias s = new Sentencias();
                
                s.setDescripcion(this.txtDescripcion.getText());
                s.setFecha(this.lblfecha.getText());
                s.setIdProveedor(this.Proveedor.getSelectedItem().toString());
                s.setTotal(Double.parseDouble(this.txtTotal.getText()));
                s.setPdf(this.txtRuta.getText());

                int opcion = Opciones.registrar(s);
                if (opcion != 0) {
                    limpiarCampos();
                    SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                    sa.titulo.setText("Mensaje");
                    sa.msj.setText("Se ha registrado una");
                    sa.msj1.setText("Nueva compra");
                    sa.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void registrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarKeyTyped
       if (this.txtDescripcion.getText().equals("") || this.Proveedor.getSelectedIndex() == 0 
                || this.Fecha.getDate().equals("")|| this.txtTotal.getText().equals("") 
                || this.txtRuta.getText().equals("")) {

            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Mensaje");
            er.msj.setText("Hay campos vacios");
            er.msj1.setText("Favor de llenarlos");
            er.setVisible(true);

        } else {

            if (this.registrar.getText().equals("Guardar")) {

                Sentencias s = new Sentencias();
                s.setDescripcion(this.txtDescripcion.getText());
                s.setFecha(this.Fecha.getDate().toString());
                s.setIdProveedor(this.Proveedor.getSelectedItem().toString());
                s.setTotal(Double.parseDouble(this.txtTotal.getText()));
                s.setPdf(this.txtRuta.getText());
                s.setId(Integer.parseInt(this.id.getText()));

                int opcion = Opciones.actualizar(s);
                if (opcion != 0) {
                    Opciones.listar("");
                    SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                    sa.titulo.setText("Mensaje");
                    sa.msj.setText("Se han guardado los campos");
                    sa.msj1.setText("exitosamente");
                    sa.setVisible(true);
                }

            } else {

                Sentencias s = new Sentencias();
                
                s.setDescripcion(this.txtDescripcion.getText());
                s.setFecha(this.Fecha.getDate().toString());
                s.setIdProveedor(this.Proveedor.getSelectedItem().toString());
                s.setTotal(Double.parseDouble(this.txtTotal.getText()));
                s.setPdf(this.txtRuta.getText());

                int opcion = Opciones.registrar(s);
                if (opcion != 0) {
                    limpiarCampos();
                    SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                    sa.titulo.setText("Mensaje");
                    sa.msj.setText("Se ha registrado una");
                    sa.msj1.setText("Nueva compra");
                    sa.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_registrarKeyTyped

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        char letras = evt.getKeyChar();

        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
       
    }//GEN-LAST:event_cargarActionPerformed

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
        (c == KeyEvent.VK_BACK_SPACE) ||
        (c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
        int limite =12;
        if (txtTotal.getText().length()== limite)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtTotalKeyTyped

    private void FechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaFocusLost
        
    }//GEN-LAST:event_FechaFocusLost

    private void FechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaMouseClicked

    private void registrarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_registrarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                paneles.Z_Usuarios.Usuario dialog = new paneles.Z_Usuarios.Usuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    public static componentes.org1.bolivia.combo.SComboBox Proveedor;
    private principal.MaterialButtomRectangle cargar;
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblfecha;
    private principal.MaterialButton limpiar;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    public static principal.MaterialButton registrar;
    public static javax.swing.JLabel titulo;
    public static javax.swing.JTextArea txtDescripcion;
    public static app.bolivia.swing.JCTextField txtRuta;
    public static app.bolivia.swing.JCTextField txtTotal;
    // End of variables declaration//GEN-END:variables
private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void Ubicar(int y) {
        setLocationRelativeTo(null);
    }
}
