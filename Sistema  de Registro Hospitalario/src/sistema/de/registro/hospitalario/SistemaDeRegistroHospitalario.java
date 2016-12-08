/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.registro.hospitalario;

import classes.IOarchivos;
import classes.Lista;
import classes.Medico;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Josselyn
 */
public class SistemaDeRegistroHospitalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("********* SISTEMA DE REGISTRO HOSPITALARIO **********");
        Scanner sc=new Scanner(System.in);
        System.out.println(" Ingrese F si es funcionario , M si es medico y P si es paciente ");
        String x;
        x=sc.nextLine();
        x=x.substring(0, 1);
        IOarchivos leer=new IOarchivos();
        System.out.println("INGRESE NUMERO CEDULA : ");
        String ci=sc.nextLine();
        System.out.println("INGRESE CONTRASEÑA : ");
        String pass=sc.nextLine();
        Lista l= (Lista)leer.leerArchivos("Medicos");
        Medico m = new Medico();
        for (Iterator<Object> iterator = l.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            m = (Medico)next;
            if(ci==m.getUsuario()&&pass==m.getPassword()){
                break;
            }
        }
        
        
       
        
        
    }
    
}
