/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista_CitasMedicas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanm
 */
public class ConsultaMedico extends javax.swing.JInternalFrame {
    public Controlador_CitasMedicas.GestorMedicos_Control GestorMedicoControl;
    private DefaultTableModel tabla;

    /**
     * Creates new form ConsultaMedico
     */
    public ConsultaMedico() {
        initComponents();
        GestorMedicoControl = new Controlador_CitasMedicas.GestorMedicos_Control(this);
        String TitulosTabla[]={"N°_Identificacion" , "Nombres", "Apellidos", "Genero","Cargo Medico"};
        tabla = new DefaultTableModel (null, TitulosTabla);
        tbl_datosM.setModel(tabla);
        btn_buscar.addActionListener(GestorMedicoControl);
        buttonGroup1.add(rdb_identificacion);
        buttonGroup1.add(rdb_nombres);
        buttonGroup1.add(rdb_apellidos);
        buttonGroup1.add(rdb_generoM);
        buttonGroup1.add(rdb_cargomedico);
    }
    
     public DefaultTableModel getTableModel(){
        return tabla;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rdb_identificacion = new javax.swing.JRadioButton();
        rdb_nombres = new javax.swing.JRadioButton();
        rdb_apellidos = new javax.swing.JRadioButton();
        rdb_generoM = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        CerrarM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datosM = new javax.swing.JTable();
        rdb_cargomedico = new javax.swing.JRadioButton();

        setTitle("Consultar Medico");

        rdb_identificacion.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        rdb_identificacion.setText("N°_Identificación");

        rdb_nombres.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        rdb_nombres.setText("Nombres");

        rdb_apellidos.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        rdb_apellidos.setText("Apellidos");

        rdb_generoM.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        rdb_generoM.setText("Genero");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Filtro de Busqueda ");

        txt_valor.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        btn_buscar.setBackground(new java.awt.Color(14, 242, 242));
        btn_buscar.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btn_buscar.setText("Buscar");

        CerrarM.setBackground(new java.awt.Color(14, 242, 242));
        CerrarM.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        CerrarM.setText("Cerrar");

        tbl_datosM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_datosM);

        rdb_cargomedico.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        rdb_cargomedico.setText("Cargo Medico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rdb_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CerrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_valor)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(rdb_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdb_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rdb_generoM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdb_cargomedico, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_identificacion)
                    .addComponent(rdb_nombres)
                    .addComponent(rdb_apellidos)
                    .addComponent(rdb_generoM)
                    .addComponent(rdb_cargomedico))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CerrarM)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CerrarM;
    public javax.swing.JButton btn_buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdb_apellidos;
    public javax.swing.JRadioButton rdb_cargomedico;
    public javax.swing.JRadioButton rdb_generoM;
    public javax.swing.JRadioButton rdb_identificacion;
    public javax.swing.JRadioButton rdb_nombres;
    public javax.swing.JTable tbl_datosM;
    public javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
