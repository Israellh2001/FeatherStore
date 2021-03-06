
package FeatherDelevoper;

import Clases.Mysql;
import FeatherStore.Menu;
import Clases.Usuario;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;


public class AppUp extends javax.swing.JInternalFrame {
    String creador,nom,dess,Repo,precio_,categoria,dessa_;
    Mysql conn;
    Usuario us;
    Menu main;
    
    
    public AppUp(Menu x) {
        main = x;
        conn = new Mysql();
        conn.connection("featherstore", "root", "");
        initComponents();
    }
    public void cargardatos(Usuario x){
        us = x;
        idDev.setText(x.getId());
        Nombre.setText(x.getNombre());
        nom_user.setText(x.getUsername());
        Titulo.setText(x.getTitulo());
    }
    public void cargar(){
        double x = 0;
        String y=Precio.getText();;
        try{
            x = Double.valueOf(y);
            //creador=idCreador.getText();
            nom=Nom_app.getText();
            dess=Descripcio.getText();
            Repo = Repo_git.getText();
            precio_=String.valueOf(x);
            dessa_=Dessa.getText();
            categoria = String.valueOf(Categ.getSelectedItem());
            conn.insertApp(creador,nom, precio_, dess, dessa_, Repo, categoria);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verifica los datos", "No pongas caracteres en el precio", WARNING_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        nom_user = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Nom_app = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcio = new javax.swing.JTextArea();
        Dessa = new javax.swing.JTextField();
        Repo_git = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Categ = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        idDev = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("FeatherStudio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 139, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Software");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 400, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 20, 380));

        jButton1.setBackground(new java.awt.Color(69, 85, 140));
        jButton1.setText("Subir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 70, 30));

        jLabel4.setText("Nuestro sistema de aplicaciónes funciona mediante Git");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel5.setText("Con lo que podras subir actualizaciónes cada que quieras");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 330, -1));

        jLabel6.setText("Quieres ver alguna aplicación tuya?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, 20));

        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 150, 20));

        nom_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nom_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 150, 20));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 150, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Developer");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, -1));

        jLabel8.setText("No sabes como subir aplicaciónes");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel9.setText("Checha nuestro manual de usuario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 440, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Bienvenido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, -1));

        jLabel11.setText("Nombre :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel12.setText("Precio (Dolares USA) :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel13.setText("Descripción :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 80, -1));

        jLabel14.setText("Desarrolladores (id) :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel15.setText("Repositorio de Git :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jButton2.setBackground(new java.awt.Color(69, 85, 140));
        jButton2.setText("Ver");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 70, 30));
        jPanel1.add(Nom_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 200, -1));
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 60, -1));

        jLabel16.setText("$");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 10, -1));

        Descripcio.setColumns(20);
        Descripcio.setRows(5);
        jScrollPane1.setViewportView(Descripcio);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 210, 40));
        jPanel1.add(Dessa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 210, -1));
        jPanel1.add(Repo_git, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 210, -1));

        jLabel17.setText("Categoria :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        Categ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juegos", "Diseño grafico", "Desarrollo de software", "Audio video", "Otra" }));
        jPanel1.add(Categ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        jLabel18.setText("ID del Developer :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        idDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(idDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 150, 20));

        jLabel7.setText("Titulo :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        jLabel19.setText("Nombre de usuario :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        jLabel20.setText("Nombre :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            cargar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        main.buss_1.setId(idDev.getText());
        main.buss_1.b();
        if(main.buss_1.getCom()==false){
            main.intercambio(main.nada);}
            else{
        main.intercambio(main.buss_1);}
        //aqui prro
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categ;
    private javax.swing.JTextArea Descripcio;
    private javax.swing.JTextField Dessa;
    private javax.swing.JTextField Nom_app;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Repo_git;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel idDev;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nom_user;
    // End of variables declaration//GEN-END:variables
}
