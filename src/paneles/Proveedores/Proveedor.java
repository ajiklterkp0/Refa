/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneles.Proveedores;

import A_alertas.principal.AWTUtilities;
import A_alertas.principal.ErrorAlert;
import A_alertas.principal.SuccessAlert;
import java.awt.Cursor;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import paneles.Proveedores.*;

/**
 *
 * @author jona
 */
public class Proveedor extends javax.swing.JDialog {

    int x, y;
    
    Timer timer = null;
    TimerTask task;
    int i = 32;
    
    public Proveedor(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AWTUtilities.setOpaque(this, false);
        this.id.setVisible(false);
        this.nombrePro.setVisible(false);
        this.txtRfc.requestFocus();
        Ubicar(0);
    }
    
     private void limpiarCampos() {
        this.txtRfc.requestFocus();
        this.txtNombre.setText("");
        this.txtDireccion.setText("");
        this.txtNumero.setText("");
        this.txtEmail.setText("");
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
        txtRfc = new app.bolivia.swing.JCTextField();
        txtNombre = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumero = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDireccion = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registrar = new principal.MaterialButton();
        limpiar = new principal.MaterialButton();
        jPanel5 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        id = new javax.swing.JLabel();
        nombrePro = new javax.swing.JLabel();

        setUndecorated(true);

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
        titulo.setText("Proveedores");
        jPanel3.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 13, 330, 34));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRfc.setBorder(null);
        txtRfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRfc.setPlaceholder("Ej. REF730510K44");
        txtRfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRfcKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcKeyTyped(evt);
            }
        });
        jPanel2.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 220, 30));

        txtNombre.setBorder(null);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setPlaceholder("Ej. Refaccionaria El Pino");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("                       Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 220, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 220, -1));

        txtEmail.setBorder(null);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setPlaceholder("Ej. Refaccionaria14@pino.com.mx");
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 220, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("                  Email:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        txtNumero.setBorder(null);
        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero.setPlaceholder("Ej. 7224328907");
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 220, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 220, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Número Telefonico:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("     RFC del Proveedor:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 20, 140, -1));

        txtDireccion.setBorder(null);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setPlaceholder("Ej. Valle de Bravo, Col. San Juan, No.2, Int: 2.");
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 290, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 220, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Dirección:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea_roja.PNG"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 220, -1));

        registrar.setBackground(new java.awt.Color(204, 204, 204));
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 32, -1, 350));

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

        nombrePro.setText("nombrePro");
        jPanel5.add(nombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 350, -1));

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (this.txtRfc.getText().equals("") || this.txtNombre.getText().equals("") 
                || this.txtDireccion.getText().equals("") || this.txtNumero.getText().equals("") 
                || this.txtEmail.getText().equals("")) 
        {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Mensaje");
            er.msj.setText("Hay campos vacios");
            er.msj1.setText("Favor de llenarlos");
            er.setVisible(true);

        } else {
            
            if (this.registrar.getText().equals("Guardar")) {

                if (Opciones.verificaProveedor(this.txtRfc.getText())
                    && !this.txtRfc.getText().equals(this.nombrePro.getText())) {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    er.titulo.setText("Mensaje");
                    er.msj.setText("El nombre de usuario");
                    er.msj1.setText("Ya éxiste");
                    er.setVisible(true);
                } else {
                    Sentencias s = new Sentencias();

                    s.setRfc(this.txtRfc.getText());
                    s.setNombre(this.txtNombre.getText());
                    s.setDireccion(this.txtDireccion.getText());
                    s.setNumero(this.txtNumero.getText());
                    s.setEmail(this.txtEmail.getText());
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
                }
            } else {
                if (Opciones.verificaProveedor(this.txtRfc.getText())) {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    er.titulo.setText("Mensaje");
                    er.msj.setText("El nombre de usuario");
                    er.msj1.setText("Ya éxiste");
                    er.setVisible(true);
                } else {
                    Sentencias s = new Sentencias();

                    s.setRfc(this.txtRfc.getText());
                    s.setNombre(this.txtNombre.getText());
                    s.setDireccion(this.txtDireccion.getText());
                    s.setNumero(this.txtNumero.getText());
                    s.setEmail(this.txtEmail.getText());
                    

                    int opcion = Opciones.registrar(s);
                    if (opcion != 0) {
                        limpiarCampos();
                        SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                        sa.titulo.setText("Mensaje");
                        sa.msj.setText("Se ha registrado un");
                        sa.msj1.setText("Nuevo usuario");
                        sa.setVisible(true);
                        this.dispose();
                    }
                }
            }
        }
       
    }//GEN-LAST:event_registrarActionPerformed

    private void registrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarKeyTyped
     if (this.txtRfc.getText().equals("") || this.txtNombre.getText().equals("") 
                || this.txtDireccion.getText().equals("") || this.txtNumero.getText().equals("") 
                || this.txtEmail.getText().equals("")
        ) {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.titulo.setText("Mensaje");
            er.msj.setText("Hay campos vacios");
            er.msj1.setText("Favor de llenarlos");
            er.setVisible(true);

        } else {

            if (this.registrar.getText().equals("Guardar")) {

                if (Opciones.verificaProveedor(nombrePro.getText())
                    && !this.txtRfc.getText().equals(this.txtRfc.getText())) {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    er.titulo.setText("Mensaje");
                    er.msj.setText("El nombre de usuario");
                    er.msj1.setText("Ya éxiste");
                    er.setVisible(true);
                } else {
                    Sentencias s = new Sentencias();

                    s.setRfc(this.txtRfc.getText());
                    s.setNombre(this.txtNombre.getText());
                    s.setDireccion(this.txtDireccion.getText());
                    s.setNumero(this.txtNumero.getText());
                    s.setDireccion(this.txtEmail.getText());
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
                }
            } else {
                if (Opciones.verificaProveedor(this.txtRfc.getText())) {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    er.titulo.setText("Mensaje");
                    er.msj.setText("El nombre de usuario");
                    er.msj1.setText("Ya éxiste");
                    er.setVisible(true);
                } else {
                    Sentencias s = new Sentencias();

                    s.setRfc(this.txtRfc.getText());
                    s.setNombre(this.txtNombre.getText());
                    s.setDireccion(this.txtDireccion.getText());
                    s.setNumero(this.txtNumero.getText());
                    s.setDireccion(this.txtEmail.getText());
                    s.setId(Integer.parseInt(this.id.getText()));

                    int opcion = Opciones.registrar(s);
                    if (opcion != 0) {
                        limpiarCampos();
                        SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                        sa.titulo.setText("Mensaje");
                        sa.msj.setText("Se ha registrado un");
                        sa.msj1.setText("Nuevo usuario");
                        sa.setVisible(true);
                        this.dispose();
                    }
                }
            }
        }
    }//GEN-LAST:event_registrarKeyTyped

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

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

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ||
        (c == KeyEvent.VK_BACK_SPACE) ||
        (c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
        int limite =10;
        if (txtNumero.getText().length()== limite)
        {
            evt.consume();
        }

    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtRfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcKeyTyped
        int limite =13;
        if (txtRfc.getText().length()== limite)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtRfcKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        
        char c=evt.getKeyChar(); 
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          }
        int limite =20;
        if (txtNombre.getText().length()== limite)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        int limite =28;
        if (txtEmail.getText().length()== limite)
        {
            evt.consume();
        }
    
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        int limite =45;
        if (txtDireccion.getText().length()== limite)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtRfcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcKeyReleased
        String cadena= (txtRfc.getText()).toUpperCase();
        txtRfc.setText(cadena);
    }//GEN-LAST:event_txtRfcKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                paneles.Proveedores.Proveedor dialog = new paneles.Proveedores.Proveedor(new javax.swing.JFrame(), true);
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
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private principal.MaterialButton limpiar;
    public static javax.swing.JLabel nombrePro;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    public static principal.MaterialButton registrar;
    public static javax.swing.JLabel titulo;
    public static app.bolivia.swing.JCTextField txtDireccion;
    public static app.bolivia.swing.JCTextField txtEmail;
    public static app.bolivia.swing.JCTextField txtNombre;
    public static app.bolivia.swing.JCTextField txtNumero;
    public static app.bolivia.swing.JCTextField txtRfc;
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
        this.setLocationRelativeTo(null);
    }
}
