package es.seas.unidad3.ejemplo.fastfoodcompany.clientes.acciones;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelBajaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.principal.Conexion;

/**
 * Clase que realiza las acciones asociadas al panel de baja. El alumno deberá
 * completar la clase de cara al ejercicio feedback.
 *
 * @author
 */
public class AccionesBajaClientes {

    private PanelBajaClientes panel;

    public AccionesBajaClientes(PanelBajaClientes panel) {
        this.panel = panel;
    }

    public void eliminarCliente(String nombreCliente, String apellidoCliente) {
        Conexion conexion = new Conexion();
        conexion.connect();
        conexion.deletePreparedStatement(nombreCliente, apellidoCliente);
    }
}
