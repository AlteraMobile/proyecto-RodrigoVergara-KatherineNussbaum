
package gui;

import persistencia.LlenadoComboBox;

/**
 * Panel jPanelIngresoVehiculo
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 2.0 ==> 05-05-2016 
 */
public class jPanelIngresoVehiculo extends javax.swing.JPanel {

    /**
     * Constructor del Panel jPanelIngresoVehiculo
     */
    public jPanelIngresoVehiculo() {
        initComponents();
        cbbxMarca.removeAll();
        cbbxColor.removeAll();
        new LlenadoComboBox().cargaComboBoxColor(cbbxColor);
        new LlenadoComboBox().cargaComboBoxMarca(cbbxMarca);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbtnGrupoTipo = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblChasis = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPuertas = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblPatente = new javax.swing.JLabel();
        cbbxMarca = new javax.swing.JComboBox<>();
        cbbxColor = new javax.swing.JComboBox<>();
        txtChasis = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPuertas = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        rdbtnUsado = new javax.swing.JRadioButton();
        rdbtnNuevo = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();

        lblTitulo.setText("Ingreso Automovil");

        lblMarca.setText("Marca:");

        lblChasis.setText("Chasis:");

        lblColor.setText("Color:");

        lblAnio.setText("Año:");

        lblModelo.setText("Modelo:");

        lblPuertas.setText("Puertas:");

        lblTipo.setText("Tipo:");

        lblPatente.setText("Patente:");

        rdbtnGrupoTipo.add(rdbtnUsado);
        rdbtnUsado.setText("Usado");

        rdbtnGrupoTipo.add(rdbtnNuevo);
        rdbtnNuevo.setText("Nuevo");

        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnio)
                    .addComponent(lblTitulo))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChasis)
                            .addComponent(lblMarca)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblColor)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbxMarca, 0, 150, Short.MAX_VALUE)
                            .addComponent(txtChasis)
                            .addComponent(cbbxColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(lblPuertas)
                            .addComponent(lblTipo))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbtnUsado)
                                .addGap(18, 18, 18)
                                .addComponent(rdbtnNuevo))
                            .addComponent(txtPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatente)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPatente, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(cbbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatente)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChasis)
                    .addComponent(txtChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuertas)
                    .addComponent(txtPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(cbbxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo)
                    .addComponent(rdbtnUsado)
                    .addComponent(rdbtnNuevo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbbxColor;
    private javax.swing.JComboBox<String> cbbxMarca;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblChasis;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JLabel lblPuertas;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.ButtonGroup rdbtnGrupoTipo;
    private javax.swing.JRadioButton rdbtnNuevo;
    private javax.swing.JRadioButton rdbtnUsado;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPuertas;
    // End of variables declaration//GEN-END:variables
}
