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
 * @author Dario
 */
public class Provedor {
    private int id_proveedor;
    private String nombre_proveedor;
    private String direccion;
    private String contacto;
    private String ciudad;
    private String telefono;
    private String celular;
    public Provedor() {   
}
    public void Provedor(int id_proveedor, String nombre_proveedor, String direccion, String contacto,String ciudad,String telefono, String celular) {
        
        this.id_proveedor=id_proveedor;
        this.nombre_proveedor=nombre_proveedor;
        this.direccion=direccion;
        this.contacto=contacto;
        this.ciudad=ciudad;
        this.telefono=telefono;
        this.celular=celular;
}
    public int getid_proveedor(){
        return id_proveedor;
    }
     public void setid_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getnombre_proveedor() {
        return nombre_proveedor;
    }

    public void setnombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
   
         }

    public String getcontacto() {
        return contacto;
    }

    public void setcontacto(String contacto) {
        this.contacto = contacto;
    }

    public String getciudad() {
        return ciudad;
    }

    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
        }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
        
        }

    public String getcelular() {
        return celular;
    }

    public void setcelular(String celular) {
        this.celular = celular;
}
}