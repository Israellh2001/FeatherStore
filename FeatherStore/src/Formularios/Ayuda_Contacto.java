package Formularios;

import Clases.Correo;
import Clases.Control;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Ayuda_Contacto extends javax.swing.JInternalFrame {
    Correo c;
    Control x;
    String asunto_;

    public Ayuda_Contacto() {
        initComponents();
        c = new Correo();
        x = new Control();
    }
    public void enviarCorreo_(){
        asunto_="De :"+Nombre.getText()+"__"+Asunto.getText();
        c.setContraseña("tunutlhjueudeidi");
        c.setUsuarioCorreo("mcool9601@gmail.com");
        c.setAsunto(asunto_);
        c.setMensaje(Contenido.getText().trim());
        c.setDestino("feather.tm.ags@gmail.com");
        if(x.enviarCorreo(c)){
            JOptionPane.showMessageDialog(null, "Al 100", "Mensaje Enviado", WARNING_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Reintenta mas tarde", "Ocurrio un error al Enviar el correo1", WARNING_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Contenido = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Asunto = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quieres mandarnos un correo?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 30));

        jLabel2.setText("En caso de tener alguna duda, sugerencia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setText("O simplemente quieres alguien con quien hablar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel4.setText("Te dejaremos el correo de Feather studio y de nuestros dessarrolladores");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("Feather studio :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel6.setText("Israel Lopez :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel7.setText("Fernando Arevalo :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel8.setText("feather.tm.ags@gmail.com ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel9.setText("Israellh2001@gmail.com");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel10.setText("prepa.2001@gmail.com");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 840, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 10, 290));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Contacto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel12.setText("Nombre :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, 20));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 220, -1));

        jLabel13.setText("Contenido :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        Contenido.setColumns(20);
        Contenido.setRows(5);
        jScrollPane1.setViewportView(Contenido);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 220, 140));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorasifinalneg.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, 200));

        jButton1.setBackground(new java.awt.Color(69, 85, 140));
        jButton1.setText("Enviar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 110, 20));

        jLabel16.setText("Asunto :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));
        jPanel1.add(Asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        enviarCorreo_();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Asunto;
    private javax.swing.JTextArea Contenido;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
