
package FeatherStore;

import Clases.Mysql;
import java.awt.CardLayout;
import Formularios.Busqueda;
import Clases.Usuario;
import Formularios.Login;
import Formularios.Perfil;
import Formularios.Principal_;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    Mysql conn;
    Usuario user;
    Busqueda ask;
    Perfil perf;
    Principal_ main;
    
    public Menu(){
        initComponents();
       // setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Feather Logo.png")).getImage());
        setTitle("Menu-FeatherStore");
        conn=new Mysql();
        conn.connection("FeatherStore","root", "");
        ask=new Busqueda();
        perf = new Perfil();
        perf.setVisible(false);
        ask.setVisible(false);
        main=new Principal_();
        main.setVisible(true);
        jPanel3.add(perf);
        jPanel3.add(main);
        jPanel3.add(ask);
    }
    public void cargarUser(Usuario x){
        user = x;
        String h=user.getNombre(),y=user.getUsername();
        Nombre2.setText(h);
        Username2.setText(y);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        Username2 = new javax.swing.JLabel();
        Perfil = new javax.swing.JLabel();
        Explorar_ = new javax.swing.JLabel();
        Mis_aplicaciones = new javax.swing.JLabel();
        Pago = new javax.swing.JLabel();
        FetherDeveloper = new javax.swing.JLabel();
        Configuracion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        CerrarSesion = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1900, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(69, 85, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 11, 43, 59));
        jPanel4.add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 11, 150, 59));
        jPanel4.add(Username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 76, 202, 15));

        Perfil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Perfil.setText("Perfil");
        Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Perfil.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PerfilMouseMoved(evt);
            }
        });
        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PerfilMouseExited(evt);
            }
        });
        jPanel4.add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 115, 137, 49));

        Explorar_.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Explorar_.setText("Explorar");
        Explorar_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Explorar_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Explorar_MouseMoved(evt);
            }
        });
        Explorar_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Explorar_MouseExited(evt);
            }
        });
        jPanel4.add(Explorar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 191, 137, 38));

        Mis_aplicaciones.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Mis_aplicaciones.setText("Mis aplicaciones");
        Mis_aplicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mis_aplicaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Mis_aplicacionesMouseMoved(evt);
            }
        });
        Mis_aplicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Mis_aplicacionesMouseExited(evt);
            }
        });
        jPanel4.add(Mis_aplicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 261, 137, 41));

        Pago.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Pago.setText("Sistema de pago");
        Pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pago.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PagoMouseMoved(evt);
            }
        });
        Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PagoMouseExited(evt);
            }
        });
        jPanel4.add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 325, 137, 48));

        FetherDeveloper.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        FetherDeveloper.setText("FetaherDeveloper");
        FetherDeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FetherDeveloper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FetherDeveloperMouseMoved(evt);
            }
        });
        FetherDeveloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FetherDeveloperMouseExited(evt);
            }
        });
        jPanel4.add(FetherDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 394, 137, 48));

        Configuracion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Configuracion.setText("Configuracion");
        Configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Configuracion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseMoved(evt);
            }
        });
        Configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseExited(evt);
            }
        });
        jPanel4.add(Configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 516, 137, 25));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 273, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 273, 10));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 313, 273, 10));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, 273, 9));

        CerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseMoved(evt);
            }
        });
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseExited(evt);
            }
        });
        jPanel4.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 464, 146, 25));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 273, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 448, 273, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 273, 10));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        jPanel2.setBackground(new java.awt.Color(69, 85, 140));

        jLabel20.setText("<");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(69, 85, 140));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel22.setText("Menu");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Pequeño.png"))); // NOI18N

        jLabel24.setText(">");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(57, 57, 57)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 870, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 870, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(evt.getKeyCode()==10){
            ask.setVisible(true);
            main.setVisible(false);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        Login x = new Login();
        x.setLocation(getLocation());
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked

    private void PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseClicked
        perf.cargarUser(user);
        perf.setVisible(true);
        main.setVisible(false);
    }//GEN-LAST:event_PerfilMouseClicked

    private void PerfilMouseMoved(java.awt.event.MouseEvent evt) {Perfil.setForeground(new java.awt.Color(255, 255, 255));}
    private void PerfilMouseExited(java.awt.event.MouseEvent evt) {Perfil.setForeground(new java.awt.Color(0,0,0));}
    private void Explorar_MouseMoved(java.awt.event.MouseEvent evt) {Explorar_.setForeground(new java.awt.Color(255, 255, 255));}
    private void Explorar_MouseExited(java.awt.event.MouseEvent evt) {Explorar_.setForeground(new java.awt.Color(0,0,0));}
    private void Mis_aplicacionesMouseMoved(java.awt.event.MouseEvent evt) {Mis_aplicaciones.setForeground(new java.awt.Color(255, 255, 255));}
    private void Mis_aplicacionesMouseExited(java.awt.event.MouseEvent evt) {Mis_aplicaciones.setForeground(new java.awt.Color(0,0,0));}
    private void PagoMouseMoved(java.awt.event.MouseEvent evt) {Pago.setForeground(new java.awt.Color(255, 255, 255));}
    private void PagoMouseExited(java.awt.event.MouseEvent evt) {Pago.setForeground(new java.awt.Color(0,0,0));}
    private void FetherDeveloperMouseMoved(java.awt.event.MouseEvent evt) {if(user.getDeveloper()){FetherDeveloper.setForeground(new java.awt.Color(255, 255, 255));}else{FetherDeveloper.setCursor(Cursor.getDefaultCursor());}}
    private void FetherDeveloperMouseExited(java.awt.event.MouseEvent evt) {if(user.getDeveloper()){FetherDeveloper.setForeground(new java.awt.Color(0,0,0));}}
    private void CerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));}
    private void CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {CerrarSesion.setForeground(new java.awt.Color(0,0,0));}
    private void ConfiguracionMouseMoved(java.awt.event.MouseEvent evt) {Configuracion.setForeground(new java.awt.Color(255, 255, 255));}
    private void ConfiguracionMouseExited(java.awt.event.MouseEvent evt) {Configuracion.setForeground(new java.awt.Color(0,0,0));}
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Configuracion;
    private javax.swing.JLabel Explorar_;
    private javax.swing.JLabel FetherDeveloper;
    private javax.swing.JLabel Mis_aplicaciones;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Pago;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Username2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
