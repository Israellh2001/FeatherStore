package FeatherStore;

import Clases.Mysql;
import Formularios.Login;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class Registro extends javax.swing.JFrame{
    public String nombre_,apellidos_,contraseña_,correo_,conn_contraseña_,nom_usuario_,pais,NOMBRE,Contraseña_prron;
    public boolean h=false,i=true,contra=false,trem=false,nom=false;
    public int y, x;
    public Mysql conn;

   
    public Registro() {
        setResizable(false);
        conn = new Mysql();
        conn.connection("feahterstore", "root", "");
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Feather Logo.png")).getImage());
        setTitle("Registro-FeatherStore");
    }

    public void cargar(){
        nombre_ = Nombre.getText();
        apellidos_= apellidos.getText();
        contraseña_ = String.valueOf(contraseña.getText());
        correo_ = correo_elc.getText();
        conn_contraseña_ = String.valueOf(Con_contraseña.getText());
        nom_usuario_ = nom_usuario.getText();
        pais = String.valueOf(paises.getSelectedItem());
        //System.out.println(nombre_+"__"+apellidos_+"___"+nom_usuario_+"____"+pais+"__"+correo_+"___"+contraseña_+"____"+conn_contraseña_+"_______\n");
        NOMBRE = nombre_+" "+apellidos_;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nom_usuario = new javax.swing.JTextField();
        correo_elc = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        paises = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Con_contraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Terminos_ = new javax.swing.JCheckBox();
        registrarse_ = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        validar_nom = new javax.swing.JLabel();
        Terminos = new javax.swing.JLabel();
        validar_con = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombre de usuario :");

        jLabel3.setText("Contraseña :");

        jLabel4.setText("Correo electronico :");

        jLabel5.setText("Nombre :");

        jLabel6.setText("Pais :");

        jLabel7.setText("Apellidos :");

        nom_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nom_usuarioKeyPressed(evt);
            }
        });

        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraseñaKeyReleased(evt);
            }
        });

        paises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexico", "U.S.A", "Chile", "Peru", "Argentina", "Colombia", "España", "Canada", "Cuba", "Costa rica", "Honduras", "Brasil", "Francia", "China" }));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel10.setText("FeatherStore");

        jLabel9.setText("Confirmar contraseña :");

        Con_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Con_contraseñaActionPerformed(evt);
            }
        });
        Con_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Con_contraseñaKeyReleased(evt);
            }
        });

        jLabel1.setText("Terminos y condiciones de uso :");

        Terminos_.setBackground(new java.awt.Color(255, 255, 255));
        Terminos_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Terminos_MouseClicked(evt);
            }
        });

        registrarse_.setBackground(new java.awt.Color(69, 85, 140));
        registrarse_.setText("Registrarse");
        registrarse_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarse_ActionPerformed(evt);
            }
        });

        jLabel17.setText("¿Ya tienes cuenta?");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(Terminos_)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(correo_elc)
                                        .addComponent(nom_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(contraseña)
                                        .addComponent(Con_contraseña)
                                        .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(apellidos))
                                    .addComponent(paises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(registrarse_))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Con_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo_elc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(paises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Terminos_, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(registrarse_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 490));

        jPanel3.setBackground(new java.awt.Color(69, 85, 140));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel20.setText("Sistema de registro");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorasifinal_1.png"))); // NOI18N

        jLabel11.setText("En FeatherStore podras usar aplicaciones");

        jLabel12.setText("creadas por la comunidad, así como subir las tuyas");

        jLabel13.setText("Nombre de usuario :");

        jLabel14.setText("Contraseña :");

        jLabel16.setText("Terminos y condiciones :");

        validar_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png"))); // NOI18N

        Terminos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png"))); // NOI18N

        validar_con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validar_nom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validar_con))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Terminos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validar_nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(validar_con, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Terminos)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 370, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Con_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Con_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Con_contraseñaActionPerformed

    private void registrarse_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarse_ActionPerformed
       if(contra==true&&nom==true&&trem==true){
            cargar();
            conn.Registro(NOMBRE, correo_, contraseña_, pais, nom_usuario_);
            Login x = new Login();
            x.setLocation(this.getLocation());
            x.setVisible(true);
            this.dispose();
       }
       else{
            JOptionPane.showMessageDialog(null, "Ingresa correctamente los datos", "Ocurrio un error al registarse", WARNING_MESSAGE);

       }
    }//GEN-LAST:event_registrarse_ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Login x = new Login();
        x.setLocation(this.getLocation());
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void Terminos_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Terminos_MouseClicked
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
    }//GEN-LAST:event_Terminos_MouseClicked

    private void nom_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_usuarioKeyPressed
        char c = evt.getKeyChar();
        if(Character.isJavaIdentifierPart(c)){
           validar_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FinalFinalCheck.png")));
           nom=true;
        }
        else{
            validar_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finalequis.png")));
            nom=false;
        }
    }//GEN-LAST:event_nom_usuarioKeyPressed

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
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Con_contraseña;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Terminos;
    private javax.swing.JCheckBox Terminos_;
    private javax.swing.JTextField apellidos;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo_elc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nom_usuario;
    private javax.swing.JComboBox<String> paises;
    private javax.swing.JButton registrarse_;
    private javax.swing.JLabel validar_con;
    private javax.swing.JLabel validar_nom;
    // End of variables declaration//GEN-END:variables

}
