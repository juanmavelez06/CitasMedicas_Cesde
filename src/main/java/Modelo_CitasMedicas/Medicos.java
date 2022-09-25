/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_CitasMedicas;

/**
 *
 * @author juanm
 */
public class Medicos {
    
    private String Nombres;
    private String Apellidos;
    private String FechaNacimiento;
    private String Identificacion;
    private String Genero;
    private String CargoMedico;
    

    public Medicos(String Identificacion, String Nombres, String Apellidos, String FechaNacimiento, String CargoMedico, String Genero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the NombresMedicos
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param NombresMedicos the NombresMedicos to set
     */
    public void setNombres(String NombresMedicos) {
        this.Nombres = NombresMedicos;
    }

    /**
     * @return the ApellidosMedicos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * 
     * @param Apellidos
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
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
     * @return the IdentificacionMedico
     */
    public String getIdentificacion() {
        return Identificacion;
    }

    /**
     * @param Identificacion the IdentificacionMedico to set
     */
    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
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
     * @return the CargoMedico
     */
    public String getCargoMedico() {
        return CargoMedico;
    }

    /**
     * @param CargoMedico the CargoMedico to set
     */
    public void setCargoMedico(String CargoMedico) {
        this.CargoMedico = CargoMedico;
    }
    
   
    
    
}
