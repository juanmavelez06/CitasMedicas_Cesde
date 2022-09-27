package coneccion_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class coneccion {

    //se inicia la coneccion a la bases de datos
    public static void consultasMysql(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_agendarcitasmedicas","root","");
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
