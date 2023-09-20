package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelEditaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.principal.Conexion;

/**
 * Clase que realiza las acciones asociadas al panel de edición. El alumno
 * deberá completar la clase de cara al ejercicio feedback.
 *
 * @author
 */
public class AccionesEditaClientes {

    private PanelEditaClientes panel;

    public AccionesEditaClientes(PanelEditaClientes panel) {
        this.panel = panel;
    }

    public boolean editarCliente(String nombreEditar, String apellidoEditar) {

        String nombre = panel.getTxtNombre().getText();
        String apellido_1 = panel.getTxtApellido1().getText();
        String apellido_2 = panel.getTxtApellido2().getText();
        Conexion conexion = new Conexion();
        conexion.connect();

        int id = conexion.getCliente(nombreEditar, apellidoEditar);

        System.out.println(id);
        conexion.editaPreparedStatement(nombre, apellido_1, apellido_2, id);

        panel.getTxtNombre().setText("");
        panel.getTxtApellido1().setText("");
        panel.getTxtApellido2().setText("");

        return true;
    }
}
