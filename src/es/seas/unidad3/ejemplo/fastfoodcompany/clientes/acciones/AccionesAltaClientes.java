package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelAltaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.principal.Conexion;
import java.util.ArrayList;

/**
 * Clase que realiza las acciones asociadas al panel de alta.
 *
 * @author
 */
public class AccionesAltaClientes {

    private PanelAltaClientes panel;
    public ArrayList filaCliente = new ArrayList();

    /**
     * Constructor de la clase.
     *
     * @param panel PanelAltaClientes del que deberá manejar los eventos.
     */
    public AccionesAltaClientes(PanelAltaClientes panel) {
        this.panel = panel;
    }

    /**
     * Método que recupera los valores del formulario y los guarda en la
     * estructura de almacenamiento propuesta y existente en el frame.
     */
    public boolean guardarCliente() {

        String nombre = panel.getTxtNombre().getText();
        String apellido_1 = panel.getTxtApellido1().getText();
        String apellido_2 = panel.getTxtApellido2().getText();
        Conexion conexion = new Conexion();
        conexion.connect();
        conexion.insertaPreparedStatement(0, nombre, apellido_1, apellido_2);
        panel.getTxtNombre().setText("");
        panel.getTxtApellido1().setText("");
        panel.getTxtApellido2().setText("");

        return true;
    }
}
