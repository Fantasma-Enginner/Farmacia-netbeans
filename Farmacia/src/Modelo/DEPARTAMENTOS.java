package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fantasma-Enginner
 */
public class DEPARTAMENTOS {
    private String cod_departamento;
    private String nom_departamento;

    public DEPARTAMENTOS() {
    }

    public DEPARTAMENTOS(String cod_departamento, String nom_departamento) {
        this.cod_departamento = cod_departamento;
        this.nom_departamento = nom_departamento;
    }

    public String getCod_departamento() {
        return cod_departamento;
    }

    public void setCod_departamento(String cod_departamento) {
        this.cod_departamento = cod_departamento;
    }

    public String getNom_departamento() {
        return nom_departamento;
    }

    public void setNom_departamento(String nom_departamento) {
        this.nom_departamento = nom_departamento;
    }
    
    @Override
    public String toString() {
        return this.nom_departamento;
    }
    
    public DefaultComboBoxModel LLENARCOMBO(Connection con) {
        /*
         * Lo primero que hacemos es instanciar un DefaultComboModel, que es el modelo del combo, el cual vamos 
         * a llenar con los datos y luego asignarlo al JComboBox.
         */
        DefaultComboBoxModel combomodelo = new DefaultComboBoxModel();
        try {
            PreparedStatement consulta = con.prepareStatement("SELECT * FROM departamento ORDER BY codigo ASC");
            ResultSet r = consulta.executeQuery();
            /*
             * Luego recorremos los resultados de la consulta y vamos asignando al combo el contenido de la columna 
             * (o campo) "nombre" Utilizamos el metodo addElement del DefaultComboModel que creamos, al cual le pasamos 
             * como parametro lo que nos devuelve el metodo getObject del resulset
             */
            combomodelo.addElement("");
            while (r.next()) {
                combomodelo.addElement(new DEPARTAMENTOS(r.getString(1), r.getString(2)));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return combomodelo;
    }
//    
//    public LinkedList<PAR_DEPARTAMENTOS> BuscarTodos(Connection con) throws SQLException {
//        LinkedList<PAR_DEPARTAMENTOS> searchResults = new LinkedList<>();
//        ResultSet result = null;
//        PreparedStatement stmt = null;
//
//        try {
//            stmt = con.prepareStatement("SELECT * FROM par_departamentos ORDER BY cod_departamento ASC");
//            result = stmt.executeQuery();
//
//            while (result.next()) {
//                DEPARTAMENTOS temp = new DEPARTAMENTOS();
//                temp.setCod_departamento(result.getString(1));
//                temp.setNom_departamento(result.getString(2));
//                searchResults.add(temp);
//            }
//        } finally {
//            if (result != null) {
//                result.close();
//            }
//            if (stmt != null) {
//                stmt.close();
//            }
//        }
//        return (LinkedList<PAR_DEPARTAMENTOS>) searchResults;
//    }
}
