
package Formularios;

import Clases.Mysql;

public class Busqueda extends javax.swing.JInternalFrame {
    String bus;
    public boolean comprobar = true;
    
    public String[] titulos=new String[5];
    public String[] desc=new String[5];
    public String[] id = new String[5];
    public String[] git = new String[5];

    public Busqueda() {
        initComponents();
        //setBackground(new java.awt.Color(255, 255, 255));
    }
    public void setBus(String x){
        bus = x;
    }
    public void setCom(boolean x){
        comprobar = x;
    }
    public boolean getCom(){
        return comprobar;
    }
    public void b(){
        Mysql a=new Mysql();
        a.mostrar_resultados(bus, this);
        String x = titulos[0];
        t1.setText(x);
        x = titulos[1];
        t2.setText(x);
        x = titulos[2];
        t3_.setText(x);
        x = titulos[3];
        t4.setText(x);
        x = titulos[4];
        t5.setText(x);
       //////////////////////////
        x = desc[0];
        d1.setText(x);
        x = desc[1];
        d2.setText(x);
        x = desc[2];
        d3_.setText(x);
        x = desc[3];
        d4.setText(x);
        x = desc[4];
        d5.setText(x);
       //////////////////////////// 
        x = git[0];
        git1.setText(x);
        x = git[1];
        git2.setText(x);
        x = git[2];
        git3.setText(x);
        x = git[3];
        git4.setText(x);
        x = git[4];
        git5.setText(x);
        /////////////////////////7
        x = id[0];
        id1.setText(x);
        x = id[1];
        id2.setText(x);
        x = id[2];
        id3.setText(x);
        x = id[3];
        id4.setText(x);
        x = id[4];
        id5.setText(x);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        d3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        d2 = new javax.swing.JTextArea();
        t2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        d4 = new javax.swing.JTextArea();
        t4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTextArea();
        id1 = new javax.swing.JLabel();
        git1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        d3_ = new javax.swing.JTextArea();
        t3_ = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        git3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        d5 = new javax.swing.JTextArea();
        t5 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        git5 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        git2 = new javax.swing.JLabel();
        git4 = new javax.swing.JLabel();

        t3.setText("Hola mundo");

        d3.setColumns(20);
        d3.setRows(5);
        jScrollPane3.setViewportView(d3);

        setPreferredSize(new java.awt.Dimension(850, 1000));

        jScrollPane4.setPreferredSize(new java.awt.Dimension(50, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 1490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d2.setColumns(20);
        d2.setRows(5);
        jScrollPane6.setViewportView(d2);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 430, 130));

        t2.setText("jLabel1");
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        d4.setColumns(20);
        d4.setRows(5);
        jScrollPane8.setViewportView(d4);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 430, 140));

        t4.setText("jLabel1");
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jPanel2.setBackground(new java.awt.Color(69, 85, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setText("jLabel1");
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        d1.setColumns(20);
        d1.setRows(5);
        jScrollPane5.setViewportView(d1);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 430, 130));

        id1.setText("jLabel2");
        jPanel2.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        git1.setText("jLabel6");
        jPanel2.add(git1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 180));

        jPanel3.setBackground(new java.awt.Color(69, 85, 140));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d3_.setColumns(20);
        d3_.setRows(5);
        jScrollPane7.setViewportView(d3_);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 39, 430, 160));

        t3_.setText("jLabel1");
        jPanel3.add(t3_, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        id3.setText("jLabel4");
        jPanel3.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        git3.setText("jLabel8");
        jPanel3.add(git3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 830, 220));

        jPanel4.setBackground(new java.awt.Color(69, 85, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        d5.setColumns(20);
        d5.setRows(5);
        jScrollPane9.setViewportView(d5);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 430, 130));

        t5.setText("jLabel1");
        jPanel4.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        id5.setText("jLabel1");
        jPanel4.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        git5.setText("jLabel10");
        jPanel4.add(git5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 830, 170));

        id2.setText("jLabel3");
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        id4.setText("jLabel5");
        jPanel1.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, -1, -1));

        git2.setText("jLabel7");
        jPanel1.add(git2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        git4.setText("jLabel9");
        jPanel1.add(git4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, -1, -1));

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea d1;
    private javax.swing.JTextArea d2;
    private javax.swing.JTextArea d3;
    private javax.swing.JTextArea d3_;
    private javax.swing.JTextArea d4;
    private javax.swing.JTextArea d5;
    private javax.swing.JLabel git1;
    private javax.swing.JLabel git2;
    private javax.swing.JLabel git3;
    private javax.swing.JLabel git4;
    private javax.swing.JLabel git5;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t3_;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    // End of variables declaration//GEN-END:variables
}
