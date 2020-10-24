/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioochonumeromes;

import java.util.Scanner;

/**
 *
 * @author OrtizL
 */
public class EjercicioOchoNumeroMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número entero entre 1 y 12");
        numero= teclado.nextLine();
        
        if (numero.matches("[0-9]*"))
        {        
            int numero1=Integer.parseInt(numero);
            if (1<=numero1&&numero1<=12)
            {
                if (numero1==1){System.out.println("Enero");}
                if (numero1==2){System.out.println("Febrero");}
                if (numero1==3){System.out.println("Marzo");}
                if (numero1==4){System.out.println("Abril");}
                if (numero1==5){System.out.println("Mayo");}
                if (numero1==6){System.out.println("Junio");}
                if (numero1==7){System.out.println("Julio");}
                if (numero1==8){System.out.println("Agosto");}
                if (numero1==9){System.out.println("Septiembre");}
                if (numero1==10){System.out.println("Octubre");}
                if (numero1==11){System.out.println("Noviembre");}
                if (numero1==12){System.out.println("Diciembre");}
            }
            else{System.out.println("Introduce un valor entre 1 y 12");}
            
        }
        else{System.out.println("Introduce un valor entero entre 1 y 12");}
            
    }
    
}
