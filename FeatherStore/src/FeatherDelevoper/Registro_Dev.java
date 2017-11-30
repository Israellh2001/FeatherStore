
package FeatherDelevoper;

import Clases.Mysql;
import Formularios.Login;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class Registro_Dev extends javax.swing.JFrame {
    public String nombre_,apellidos_,contraseña_,correo_,conn_contraseña_,nom_usuario_,pais,NOMBRE,Contraseña_prron,titulo;
    public Mysql conn;
    boolean nom=false,contra=false,trem=false,i=true;

    public Registro_Dev() {
        conn = new Mysql();
        conn.connection("featherstore", "root", "");
        setResizable(false);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Feather Logo.png")).getImage());
        setTitle("Registro-FeatherDeveloper");
    }
    public void cargar(){
        nombre_ = Nombre.getText();
        apellidos_= Apellidos.getText();
        contraseña_ = String.valueOf(contraseña.getText());
        correo_ = correo_elc.getText();
        conn_contraseña_ = String.valueOf(Con_contraseña.getText());
        nom_usuario_ = Nom_usuario.getText();
        pais = String.valueOf(Pais.getSelectedItem());
        titulo = Titulo.getText();
        //System.out.println(nombre_+"__"+apellidos_+"___"+nom_usuario_+"____"+pais+"__"+correo_+"___"+contraseña_+"____"+conn_contraseña_+"_____"+titulo+"_______\n");
        NOMBRE = nombre_+" "+apellidos_;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        validar_nom = new javax.swing.JLabel();
        validar_con = new javax.swing.JLabel();
        Terminos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nom_usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        Con_contraseña = new javax.swing.JPasswordField();
        Titulo = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Pais = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        correo_elc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(69, 85, 140));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel11.setText("FeatherDeveloper");

        jLabel12.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel12.setText(" Sistema de registro");

        jLabel9.setText("Como developer de FetherStore tendras las");

        jLabel13.setText("herramientas para poder distribuir tus aplicaciones");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorasifinalneg.png"))); // NOI18N

        jLabel16.setText("Nombre :");

        jLabel17.setText("Contraseña :");

        jLabel18.setText("Terminos y condiciones :");

        validar_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png"))); // NOI18N

        validar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png"))); // NOI18N

        Terminos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)))
                        .addGap(38, 38, 38))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validar_nom))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validar_con)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Terminos)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validar_nom)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validar_con)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Terminos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 330, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre de usuario :");

        jLabel2.setText("Contraseña :");

        jLabel3.setText("Confirmar contraseña :");

        jLabel4.setText("Titulo profesional :");

        jLabel5.setText("Nombre :");

        jLabel6.setText("Apellidos :");

        jLabel7.setText("Pais :");

        jLabel8.setText("Terminos y condiciones de uso :");

        Nom_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nom_usuarioKeyPressed(evt);
            }
        });

        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraseñaKeyReleased(evt);
            }
        });

        Con_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Con_contraseñaKeyReleased(evt);
            }
        });

        Pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexico", "U.S.A", "Chile", "Peru", "Argentina", "Colombia", "España", "Canada", "Cuba", "Costa rica", "Honduras", "Brasil", "Francia", "China" }));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel10.setText("     FeatherStore");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        jLabel15.setText("¿Ya tienes cuenta?");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        Registrarse.setBackground(new java.awt.Color(69, 85, 140));
        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        jLabel22.setText("Correo electronico :");

        correo_elc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_elcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Registrarse)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel22))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nom_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(contraseña)
                            .addComponent(Con_contraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(correo_elc))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nom_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(correo_elc)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contraseña)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Con_contraseña)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nombre)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Apellidos)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jCheckBox1))
                .addGap(24, 24, 24)
                .addComponent(Registrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Login x = new Login();
        x.setLocation(this.getLocation());
        this.dispose();
        x.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
      if(contra==true&&nom==true&&trem==true){
            cargar();
            conn.RegistroDev(NOMBRE, correo_, contraseña_, pais, nom_usuario_,titulo);
            Login x = new Login();
            x.setLocation(this.getLocation());
            x.setVisible(true);
            this.dispose();     
       }
       else{
            JOptionPane.showMessageDialog(null, "Ingresa correctamente los datos", "Ocurrio un error al registarse", WARNING_MESSAGE);

       }
    }//GEN-LAST:event_RegistrarseActionPerformed

    private void correo_elcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_elcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_elcActionPerformed

    private void Nom_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nom_usuarioKeyPressed
        char c = evt.getKeyChar();
        if(Character.isJavaIdentifierPart(c)){
           validar_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinalFinalCheck.png")));
           nom=true;
        }
        else{
            validar_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png")));
            nom=false;
        }
    }//GEN-LAST:event_Nom_usuarioKeyPressed

    private void contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyReleased
        String k=String.valueOf(contraseña.getText()),ñ=String.valueOf(Con_contraseña.getText());
        if(k.equals(ñ)){
           validar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinalFinalCheck.png")));
           contra=true;
       }else{
           validar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png")));
           contra=false;
        }
    }//GEN-LAST:event_contraseñaKeyReleased

    private void Con_contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Con_contraseñaKeyReleased
        String k=String.valueOf(contraseña.getText()),ñ=String.valueOf(Con_contraseña.getText());
        if(k.equals(ñ)){
           validar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinalFinalCheck.png")));
           contra=true;
       }else{
           validar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png")));
           contra=false;
        }
    }//GEN-LAST:event_Con_contraseñaKeyReleased

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
       if(i){
            Terminos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinalFinalCheck.png")));
            i=false;
            trem=true;
        }
        else{
            Terminos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png")));
            i=true;
            trem=false;
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JPasswordField Con_contraseña;
    private javax.swing.JTextField Nom_usuario;
    private javax.swing.JTextField Nombre;
    private javax.swing.JComboBox<String> Pais;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel Terminos;
    private javax.swing.JTextField Titulo;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo_elc;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel validar_con;
    private javax.swing.JLabel validar_nom;
    // End of variables declaration//GEN-END:variables
}
