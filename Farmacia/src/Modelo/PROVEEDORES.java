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
 * @author Fantasma-Enginner
 */
public class PROVEEDORES {
   private int id_proveedor;
    private String nombre_proveedor;
    private String direccion;
    private String contacto;
    private String ciudad;
    private String telefono;
    private String celular;
      
    public PROVEEDORES() {     
}
    public void PROVEEDORES(int id_proveedor, String nombre_proveedor, String direccion, String contacto,String ciudad,String telefono, String celular) {
        
        this.setId_proveedor(id_proveedor);
        this.setNombre_proveedor(nombre_proveedor);
        this.setDireccion(direccion);
        this.setContacto(contacto);
        this.setCiudad(ciudad);
        this.setTelefono(telefono);
        this.setCelular(celular);
        
}

    /**
     * @return the id_proveedor
     */
    public int getId_proveedor() {
        return id_proveedor;
    }

    /**
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    /**
     * @return the nombre_proveedor
     */
    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    /**
     * @param nombre_proveedor the nombre_proveedor to set
     */
    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
     public synchronized void INSERT_PROVEEDORES(Connection con) throws SQLException{
        PreparedStatement pst = con.prepareStatement("INSERT INTO PROVEEDOR VALUES (?,?,?,?,?,?,?)");
        pst.setInt(1, getId_proveedor());
        pst.setString(2, getNombre_proveedor());
        pst.setString(3, getDireccion());
        pst.setString(4, getContacto());
        pst.setString(5, getCiudad());
        pst.setString(6, getTelefono());
        pst.setString(7, getCelular());
        pst.executeUpdate();
}
      public synchronized void UPDATE_PROVEEDORES(Connection con, String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("UPDATE PROVEEDOR SET  Id_proveedor= ?, Nombre_proveedor = ?,Direccion = ?,Contacto= ?, Ciudad = ?,Telefono=?,Ciudad = ?,Celular = ? WHERE Id_proveedor = '"+id+"'");
        pst.setInt(1, getId_proveedor());
        pst.setString(2, getNombre_proveedor());
        pst.setString(3, getDireccion());
        pst.setString(4, getContacto());
        pst.setString(5, getCiudad());
        pst.setString(6, getTelefono());
        pst.setString(7, getCelular());
        pst.executeUpdate();
}
       public synchronized void DELETE_PROVEEDORES(Connection con, String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("DELETE FROM PROVEEDOR WHERE Id_proveedor = ?");
        pst.setString(1, id);
        pst.executeUpdate();
}
        public DefaultTableModel CARGAR_PROVEEDORES(Connection con) {
        DefaultTableModel tablamodelo = new DefaultTableModel(null, new Object[]{"Código", "Nombre","Direccion","Contacto","Ciudad","Telefono","Celular"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
    }
        };
        try {
            PreparedStatement consulta = con.prepareStatement("SELECT id_proveedor,nombre_proveedor,direccion,contacto,ciudad,telefono,celular FROM proveedor");
                                                              
            ResultSet readline = consulta.executeQuery();
            while (readline.next()) {
                tablamodelo.addRow(new Object[]{readline.getString("id_proveedor"),
                                                readline.getString("nombre_proveedor"),
                                                readline.getString("direccion"),
                                                readline.getString("contacto"),
                                                readline.getString("ciudad"),
                                                readline.getString("telefono"),
                                                readline.getString("celular")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return tablamodelo;
    }

}          