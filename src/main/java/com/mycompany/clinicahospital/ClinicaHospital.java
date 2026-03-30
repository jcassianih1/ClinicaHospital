/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicahospital;

import com.mycompany.clinicahospital.Models.Consulta;
import com.mycompany.clinicahospital.Models.Hospital;
import com.mycompany.clinicahospital.Models.Medico;

/**
 *
 * @author ESTUDIANTE
 */
public class ClinicaHospital {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
                // 1. Crear Hospital
        Hospital h = new Hospital("Clinica Santa Maria", "Cartagena");

        // 2. Registrar 3 consultas
        h.registrarConsulta(new Consulta("1/02/2025", "Fiebre", "Tratamiento con reposo",    30));
        h.registrarConsulta(new Consulta("12/11/2022", "Dolor", "Sano", 15));
        h.registrarConsulta(new Consulta("2/12/2026", "Hematoma", "Yeso aplicado", 60));

        // 3. Crear 2 Medicos
        Medico m1 = new Medico( "Ortopeda", "1231", 201, "MARUAN", "1223", 23, "2323");
        Medico m2 = new Medico("Medicina interna", "13232", 302, "CHRISTOFER", "2323", 32, "33332");

        // 4. Atender y demostrar dependencia
        System.out.println("--- Reporte del Hospital ---");
        System.out.println(h.toString());

        System.out.println("\n--- Proceso de Atencion ---");
        m1.atender(h.getConsulta(0));
        m2.atender(h.getConsulta(2));

        System.out.println("\n--- Datos de los Medicos ---");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        
    }
}
