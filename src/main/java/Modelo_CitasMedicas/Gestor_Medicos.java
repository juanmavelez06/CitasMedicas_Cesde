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
public class Gestor_Medicos {
    
    private static LinkedList<Medicos> medicos;
    
     public Gestor_Medicos(){
        medicos = new LinkedList<Medicos>();
    }
    
      public void RegistrarMedicos(Medicos medico){
        medicos.add(medico);
    }
      
    public static LinkedList<Medicos> getMedicosbyParametro(int Parametro, String valor )
    {
        LinkedList<Medicos> resultado = new LinkedList <Medicos>();
        for (Medicos pac:medicos)
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
                case 4: if(pac.getGenero().equals(valor))
                        resultado.add(pac);
                break;
                case 5: if(pac.getCargoMedico().equals(valor))
                        resultado.add(pac);
                break;
            } 
        }return null;
    }
        
}
