/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosistema;

import modelo.Funcionario;
import modelo.Medico;
import modelo.Paciente;
import controlador.LeerEscribirArchivos;
import controlador.Validar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProyectoSistema {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Validar val=new Validar();
        String tipo,user,pass,nombre="";
        Funcionario fun=new Funcionario();
        Medico med=new Medico();
        int op=0;
         LeerEscribirArchivos leerEsc= new LeerEscribirArchivos();
         List<Medico> listMed=new ArrayList();
         List<Paciente> lp=new ArrayList();
        List<Funcionario> lf=new ArrayList();
//        lf.add(new Funcionario("FUNCIONARIO","Andres Ruiz","1723291090","mailof",val.encriptaEnMD5("mailof")));
//        leerEsc.escribirArchivo(lf, "listFuncionario");
        listMed.add(new Medico("Obste","Juan","1723291090","doc1",val.encriptaEnMD5("doc1")));
        leerEsc.escribirArchivo(listMed, "listMedicos");
//        lp.add(new Paciente("1723291090","Juan","Andres Ruiz","1723291090","pac1",val.encriptaEnMD5("pac1")));
//        leerEsc.escribirArchivo(lp, "listPacientes");
         Scanner sc=new Scanner(System.in);
         

         
         do{
             
             System.out.println("Ingrese M medico P paciente F funcionario");
              tipo=sc.nextLine();
             System.out.println("Ingrese Usuario");
             user=sc.nextLine();
             System.out.println("Ingrese Contraseña");
              pass=sc.nextLine();
             
               switch(tipo.toUpperCase()){
             case "F":
                     tipo="listFuncionario";
                    nombre= val.buscarUsuario(user,val.encriptaEnMD5(pass),tipo);
                   
                    System.out.println("FUNCIONARIO "+nombre);
                     if(nombre.equals("no existe")){
                        ProyectoSistema.main(args);
                    }else{
                         System.out.println("1. Ingreso Funcionario");
                         System.out.println("2. Ingreso Paciente");
                         System.out.println("3. Ingreso Medico");
                         System.out.println("Digite la opcion deseada");
                         tipo=sc.nextLine();
                         switch(tipo){
                             case "1":fun.ingresarFuncionario();break;
                             case "2":fun.ingresarPaciente();break;
                             case "3":fun.ingresarMedico();break;
                             default: System.out.println("Ingreso mal ERROR");
                                 System.out.println("");
                            
                            
                             
                         }
                         
                     }
                      op=0;
                    
                     
                
                 break;
             case "M":
                 tipo="listMedicos";
                 nombre= val.buscarUsuario(user,val.encriptaEnMD5(pass),tipo);
                    System.out.println("MEDICO  "+nombre);
                    if(nombre.equals("no existe")){
                        ProyectoSistema.main(args);
                    }else{
                       
                         tipo=sc.nextLine();
                       med.crearHistoria();
                       med.verHistoria();
                    }
                 
                  op=0;
                 break;
             case "P":
                    tipo="listPacientes";
                    
                    nombre= val.buscarUsuario(user,val.encriptaEnMD5(pass),tipo);
                    System.out.println("PACIENTE "+nombre);
                     if(nombre.equals("")){
                          System.out.println("No existe");
                        ProyectoSistema.main(args);
                    }
                  op=1;
                 break;
             default:
                 System.out.println("Ingrese Correctamente F P o M");

                 break;
          
            }
         }while(op!=1);
       
         
         
         
  }
    
}
