/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_CitasMedicas;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanm
 */
public class GestorMedicos_Control implements ActionListener {
 Modelo_CitasMedicas.Gestor_Medicos medicosModelo;
 Vista_CitasMedicas.ConsultaMedico consultarMedicosVista;
 
 public GestorMedicos_Control(Vista_CitasMedicas.ConsultaMedico consultarMedicosVista)
{
 this.consultarMedicosVista = consultarMedicosVista;
 medicosModelo = new Modelo_CitasMedicas.Gestor_Medicos();
 }
 
 public void actionPerformed(ActionEvent e){


 DefaultTableModel tmodelo;
 String valor= consultarMedicosVista.txt_valor.getText();
 int parametro=0;

 if(consultarMedicosVista.rdb_identificacion.isSelected()){
 parametro=1;
 }
 if(consultarMedicosVista.rdb_nombres.isSelected()){
 parametro=2;
 }
 if(consultarMedicosVista.rdb_apellidos.isSelected()){
 parametro=3;
 }
 if(consultarMedicosVista.rdb_generoM.isSelected()){
 parametro=4;
 }
 if(consultarMedicosVista.rdb_cargomedico.isSelected()){
 parametro=5;
 }

 LinkedList<Modelo_CitasMedicas.Medicos>
 medicos = medicosModelo.getMedicosbyParametro(parametro, valor);
 String registro[]=new String[5];

 String[]Titulos = {"Identificacion","Nombre","Apellidos","Genero","Cargo Medico"};

 tmodelo=new DefaultTableModel();
 tmodelo.setColumnIdentifiers(Titulos);

 for(Modelo_CitasMedicas.Medicos p:medicos){
    registro[0]=p.getIdentificacion();
    registro[1]=p.getNombres();
    registro[2]=p.getApellidos();
    registro[3]=p.getGenero();
    registro[4]=p.getCargoMedico();
 tmodelo.addRow(registro);
 }

 consultarMedicosVista.tbl_datosM.setModel(tmodelo);
 }

    
}
