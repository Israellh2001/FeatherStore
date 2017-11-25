
package FeatherStore;

import Clases.Usuario;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    Usuario user;

    public Menu() {

        initComponents();
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Feather Logo.png")).getImage());
        setTitle("Menu-FeatherStore");
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
        jPanel1 = new javax.swing.JPanel();
        Juegos = new javax.swing.JLabel();
        Noticias = new javax.swing.JLabel();
        Actualizaciones = new javax.swing.JLabel();
        Para_el_hogar = new javax.swing.JLabel();
        Desarrollo_Soft = new javax.swing.JLabel();
        Diseño_Grafico = new javax.swing.JLabel();
        Audio_Video = new javax.swing.JLabel();
        Facilidades = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        FetherStudio = new javax.swing.JLabel();
        Hardware = new javax.swing.JLabel();
        Ayuda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseExited(evt);
            }
        });
        jPanel4.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 464, 146, 25));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 273, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 448, 273, 10));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 273, 10));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Juegos.setBackground(new java.awt.Color(255, 255, 255));
        Juegos.setText("                  Juegos");
        Juegos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JuegosMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JuegosMouseMoved(evt);
            }
        });
        Juegos.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                JuegosMouseWheelMoved(evt);
            }
        });
        Juegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JuegosMouseExited(evt);
            }
        });

        Noticias.setBackground(new java.awt.Color(255, 255, 255));
        Noticias.setText("                     Noticias");
        Noticias.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NoticiasMouseMoved(evt);
            }
        });
        Noticias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoticiasMouseExited(evt);
            }
        });

        Actualizaciones.setBackground(new java.awt.Color(255, 255, 255));
        Actualizaciones.setText("                  Actualizaciones");
        Actualizaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ActualizacionesMouseMoved(evt);
            }
        });
        Actualizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizacionesMouseExited(evt);
            }
        });

        Para_el_hogar.setBackground(new java.awt.Color(255, 255, 255));
        Para_el_hogar.setText("                   Para el hogar");
        Para_el_hogar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Para_el_hogarMouseMoved(evt);
            }
        });
        Para_el_hogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Para_el_hogarMouseExited(evt);
            }
        });

        Desarrollo_Soft.setBackground(new java.awt.Color(255, 255, 255));
        Desarrollo_Soft.setText("           Desarrollo de Software");
        Desarrollo_Soft.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Desarrollo_SoftMouseMoved(evt);
            }
        });
        Desarrollo_Soft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Desarrollo_SoftMouseExited(evt);
            }
        });

        Diseño_Grafico.setBackground(new java.awt.Color(255, 255, 255));
        Diseño_Grafico.setText("                 Diseño grafico");
        Diseño_Grafico.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Diseño_GraficoMouseMoved(evt);
            }
        });
        Diseño_Grafico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Diseño_GraficoMouseExited(evt);
            }
        });

        Audio_Video.setBackground(new java.awt.Color(255, 255, 255));
        Audio_Video.setText("                  Audio y video");
        Audio_Video.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Audio_VideoMouseMoved(evt);
            }
        });
        Audio_Video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Audio_VideoMouseExited(evt);
            }
        });

        Facilidades.setBackground(new java.awt.Color(255, 255, 255));
        Facilidades.setText("                  Facilidades");
        Facilidades.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FacilidadesMouseMoved(evt);
            }
        });
        Facilidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FacilidadesMouseExited(evt);
            }
        });

        Info.setBackground(new java.awt.Color(255, 255, 255));
        Info.setText("             Sobre la aplicación");
        Info.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InfoMouseMoved(evt);
            }
        });
        Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InfoMouseExited(evt);
            }
        });

        FetherStudio.setBackground(new java.awt.Color(255, 255, 255));
        FetherStudio.setText("            Sobre FetherStudio");
        FetherStudio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FetherStudioMouseMoved(evt);
            }
        });
        FetherStudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FetherStudioMouseExited(evt);
            }
        });

        Hardware.setBackground(new java.awt.Color(255, 255, 255));
        Hardware.setText("                Sobre Hardware");
        Hardware.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HardwareMouseMoved(evt);
            }
        });
        Hardware.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HardwareMouseExited(evt);
            }
        });

        Ayuda.setBackground(new java.awt.Color(255, 255, 255));
        Ayuda.setText("                      Ayuda");
        Ayuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AyudaMouseMoved(evt);
            }
        });
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AyudaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Juegos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Desarrollo_Soft, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Diseño_Grafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Noticias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FetherStudio, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Audio_Video, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hardware, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Actualizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Facilidades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Para_el_hogar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Noticias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Actualizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Para_el_hogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Juegos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Audio_Video, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Desarrollo_Soft, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Diseño_Grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Facilidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hardware, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(FetherStudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 37, 830, 520));

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
                .addContainerGap(231, Short.MAX_VALUE))
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 830, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PerfilMouseMoved(java.awt.event.MouseEvent evt) {Perfil.setForeground(new java.awt.Color(255, 255, 255));}
    private void PerfilMouseExited(java.awt.event.MouseEvent evt) {Perfil.setForeground(new java.awt.Color(0,0,0));}
    private void Explorar_MouseMoved(java.awt.event.MouseEvent evt) {Explorar_.setForeground(new java.awt.Color(255, 255, 255));}
    private void Explorar_MouseExited(java.awt.event.MouseEvent evt) {Explorar_.setForeground(new java.awt.Color(0,0,0));}
    private void Mis_aplicacionesMouseMoved(java.awt.event.MouseEvent evt) {Mis_aplicaciones.setForeground(new java.awt.Color(255, 255, 255));}
    private void Mis_aplicacionesMouseExited(java.awt.event.MouseEvent evt) {Mis_aplicaciones.setForeground(new java.awt.Color(0,0,0));}
    private void PagoMouseMoved(java.awt.event.MouseEvent evt) {Pago.setForeground(new java.awt.Color(255, 255, 255));}
    private void PagoMouseExited(java.awt.event.MouseEvent evt) {Pago.setForeground(new java.awt.Color(0,0,0));}
    private void FetherDeveloperMouseMoved(java.awt.event.MouseEvent evt) {if(user.getDeveloper()){Pago.setForeground(new java.awt.Color(255, 255, 255));}else{FetherDeveloper.setCursor(Cursor.getDefaultCursor());}}
    private void FetherDeveloperMouseExited(java.awt.event.MouseEvent evt) {if(user.getDeveloper()){Pago.setForeground(new java.awt.Color(0,0,0));}}
    private void CerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));}
    private void CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {CerrarSesion.setForeground(new java.awt.Color(0,0,0));}
    private void ConfiguracionMouseMoved(java.awt.event.MouseEvent evt) {Configuracion.setForeground(new java.awt.Color(255, 255, 255));}
    private void ConfiguracionMouseExited(java.awt.event.MouseEvent evt) {Configuracion.setForeground(new java.awt.Color(0,0,0));}
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void JuegosMouseDragged(java.awt.event.MouseEvent evt) {}
    private void JuegosMouseMoved(java.awt.event.MouseEvent evt) {Juegos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void JuegosMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {}
    private void JuegosMouseExited(java.awt.event.MouseEvent evt) {Juegos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void NoticiasMouseMoved(java.awt.event.MouseEvent evt) {Noticias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void NoticiasMouseExited(java.awt.event.MouseEvent evt) {Noticias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void ActualizacionesMouseMoved(java.awt.event.MouseEvent evt) {Actualizaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void ActualizacionesMouseExited(java.awt.event.MouseEvent evt) {Actualizaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void Para_el_hogarMouseMoved(java.awt.event.MouseEvent evt) {Para_el_hogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void Para_el_hogarMouseExited(java.awt.event.MouseEvent evt) {Para_el_hogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void Desarrollo_SoftMouseMoved(java.awt.event.MouseEvent evt) {Desarrollo_Soft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void Desarrollo_SoftMouseExited(java.awt.event.MouseEvent evt) {Desarrollo_Soft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void Diseño_GraficoMouseMoved(java.awt.event.MouseEvent evt) {Diseño_Grafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void Diseño_GraficoMouseExited(java.awt.event.MouseEvent evt) {Diseño_Grafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void Audio_VideoMouseMoved(java.awt.event.MouseEvent evt) {Audio_Video.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void Audio_VideoMouseExited(java.awt.event.MouseEvent evt) {Audio_Video.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void FacilidadesMouseMoved(java.awt.event.MouseEvent evt) {Facilidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void FacilidadesMouseExited(java.awt.event.MouseEvent evt) {Facilidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void InfoMouseMoved(java.awt.event.MouseEvent evt) {Info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void InfoMouseExited(java.awt.event.MouseEvent evt) {Info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void FetherStudioMouseMoved(java.awt.event.MouseEvent evt) {FetherStudio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void FetherStudioMouseExited(java.awt.event.MouseEvent evt) {FetherStudio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void HardwareMouseMoved(java.awt.event.MouseEvent evt) {Hardware.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void HardwareMouseExited(java.awt.event.MouseEvent evt) {Hardware.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    private void AyudaMouseMoved(java.awt.event.MouseEvent evt) {Ayuda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
    private void AyudaMouseExited(java.awt.event.MouseEvent evt) {Ayuda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actualizaciones;
    private javax.swing.JLabel Audio_Video;
    private javax.swing.JLabel Ayuda;
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel Configuracion;
    private javax.swing.JLabel Desarrollo_Soft;
    private javax.swing.JLabel Diseño_Grafico;
    private javax.swing.JLabel Explorar_;
    private javax.swing.JLabel Facilidades;
    private javax.swing.JLabel FetherDeveloper;
    private javax.swing.JLabel FetherStudio;
    private javax.swing.JLabel Hardware;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Juegos;
    private javax.swing.JLabel Mis_aplicaciones;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Noticias;
    private javax.swing.JLabel Pago;
    private javax.swing.JLabel Para_el_hogar;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Username2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
