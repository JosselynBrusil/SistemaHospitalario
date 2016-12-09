/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.LeerEscribirArchivos;
import controlador.Validar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Funcionario extends Persona implements Serializable{
    String cargo;
    
       LeerEscribirArchivos leerEsc=new LeerEscribirArchivos();
       Validar val= new Validar();
    public Funcionario() {
    }

    public Funcionario(String cargo, String nombre, String id, String usuario, String pass) {
        super(nombre, id, usuario, pass);
        this.cargo = cargo;
    }

 

    

    @Override
    public String toString() {
        return "Funcionario{" + "cargo=" + cargo + '}'+""+super.toString();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

     public void ingresarFuncionario(){
            Scanner sc=new Scanner(System.in);
         List<Funcionario> lf=(List<Funcionario>)leerEsc.leerArchivo("listFuncionario");
         System.out.println("Ingrese nombre del funcionario");
        super.setNombre(sc.nextLine());
        System.out.println("Ingrese la ci del funcionario");
        super.setId(sc.nextLine());
        System.out.println("Ingrese el usuario del funcionario");
        super.setUsuario(sc.nextLine());
        System.out.println("Ingrese el password del funcionario");
        super.setPass(sc.nextLine());
        lf.add(new Funcionario("FUNCIONARIO",super.getNombre(),super.getId(),super.getUsuario(),val.encriptaEnMD5(super.getPass())));
        leerEsc.escribirArchivo(lf, "listFuncionario");
         
         System.out.println("*** Gracias por ingresar su funcionario***");
        
        
        
    }
     public void ingresarMedico(){
            Scanner sc=new Scanner(System.in);
           List<Medico> lm=(List<Medico>)leerEsc.leerArchivo("listMedicos");
         System.out.println("Ingrese nombre del Doctor");
        super.setNombre(sc.nextLine());
        System.out.println("Ingrese la ci del Doctor");
        super.setId(sc.nextLine());
        System.out.println("Ingrese la especialidad del Doctor");
        String especialidad =sc.nextLine();
        System.out.println("Ingrese el usuario del Doctor");
        super.setUsuario(sc.nextLine());
        System.out.println("Ingrese el password del Doctor");
        super.setPass(sc.nextLine());
        lm.add(new Medico(especialidad,super.getNombre(),super.getId(),
                super.getUsuario(),val.encriptaEnMD5(super.getPass())));
        leerEsc.escribirArchivo(lm, "ListMedicos");
        System.out.println("*** Gracias por ingresar su medico***");
    }
      public void ingresarPaciente(){
            Scanner sc=new Scanner(System.in);
           List<Paciente> lp=(List<Paciente>)leerEsc.leerArchivo("listPacientes");
         System.out.println("Ingrese nombre del Paciente");
        super.setNombre(sc.nextLine());
        System.out.println("Ingrese la ci del Paciente");
        super.setId(sc.nextLine());
        System.out.println("Ingrese el numero de historia clinica");
        String numHistoria=sc.nextLine();
        System.out.println("Ingrese el nombre del Doctor a atender");
        String nombreDoc=sc.nextLine();
        System.out.println("Ingrese el usuario del Paciente");
        super.setUsuario(sc.nextLine());
        System.out.println("Ingrese el password del Paciente");
        super.setPass(sc.nextLine());
        lp.add(new Paciente(numHistoria,nombreDoc,super.getNombre(),
                super.getId(),super.getUsuario(),val.encriptaEnMD5(super.getPass())));
        leerEsc.escribirArchivo(lp, "listPacientes");
        System.out.println("*** Gracias por ingresar su paciente***");
        
    }
    
    
    
    
}
