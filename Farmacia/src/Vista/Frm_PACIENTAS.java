package Vista;

import Controlador.ConexionMYSQL;
import Controlador.Funciones;
import Modelo.DEPARTAMENTOS;
import Modelo.MUNICIPIOS;
import Modelo.PACIENTES;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Fantasma-Enginner
 */
public class Frm_PACIENTAS extends javax.swing.JFrame {

    public static ConexionMYSQL CN = new ConexionMYSQL();
    public Funciones FUN = new Funciones();
    public static PACIENTES PA = new PACIENTES();
    public DEPARTAMENTOS DE = new DEPARTAMENTOS();
    public static MUNICIPIOS MU = new MUNICIPIOS();
    
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    public static String cod_d, cod_m, id;
    public static int swd;
    
    public Frm_PACIENTAS() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Nit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Txt_Apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_Direccion = new javax.swing.JTextField();
        Txt_Movil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Txt_Fijo = new javax.swing.JTextField();
        Cb_Departamento = new javax.swing.JComboBox();
        Cb_Municipio = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_FechaNacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Cb_Zona = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        Cb_Genero = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Cmb_Nuevo = new javax.swing.JButton();
        Cmb_Guardar = new javax.swing.JButton();
        Cmb_Actualizar = new javax.swing.JButton();
        Cmb_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jLabel1.setText("Identificación");

        Txt_Nit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_NitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NitKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre");

        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyTyped(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Txt_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_ApellidosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ApellidosKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellidos");

        jLabel4.setText("Dirección");

        Txt_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_DireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DireccionKeyTyped(evt);
            }
        });

        Txt_Movil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_MovilKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_MovilKeyTyped(evt);
            }
        });

        jLabel5.setText("Movil");

        jLabel6.setText("Fijo");

        Txt_Fijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_FijoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_FijoKeyTyped(evt);
            }
        });

        Cb_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_DepartamentoActionPerformed(evt);
            }
        });
        Cb_Departamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cb_DepartamentoKeyPressed(evt);
            }
        });

        Cb_Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_MunicipioActionPerformed(evt);
            }
        });
        Cb_Municipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cb_MunicipioKeyPressed(evt);
            }
        });

        jLabel7.setText("Departamento nacimiento");

        jLabel8.setText("Municipio nacimiento");

        Txt_FechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_FechaNacimientoKeyPressed(evt);
            }
        });

        jLabel9.setText("Fecha nacimiento");

        Cb_Zona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cb_ZonaKeyPressed(evt);
            }
        });

        jLabel10.setText("Zona");

        Cb_Genero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cb_GeneroKeyPressed(evt);
            }
        });

        jLabel11.setText("Genero");

        Cmb_Nuevo.setText("Nuevo");
        Cmb_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_NuevoActionPerformed(evt);
            }
        });

        Cmb_Guardar.setText("Guardar");
        Cmb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_GuardarActionPerformed(evt);
            }
        });

        Cmb_Actualizar.setText("Actualizar");
        Cmb_Actualizar.setEnabled(false);
        Cmb_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_ActualizarActionPerformed(evt);
            }
        });

        Cmb_Eliminar.setText("Eliminar");
        Cmb_Eliminar.setEnabled(false);
        Cmb_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cmb_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))))
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(Cb_Departamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(Cb_Zona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(Txt_Apellidos)
                                .addComponent(Txt_Movil)
                                .addComponent(Cb_Municipio, 0, 219, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(Cb_Genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cmb_Nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(Cmb_Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Cmb_Actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(Cmb_Eliminar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Movil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_Zona, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cmb_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cmb_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Limpiar();
        Departamentos();
        Zona();
        Genere();
        Txt_FechaNacimiento.setText(formato.format(new Date()));
    }//GEN-LAST:event_formWindowOpened

    private void Txt_NitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NitKeyTyped
        FUN.CantidadDigitos(evt, Txt_Nit, 10);
    }//GEN-LAST:event_Txt_NitKeyTyped

    private void Txt_NitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NitKeyPressed
        FUN.PasarTextAText(evt, Txt_Nit, Txt_Nombre, "Este campo es requerido");
    }//GEN-LAST:event_Txt_NitKeyPressed

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        FUN.CantidadDigitos(evt, Txt_Nombre, 50);
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyPressed
        FUN.PasarTextAText(evt, Txt_Nombre, Txt_Apellidos, "Este campo es requerido");
    }//GEN-LAST:event_Txt_NombreKeyPressed

    private void Txt_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidosKeyTyped
        FUN.CantidadDigitos(evt, Txt_Apellidos, 50);
    }//GEN-LAST:event_Txt_ApellidosKeyTyped

    private void Txt_ApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidosKeyPressed
        FUN.PasarTextAText(evt, Txt_Apellidos, Txt_Direccion, "Este campo es requerido");
    }//GEN-LAST:event_Txt_ApellidosKeyPressed

    private void Txt_DireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DireccionKeyTyped
        FUN.CantidadDigitos(evt, Txt_Direccion, 50);
    }//GEN-LAST:event_Txt_DireccionKeyTyped

    private void Txt_DireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DireccionKeyPressed
        FUN.PasarTextAText(evt, Txt_Direccion, Txt_Movil, "Este campo es requerido");
    }//GEN-LAST:event_Txt_DireccionKeyPressed

    private void Txt_MovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_MovilKeyTyped
        FUN.CantidadDigitos(evt, Txt_Movil, 10);
    }//GEN-LAST:event_Txt_MovilKeyTyped

    private void Txt_MovilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_MovilKeyPressed
        FUN.PasarTextATextt(evt, Txt_Movil, Txt_Fijo);
    }//GEN-LAST:event_Txt_MovilKeyPressed

    private void Txt_FijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FijoKeyTyped
        FUN.CantidadDigitos(evt, Txt_Fijo, 7);
    }//GEN-LAST:event_Txt_FijoKeyTyped

    private void Txt_FijoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FijoKeyPressed
        FUN.PasarTextAComboo(evt, Txt_Fijo, Cb_Departamento);
    }//GEN-LAST:event_Txt_FijoKeyPressed

    private void Cb_DepartamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cb_DepartamentoKeyPressed
        FUN.PasarComboACombo(evt, Cb_Departamento, Cb_Municipio, "Este campo es requerido");
    }//GEN-LAST:event_Cb_DepartamentoKeyPressed

    private void Cb_MunicipioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cb_MunicipioKeyPressed
        FUN.PasarComboAText(evt, Cb_Municipio, Txt_FechaNacimiento, "Este campo es requerido");
    }//GEN-LAST:event_Cb_MunicipioKeyPressed

    private void Txt_FechaNacimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FechaNacimientoKeyPressed
        FUN.PasarTextACombo(evt, Txt_FechaNacimiento, Cb_Zona, "Este campo requerido");
    }//GEN-LAST:event_Txt_FechaNacimientoKeyPressed

    private void Cb_ZonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cb_ZonaKeyPressed
        FUN.PasarComboACombo(evt, Cb_Zona, Cb_Genero, "Este campo es requerido");
    }//GEN-LAST:event_Cb_ZonaKeyPressed

    private void Cb_GeneroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cb_GeneroKeyPressed
        FUN.PasarComboAButtun(evt, Cb_Genero, Cmb_Guardar, "Este campo es requerido");
    }//GEN-LAST:event_Cb_GeneroKeyPressed

    private void Cmb_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_NuevoActionPerformed
        Limpiar();
    }//GEN-LAST:event_Cmb_NuevoActionPerformed

    private void Cmb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_GuardarActionPerformed
        if (Txt_Nit.getText().trim().isEmpty() || Txt_Nombre.getText().trim().isEmpty() || Txt_Apellidos.getText().trim().isEmpty() || Txt_Direccion.getText().trim().isEmpty() || Cb_Departamento.getSelectedItem().equals("") || Cb_Municipio.getSelectedItem().equals("") || Cb_Zona.getSelectedItem().equals("") || Cb_Genero.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Existen campos vacíos por favor verifique.");
        } else {
            Save();
        }
    }//GEN-LAST:event_Cmb_GuardarActionPerformed

    private void Cmb_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_ActualizarActionPerformed
        Update();
    }//GEN-LAST:event_Cmb_ActualizarActionPerformed

    private void Cmb_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cmb_EliminarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar este registro?", "CONFIRMAR", 0);
        if (confirmar == 0) {
            Delete();
        }
    }//GEN-LAST:event_Cmb_EliminarActionPerformed

    private void Cb_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_DepartamentoActionPerformed
        if (swd == 0) {
            if (!Cb_Departamento.getSelectedItem().equals("")) {
                cod_d = ((DEPARTAMENTOS) Cb_Departamento.getModel().getSelectedItem()).getCod_departamento();
                Municipios(cod_d);
            } else {
                Cb_Municipio.removeAllItems();
            }
        }
    }//GEN-LAST:event_Cb_DepartamentoActionPerformed

    private void Cb_MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_MunicipioActionPerformed
        if (swd == 0) {
            if (!Cb_Municipio.getSelectedItem().equals("")) {
                cod_m = ((MUNICIPIOS) Cb_Municipio.getModel().getSelectedItem()).getCod_municipio();
            }
        }
    }//GEN-LAST:event_Cb_MunicipioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Frm_FILTRO().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Save() {
        try {
            PA.setTodos(Txt_Nit.getText(),
                        Txt_Nombre.getText(),
                        Txt_Apellidos.getText(),
                        cod_m,
          formato.parse(Txt_FechaNacimiento.getText()),
               (String) Cb_Zona.getSelectedItem(),
                        Txt_Direccion.getText(),
                        Txt_Fijo.getText(),
                        Txt_Movil.getText(),
               (String) Cb_Genero.getSelectedItem());
            PA.INSERT_PACIENTES(CN.getConnection());
            formWindowOpened(null);
        } catch (ParseException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void Update() {
        try {
            PA.setTodos(Txt_Nit.getText(),
                        Txt_Nombre.getText(),
                        Txt_Apellidos.getText(),
                        cod_m,
          formato.parse(Txt_FechaNacimiento.getText()),
               (String) Cb_Zona.getSelectedItem(),
                        Txt_Direccion.getText(),
                        Txt_Fijo.getText(),
                        Txt_Movil.getText(),
               (String) Cb_Genero.getSelectedItem());
            PA.UPDATE_PACIENTES(CN.getConnection(), id);
            formWindowOpened(null);
        } catch (ParseException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void Delete(){
        try {
            PA.DELETE_PACIENTES(CN.getConnection(), id);
            formWindowOpened(null);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    public void Limpiar(){
        swd = 1;
        FUN.LimpiarText(jPanel1);
        FUN.LimpiarCombox(jPanel1);
        swd = 0;
    }
    
    public void Zona(){
        Cb_Zona.addItem("");
        Cb_Zona.addItem("U");
        Cb_Zona.addItem("R");
    }
    
    public void Genere(){
        Cb_Genero.addItem("");
        Cb_Genero.addItem("M");
        Cb_Genero.addItem("F");
    }
    
    public void Departamentos() {
        Cb_Departamento.setModel(DE.LLENARCOMBO(CN.getConnection()));
    }

    public void Municipios(String dep) {
        Cb_Municipio.setModel(MU.LLENARCOMBO(CN.getConnection(), dep));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frm_PACIENTAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox Cb_Departamento;
    public static javax.swing.JComboBox Cb_Genero;
    public static javax.swing.JComboBox Cb_Municipio;
    public static javax.swing.JComboBox Cb_Zona;
    public static javax.swing.JButton Cmb_Actualizar;
    public static javax.swing.JButton Cmb_Eliminar;
    public static javax.swing.JButton Cmb_Guardar;
    public static javax.swing.JButton Cmb_Nuevo;
    public static javax.swing.JTextField Txt_Apellidos;
    public static javax.swing.JTextField Txt_Direccion;
    public static javax.swing.JTextField Txt_FechaNacimiento;
    public static javax.swing.JTextField Txt_Fijo;
    public static javax.swing.JTextField Txt_Movil;
    public static javax.swing.JTextField Txt_Nit;
    public static javax.swing.JTextField Txt_Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
