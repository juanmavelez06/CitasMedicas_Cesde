/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Proyecto_Citas;

import Vista_CitasMedicas.CitasMedicas_2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author juanm
 */
public class CitasMedicas {

    public static void main(String[] args) {
        CitasMedicas_2 abrir = new CitasMedicas_2();
        abrir.setVisible(true);

        //se inicial la coneccion a bases de datos
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_agendarcitasmedicas","root","");
            String Query = "SELECT * FROM tbl_pacientes";
            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery(Query);
            System.out.println("Conectado a la base de datos");

            while(rs.next()){
                int id = rs.getInt("IdPaciente");
                String nombre = rs.getString("NomPaciente");
                String apellido = rs.getString("ApellPaciente");
                String fechaNacimiento = rs.getString("FechaNacimientoPac");
                String genero = rs.getString("GenPaciente");

                //reusltados de la consulta
                System.out.println(id);
                System.out.println(nombre);
                System.out.println(apellido);
                System.out.println(fechaNacimiento);
                System.out.println(genero);

            }
            stmt.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
