/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_CitasMedicas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

/**
 *
 * @author juanm
 */
public class ControlPacientes implements ActionListener {
   Vista_CitasMedicas.Registro pacientesVista;
   Modelo_CitasMedicas.Pacientes pacientesModelo;
   Modelo_CitasMedicas.Gestor_Pacientes gestorpacienteModelo;
   
public ControlPacientes(Vista_CitasMedicas.Registro pacientesVista){
 this.pacientesVista = pacientesVista;
 gestorpacienteModelo = new Modelo_CitasMedicas.Gestor_Pacientes();
 }
 @Override
 public void actionPerformed(ActionEvent e){
 if(e.getSource().equals(pacientesVista.Registrar)){
 String Identificacion = pacientesVista.txt_identificacion.getText();
 String Nombres = pacientesVista.txt_nombres.getText();
 String Apellidos = pacientesVista.txt_apellidos.getText();
 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 String Fecha_Nacimiento = formato.format(pacientesVista.Dtd_fecha_nacimiento.getDate());
 String Genero="";
 if(pacientesVista.rdb_masculino.isSelected()){
 Genero="M";
 }
 if(pacientesVista.rdb_femenino.isSelected()){
 Genero="F";
 }
 pacientesModelo = new Modelo_CitasMedicas.Pacientes(Identificacion,Nombres,Apellidos,Fecha_Nacimiento,Genero);
 gestorpacienteModelo.RegistrarPacientes(pacientesModelo);
 }
 if(e.getSource().equals(pacientesVista.Nuevo)){
 pacientesVista.txt_identificacion.setText("");
 pacientesVista.txt_nombres.setText("");
 pacientesVista.txt_apellidos.setText("");
 pacientesVista.Dtd_fecha_nacimiento.setDate(null);
 pacientesVista.rdb_masculino.setSelected(true);
 pacientesVista.rdb_femenino.setSelected(false);
 pacientesVista.txt_identificacion.requestFocus();
 }
 }
} 

