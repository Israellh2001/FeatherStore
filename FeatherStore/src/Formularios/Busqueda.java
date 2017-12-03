
package Formularios;

import Clases.Mysql;

public class Busqueda extends javax.swing.JInternalFrame {


    public Busqueda() {
        initComponents();
        b();
        //setBackground(new java.awt.Color(255, 255, 255));
    }

public void b(){
    Mysql a=new Mysql();
    a.mostrar_resultados("Juegos", t1, t2,d1,d2);
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
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 430, 130));

        t2.setText("jLabel1");
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 430, 150));

        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));

        jPanel2.setBackground(new java.awt.Color(69, 85, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setText("jLabel1");
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        d1.setColumns(20);
        d1.setRows(5);
        jScrollPane5.setViewportView(d1);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 430, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 815, 180));

        jPanel3.setBackground(new java.awt.Color(69, 85, 140));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 39, 430, 160));

        jLabel3.setText("jLabel1");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 810, 220));

        jPanel4.setBackground(new java.awt.Color(69, 85, 140));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane9.setViewportView(jTextArea5);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 430, 140));

        jLabel5.setText("jLabel1");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 810, 170));

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    // End of variables declaration//GEN-END:variables
}
