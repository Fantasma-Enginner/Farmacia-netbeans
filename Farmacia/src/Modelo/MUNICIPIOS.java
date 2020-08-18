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
public class MUNICIPIOS {
    private String cod_departamento;
    private String cod_municipio;
    private String nom_municipio;

    public MUNICIPIOS() {
    }

    public MUNICIPIOS(String cod_departamento, String cod_municipio, String nom_municipio) {
        this.cod_departamento = cod_departamento;
        this.cod_municipio = cod_municipio;
        this.nom_municipio = nom_municipio;
    }
    
    public void setTodos(String cod_municipio) {
        this.cod_municipio = cod_municipio;
    }
    
    public String getCod_departamento() {
        return cod_departamento;
    }

    public void setCod_departamento(String cod_departamento) {
        this.cod_departamento = cod_departamento;
    }

    public String getCod_municipio() {
        return cod_municipio;
    }

    public void setCod_municipio(String cod_municipio) {
        this.cod_municipio = cod_municipio;
    }

    public String getNom_municipio() {
        return nom_municipio;
    }

    public void setNom_municipio(String nom_municipio) {
        this.nom_municipio = nom_municipio;
    }
    
    @Override
    public String toString() {
        return this.nom_municipio;
    }
    
    public DefaultComboBoxModel LLENARCOMBO(Connection con, String dep) {
        /*
         * Lo primero que hacemos es instanciar un DefaultComboModel, que es el modelo del combo, el cual vamos 
         * a llenar con los datos y luego asignarlo al JComboBox.
         */
        DefaultComboBoxModel combomodelo = new DefaultComboBoxModel();
        try {
            PreparedStatement consulta = con.prepareStatement("SELECT * FROM municipios WHERE codigo = '" + dep + "' ORDER BY cod_municipio ASC");
            ResultSet r = consulta.executeQuery();
            /*
             * Luego recorremos los resultados de la consulta y vamos asignando al combo el contenido de la columna 
             * (o campo) "nombre" Utilizamos el metodo addElement del DefaultComboModel que creamos, al cual le pasamos 
             * como parametro lo que nos devuelve el metodo getObject del resulset
             */
            combomodelo.addElement("");
            while (r.next()) {
                combomodelo.addElement(new MUNICIPIOS(r.getString(1), r.getString(2),r.getString(3)));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return combomodelo;
    }
    
//    public LinkedList<PAR_MUNICIPIOS> BuscarTodos(Connection con, String dep) throws SQLException {
//        LinkedList<PAR_MUNICIPIOS> searchResults = new LinkedList<>();
//        ResultSet result = null;
//        PreparedStatement stmt = null;
//
//        try {
//            stmt = con.prepareStatement("SELECT * FROM par_municipios WHERE cod_departamento = '" + dep + "' ORDER BY cod_municipio ASC");
//            result = stmt.executeQuery();
//            while (result.next()) {
//                MUNICIPIOS temp = new MUNICIPIOS();
//                temp.setCod_departamento(result.getString(1));
//                temp.setCod_municipio(result.getString(2));
//                temp.setNom_municipio(result.getString(3));
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
//        return (LinkedList<PAR_MUNICIPIOS>) searchResults;
//    }
}
