package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUIS LOPEZ LOPEZ
 */
public class PACIENTES extends MUNICIPIOS{
    private String nro_documento;
    private String Nombres;
    private String apellidos;
    private Date Fecha_nac;
    private String zona;
    private String direccion;
    private String Fijo;
    private String Movil;
    private String Genero;

    public PACIENTES() {
    }

    public void setTodos(String nro_documento, String Nombres, String apellidos, String cod_municipio, Date Fecha_nac, String zona, String direccion, String Fijo, String Movil, String Genero) {
        super.setTodos(cod_municipio);
        this.nro_documento = nro_documento;
        this.Nombres = Nombres;
        this.apellidos = apellidos;
        this.Fecha_nac = Fecha_nac;
        this.zona = zona;
        this.direccion = direccion;
        this.Fijo = Fijo;
        this.Movil = Movil;
        this.Genero = Genero;
    }



    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nac() {
        return Fecha_nac;
    }

    public void setFecha_nac(Date Fecha_nac) {
        this.Fecha_nac = Fecha_nac;
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
        return Fijo;
    }

    public void setFijo(String Fijo) {
        this.Fijo = Fijo;
    }

    public String getMovil() {
        return Movil;
    }

    public void setMovil(String Movil) {
        this.Movil = Movil;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    public synchronized void INSERT_PACIENTES(Connection con) throws SQLException{
        PreparedStatement pst = con.prepareStatement("INSERT INTO pacientes VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        pst.setString(1, getNro_documento());
        pst.setString(2, getNombres());
        pst.setString(3, getApellidos());
        pst.setString(4, getCod_municipio());
        pst.setTimestamp(5, new Timestamp(getFecha_nac().getTime()));
        pst.setString(6, getZona());
        pst.setString(7, getDireccion());
        pst.setString(8, getFijo());
        pst.setString(9, getMovil());
        pst.setString(10, getGenero());
        pst.executeUpdate();
    }
    
    public synchronized void UPDATE_PACIENTES(Connection con, String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("UPDATE pacientes SET nro_documento = ?, Nombres = ?, apellidos = ?, cod_municipio = ?, Fecha_nac = ?, zona = ?, direccion = ?, Fijo = ?, Movil = ?, Genero = ? WHERE nro_documento = '"+id+"'");
        pst.setString(1, getNro_documento());
        pst.setString(2, getNombres());
        pst.setString(3, getApellidos());
        pst.setString(4, getCod_municipio());
        pst.setTimestamp(5, new Timestamp(getFecha_nac().getTime()));
        pst.setString(6, getZona());
        pst.setString(7, getDireccion());
        pst.setString(8, getFijo());
        pst.setString(9, getMovil());
        pst.setString(10, getGenero());
        pst.executeUpdate();
    }
    
    public synchronized void DELETE_PACIENTES(Connection con, String id) throws SQLException {
        PreparedStatement pst = con.prepareStatement("DELETE FROM pacientes WHERE nro_documento = ?");
        pst.setString(1, id);
        pst.executeUpdate();
    }
    
    public DefaultTableModel CARGAR_PACIENTES(Connection con) {
        DefaultTableModel tablamodelo = new DefaultTableModel(null, new Object[]{"Identificación", "Nombre", "Nombre", "Apellidos", "De_Codigo", "De_Nombre", "Mu_Codigo", "Mu_Nombre", "Fecha", "Zona", "Dirección", "Fijo", "Movil", "Genero"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        try {
            PreparedStatement consulta = con.prepareStatement("SELECT p.nro_documento, CONCAT(Nombres,' ',apellidos) 'Nombre', Nombres, apellidos, d.codigo, d.nombre, m.cod_municipio, m.nombre, Fecha_nac, " +
                                                              "zona, direccion, Fijo, Movil, Genero " +
                                                              "FROM pacientes p, municipios m, departamento d " +
                                                              "WHERE p.cod_municipio = m.cod_municipio AND m.codigo = d.codigo");
            ResultSet readline = consulta.executeQuery();
            while (readline.next()) {
                tablamodelo.addRow(new Object[]{readline.getString("nro_documento"),
                                                readline.getString("Nombre"),
                                                readline.getString("Nombres"),
                                                readline.getString("apellidos"),
                                                readline.getString("codigo"),
                                                readline.getString("nombre"),
                                                readline.getString("cod_municipio"),
                                                readline.getString("m.nombre"),
                                                readline.getDate("Fecha_nac"),
                                                readline.getString("zona"),
                                                readline.getString("direccion"),
                                                readline.getString("Fijo"),
                                                readline.getString("Movil"),
                                                readline.getString("Genero")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return tablamodelo;
    }
}
