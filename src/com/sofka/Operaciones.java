package com.sofka;


public class Operaciones {

    public Operaciones() {  //constructor
    }

    public float menu(String operador, float resultado, float numero2){ //se reciben los numeros y el operador para validar que operacion realizar
        if(operador.equals("+")){ //en los condicionales se valida el operador y luego llama la funcion respectiva de la operacion
            resultado =  sumar(resultado, numero2);
        } else{
            if(operador.equals("-")){
                resultado =  restar(resultado, numero2);
            } else {
                if(operador.equals("*")){
                    resultado =  multiplicar(resultado, numero2);
                } else {
                    if(operador.equals("/")){
                        resultado =  dividir(resultado, numero2);
                    } else {
                        if(operador.equals("%")){
                            resultado =  mod(resultado, numero2);
                        } else {
                            System.out.println("Operador invalido, intente nuevamente"); //si se ingresa un valor diferente en el operador, se pide nuevamente el ingreso de los valores
                        }
                    }
                }
            }
        }
        return resultado; //retorno del resultado de la operacion
    }

    public float sumar(float num1, float num2){ //funcion de suma
        float sumar;
        sumar = num1 + num2;
        return sumar;
    }

    public float restar(float num1, float num2){ //funcion de resta
        float restar;
        restar = num1 - num2;
        return restar;
    }

    public float multiplicar(float num1, float num2){ //funcion de multiplicar
        float multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public float dividir(float num1, float num2){ //funcion de division
        float divicion;
        divicion = num1 / num2;
        return divicion;
    }

    public float mod(float num1, float num2){ //funcion de modulo
        float mod;
        mod = num1 % num2;
        return mod;
    }

    public boolean validarResultado(String resultado){ //funcion de validar la division por 0
        if(resultado.equals("Infinity")){
            return false;
        } else {
            return  true;
        }
    }
}

