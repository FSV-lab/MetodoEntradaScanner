

package metodoentradascanner;

import java.util.Scanner;//Cuando utilizamos metodo de entrada de datos importamos java.util.Scanner;


public class MetodoEntradaScanner { //clase

    public static void main(String[] args) {  //metodo principal
        Scanner sc = new Scanner(System.in);  // se utiliza Scanner y se abrevia creando como objeto
                                              //se utiliza El system.in
        
        System.out.println("Ingresa tu Nombre:"); //se imprime el dato que se le  solicita al usuario
        String nombre = sc.nextLine();            //se declara el tipo de variable y la variable se toma la abreviacion del scanner                                        
        System.out.println("Tu  nombre es:"+ nombre);//Se imprime y se concatena la variable.
        
        System.out.println("Ingrese su apellido:");
        String Apellido = sc.nextLine();
        System.out.println("Tu apellido es:"+Apellido);
            
    }
    
}
