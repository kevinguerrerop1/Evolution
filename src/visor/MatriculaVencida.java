/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visor;

import control.CClientes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.clientes;

/**
 *
 * @author Kevin Guerrero
 */
public class MatriculaVencida extends javax.swing.JInternalFrame {

    CClientes mega = new CClientes();

    DefaultTableModel tabla = new DefaultTableModel();

    ArrayList<clientes> lista;

    private void llenardatos(String nombre) {
        //indicar que empezamos a trabajar de la primera columna
        tabla.setColumnCount(0);
        tabla.addColumn("N°. Socio");
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Rut");
        tabla.addColumn("Fecha Termino");
        tabla.addColumn("Estado");
        tabla.addColumn("Plan");
        tabla.addColumn("Valor Plan");
        tabla.addColumn("Estado De Mensualidad");
        lista = mega.Mostrarven(nombre);
        tabla.setNumRows(lista.size());

        for (int i = 0; i < lista.size(); i++) {
            tabla.setValueAt(lista.get(i).getN_socio(), i, 0);
            tabla.setValueAt(lista.get(i).getNombre(), i, 1);
            tabla.setValueAt(lista.get(i).getApellido(), i, 2);
            tabla.setValueAt(lista.get(i).getRut(), i, 3);
            tabla.setValueAt(lista.get(i).getF_termino(), i, 4);
            tabla.setValueAt(lista.get(i).getNomes(), i, 5);
            tabla.setValueAt(lista.get(i).getNompl(), i, 6);
            tabla.setValueAt(lista.get(i).getVpla(), i, 7);
        }
        //Entregar los datos a la tabla
        jTable1.setModel(tabla);
    }

    public MatriculaVencida() {
        initComponents();
        llenardatos("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1189, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}