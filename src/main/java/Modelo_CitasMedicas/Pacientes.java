/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_CitasMedicas;

/**
 *
 * @author juanm
 */
public class Pacientes {
    
    private String NombresPaciente;
    private String ApellidosPaciente;
    private String FechaNacimiento;
    private String IdentificacionPaciente;
    private String Genero;

    public Pacientes(String Identificacion, String Nombres, String Apellidos, String Fecha_Nacimiento, String Genero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

  

    /**
     * @return the NombresPaciente
     */
    public String getNombresPaciente() {
        return NombresPaciente;
    }

    /**
     * @param NombresPaciente the NombresPaciente to set
     */
    public void setNombresPaciente(String NombresPaciente) {
        this.NombresPaciente = NombresPaciente;
    }

    /**
     * @return the ApellidosPaciente
     */
    public String getApellidosPaciente() {
        return ApellidosPaciente;
    }

    /**
     * @param ApellidosPaciente the ApellidosPaciente to set
     */
    public void setApellidosPaciente(String ApellidosPaciente) {
        this.ApellidosPaciente = ApellidosPaciente;
    }

    /**
     * @return the FechaNacimiento
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the IdentificacionPaciente
     */
    public String getIdentificacionPaciente() {
        return IdentificacionPaciente;
    }

    /**
     * @param IdentificacionPaciente the IdentificacionPaciente to set
     */
    public void setIdentificacionPaciente(String IdentificacionPaciente) {
        this.IdentificacionPaciente = IdentificacionPaciente;
    }
    
    
    
    
}
