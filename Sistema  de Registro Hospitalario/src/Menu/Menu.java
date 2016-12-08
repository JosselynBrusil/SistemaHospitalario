/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author Josselyn
 */
import classes.Persona;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Menu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list;
        list = new ArrayList();
        list.add("1723987441,123");
        list.add("1711331456,124");
        list.add("0703490695,125");
        list.add("1723987221,126");
        Scanner Leer = new Scanner(System.in);
        String Password;

        Persona p = new Persona();
        int r = 0;
        int i = 0;
        System.out.println("-----MENU-----");
        System.out.println("");
        do {
            System.out.println("\nPor favor ingrese su numero de cedula");
            String ci = br.readLine();  //Se guarda la entrada (ci) en una variable
            int cide = Integer.parseInt(ci); //Se transforma la ci anterior en un entero
            p.setCi(cide);
            int x = list.size();
            boolean f = true;
            String cedula="";
            String contrasena = "";
            StringTokenizer tokens = new StringTokenizer(list.get(i),",");
            cedula = tokens.nextToken();
            contrasena = tokens.nextToken();
            if (ci.equals(cedula)) {
                System.out.println(p.getCi());
                System.out.println("El usuario si existe");
                r = 1;
                System.out.println("\nPor favor ingrese su contraseña");
                Password = Leer.nextLine();
                if(Password.equals(contrasena)){
                    System.out.println("Contrasena valida");
                }
                else{
                    System.out.println("Contrasena no valida");
                }
            } else {
                System.out.println("\nERROR: numero de cedula no identificada");
                r = 0;
            }
        } while (r == 0 || i == list.size());
       
    }

}
