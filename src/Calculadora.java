import java.util.Scanner; //Importamos el scanner para pedir datos

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  //declaramos el scanner y le ponemos nombre
        System.out.println("Hola, esta es la calculadora de Jorge"); //Damos la bienvenida a nuestro programa
        System.out.println("A continuación le explicaré el menú de navegación"); //instrucciones
        System.out.println("Si quieres sumar, escribe sumar"); //opciones de navegacion
        System.out.println("Si lo que quieres es restar, escribe restar");//opciones de navegacion
        System.out.println("Si usted lo que quiere es multiplicar, escribe multiplicar");//opciones de navegacion
        System.out.println("Si está buscando dividir, escriba dividir");//opciones de navegacion
        System.out.println("Si desea saber el resto de una division, escriba resto");//opciones de navegacion
        System.out.println("Si desea apagar la calculadora, escriba off");//opciones de navegacion
        System.out.println("Holaa! ¿qué operacion desea efectuar?"); //preguntamos que desea hacer
        String operacion = teclado.next(); //declaramos el string operacion y le damos valor con el scanner
        //OJO, al ser Strings, no usamos ==, strings se comportan diferente y usaremos .equals()
        //utilizamos if e ifs anidados para segun nuestra respuesta entre en un caso o en otro
        if (operacion.equals("sumar")) { //Si mi respuesta ha sido sumar, entraria aqui
            System.out.println("¿Cual es el primer numero?"); // preguntamos por el numero A
            double numA = teclado.nextDouble(); // declaramos el double numA y le decimos que nuestra entrada de teclado sera su valor
            System.out.println("¿Cual es el segundo numero?");  // preguntamos por el numero B
            double numB = teclado.nextDouble(); //declaramos el double numB y le decimos que nuestra entrada de teclado sera su valor
            double resultado = numA + numB;//declaramos el double resultado con los valores y operacion de numA y numB
            System.out.println("el resultado es: " + resultado); //imprimimos por pantalla el resultado
            System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion"); //en construccion
            System.out.println("Gracias por usar la calculadora de Jorge"); // mensaje de cierre del programa
            System.out.println("Adios"); // mensaje de despedida
        } else if (operacion.equals("restar")) { //Si mi respuesta ha sido restar, entraria aqui
            System.out.println("¿Cual es el primer numero?");// preguntamos por el numero A
            double numA = teclado.nextDouble(); // declaramos el double numA y le decimos que nuestra entrada de teclado sera su valor
            System.out.println("¿Cual es el segundo numero?");// preguntamos por el numero B
            double numB = teclado.nextDouble();//declaramos el double numB y le decimos que nuestra entrada de teclado sera su valor
            double resultado = numA - numB;//declaramos el double resultado con los valores y operacion de numA y numB
            System.out.println("El resultado es: " + resultado);//imprimimos por pantalla el resultado
            System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion"); //en construccion
            System.out.println("Gracias por usar la calculadora de Jorge");// mensaje de cierre del programa
            System.out.println("Adios");// mensaje de despedida
        } else if (operacion.equals("multiplicar")) { //Si mi respuesta ha sido multiplicar, entraria aqui
            System.out.println("¿Cual es el primer numero?");// preguntamos por el numero A
            double numA = teclado.nextDouble();// declaramos el double numA y le decimos que nuestra entrada de teclado sera su valor
            System.out.println("¿Cual es el segundo numero?");// preguntamos por el numero B
            double numB = teclado.nextDouble();//declaramos el double numB y le decimos que nuestra entrada de teclado sera su valor
            double resultado = numA * numB;//declaramos el double resultado con los valores y operacion de numA y numB
            System.out.println("El resultado es: " + resultado);//imprimimos por pantalla el resultado
            System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion"); //en construccion
            System.out.println("Gracias por usar la calculadora de Jorge");// mensaje de cierre del programa
            System.out.println("Adios");// mensaje de despedida
        } else if (operacion.equals("dividir")) { //Si mi respuesta ha sido dividir, entraria aqui
            System.out.println("¿Cual es el primer numero?");// preguntamos por el numero A
            double numA = teclado.nextDouble();// declaramos el double numA y le decimos que nuestra entrada de teclado sera su valor
            System.out.println("¿Cual es el segundo numero?");// preguntamos por el numero B
            double numB = teclado.nextDouble();//declaramos el double numB y le decimos que nuestra entrada de teclado sera su valor
            if (numB != 0) {
                double resultado = numA / numB;//declaramos el double resultado con los valores y operacion de numA y numB
                System.out.println("El resultado es: " + resultado);//imprimimos por pantalla el resultado
                System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion");//en construccion
                System.out.println("Gracias por usar la calculadora de Jorge");// mensaje de cierre del programa
                System.out.println("Adios");// mensaje de despedida
            } else if (numB == 0) { //añadimos esta funcion por que si ingresa numB 0  al dividir daria error
                System.out.println("0 no es divisible"); //si el usuario ingresa 0 en numB saldria por aqui ya que no es divisible
            }
        } else if (operacion.equals("resto")) { //Si mi respuesta ha sido resto, entraria aqui
            System.out.println("¿Cual es el primer numero?");// preguntamos por el numero A
            double numA = teclado.nextDouble();// declaramos el double numA y le decimos que nuestra entrada de teclado sera su valor
            System.out.println("¿Cual es el segundo numero?");// preguntamos por el numero B
            double numB = teclado.nextDouble();//declaramos el double numB y le decimos que nuestra entrada de teclado sera su valor
            double resultado = numA % numB;//declaramos el double resultado con los valores y operacion de numA y numB
            System.out.println("El resultado es: " + resultado);//imprimimos por pantalla el resultado
            System.out.println("Si quiere realizar otra operacion vuelva a encender la calculadora por que aun no se pedir otra operacion");//en construccion
            System.out.println("Gracias por usar la calculadora de Jorge");// mensaje de cierre del programa
            System.out.println("Adios");// mensaje de despedida
        } else if (operacion.equals("off")) { //Si mi respuesta ha sido off, entraria aqui
            System.out.println("Gracias por usar la calculadora de Jorge");// mensaje de cierre del programa
            System.out.println("ADIOS");// mensaje de despedida
        } else { //por aqui entra el if si la respuesta es algo distinto de lo especificado
            System.out.println("Por favor, introduzca un comando especificado"); //mensaje avisando que ha introducido una respuesta no contemplada
        }
    }
}



