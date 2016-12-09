/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Scanner;
import modelo.Funcionario;
import modelo.Medico;
import modelo.Persona;

/**
 *
 * @author USRBET
 */
public class Validar implements Serializable {

    LeerEscribirArchivos leerEsc = new LeerEscribirArchivos();
    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String encriptaEnMD5(String stringAEncriptar) {
        try {
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
            StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int bajo = (int) (bytes[i] & 0x0f);
                int alto = (int) ((bytes[i] & 0xf0) >> 4);
                strbCadenaMD5.append(CONSTS_HEX[alto]);
                strbCadenaMD5.append(CONSTS_HEX[bajo]);
            }
            return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }

    }

    public String buscarUsuario(String usuario, String clave, String tipo) {
        String nombreyApellido = "";
       
              List<Object> listaUsuario = (List)leerEsc.leerArchivo(tipo);

                for (Object listaUsuario1 : listaUsuario) {
                   
                   Persona u = (Persona) listaUsuario1;
                   
                    
                    if (u.getUsuario().equals(usuario) && u.getPass().equals(clave)) {
                        nombreyApellido = u.getNombre();
                        break;
                    } else {
                        nombreyApellido="no existe";

                       
                    }

                }

                return nombreyApellido;
                
          
                

        

         
        }
}
