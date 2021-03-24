/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionlambda;

/**
 *
 * @author abarrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ICalculadora calculadora = (n) -> System.out.println(n + "Bienvenidos a las Expresiones Lambda");
        //calculadora.mensaje("Enviar ");
        ICalculadora calculadora = (n1, n2) ->{
            double resultado = n1 + n2;
            System.out.println("La suma es: " + resultado);
        };
        calculadora.operacion(5, 8);
        ICalculadora calculadora2 = (n1, n2) ->{
            double resultado = n1 - n2;
            System.out.println("La suma es: " + resultado);
        };
        calculadora2.operacion(15, 9);
    }
    
}
