/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freddy Moreno
 */
public class Medicamentos{
    private int codigo_medicamento;
    private String principio_act;
    private String descripcion;
    private String presentacion;
    private String laboratorio;
    
    public Medicamentos() {
    }

    public void Medicamentos(int codigo_medicamento, String principio_act, String descripcion, String presentacion,String laboratorio) {
        
        this.codigo_medicamento=codigo_medicamento;
        this.principio_act=principio_act;
        this.descripcion=descripcion;
        this.presentacion=presentacion;
        this.laboratorio=laboratorio;
        
    }
 public int getcodigo_medicamento() {
        return codigo_medicamento;
    }

    public void setcodigo_medicamento(int codigo_medicamento) {
        this.codigo_medicamento = codigo_medicamento;
    }

    public String getprincipio_act() {
        return principio_act;
    }

    public void setprincipio_act(String principio_act) {
        this.principio_act = principio_act;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getpresentacion() {
        return presentacion;
    }

    public void setpresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getlaboratorio() {
        return laboratorio;
    }

    public void setlaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    
    
    public synchronized void INSERT_MEDICAMENTOS(Connection con) throws SQLException{
        PreparedStatement pst = con.prepareStatement("INSERT INTO medicamentos VALUES (?, ?, ?, ?, ?)");
        pst.setInt(1, getcodigo_medicamento());
        pst.setString(2, getprincipio_act());
        pst.setString(3, getdescripcion());
        pst.setString(4, getpresentacion());
        pst.setString(5, getlaboratorio());
        pst.executeUpdate();
    }
    
    public synchronized void UPDATE_MEDICAMENTOS(Connection con, String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("UPDATE medicamentos SET  codigo_medicamento= ?, principio_act = ?,descripcion = ?,presentacion= ?, laboratorio = ? WHERE codigo_medicamento = '"+id+"'");
        pst.setInt(1, getcodigo_medicamento());
        pst.setString(2, getprincipio_act());
        pst.setString(3, getdescripcion());
        pst.setString(4, getpresentacion());
        pst.setString(5, getlaboratorio());
        pst.executeUpdate();
    }
    
    public synchronized void DELETE_MEDICAMENTOS(Connection con, String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("DELETE FROM medicamentos WHERE codigo_medicamento = ?");
        pst.setString(1, id);
        pst.executeUpdate();
    }
    public DefaultTableModel CARGAR_MEDICAMENTOS(Connection con) {
        DefaultTableModel tablamodelo = new DefaultTableModel(null, new Object[]{"Código", "Principio","Descripción","presentacion","laboratorio"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        try {
            PreparedStatement consulta = con.prepareStatement("SELECT codigo_medicamento,principio_act,descripcion,presentacion,laboratorio FROM medicamentos");
                                                              
            ResultSet readline = consulta.executeQuery();
            while (readline.next()) {
                tablamodelo.addRow(new Object[]{readline.getString("codigo_medicamento"),
                                                readline.getString("principio_act"),
                                                readline.getString("descripcion"),
                                                readline.getString("presentacion"),
                                                readline.getString("laboratorio")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return tablamodelo;
    }

}
