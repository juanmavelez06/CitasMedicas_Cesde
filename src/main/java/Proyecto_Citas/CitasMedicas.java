/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Proyecto_Citas;

import Vista_CitasMedicas.CitasMedicas_2;
import coneccion_db.coneccion;

/**
 *
 * @author juanm
 */
public class CitasMedicas {

    public static void main(String[] args) {
        CitasMedicas_2 abrir = new CitasMedicas_2();
        abrir.setVisible(true);

        //se inicia la coneccion a la base de datos
        coneccion.consultasMysql();
    }
}
