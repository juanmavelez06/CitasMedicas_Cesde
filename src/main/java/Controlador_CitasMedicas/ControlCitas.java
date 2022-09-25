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
public class ControlCitas implements ActionListener {
   Vista_CitasMedicas.Solicitar_Cita citasVista;
   Modelo_CitasMedicas.Citas citasModelo;
   Modelo_CitasMedicas.Gestor_Citas gestorcitasModelo;
   
 public ControlCitas (Vista_CitasMedicas.Solicitar_Cita citasVista){
 this.citasVista = citasVista;
 gestorcitasModelo = new Modelo_CitasMedicas.Gestor_Citas();
 }
 @Override
 public void actionPerformed(ActionEvent e){
 if(e.getSource().equals(citasVista.Solicitar)){
 String Identificacion = citasVista.txt_identificacionC.getText();
 String Nombres = citasVista.txt_nombreC.getText();
 String Apellidos = citasVista.txt_apellidosC.getText();
 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 String FechaNacimiento = formato.format(citasVista.Dtd_fecha_nacimientoC.getDate());
 String FechadeCita = formato.format(citasVista.Dtd_fecha_cita.getDate());
 String Genero="";
 if(citasVista.rdb_masculinoC.isSelected()){
 Genero="M";
 }
 if(citasVista.rdb_femeninoC.isSelected()){
 Genero="F";
 }
 citasModelo = new Modelo_CitasMedicas.Citas(Identificacion,Nombres,Apellidos,FechaNacimiento,FechadeCita,Genero);
 gestorcitasModelo.RegistrarCitas(citasModelo);
 }
 if(e.getSource().equals(citasVista.NuevoC)){
 citasVista.txt_identificacionC.setText("");
 citasVista.txt_nombreC.setText("");
 citasVista.txt_apellidosC.setText("");
 citasVista.Dtd_fecha_nacimientoC.setDate(null);
 citasVista.Dtd_fecha_cita.setDate(null);
 citasVista.rdb_masculinoC.setSelected(true);
 citasVista.rdb_femeninoC.setSelected(false);
 citasVista.txt_identificacionC.requestFocus();
 }
 }
    
}
