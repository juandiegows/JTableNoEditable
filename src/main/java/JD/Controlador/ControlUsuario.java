/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JD.Controlador;

import JD.Modelo.Usuario;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sain
 */
public class ControlUsuario {

    private static Vector<Usuario> listaUsuarios = new Vector<>();

    //creamos un metodo que nos permitira agregar un usuario mas a la lista de usuario (listaUsuario)
    /**
     * @param nit
     * @param nombre
     * @param apellido
     * @param edad Crea y agrega un nuevo usuario al vector
     */
    public void ingresar(String nit, String nombre, String apellido, int edad) {
        // agregamos el usuario al vector
        listaUsuarios.add(new Usuario(nit, nombre, apellido, edad));

    }

    ;
    
    
public void llenarTabla(JTable table) {
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }

        };

        modelo.addColumn("Nit");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");

        Object[] datos = new Object[4];

        for (Usuario usuario : listaUsuarios) {
            datos[0] = usuario.getNit();
            datos[1] = usuario.getNombre();
            datos[2] = usuario.getApellido();
            datos[3] = usuario.getEdad();
            
            modelo.addRow(datos);

        }
        table.setModel(modelo);
    }
;
}
