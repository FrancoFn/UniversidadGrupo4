/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Luz
 */
public class formularioDeInscripcion extends javax.swing.JInternalFrame {

    AlumnoData alumData = new AlumnoData();
    MateriaData matData = new MateriaData();
    InscripcionData insData = new InscripcionData();
    DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    DefaultTableModel modeloTabla;
    List<Alumno> alum;

    public formularioDeInscripcion() {
        initComponents();
        modeloTabla = (DefaultTableModel) JTInscripcion.getModel();

        listarAlumno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCBAlum = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JRBMateinscriptas = new javax.swing.JRadioButton();
        JRBMatenoinscrip = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTInscripcion = new javax.swing.JTable();
        JBInscribir = new javax.swing.JButton();
        JBAnularinscrip = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

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

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Formulario De Inscripcion");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Seleccione Un Alumno:");

        JCBAlum.setToolTipText("");
        JCBAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAlumActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias:");

        JRBMateinscriptas.setFont(new java.awt.Font("Bookman Old Style", 1, 10)); // NOI18N
        JRBMateinscriptas.setText("Materias inscriptas");
        JRBMateinscriptas.setEnabled(false);
        JRBMateinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMateinscriptasActionPerformed(evt);
            }
        });

        JRBMatenoinscrip.setFont(new java.awt.Font("Bookman Old Style", 1, 10)); // NOI18N
        JRBMatenoinscrip.setText("Materias no inscriptas");
        JRBMatenoinscrip.setEnabled(false);
        JRBMatenoinscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBMatenoinscripActionPerformed(evt);
            }
        });

        JTInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTInscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTInscripcionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTInscripcion);

        JBInscribir.setText("Inscribir");
        JBInscribir.setEnabled(false);
        JBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInscribirActionPerformed(evt);
            }
        });

        JBAnularinscrip.setText("Anular Inscripcion");
        JBAnularinscrip.setEnabled(false);
        JBAnularinscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnularinscripActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JCBAlum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JRBMateinscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JRBMatenoinscrip))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(JBInscribir)
                        .addGap(39, 39, 39)
                        .addComponent(JBAnularinscrip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(JBSalir)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCBAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBMateinscriptas)
                    .addComponent(JRBMatenoinscrip))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAnularinscrip)
                    .addComponent(JBSalir)
                    .addComponent(JBInscribir))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAnularinscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnularinscripActionPerformed
        anularInscripcion();
    }//GEN-LAST:event_JBAnularinscripActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JCBAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAlumActionPerformed
        if (JCBAlum.getSelectedIndex() != 0) {
            cargarTablaAlumno();
            JRBMateinscriptas.setEnabled(true);
            JRBMatenoinscrip.setEnabled(true);
        } else {
            limpiarFilas();
        }

    }//GEN-LAST:event_JCBAlumActionPerformed

    private void JRBMatenoinscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMatenoinscripActionPerformed
        if (JRBMatenoinscrip.isSelected()) {
            JRBMateinscriptas.setSelected(false);
            cargarTablaAlumno();
            JBAnularinscrip.setEnabled(false);
        } else {
            limpiarFilas();

        }
    }//GEN-LAST:event_JRBMatenoinscripActionPerformed

    private void JRBMateinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBMateinscriptasActionPerformed
        if (JRBMateinscriptas.isSelected()) {
            JRBMatenoinscrip.setSelected(false);
            cargarTablaAlumno();
        } else {
            limpiarFilas();

        }

    }//GEN-LAST:event_JRBMateinscriptasActionPerformed

    private void JBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInscribirActionPerformed
        guardarInscripcion();
    }//GEN-LAST:event_JBInscribirActionPerformed

    private void JTInscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTInscripcionMouseClicked
        if (JRBMateinscriptas.isSelected()) {
            int contador = 0;
            int filas = modeloTabla.getRowCount();
            for (int i = 0; i < filas; i++) {
                if ((Boolean) modeloTabla.getValueAt(i, 3)) {
                    JBAnularinscrip.setEnabled(true);
                    contador++;
                }
                if (contador == 0) {
                    JBAnularinscrip.setEnabled(false);
                }

            }
        } else {
            JBAnularinscrip.setEnabled(false);
        }
        if (JRBMatenoinscrip.isSelected()) {
            int contador = 0;
            int filas = modeloTabla.getRowCount();
            for (int i = 0; i < filas; i++) {
                if ((Boolean) modeloTabla.getValueAt(i, 3)) {
                    JBInscribir.setEnabled(true);
                    contador++;
                }
                if (contador == 0) {
                    JBInscribir.setEnabled(false);
                }

            }
        } else {
            JBInscribir.setEnabled(false);
        }
    }//GEN-LAST:event_JTInscripcionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAnularinscrip;
    private javax.swing.JButton JBInscribir;
    private javax.swing.JButton JBSalir;
    private javax.swing.JComboBox<String> JCBAlum;
    private javax.swing.JRadioButton JRBMateinscriptas;
    private javax.swing.JRadioButton JRBMatenoinscrip;
    private javax.swing.JTable JTInscripcion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public void listarAlumno() {
        alum = alumData.listarAlumnos();
        modeloComboBox.addElement("--- Lista de alumnos ---");
        for (Alumno alumno : alum) {

            modeloComboBox.addElement(alumno);

        }
        JCBAlum.setModel(modeloComboBox);
        JCBAlum.repaint();
    }

    private void limpiarFilas() {
        int filas = modeloTabla.getRowCount();
        for (int i = 0; i < filas; i++) {

            modeloTabla.removeRow(0);
        }
    }

    public void cargarTablaAlumno() {
        Alumno alu = (Alumno) JCBAlum.getSelectedItem();
        limpiarFilas();
        if (JRBMatenoinscrip.isSelected()) {
            List<Materia> materias = insData.obtenerMateriasNoCursadas(alu.getIdAlumno());
            modeloTabla.setRowCount(0);
            for (Materia materia : materias) {
                modeloTabla.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria(), false});

            }
        } else if (JRBMateinscriptas.isSelected()) {

            List<Materia> materiass = insData.obtenerMateriasCursadas(alu.getIdAlumno());
            modeloTabla.setRowCount(0);
            for (Materia materia : materiass) {
                modeloTabla.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria(), false});
            }
        }
    }

    public void guardarInscripcion() {
        int filas = modeloTabla.getRowCount();
        Inscripcion ins = new Inscripcion();
        Alumno alumn = (Alumno) JCBAlum.getSelectedItem();
        Materia materia;
        for (int i = 0; i < filas; i++) {
            if ((Boolean) (modeloTabla.getValueAt(i, 3))) {
                materia = matData.buscarMateria((int) modeloTabla.getValueAt(i, 0));
                System.out.println(alumn);
                System.out.println(materia);
                ins.setAlumno(alumn);
                ins.setMateria(materia);
                ins.setNota(8);
                insData.guardarInscripcion(ins);
                System.out.println(ins);
            }
        }
        cargarTablaAlumno();

    }

    public void anularInscripcion() {
        int filas = modeloTabla.getRowCount();
        Alumno alu = (Alumno) JCBAlum.getSelectedItem();
        List<Inscripcion> inscripciones = insData.obtenerInscripciones();
        Iterator<Inscripcion> it = inscripciones.iterator();
        while (it.hasNext()) {
            for (Inscripcion inscripcion : inscripciones) {

            }
        }
        List<Integer> idMaterias = new ArrayList<>();
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {

            if ((Boolean) (modeloTabla.getValueAt(i, 3))) {
                idMaterias.add((int) modeloTabla.getValueAt(i, 0));
//                    int idmateria = (int) modeloTabla.getValueAt(i,0);
//                    insData.borrarInscripcionMateriaAlumnos(alu.getIdAlumno(),idmateria );
            }
            for (Integer idMateria : idMaterias) {
                insData.borrarInscripcionMateriaAlumnos(alu.getIdAlumno(), idMateria);
            }
            
            System.out.println("inscripcion anulada");
            cargarTablaAlumno();
        }
    }
}
