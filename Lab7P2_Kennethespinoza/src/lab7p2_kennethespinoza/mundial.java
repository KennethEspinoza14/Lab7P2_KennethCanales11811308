
package lab7p2_kennethespinoza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth
 */
public class mundial extends javax.swing.JFrame {

   
    public mundial() {
        initComponents();
        in.cargarArchivo();
        this.setVisible(false);
        aparecer_login();
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jb_registro = new javax.swing.JButton();
        jd_registro = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jt_nombre_reg = new javax.swing.JTextField();
        pf_pass_reg = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jd_verEncuentros = new javax.swing.JDialog();
        ver_encuentros = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtab_equipos = new javax.swing.JTable();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jt_nombre_seleccion = new javax.swing.JTextField();
        crear_seleccion = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cb_equipo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jt_nombre_jugador = new javax.swing.JTextField();
        jt_dorsal = new javax.swing.JTextField();
        cb_posicion = new javax.swing.JComboBox<>();
        jb_agregarjugador = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cb_grupo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_equipoLoc = new javax.swing.JComboBox<>();
        cb_equipoVis = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pos_equipoLoc = new javax.swing.JTextField();
        pos_equipoVis = new javax.swing.JTextField();
        gol_equipoLoc = new javax.swing.JTextField();
        goles_equipoVis = new javax.swing.JTextField();
        faltas_equipoLoc = new javax.swing.JTextField();
        faltas_equipoVis = new javax.swing.JTextField();
        tiros_equipoLoc = new javax.swing.JTextField();
        tiros_equipoVis = new javax.swing.JTextField();
        jb_crear_partido = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        Selecciones_grupo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido ");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Ingrese sus credenciales");
        jLabel2.setToolTipText("");

        jLabel3.setText("USER");

        jLabel4.setText("PASSWORD");

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jb_registro.setText("¿No tiene una cuenta?");
        jb_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(jd_loginLayout.createSequentialGroup()
                                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_user)
                                    .addComponent(pf_pass)))))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton1))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_registro)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jb_registro)
                .addGap(17, 17, 17))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Registro");

        jLabel6.setText("Ingrese su nombre:");

        jLabel7.setText("Ingrese su contraseña");

        jButton2.setText("REGISTRARSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel5))
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_nombre_reg)
                            .addComponent(pf_pass_reg, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jButton2)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_nombre_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pf_pass_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ver_encuentros.addTab("Equipos", jPanel2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ver_encuentros.addTab("Tabla de goleadores", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ver_encuentros.addTab("tab3", jPanel12);

        jtab_equipos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtab_equipos);

        javax.swing.GroupLayout jd_verEncuentrosLayout = new javax.swing.GroupLayout(jd_verEncuentros.getContentPane());
        jd_verEncuentros.getContentPane().setLayout(jd_verEncuentrosLayout);
        jd_verEncuentrosLayout.setHorizontalGroup(
            jd_verEncuentrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verEncuentrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(jd_verEncuentrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_verEncuentrosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ver_encuentros)
                    .addContainerGap()))
        );
        jd_verEncuentrosLayout.setVerticalGroup(
            jd_verEncuentrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verEncuentrosLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(jd_verEncuentrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_verEncuentrosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ver_encuentros)
                    .addContainerGap()))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Nombre de la selección");

        crear_seleccion.setText("CREAR");
        crear_seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_seleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jt_nombre_seleccion)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(crear_seleccion)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel19)
                .addGap(61, 61, 61)
                .addComponent(jt_nombre_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(crear_seleccion)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane10.addTab("Agregar selección", jPanel10);

        jLabel15.setText("Selección a la que pertenece");

        jLabel16.setText("Nombre");

        jLabel17.setText("Dorsal");

        jLabel18.setText("Posición");

        cb_posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero", " " }));

        jb_agregarjugador.setText("Agregar Jugador");
        jb_agregarjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarjugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_posicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jt_dorsal)
                            .addComponent(jt_nombre_jugador)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)))
                .addGap(32, 32, 32)
                .addComponent(cb_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jb_agregarjugador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jt_nombre_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jt_dorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jb_agregarjugador)
                .addGap(92, 92, 92))
        );

        jTabbedPane10.addTab("Agregar Jugador", jPanel4);

        jLabel8.setText("Grupo");

        cb_grupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Equipo Local");

        jLabel10.setText("Equipo Visitante");

        cb_equipoLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_equipoVis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Posesión");

        jLabel12.setText("Resultado");

        jLabel13.setText("Faltas");

        jLabel14.setText("Tiros");

        jb_crear_partido.setText("AGREGAR AL SISTEMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(cb_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jb_crear_partido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gol_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pos_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faltas_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiros_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)))
                    .addComponent(cb_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goles_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faltas_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiros_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pos_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(gol_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goles_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(faltas_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faltas_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tiros_equipoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiros_equipoVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jb_crear_partido)
                .addGap(45, 45, 45))
        );

        jTabbedPane10.addTab("Crear/Editar Partido", jPanel1);

        jButton3.setText("AGREGAR GRUPO 1");

        jButton4.setText("AGREGAR GRUPO 2");

        jButton5.setText("AGREGAR GRUPO 3");

        jButton6.setText("AGREGAR GRUPO 4");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(Selecciones_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Selecciones_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton3)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addGap(27, 27, 27)
                .addComponent(jButton6)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane10.addTab("Crear Grupos", jPanel14);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane10)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane10)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        entrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registroActionPerformed
        aparecer_registro();
    }//GEN-LAST:event_jb_registroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        in.cargarArchivo();
        String nombre, pass;

        nombre = jt_nombre_reg.getText();
        pass = pf_pass_reg.getText();
        usuario u = new usuario(nombre, pass, 0, false);
        u.setId(123455 + in.getListausuarios().size());

        in.getListausuarios().add(u);
        System.out.println(in.getListausuarios());
        try {
            in.escribirArchivo();
        } catch (IOException ex) {

        }

        jt_nombre_reg.setText("");
        pf_pass_reg.setText("");
        jd_registro.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    public void escribir_archivo_jugador() throws IOException{
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
      
        try {
            archivo = new File("./equipos.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (jugador t : s.getJugadores() ) {
                bw.write(t.getNombre()+"|");
                bw.write(t.getDorsal()+"|");
                bw.write(t.getGoles()+"|");
                bw.write(t.getAsistencias()+"|");
                bw.write(t.getPosición()+"|");
                bw.write(t.getPartidos_jugados()+"|");
                bw.write(t.getFaltas_cometidas()+"|");
                bw.write(t.getFaltas_recibidas()+"|");
                bw.write(t.getTarjetas_amarillas()+"|");
                bw.write(t.getTarjetas_rojas()+"|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }
    
    public void cargar_archivo_jugador(){
         Scanner sc = null;
        File archivo = null;

        equipos = new ArrayList();
        archivo = new File("./equipos.txt");

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    s.getJugadores().add(new jugador(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    
    public void escribir_archivo_seleccion() throws IOException{
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        
        try {
            archivo = new File("./equipos.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (seleccion t : equipos) {
                bw.write(t.getNombre() + "|");
                bw.write(t.getGoles_favor() + "|");
                bw.write(t.getGoles_enContra()+"|");
                bw.write(t.getDiferencia_goles()+"|");
                bw.write(t.getPartidos_jug()+"|");
                bw.write(t.getPartidos_ganados()+"|");
                bw.write(t.getPartidos_empatados()+"|");
                bw.write(t.getPartidos_perdidos()+"|");
                bw.write(t.toString()+"|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }
    
    public void cargar_archivo_seleccion(){
        Scanner sc = null;
        File archivo = null;

        equipos = new ArrayList();
        archivo = new File("./equipos.txt");

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    equipos.add(new seleccion(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    
    private void crear_seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_seleccionActionPerformed
       
        cargar_archivo_seleccion();
        String nombre;
        nombre = jt_nombre_seleccion.getText();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_equipo.getModel();
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) Selecciones_grupo.getModel();
        
        modelo2.addElement(nombre);
        modelo.addElement(nombre);
        Selecciones_grupo.setModel(modelo2);
        cb_equipo.setModel(modelo);
        equipos.add(new seleccion(nombre, 0, 0, 0, 0, 0, 0, 0));
        
        System.out.println(equipos);
        try {
            escribir_archivo_seleccion();
        } catch (IOException ex) {

        }
        jt_nombre_seleccion.setText("");
        JOptionPane.showMessageDialog(this,
                    "Equipo agregado exitosamente");
        
    }//GEN-LAST:event_crear_seleccionActionPerformed

    private void jb_agregarjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarjugadorActionPerformed

        cargar_archivo_jugador();
        
        String nombre, posicion = "";
        int dorsal;
        
        nombre = jt_nombre_jugador.getText();
        dorsal = Integer.parseInt(jt_dorsal.getText());
        s.getJugadores().add(new jugador(nombre, dorsal, 0, 0, 0, 0, 0, 0, 0, (String)cb_posicion.getSelectedItem()));
        
         System.out.println(s.getJugadores());
        try {
            escribir_archivo_jugador();
        } catch (IOException ex) {

        }
        jt_nombre_jugador.setText("");
        jt_dorsal.setText("");
        JOptionPane.showMessageDialog(this,
                    "Jugador agregado exitosamente");
        
    }//GEN-LAST:event_jb_agregarjugadorActionPerformed

     private void aparecer_login() {
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setLocationRelativeTo(this);

        jd_login.setVisible(true);
    }
     
      private void aparecer_registro() {
        jd_registro.setModal(true);
        jd_registro.pack();
        jd_registro.setLocationRelativeTo(this);
        jd_registro.setVisible(true);
    }
      
      private void aparecer_encuentros(){
          
          jd_verEncuentros.setModal(true);
          jd_verEncuentros.pack();
        jd_verEncuentros.setLocationRelativeTo(this);
        jd_verEncuentros.setVisible(true);
        

        }
      
      public void aparecer_menu(){
          this.setVisible(false);
      }
     
     public void entrar() {
        boolean login = false;

        if (jt_user.getText().equals(a.getNombre()) && pf_pass.getText().equals(a.getPass())) {
            JOptionPane.showMessageDialog(this, "Bienvenido al sistema administrador");
            login = true;
            this.setVisible(true);
            jd_login.setVisible(false);
        }

        for (int i = 0; i < in.getListausuarios().size(); i++) {
            if (jt_user.getText().equals(in.getListausuarios().get(i).getNombre()) && pf_pass.getText().equals(in.getListausuarios().get(i).getPass())) {
                JOptionPane.showMessageDialog(this, "Bienvenido al sistema");
                login = true;
                jd_login.setVisible(false);
                this.setVisible(false);
                aparecer_encuentros();

            }

        }
        if (login == false) {
            JOptionPane.showMessageDialog(this, "Datos incorrectos");
        }

    }
    
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
            java.util.logging.Logger.getLogger(mundial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mundial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mundial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mundial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mundial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Selecciones_grupo;
    private javax.swing.JComboBox<String> cb_equipo;
    private javax.swing.JComboBox<String> cb_equipoLoc;
    private javax.swing.JComboBox<String> cb_equipoVis;
    private javax.swing.JComboBox<String> cb_grupo;
    private javax.swing.JComboBox<String> cb_posicion;
    private javax.swing.JButton crear_seleccion;
    private javax.swing.JTextField faltas_equipoLoc;
    private javax.swing.JTextField faltas_equipoVis;
    private javax.swing.JTextField gol_equipoLoc;
    private javax.swing.JTextField goles_equipoVis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JButton jb_agregarjugador;
    private javax.swing.JButton jb_crear_partido;
    private javax.swing.JButton jb_registro;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JDialog jd_verEncuentros;
    private javax.swing.JTextField jt_dorsal;
    private javax.swing.JTextField jt_nombre_jugador;
    private javax.swing.JTextField jt_nombre_reg;
    private javax.swing.JTextField jt_nombre_seleccion;
    private javax.swing.JTextField jt_user;
    private javax.swing.JTable jtab_equipos;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPasswordField pf_pass_reg;
    private javax.swing.JTextField pos_equipoLoc;
    private javax.swing.JTextField pos_equipoVis;
    private javax.swing.JTextField tiros_equipoLoc;
    private javax.swing.JTextField tiros_equipoVis;
    private javax.swing.JTabbedPane ver_encuentros;
    // End of variables declaration//GEN-END:variables

     static archivos_usuarios in
            = new archivos_usuarios("./usuarios.txt");
     
    seleccion s = new seleccion();
    
    static admin a = new admin("admin", "admin", 0, false);
    
    ArrayList <seleccion> equipos = new ArrayList();
}
