import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola, esta es la calculadora de Jorge");
        System.out.println("A continuación le explicaré el menú de navegación");
        System.out.println("Si quieres sumar, escribe sumar");
        System.out.println("Si lo que quieres es restar, escribe restar");
        System.out.println("Si usted lo que quiere es multiplicar, escribe multiplicar");
        System.out.println("Si está buscando dividir, escriba dividir");
        System.out.println("Si desea saber el resto de una division, escriba resto");
        System.out.println("Si desea apagar la calculadora, escriba off");
        System.out.println("Holaa! ¿qué operacion desea efectuar?");
        String operacion = teclado.next();


            if (operacion.equals("sumar")) {
                System.out.println("¿Cual es el primer numero?");
                double numA = teclado.nextDouble();
                System.out.println("¿Cual es el segundo numero?");
                double numB = teclado.nextDouble();
                double resultado = numA + numB;
                System.out.println("el resultado es: " + resultado);
                System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion");
                System.out.println("Gracias por usar la calculadora de Jorge");
                System.out.println("Adios");
            } else if (operacion.equals("restar")) {
                System.out.println("¿Cual es el primer numero?");
                double numA = teclado.nextDouble();
                System.out.println("¿Cual es el segundo numero?");
                double numB = teclado.nextDouble();
                double resultado = numA - numB;
                System.out.println("El resultado es: " + resultado);
                System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion");
                System.out.println("Gracias por usar la calculadora de Jorge");
                System.out.println("Adios");
            } else if (operacion.equals("multiplicar")) {
                System.out.println("¿Cual es el primer numero?");
                double numA = teclado.nextDouble();
                System.out.println("¿Cual es el segundo numero?");
                double numB = teclado.nextDouble();
                double resultado = numA * numB;
                System.out.println("El resultado es: " + resultado);
                System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion");
                System.out.println("Gracias por usar la calculadora de Jorge");
                System.out.println("Adios");
            } else if (operacion.equals("dividir")) {
                System.out.println("¿Cual es el primer numero?");
                double numA = teclado.nextDouble();
                System.out.println("¿Cual es el segundo numero?");
                double numB = teclado.nextDouble();
                if (numB != 0) {
                    double resultado = numA / numB;
                    System.out.println("El resultado es: " + resultado);
                    System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion");
                    System.out.println("Gracias por usar la calculadora de Jorge");
                    System.out.println("Adios");
                } else if (numB == 0) {
                    System.out.println("0 no es divisible");
                }
            } else if (operacion.equals("resto")) {
                System.out.println("¿Cual es el primer numero?");
                double numA = teclado.nextDouble();
                System.out.println("¿Cual es el segundo numero?");
                double numB = teclado.nextDouble();
                double resultado = numA % numB;
                System.out.println("El resultado es: " + resultado);
                System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion");
                System.out.println("Gracias por usar la calculadora de Jorge");
                System.out.println("Adios");
            } else if (operacion.equals("off")) {
                System.out.println("Gracias por usar la calculadora de Jorge");
                System.out.println("ADIOS");
            } else {
                System.out.println("Por favor, introduzca un comando especificado");
            }
        }
    }



