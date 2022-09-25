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
public class GestorPaciente_Control  implements ActionListener {
 Modelo_CitasMedicas.Gestor_Pacientes pacientesModelo;
 Vista_CitasMedicas.ConsultarPaciente consultarPacienteVista;

 public GestorPaciente_Control(Vista_CitasMedicas.ConsultarPaciente consultarPacienteVista)
{
 this.consultarPacienteVista = consultarPacienteVista;
 pacientesModelo = new Modelo_CitasMedicas.Gestor_Pacientes();
 }

 public void actionPerformed(ActionEvent e){


 DefaultTableModel tmodelo;
 String valor=consultarPacienteVista.txt_valor.getText();
 int parametro=0;

 if(consultarPacienteVista.rdb_identificacion.isSelected()){
 parametro=1;
 }
 if(consultarPacienteVista.rdb_nombres.isSelected()){
 parametro=2;
 }
 if(consultarPacienteVista.rdb_apellidos.isSelected()){
 parametro=3;
 }
 if(consultarPacienteVista.rdb_genero.isSelected()){
 parametro=4;
 }

 LinkedList<Modelo_CitasMedicas.Pacientes>
 pacientes = pacientesModelo.getPacientesbyParametro(parametro, valor);
 String registro[]=new String[5];

 String[]Titulos = {"Identificacion","Nombre","Apellidos","Fecha Nacimiento","Genero"};

 tmodelo=new DefaultTableModel();
 tmodelo.setColumnIdentifiers(Titulos);

 for(Modelo_CitasMedicas.Pacientes p:pacientes){
    registro[0]=p.getIdentificacionPaciente();
    registro[1]=p.getNombresPaciente();
    registro[2]=p.getApellidosPaciente();
    registro[3]=p.getFechaNacimiento();
    registro[4]=p.getGenero();
 tmodelo.addRow(registro);
 }

 consultarPacienteVista.Tbl_datosP.setModel(tmodelo);
 }
}