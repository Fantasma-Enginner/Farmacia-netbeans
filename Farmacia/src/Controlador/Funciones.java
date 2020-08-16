package Controlador;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author LUIS LOPEZ LOPEZ
 */
public class Funciones {
    
    public void LimpiarText(JPanel panel) {
        Component[] comp = new Component[panel.getComponentCount()];
        comp = panel.getComponents();
        JTextField text;
        JPasswordField pass;
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (comp[i].getClass().getName().equals("javax.swing.JTextField")) {
                text = (JTextField) comp[i];
                text.setText("");
            }
        }
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (comp[i].getClass().getName().equals("javax.swing.JPasswordField")) {
                pass = (JPasswordField) comp[i];
                pass.setText("");

            }
        }
    }
    
    public void LimpiarCombox(JPanel panel) {
        Component[] comp = new Component[panel.getComponentCount()];
        comp = panel.getComponents();
        JComboBox COMBO;
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (comp[i].getClass().getName().equals("javax.swing.JComboBox")) {
                COMBO = (JComboBox) comp[i];
                COMBO.setSelectedItem("");
            }
        }

    }
    
    public void PasarTextAText(java.awt.event.KeyEvent evt, JTextField Actual, JTextField Siguiente, String Mensaje) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, Mensaje);
                    Actual.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    
    public void PasarTextATextt(java.awt.event.KeyEvent evt, JTextField Actual, JTextField Siguiente) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getText().equals("")) {
                    Siguiente.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    
    public void PasarTextACombo(java.awt.event.KeyEvent evt, JTextField Actual, JComboBox Siguiente, String Mensaje) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, Mensaje);
                    Actual.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    
    public void PasarTextAComboo(java.awt.event.KeyEvent evt, JTextField Actual, JComboBox Siguiente) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getText().equals("")) {
                    Siguiente.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    
    public void PasarComboACombo(java.awt.event.KeyEvent evt, JComboBox Actual, JComboBox Siguiente, String Mensaje) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, Mensaje);
                    Actual.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    
    public void PasarComboAText(java.awt.event.KeyEvent evt, JComboBox Actual, JTextField Siguiente, String Mensaje) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, Mensaje);
                    Actual.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    
    public void PasarComboAButtun(java.awt.event.KeyEvent evt, JComboBox Actual, JButton Siguiente, String Mensaje) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, Mensaje);
                    Actual.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    public void PasarTextAButtun(java.awt.event.KeyEvent evt, JTextField Actual, JButton Siguiente, String Mensaje) {
        if (evt.getSource().equals(Actual)) {
            if (evt.getKeyCode() == 10) {
                if (Actual.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, Mensaje);
                    Actual.grabFocus();
                } else {
                    Siguiente.setEnabled(true);
                    Siguiente.grabFocus();
                }
            }
        }
    }
    
    public void SoloNumeros(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }
    
    public void CantidadDigitos(java.awt.event.KeyEvent evt, JTextField Actual, int cant) {
        char car = evt.getKeyChar();
        if (Actual.getText().length() >= cant && (car != ' ')) {
            evt.consume();  // ignorar el evento de teclado
        }
    }
    
    public void SoloLetras(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if ((!Character.isLetter(car)) && (car != ' ')) {
            evt.consume();
        }
    }
    
}
