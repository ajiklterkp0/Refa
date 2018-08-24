/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;
import paneles.Productos.pnlProducto;
import paneles.Proveedores.pnlProveedor;
import paneles.Ventas.Ventas;
import paneles.Z_Acercade.pnlAbout;
import paneles.Z_Compras.pnlCompras;

/**
 *
 * @author jona
 */
public class pnlOperaciones extends javax.swing.JPanel {

    /**
     * Creates new form pnlPrincipal
     */
    public pnlOperaciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        pnlOperaciones = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelclientes = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelventas = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelcortecaja = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelfactura = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelarticulos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelcompras = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelproveedores = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelcotizacion = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        pnlOperaciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/linea.png"))); // NOI18N

        panelclientes.setBackground(new java.awt.Color(255, 255, 255));
        panelclientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelclientes.setForeground(new java.awt.Color(204, 0, 0));
        panelclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelclientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelclientesMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelclientesMouseReleased(evt);
            }
        });
        panelclientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("   Clientes");
        panelclientes.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 110, 80, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/Empleados.jpg"))); // NOI18N
        panelclientes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        panelventas.setBackground(new java.awt.Color(255, 255, 255));
        panelventas.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelventas.setForeground(new java.awt.Color(204, 0, 0));
        panelventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelventasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelventasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelventasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelventasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelventasMouseReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("    Ventas");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/ventas.png"))); // NOI18N

        javax.swing.GroupLayout panelventasLayout = new javax.swing.GroupLayout(panelventas);
        panelventas.setLayout(panelventasLayout);
        panelventasLayout.setHorizontalGroup(
            panelventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelventasLayout.setVerticalGroup(
            panelventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelventasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(5, 5, 5))
        );

        panelcortecaja.setBackground(new java.awt.Color(255, 255, 255));
        panelcortecaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelcortecaja.setForeground(new java.awt.Color(204, 0, 0));
        panelcortecaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelcortecajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelcortecajaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelcortecajaMouseReleased(evt);
            }
        });
        panelcortecaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Corte/Caja");
        panelcortecaja.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 106, 80, 28));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/corte de caja.png"))); // NOI18N
        panelcortecaja.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, -1));

        panelfactura.setBackground(new java.awt.Color(255, 255, 255));
        panelfactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelfactura.setForeground(new java.awt.Color(204, 0, 0));
        panelfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelfacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelfacturaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelfacturaMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Factura");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/factura.png"))); // NOI18N

        javax.swing.GroupLayout panelfacturaLayout = new javax.swing.GroupLayout(panelfactura);
        panelfactura.setLayout(panelfacturaLayout);
        panelfacturaLayout.setHorizontalGroup(
            panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfacturaLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfacturaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18))
        );
        panelfacturaLayout.setVerticalGroup(
            panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfacturaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(6, 6, 6))
        );

        panelarticulos.setBackground(new java.awt.Color(255, 255, 255));
        panelarticulos.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelarticulos.setForeground(new java.awt.Color(204, 0, 0));
        panelarticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelarticulosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelarticulosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelarticulosMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelarticulosMouseReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/productos.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("  Productos");

        javax.swing.GroupLayout panelarticulosLayout = new javax.swing.GroupLayout(panelarticulos);
        panelarticulos.setLayout(panelarticulosLayout);
        panelarticulosLayout.setHorizontalGroup(
            panelarticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelarticulosLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(panelarticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelarticulosLayout.setVerticalGroup(
            panelarticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelarticulosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelcompras.setBackground(new java.awt.Color(255, 255, 255));
        panelcompras.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelcompras.setForeground(new java.awt.Color(204, 0, 0));
        panelcompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelcomprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelcomprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelcomprasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelcomprasMouseReleased(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/compras.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Compras");

        javax.swing.GroupLayout panelcomprasLayout = new javax.swing.GroupLayout(panelcompras);
        panelcompras.setLayout(panelcomprasLayout);
        panelcomprasLayout.setHorizontalGroup(
            panelcomprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcomprasLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcomprasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelcomprasLayout.setVerticalGroup(
            panelcomprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcomprasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(7, 7, 7))
        );

        panelproveedores.setBackground(new java.awt.Color(255, 255, 255));
        panelproveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelproveedores.setForeground(new java.awt.Color(204, 0, 0));
        panelproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelproveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelproveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelproveedoresMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelproveedoresMouseReleased(evt);
            }
        });
        panelproveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Proveedores");
        panelproveedores.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/proveedores.png"))); // NOI18N
        panelproveedores.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        panelcotizacion.setBackground(new java.awt.Color(255, 255, 255));
        panelcotizacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        panelcotizacion.setForeground(new java.awt.Color(204, 0, 0));
        panelcotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelcotizacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelcotizacionMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelcotizacionMouseReleased(evt);
            }
        });
        panelcotizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("cotización");
        panelcotizacion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 106, 73, 28));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A_Imagenes/cotizaciones.png"))); // NOI18N
        panelcotizacion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 18, -1, -1));

        javax.swing.GroupLayout pnlOperacionesLayout = new javax.swing.GroupLayout(pnlOperaciones);
        pnlOperaciones.setLayout(pnlOperacionesLayout);
        pnlOperacionesLayout.setHorizontalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(pnlOperacionesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelcompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelproveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelarticulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelcotizacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelcortecaja, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlOperacionesLayout.setVerticalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOperacionesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                                .addComponent(panelarticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))))
                    .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelcompras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelventas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelcotizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelcortecaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelproveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(jLabel15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelclientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelclientesMouseReleased
        
    }//GEN-LAST:event_panelclientesMouseReleased

    private void panelventasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelventasMouseReleased
        
    }//GEN-LAST:event_panelventasMouseReleased

    private void panelcortecajaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcortecajaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_panelcortecajaMouseReleased

    private void panelfacturaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfacturaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_panelfacturaMouseReleased

    private void panelventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelventasMouseEntered
        panelventas.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelventasMouseEntered

    private void panelventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelventasMouseExited
        panelventas.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelventasMouseExited

    private void panelclientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelclientesMouseEntered
        panelclientes.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelclientesMouseEntered

    private void panelcortecajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcortecajaMouseEntered
        panelcortecaja.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelcortecajaMouseEntered

    private void panelfacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfacturaMouseEntered
        panelfactura.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelfacturaMouseEntered

    private void panelclientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelclientesMouseExited
        panelclientes.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelclientesMouseExited

    private void panelcortecajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcortecajaMouseExited
        panelcortecaja.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelcortecajaMouseExited

    private void panelfacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfacturaMouseExited
        panelfactura.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelfacturaMouseExited

    private void panelarticulosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelarticulosMouseEntered
        panelarticulos.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelarticulosMouseEntered

    private void panelarticulosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelarticulosMouseExited
        panelarticulos.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelarticulosMouseExited

    private void panelarticulosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelarticulosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_panelarticulosMouseReleased

    private void panelcomprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcomprasMouseEntered
        panelcompras.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelcomprasMouseEntered

    private void panelcomprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcomprasMouseExited
        panelcompras.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelcomprasMouseExited

    private void panelcomprasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcomprasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_panelcomprasMouseReleased

    private void panelproveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelproveedoresMouseEntered
        panelproveedores.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelproveedoresMouseEntered

    private void panelproveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelproveedoresMouseExited
        panelproveedores.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelproveedoresMouseExited

    private void panelproveedoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelproveedoresMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_panelproveedoresMouseReleased

    private void panelcotizacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcotizacionMouseEntered
        panelcotizacion.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.black));
    }//GEN-LAST:event_panelcotizacionMouseEntered

    private void panelcotizacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcotizacionMouseExited
        panelcotizacion.setBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,Color.white));
    }//GEN-LAST:event_panelcotizacionMouseExited

    private void panelcotizacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcotizacionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_panelcotizacionMouseReleased

    private void panelventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelventasMouseClicked
        Ventas vent=new Ventas();
        vent.setSize(640,570);
        vent.setLocation(0,0);
        
        pnlOperaciones.removeAll();
        pnlOperaciones.add(vent,BorderLayout.CENTER);
        pnlOperaciones.revalidate();
        pnlOperaciones.repaint();
        
        

    }//GEN-LAST:event_panelventasMouseClicked

    private void panelventasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelventasMousePressed
        
    }//GEN-LAST:event_panelventasMousePressed

    private void panelcomprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelcomprasMouseClicked
        pnlCompras vent=new pnlCompras();
        vent.setSize(640,570);
        vent.setLocation(0,0);
        
        pnlOperaciones.removeAll();
        pnlOperaciones.add(vent,BorderLayout.CENTER);
        pnlOperaciones.revalidate();
        pnlOperaciones.repaint();
    }//GEN-LAST:event_panelcomprasMouseClicked

    private void panelarticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelarticulosMouseClicked
        pnlProducto vent=new pnlProducto();
        vent.setSize(640,570);
        vent.setLocation(0,0);
        
        pnlOperaciones.removeAll();
        pnlOperaciones.add(vent,BorderLayout.CENTER);
        pnlOperaciones.revalidate();
        pnlOperaciones.repaint();
    }//GEN-LAST:event_panelarticulosMouseClicked

    private void panelproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelproveedoresMouseClicked
        pnlProveedor vent=new pnlProveedor();
        vent.setSize(640,570);
        vent.setLocation(0,0);
        
        pnlOperaciones.removeAll();
        pnlOperaciones.add(vent,BorderLayout.CENTER);
        pnlOperaciones.revalidate();
        pnlOperaciones.repaint();
    }//GEN-LAST:event_panelproveedoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelarticulos;
    private javax.swing.JPanel panelclientes;
    private javax.swing.JPanel panelcompras;
    private javax.swing.JPanel panelcortecaja;
    private javax.swing.JPanel panelcotizacion;
    private javax.swing.JPanel panelfactura;
    private javax.swing.JPanel panelproveedores;
    private javax.swing.JPanel panelventas;
    private javax.swing.JPanel pnlOperaciones;
    // End of variables declaration//GEN-END:variables
}
