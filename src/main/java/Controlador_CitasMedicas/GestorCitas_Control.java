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
public class GestorCitas_Control implements ActionListener {
    
 Modelo_CitasMedicas.Gestor_Citas citasModelo;
 Vista_CitasMedicas.Consultar_Citas consultarCitasVista;

 public GestorCitas_Control(Vista_CitasMedicas.Consultar_Citas consultarCitasVista)
{
 this.consultarCitasVista = consultarCitasVista;
  citasModelo = new Modelo_CitasMedicas.Gestor_Citas();
 }
 
 public void actionPerformed(ActionEvent e){


 DefaultTableModel tmodelo;
 String valor= consultarCitasVista.txt_valor.getText();
 int parametro=0;

 if(consultarCitasVista.rdb_identificacionC.isSelected()){
 parametro=1;
 }
 if(consultarCitasVista.rdb_nombresC.isSelected()){
 parametro=2;
 }
 if(consultarCitasVista.rdb_apellidosC.isSelected()){
 parametro=3;
 }
 if(consultarCitasVista.rdb_fechacita.isSelected()){
 parametro=4;
 }

 LinkedList<Modelo_CitasMedicas.Citas>
 citas = citasModelo.getCitasbyParametro(parametro, valor);
 String registro[]=new String[4];

 String[]Titulos = {"Identificacion","Nombre","Apellidos","Fecha Cita"};

 tmodelo=new DefaultTableModel();
 tmodelo.setColumnIdentifiers(Titulos);

 for(Modelo_CitasMedicas.Citas p:citas){
    registro[0]=p.getIdentificacion();
    registro[1]=p.getNombres();
    registro[2]=p.getApellidos();
    registro[3]=p.getFechadeCita();
 tmodelo.addRow(registro);
 }

 consultarCitasVista.Tbl_datosC.setModel(tmodelo);
 }
    
}
