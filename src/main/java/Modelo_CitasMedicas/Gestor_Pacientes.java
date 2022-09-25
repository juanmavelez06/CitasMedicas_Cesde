/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_CitasMedicas;

import java.util.LinkedList;

/**
 *
 * @author juanm
 */
public class Gestor_Pacientes{
    private static LinkedList<Pacientes> pacientes;
    
     public Gestor_Pacientes(){
        pacientes = new LinkedList<Pacientes>();
    }
    
      public void RegistrarPacientes(Pacientes paciente){
        pacientes.add(paciente);
    }
      
    public static LinkedList<Pacientes> getPacientesbyParametro(int Parametro, String valor )
    {
        LinkedList<Pacientes> resultado = new LinkedList <Pacientes>();
        for (Pacientes pac:pacientes)
        {
            switch(Parametro)
            {
                case 1: if(pac.getIdentificacionPaciente().equals(valor))
                    resultado.add(pac);
                break;
                case 2: if(pac.getNombresPaciente().equals(valor))
                    resultado.add(pac);
                break; 
                case 3: if(pac.getApellidosPaciente().equals(valor))
                        resultado.add(pac);
                break;
                case 4: if(pac.getGenero().equals(valor))
                        resultado.add(pac);
                break;
            } 
        }
        return null;
   }
  
}






    
   
  