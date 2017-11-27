
package Formularios;


public class Principal_ extends javax.swing.JInternalFrame {

    public Principal_() {
        initComponents();
    }
    private void JuegosMouseDragged(java.awt.event.MouseEvent evt) {}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Juegos = new javax.swing.JLabel();
        Actualizaciones = new javax.swing.JLabel();
        Desarrollo_Soft = new javax.swing.JLabel();
        Diseño_Grafico = new javax.swing.JLabel();
        Audio_Video = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        FetherStudio = new javax.swing.JLabel();
        Hardware = new javax.swing.JLabel();
        Ayuda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Juegos.setBackground(new java.awt.Color(255, 255, 255));
        Juegos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Juegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gmae.png"))); // NOI18N
        Juegos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Juegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 187, 146));

        Actualizaciones.setBackground(new java.awt.Color(255, 255, 255));
        Actualizaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Actualizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizaciones_Final.png"))); // NOI18N
        Actualizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Actualizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 170, 146));

        Desarrollo_Soft.setBackground(new java.awt.Color(255, 255, 255));
        Desarrollo_Soft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Desarrollo_Soft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Progra.png"))); // NOI18N
        Desarrollo_Soft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Desarrollo_Soft, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 130));

        Diseño_Grafico.setBackground(new java.awt.Color(255, 255, 255));
        Diseño_Grafico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Diseño_Grafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Idea_Final.png"))); // NOI18N
        Diseño_Grafico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Diseño_Grafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 138, 126));

        Audio_Video.setBackground(new java.awt.Color(255, 255, 255));
        Audio_Video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Audio_Video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Video1.png"))); // NOI18N
        Audio_Video.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Audio_Video, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 160, 126));

        Info.setBackground(new java.awt.Color(255, 255, 255));
        Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.setText("Sobre la aplicación");
        Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 363, 119, 124));

        FetherStudio.setBackground(new java.awt.Color(255, 255, 255));
        FetherStudio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FetherStudio.setText("Sobre FetherStudio");
        FetherStudio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(FetherStudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 363, 285, 124));

        Hardware.setBackground(new java.awt.Color(255, 255, 255));
        Hardware.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hardware.setText("Sobre Hardware");
        Hardware.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Hardware, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 363, 203, 124));

        Ayuda.setBackground(new java.awt.Color(255, 255, 255));
        Ayuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ayuda.setText("Ayuda");
        Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 363, 195, 124));

        jLabel1.setText("Juegos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel4.setText("Actualizaciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Desarrollo de Software");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 212, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Diseño Grafico");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 198, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Audio y Video");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void JuegosMouseMoved(java.awt.event.MouseEvent evt) {Juegos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
      private void JuegosMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {}
      private void JuegosMouseExited(java.awt.event.MouseEvent evt) {Juegos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
      private void ActualizacionesMouseMoved(java.awt.event.MouseEvent evt) {Actualizaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
      private void ActualizacionesMouseExited(java.awt.event.MouseEvent evt) {Actualizaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
      private void Desarrollo_SoftMouseMoved(java.awt.event.MouseEvent evt) {Desarrollo_Soft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
      private void Desarrollo_SoftMouseExited(java.awt.event.MouseEvent evt) {Desarrollo_Soft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
      private void Diseño_GraficoMouseMoved(java.awt.event.MouseEvent evt) {Diseño_Grafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
      private void Diseño_GraficoMouseExited(java.awt.event.MouseEvent evt) {Diseño_Grafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
      private void Audio_VideoMouseMoved(java.awt.event.MouseEvent evt) {Audio_Video.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69,85,140)));}
      private void Audio_VideoMouseExited(java.awt.event.MouseEvent evt) {Audio_Video.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));}
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
    private javax.swing.JLabel Desarrollo_Soft;
    private javax.swing.JLabel Diseño_Grafico;
    private javax.swing.JLabel FetherStudio;
    private javax.swing.JLabel Hardware;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel Juegos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
