package es.seas.unidad3.ejemplo.fastfoodcompany.principal;

import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelAltaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelBajaClientes;
import es.seas.unidad3.ejemplo.fastfoodcompany.clientes.vistas.PanelEditaClientes;
import java.util.ArrayList;

/**
 * Clase con la ventana principal de la aplicación. El alumno deberá completar
 * la clase de cara al ejercicio feedback.
 *
 * @author
 */
public class FastFoodCompanyFrame extends javax.swing.JFrame {

    private ArrayList clientesGuardados = new ArrayList();

    /**
     * Constructor del FastFoodCompanyFrame
     */
    public FastFoodCompanyFrame() {

        initComponents();

    }

    /**
     * Getter de la estructura de almacenamiento de datos.
     *
     * @return ArrayList clientesGuardados.
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        mnuBarra = new javax.swing.JMenuBar();
        mnuClientes = new javax.swing.JMenu();
        mnuAltaCliente = new javax.swing.JMenuItem();
        mnuEditaCliente = new javax.swing.JMenuItem();
        mnuBajaCliente = new javax.swing.JMenuItem();
        mnuEmpleados = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenedor.setMinimumSize(new java.awt.Dimension(600, 600));
        panelContenedor.setPreferredSize(new java.awt.Dimension(600, 600));
        panelContenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelContenedor, java.awt.BorderLayout.CENTER);

        mnuClientes.setText("Clientes");

        mnuAltaCliente.setText("Alta cliente");
        mnuAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(mnuAltaCliente);

        mnuEditaCliente.setText("Editar cliente");
        mnuEditaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditaClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(mnuEditaCliente);

        mnuBajaCliente.setText("Baja cliente");
        mnuBajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(mnuBajaCliente);

        mnuBarra.add(mnuClientes);

        mnuEmpleados.setText("Empleados");
        mnuBarra.add(mnuEmpleados);

        setJMenuBar(mnuBarra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaClienteActionPerformed
        panelContenedor.removeAll();
        PanelAltaClientes altaClientes = new PanelAltaClientes(this);
        panelContenedor.add(altaClientes, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-LAST:event_mnuAltaClienteActionPerformed

    private void mnuBajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBajaClienteActionPerformed
        panelContenedor.removeAll();
        PanelBajaClientes bajaClientes = new PanelBajaClientes();
        panelContenedor.add(bajaClientes, java.awt.BorderLayout.CENTER);
        pack();

    }//GEN-LAST:event_mnuBajaClienteActionPerformed

    private void mnuEditaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditaClienteActionPerformed
        panelContenedor.removeAll();
        PanelEditaClientes editaClientes = new PanelEditaClientes();
        panelContenedor.add(editaClientes, java.awt.BorderLayout.CENTER);
        pack();
    }//GEN-LAST:event_mnuEditaClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem mnuAltaCliente;
    private javax.swing.JMenuItem mnuBajaCliente;
    private javax.swing.JMenuBar mnuBarra;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenuItem mnuEditaCliente;
    private javax.swing.JMenu mnuEmpleados;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
