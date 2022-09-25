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
public class ControlMedicos implements ActionListener {
   Vista_CitasMedicas.RegistroMedico medicosVista;
   Modelo_CitasMedicas.Medicos medicosModelo;
   Modelo_CitasMedicas.Gestor_Medicos gestormedicosModelo;
   
 public ControlMedicos (Vista_CitasMedicas.RegistroMedico medicosVista){
 this.medicosVista = medicosVista;
 gestormedicosModelo = new Modelo_CitasMedicas.Gestor_Medicos();
 }
 @Override
 public void actionPerformed(ActionEvent e)
 {
 if(e.getSource().equals(medicosVista.RegistrarM))
 {
 String Identificacion = medicosVista.txt_identificacionM.getText();
 String Nombres = medicosVista.txt_nombresM.getText();
 String Apellidos = medicosVista.txt_apellidosM.getText();
 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 String FechaNacimiento = formato.format(medicosVista.Dtd_fecha_nacimientoM.getDate());
 String CargoMedico = medicosVista.txt_cargomedicoM.getText();
 String Genero="";
 if(medicosVista.rdb_masculinoM.isSelected()){
 Genero="M";
 }
 if(medicosVista.rdb_femeninoM.isSelected()){
 Genero="F";
 }
medicosModelo = new Modelo_CitasMedicas.Medicos(Identificacion,Nombres,Apellidos,FechaNacimiento,CargoMedico,Genero);
gestormedicosModelo.RegistrarMedicos(medicosModelo);
 }
 if(e.getSource().equals(medicosVista.NuevoM)){
 medicosVista.txt_identificacionM.setText("");
 medicosVista.txt_nombresM.setText("");
 medicosVista.txt_apellidosM.setText("");
 medicosVista.txt_cargomedicoM.setText("");
 medicosVista.Dtd_fecha_nacimientoM.setDate(null);
 medicosVista.rdb_masculinoM.setSelected(true);
 medicosVista.rdb_femeninoM.setSelected(false);
 medicosVista.txt_identificacionM.requestFocus();
 }
 }

    
}
