package com.sofka;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean calculadora = true; //variable para generar bucle en el while
        boolean validacionDivision; //se guarda el estado que devuelve la funcion de validar la division por 0.
        Operaciones operaciones = new Operaciones(); //Inicialización de objeto.
        float resultado; //se guarda resultado de las operaciones
        System.out.println("Ingrese + para sumar, - para restar / para dividir , * para multiplicar, % para hayar el modulo de la division");
        System.out.println("Para salir, ingrese (s) en el operador");
        System.out.println("Si ingresas numeros decimales, separar los decimales con una ,");
        System.out.print("Ingrese un numero y oprima enter: ");
        resultado = sc.nextFloat();
        while(calculadora){
            System.out.print("Ingrese un operador (+ para sumar, - para restar / para dividir , * para multiplicar, % para modulo, s para salir) y oprima enter: ");
            String operador = sc.next();
            if (operador.equals("s")){ //condición para seguir operando, si es igual a s, se sale de la calculadora
                System.out.println("Saliendo de la calculadora...");
                break; //romper ciclo
            }
            System.out.print("Ingrese un numero y oprima enter: ");
            float numero2 = sc.nextFloat();
            resultado = operaciones.menu(operador, resultado, numero2); //guardamos el resultado obtenido por la operacion, mandamos las variables ingresadas para validar que operacion realizar
            validacionDivision = operaciones.validarResultado(Float.toString(resultado)); //se guarda el estado que devuelve la funcion de validar la division por 0.
            if (validacionDivision){ //si es verdadero el estado, es que no han dividido por 0
                System.out.println("resultado: " + resultado);
            } else { //si se divide por 0, nos da como respuesta "Infinity", con esto mandamos false para saber que se dividio por 0
                System.out.println("No se puede dividir por 0");
                System.out.print("Ingrese un numero y oprima enter: ");
                resultado = sc.nextFloat(); //pedimos nuevamente el primer numero puesto que se dividio por 0.
            }
        }


    }
}
