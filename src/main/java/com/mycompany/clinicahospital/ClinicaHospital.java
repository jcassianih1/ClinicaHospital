/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicahospital;

import com.mycompany.clinicahospital.Models.Consulta;
import com.mycompany.clinicahospital.Models.Hospital;

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
        h.registrarConsulta(new Consulta("20/03/2026", "Migrania", "Tratamiento con reposo",    30));
        h.registrarConsulta(new Consulta("21/03/2026", "Chequeo", "Sano", 15));
        h.registrarConsulta(new Consulta("22/03/2026", "Fractura", "Yeso aplicado", 60));

        // 3. Crear 2 Medicos
        Medico m1 = new Medico("50", "JOSE", 30, "300123", "General", "TP-001", 101);
        Medico m2 = new Medico("30", "ANA", 50, "300456", "Pediatria", "TP-002", 202);

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
