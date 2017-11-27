
package Formularios;
import Clases.Usuario;
import Clases.Mysql;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class Perfil extends javax.swing.JInternalFrame {
    Mysql conn;
    public String nombre_,apellidos_,contraseña_,correo_,conn_contraseña_,nom_usuario_,pais,NOMBRE,Contraseña_prron;

    
    public Perfil(){
        conn = new Mysql();
        conn.connection("featherstore", "root", "");
        
        initComponents();
    }
    public void cargar(){
        nombre_ = Nombre.getText();
        contraseña_ = String.valueOf(contraseña.getText());
        correo_ = correo_elc.getText();
        conn_contraseña_ = String.valueOf(Con_contraseña.getText());
        nom_usuario_ = nom_usuario.getText();
        pais = String.valueOf(paises.getSelectedItem());
        //System.out.println(nombre_+"__"+apellidos_+"___"+nom_usuario_+"____"+pais+"__"+correo_+"___"+contraseña_+"____"+conn_contraseña_+"_______\n");
        NOMBRE = nombre_+" "+apellidos_;
    }
    public void cargarUser(Usuario x){
        Titulo.setVisible(false);
        if(x.getDeveloper()){
            Titulo.setVisible(true);
            Titulo.setText(x.getTitulo());
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorasifinalneg.png")));
        }
        Nombre_user.setText(x.getUsername());
        Nombre_Com.setText(x.getNombre());
        Pais_.setText(x.getPais());
        Correo_elc.setText(x.getCorreo());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Nombre_Com = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre_user = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Correo_elc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        paises = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        correo_elc = new javax.swing.JTextField();
        nom_usuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Pais_ = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();
        Con_contraseña = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 30, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 360, 10));
        jPanel1.add(Nombre_Com, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 160, 20));

        jLabel2.setText("Nombre de usuario :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel1.add(Nombre_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 190, 20));

        jLabel3.setText("Correo :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        jPanel1.add(Correo_elc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, 20));

        jLabel4.setText("Pais :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel5.setText("Quieres recibir emails con información de la app?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 30, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 10, 550));

        jLabel6.setText("Quieres editar tu información?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jLabel7.setText("Terminos y condiciones de uso :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, 30));

        jLabel8.setText("Nombre :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel9.setText("Correo :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel10.setText("Contraseña :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel11.setText("Nombre de usuario :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 110, 20));

        paises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexico", "U.S.A", "Chile", "Peru", "Argentina", "Colombia", "España", "Canada", "Cuba", "Costa rica", "Honduras", "Brasil", "Francia", "China" }));
        jPanel1.add(paises, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 90, 30));

        jLabel12.setText("Pais :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 120, -1));

        jLabel13.setText("Confirmar contraseña :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));
        jPanel1.add(correo_elc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 120, -1));
        jPanel1.add(nom_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 120, -1));

        jLabel14.setText("Titulo :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 20));
        jPanel1.add(Pais_, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorasifinal_1.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 250, 230));

        jButton1.setBackground(new java.awt.Color(69, 85, 140));
        jButton1.setText("Guardar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 60, 40));

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 120, 20));
        jPanel1.add(Con_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 420, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 420, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargar();
        if(contraseña_.equals(conn_contraseña_)){
            conn.Registro(nombre_, correo_, contraseña_, pais, nom_usuario_);
        }
        else{
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Comprueba la contraseña", WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Con_contraseña;
    private javax.swing.JLabel Correo_elc;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Nombre_Com;
    private javax.swing.JLabel Nombre_user;
    private javax.swing.JLabel Pais_;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo_elc;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nom_usuario;
    private javax.swing.JComboBox<String> paises;
    // End of variables declaration//GEN-END:variables
}
