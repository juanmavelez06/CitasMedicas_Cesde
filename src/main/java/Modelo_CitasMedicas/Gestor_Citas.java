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
public class Gestor_Citas {
    
    private static LinkedList<Citas> citas;
    
     public Gestor_Citas(){
        citas = new LinkedList<Citas>();
    }
    
      public void RegistrarCitas(Citas cita){
        citas.add(cita);
    }
      
    public static LinkedList<Citas> getCitasbyParametro (int Parametro, String valor )
    {
        LinkedList<Citas> resultado = new LinkedList <Citas>();
        for (Citas pac:citas)
        {
            switch(Parametro){
                case 1: if(pac.getNombres().equals(valor))
                    resultado.add(pac);
                break;
                case 2: if(pac.getApellidos().equals(valor))
                    resultado.add(pac);
                break; 
                case 3: if(pac.getIdentificacion().equals(valor))
                        resultado.add(pac);
                break;
                case 4: if(pac.getFechadeCita().equals(valor))
                        resultado.add(pac);
                break;
                
                
            } 
        }
        return null;
   }
    
}
