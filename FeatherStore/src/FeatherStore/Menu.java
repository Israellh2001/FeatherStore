
package FeatherStore;

import Clases.Mysql;
import Formularios.Busqueda;
import Clases.Usuario;
import Formularios.*;
import Formularios.Perfil;
import Formularios.Principal_;
import FeatherDelevoper.AppUp;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import Formularios.Ayuda_Contacto;

public class Menu extends javax.swing.JFrame {
    Ayuda_Contacto help;
    public Busqueda_1 buss_1;
    Mysql conn;
    Usuario user;
    public Busqueda ask;
    Perfil perf;
    Principal_ main;
    AppUp appup;
    public Nada nada;
    public Sobre_App appinfo;
    public Sobre_Feather info;
    
    
    
    javax.swing.JInternalFrame anterior,actual;
    
    public Menu(){
        initComponents();
       // setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Feather Logo.png")).getImage());
        setTitle("Menu-FeatherStore");
        conn=new Mysql();
        conn.connection("FeatherStore","root", "");
        ask=new Busqueda();
        buss_1 = new Busqueda_1(user);
        help = new Ayuda_Contacto();
        appup = new AppUp(this);
        nada = new Nada();
        perf = new Perfil();
        info = new Sobre_Feather();
        appinfo = new Sobre_App();
        appup.setVisible(false);
        perf.setVisible(false);
        ask.setVisible(false);
        info.setVisible(false);
        appinfo.setVisible(false);
        nada.setVisible(false);
        main=new Principal_(this);
        help.setVisible(false);
        actual = main;
        actual.setVisible(true);
        buss_1.setVisible(false);
        jPanel3.add(nada);
        jPanel3.add(buss_1);
        jPanel3.add(info);
        jPanel3.add(appinfo);
        jPanel3.add(help);
        jPanel3.add(appup);
        jPanel3.add(perf);
        jPanel3.add(main);
        jPanel3.add(ask);
        
    }
    public void intercambio(javax.swing.JInternalFrame x){
        actual.setVisible(false);
        anterior = actual;
        actual = x;
        actual.setVisible(true);
    }
    public void cargarUser(Usuario x){
        user = x;
        String h=user.getNombre(),y=user.getUsername();
        Nombre2.setText(h);
        Username2.setText(y);
    }
    public void regresar(){
        actual.setVisible(false);
        javax.swing.JInternalFrame aux=actual;
        actual = anterior;
        anterior = aux;
        actual.setVisible(true);
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
        FetherDeveloper = new javax.swing.JLabel();
        Ayuda = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
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
        Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel4.add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 137, 49));

        Explorar_.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Explorar_.setText("Explorar");
        Explorar_.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Explorar_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Explorar_MouseMoved(evt);
            }
        });
        Explorar_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Explorar_MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Explorar_MouseExited(evt);
            }
        });
        jPanel4.add(Explorar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 137, 38));

        Mis_aplicaciones.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Mis_aplicaciones.setText("Mis aplicaciones");
        Mis_aplicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel4.add(Mis_aplicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 137, 41));

        FetherDeveloper.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        FetherDeveloper.setText("FeatherDeveloper");
        FetherDeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FetherDeveloper.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FetherDeveloperMouseMoved(evt);
            }
        });
        FetherDeveloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FetherDeveloperMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FetherDeveloperMouseExited(evt);
            }
        });
        jPanel4.add(FetherDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 137, 48));

        Ayuda.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Ayuda.setText("Ayuda/Contactanos");
        Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ayuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AyudaMouseMoved(evt);
            }
        });
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AyudaMouseExited(evt);
            }
        });
        jPanel4.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 516, 137, 25));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 273, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 273, 10));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 273, 10));

        CerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel4.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 146, 25));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 273, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 273, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 273, 10));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        jPanel2.setBackground(new java.awt.Color(69, 85, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("<-");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 11, 25, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Busqueda.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 0, 34, 44));

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
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 14, 185, -1));

        jLabel22.setText("Menu");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 14, 169, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Pequeño.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 0, 51, 44));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 34, 185, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 850, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(evt.getKeyCode()==10){
            ask.setBus(jTextField1.getText());
            ask.b();
            if(ask.getCom()==false){
                intercambio(nada);}
            else{
                intercambio(ask);}
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
        intercambio(perf);
    }//GEN-LAST:event_PerfilMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        regresar();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void FetherDeveloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FetherDeveloperMouseClicked
        appup.cargardatos(user);
        intercambio(appup);
    }//GEN-LAST:event_FetherDeveloperMouseClicked

    private void Explorar_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Explorar_MouseClicked
        intercambio(main);
    }//GEN-LAST:event_Explorar_MouseClicked

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseClicked
        intercambio(help);
    }//GEN-LAST:event_AyudaMouseClicked

    private void PerfilMouseMoved(java.awt.event.MouseEvent evt) {Perfil.setForeground(new java.awt.Color(255, 255, 255));}
    private void PerfilMouseExited(java.awt.event.MouseEvent evt) {Perfil.setForeground(new java.awt.Color(0,0,0));}
    private void Explorar_MouseMoved(java.awt.event.MouseEvent evt) {Explorar_.setForeground(new java.awt.Color(255, 255, 255));}
    private void Explorar_MouseExited(java.awt.event.MouseEvent evt) {Explorar_.setForeground(new java.awt.Color(0,0,0));}
    private void Mis_aplicacionesMouseMoved(java.awt.event.MouseEvent evt) {Mis_aplicaciones.setForeground(new java.awt.Color(255, 255, 255));}
    private void Mis_aplicacionesMouseExited(java.awt.event.MouseEvent evt) {Mis_aplicaciones.setForeground(new java.awt.Color(0,0,0));}
   // private void PagoMouseMoved(java.awt.event.MouseEvent evt) {Pago.setForeground(new java.awt.Color(255, 255, 255));}
    //private void PagoMouseExited(java.awt.event.MouseEvent evt) {Pago.setForeground(new java.awt.Color(0,0,0));}
    private void FetherDeveloperMouseMoved(java.awt.event.MouseEvent evt) {if(user.getDeveloper()){FetherDeveloper.setForeground(new java.awt.Color(255, 255, 255));}else{FetherDeveloper.setCursor(Cursor.getDefaultCursor());}}
    private void FetherDeveloperMouseExited(java.awt.event.MouseEvent evt) {if(user.getDeveloper()){FetherDeveloper.setForeground(new java.awt.Color(0,0,0));}}
    private void CerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));}
    private void CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {CerrarSesion.setForeground(new java.awt.Color(0,0,0));}
    private void AyudaMouseMoved(java.awt.event.MouseEvent evt) {Ayuda.setForeground(new java.awt.Color(255, 255, 255));}
    private void AyudaMouseExited(java.awt.event.MouseEvent evt) {Ayuda.setForeground(new java.awt.Color(0,0,0));}
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ayuda;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Explorar_;
    private javax.swing.JLabel FetherDeveloper;
    private javax.swing.JLabel Mis_aplicaciones;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Username2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
