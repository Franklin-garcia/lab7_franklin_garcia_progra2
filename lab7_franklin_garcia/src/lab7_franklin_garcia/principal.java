/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_franklin_garcia;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franklin Garcia
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_principal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_apodo = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        sp_ataque = new javax.swing.JSpinner();
        sp_defensa = new javax.swing.JSpinner();
        sp_salud = new javax.swing.JSpinner();
        tab_guererro = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        cb_bestia = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_cuenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_carrera = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sp_edad = new javax.swing.JSpinner();
        boton_guardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cb_listar = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        boton_eliminar = new javax.swing.JButton();
        boton_modificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cb_jugador1 = new javax.swing.JComboBox<>();
        cb_jugador2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab_principal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tab_principalStateChanged(evt);
            }
        });

        jLabel1.setText("Ingrese sus guerreros");

        jLabel2.setText("Nombre");

        jLabel3.setText("NickName");

        jLabel4.setText("Poder de ataque");

        jLabel6.setText("Poder de defensa");

        jLabel7.setText("Salud");

        tf_apodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_apodoActionPerformed(evt);
            }
        });

        sp_ataque.setModel(new javax.swing.SpinnerNumberModel(200, 200, 300, 1));

        sp_defensa.setModel(new javax.swing.SpinnerNumberModel(25, 25, 75, 1));

        sp_salud.setModel(new javax.swing.SpinnerNumberModel(800, 800, null, 1));

        cb_bestia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dragon", "fenix", "hombre lobo", "minotauro" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(cb_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(cb_bestia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        tab_guererro.addTab("Bestia", jPanel2);

        jLabel8.setText("Numero de cuenta");

        jLabel9.setText("Carrera");

        jLabel10.setText("Edad");

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(20, null, null, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_cuenta)
                    .addComponent(tf_carrera)
                    .addComponent(sp_edad, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        tab_guererro.addTab("alumnos", jPanel3);

        boton_guardar.setText("Guardar");
        boton_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_guardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(tf_apodo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(sp_ataque)
                                    .addComponent(sp_defensa)
                                    .addComponent(sp_salud)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(boton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(tab_guererro, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_apodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(sp_ataque, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp_defensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sp_salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(boton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tab_guererro, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        tab_principal.addTab("Agregar", jPanel1);

        jLabel11.setText("Listar");

        cb_listar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_listarItemStateChanged(evt);
            }
        });

        jLabel12.setText("Seleccionar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nickname", "Poder de ataque", "Poder de defensa", "Salud", "Puntos"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        boton_eliminar.setText("Eliminar");
        boton_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_eliminarMouseClicked(evt);
            }
        });

        boton_modificar.setText("Modificar");
        boton_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_modificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel12)
                        .addGap(41, 41, 41)
                        .addComponent(cb_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(boton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        tab_principal.addTab("Listar", jPanel4);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Iniciar batallas");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel13.setText("Agregar peleadores");

        jLabel14.setText("Jugador 1");

        jLabel15.setText("Jugador 2");

        jButton3.setText("Agregar pelea");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel14)
                .addGap(42, 42, 42)
                .addComponent(cb_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(49, 49, 49)
                .addComponent(cb_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel13)
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(cb_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        tab_principal.addTab("Bitacora", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_apodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_apodoActionPerformed

    }//GEN-LAST:event_tf_apodoActionPerformed

    private void boton_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_guardarMouseClicked
        String nombre;
        String nickname;
        int ataque;
        int defensa;
        int salud;
        int puntos;

        puntos = 0;
        nombre = tf_nombre.getText();
        nickname = tf_apodo.getText();
        ataque = (Integer) sp_ataque.getValue();
        defensa = (Integer) sp_defensa.getValue();
        salud = (Integer) sp_salud.getValue();
        if (tab_guererro.getSelectedIndex() == 0) {
            if (cb_bestia.getSelectedItem().toString().equals("dragon")) {
                guerreros dragon = new dragon(nombre, nickname, ataque, defensa, salud, puntos);
                admiGuerrero ap = new admiGuerrero("./guerreros.txt");
                ap.cargarArchivo();
                ap.setGuerrero(dragon);
                ap.escribirArchivo();
            } else if (cb_bestia.getSelectedItem().toString().equals("fenix")) {
                guerreros fenix = new fenix(nombre, nickname, ataque, defensa, salud, puntos);
                admiGuerrero ap = new admiGuerrero("./guerreros.txt");
                ap.cargarArchivo();
                ap.setGuerrero(fenix);
                ap.escribirArchivo();
            } else if (cb_bestia.getSelectedItem().toString().equals("hombre lobo")) {
                guerreros lobo = new hombre_lobo(nombre, nickname, ataque, defensa, salud, puntos);
                admiGuerrero ap = new admiGuerrero("./guerreros.txt");
                ap.cargarArchivo();
                ap.setGuerrero(lobo);
                ap.escribirArchivo();
            } else if (cb_bestia.getSelectedItem().toString().equals("minotauro")) {
                guerreros minotauro = new minotauro(nombre, nickname, ataque, defensa, salud, puntos);
                admiGuerrero ap = new admiGuerrero("./guerreros.txt");
                ap.cargarArchivo();
                ap.setGuerrero(minotauro);
                ap.escribirArchivo();
            }
        } else if (tab_guererro.getSelectedIndex() == 1) {
            int cuenta;
            String carrera;
            int edad;
            cuenta = Integer.parseInt(tf_cuenta.getText());
            carrera = tf_carrera.getText();
            edad = (Integer) sp_edad.getValue();
            guerreros alumno = new alumnos(cuenta, carrera, edad, nombre, nickname, ataque, defensa, salud, puntos);
        }
        JOptionPane.showMessageDialog(this, "Se agrego con exito");
    }//GEN-LAST:event_boton_guardarMouseClicked

    private void tab_principalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tab_principalStateChanged
        if (tab_principal.getSelectedIndex() == 1) {
            admiGuerrero ap = new admiGuerrero("./guerreros.txt");
            ap.cargarArchivo();
            DefaultComboBoxModel modelo = new DefaultComboBoxModel(ap.getListaAlumnos().toArray());
            cb_listar.setModel(modelo);
            cb_jugador1.setModel(modelo);
            cb_jugador2.setModel(modelo);
        }
    }//GEN-LAST:event_tab_principalStateChanged

    private void cb_listarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_listarItemStateChanged
        if (evt.getStateChange() == 1) {
            guerreros temp = (guerreros) cb_listar.getSelectedItem();
            if (temp != null) {

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Nickname", "Poder de ataque", "Poder de defensa", "Salud", "Puntos"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                String row[] = {temp.getNombre(), temp.getNickname(), temp.getPoder_ataque() + "", temp.getPorder_defensa() + "", temp.getSalud() + "", temp.getPuntos() + ""};
                DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
                m.addRow(row);
                jTable1.setModel(m);
            }
        }
    }//GEN-LAST:event_cb_listarItemStateChanged

    private void boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseClicked
        if (jTable1.getSelectedRow() >= 0) {
            admiGuerrero ap = new admiGuerrero("./usuarios.txt");
            ap.cargarArchivo();
            ap.getListaAlumnos().remove(jTable1.getSelectedRow());
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Se elimino con exito");
        }
    }//GEN-LAST:event_boton_eliminarMouseClicked

    private void boton_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_modificarMouseClicked
        if (jTable1.getSelectedRow() >= 0) {
            admiGuerrero ap = new admiGuerrero("./usuarios.txt");

            String nombre = JOptionPane.showInputDialog("Ingrese nombre");
            String nickName = JOptionPane.showInputDialog("Ingrese nickName");
            String ataque = JOptionPane.showInputDialog("Ingrese nuevo poder de ataque");
            String defensa = JOptionPane.showInputDialog("Ingrese defensa");
            String salud = JOptionPane.showInputDialog("Ingrese salud");

            ap.cargarArchivo();
            ap.getListaAlumnos().get(jTable1.getSelectedRow()+1).setNombre(nombre);
            ap.getListaAlumnos().get(jTable1.getSelectedRow()).setNickname(nickName);
            ap.getListaAlumnos().get(jTable1.getSelectedRow()).setPoder_ataque(Integer.parseInt(ataque));
            ap.getListaAlumnos().get(jTable1.getSelectedRow()).setPorder_defensa(Integer.parseInt(defensa));
            ap.getListaAlumnos().get(jTable1.getSelectedRow()).setSalud(Integer.parseInt(salud));
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Se modifico con exito");
        }
    }//GEN-LAST:event_boton_modificarMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        peleas.add((hilo_batalla) cb_jugador1.getSelectedItem());
        peleas.add((hilo_batalla) cb_jugador2.getSelectedItem());
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        /*hilo_batalla h = new hilo_batalla(peleas);
        Thread proceso1 = new Thread(h);
        proceso1.start();*/
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JButton boton_modificar;
    private javax.swing.JComboBox<String> cb_bestia;
    private javax.swing.JComboBox<String> cb_jugador1;
    private javax.swing.JComboBox<String> cb_jugador2;
    private javax.swing.JComboBox<String> cb_listar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner sp_ataque;
    private javax.swing.JSpinner sp_defensa;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JSpinner sp_salud;
    private javax.swing.JTabbedPane tab_guererro;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTextField tf_apodo;
    private javax.swing.JTextField tf_carrera;
    private javax.swing.JTextField tf_cuenta;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
    ArrayList<hilo_batalla> peleas = new ArrayList();
}
