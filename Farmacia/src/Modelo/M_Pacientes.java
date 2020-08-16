/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Freddy
 */
public class M_Pacientes {
 
 private String nro_documento;
 private String nombres;
 private String apellidos;
 private String municipio;
 private Date fecha_nac;
 private String zona;
 private String direccion;  
 private String fijo;
 private String movil;
 private String genero;

    public M_Pacientes() {
    }

    public M_Pacientes( String nro_documento, String nombres, String apellidos, String municipio, Date fecha_nac, String zona, String direccion, String fijo, String movil, String genero) {
        
        this.nro_documento = nro_documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.municipio = municipio;
        this.fecha_nac = fecha_nac;
        this.zona = zona;
        this.direccion = direccion;
        this.fijo = fijo;
        this.movil = movil;
        this.genero = genero;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
 public void ins_paciente(Connection conn) throws SQLException{
     PreparedStatement pst = conn.prepareStatement("insert into pacientes values(?,?,?,?,?,?,?,?,?,?)");
     pst.setString(1, getNro_documento());
     pst.setString(2,getNombres());
     pst.setString(3, getApellidos());
     pst.setString(4,getMunicipio());
     pst.setTimestamp(5,new Timestamp(getFecha_nac().getTime()));
     pst.setString(6,getZona());
     pst.setString(7, getDireccion());
     pst.setString(8, getFijo());
     pst.setString(9, getMovil());
     pst.setString(10, getGenero());   
     pst.executeUpdate();
 }
 
    public void upd_paciente(Connection conn, int id) throws SQLException{
     PreparedStatement pst = conn.prepareStatement("update pacientes set nro_documento=?,nombres=?,apellidos=?,"
             + "mpo_nacimeinto=?,fecha_nac=?,zona=?,direccion=?,fijo=?,movil=?,genero=? where id_paciente='"+id+"'");
     pst.setString(1, getNro_documento());
     pst.setString(2,getNombres());
     pst.setString(3, getApellidos());
     pst.setString(4,getMunicipio());
     pst.setTimestamp(5,new Timestamp(getFecha_nac().getTime()));
     pst.setString(6,getZona());
     pst.setString(7, getDireccion());
     pst.setString(8, getFijo());
     pst.setString(9, getMovil());
     pst.setString(10, getGenero()); 
     pst.executeUpdate();
 }
 public void del_paciente(Connection conn, int id) throws SQLException{
     PreparedStatement pst = conn.prepareStatement("delete pacientes where id_paciente=?)");
     pst.setInt(1, id);
     pst.executeUpdate();
 }
 
}
