import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;   // declarar una variable de tipo numero entero
        // declaracion de nuestro scanner para hacer una captura de teclado
        Scanner input=new Scanner(System.in);
        System.out.print("Numero:");
        numero=input.nextInt();  // capturar el valor de la variable entera

        if (numero>0){
            System.out.print("El numero es Positivo");
        }

        if (numero<0){
            System.out.print("El numero es Negativo");
        }
        
        if (numero==0){
            System.out.print("El numero es NEUTRO");
        }
    }
}

//if (numero>0){
    //System.out.print("El numero es Positivo "+numero);
//}else{
   //if (numero<0){
       // System.out.print("El numero es Negativo "+numero);
    //}else{
        //if (numero==0){
            //System.out.print("El numero es NEUTRO "+numero);
        //}
    //}
//}

//if (numero>0){
    //System.out.print("El numero "+numero+" es Positivo ");
//}else if (numero<0){
        //System.out.print("El numero es Negativo "+numero);
//}else if (numero==0){
           // System.out.print("El numero es NEUTRO "+numero);
        //}
//}

/*if (numero>=0 && numero<=5){   // && = and
    System.out.print("rango de 0 a 5");
}

if (numero<0 || numero>5){   // || = or
    System.out.print("fuera de rango");
}*/

/*      int numero,i;   // declarar una variable de tipo numero entero
        String dato;
        // declaracion de nuestro scanner para hacer una captura de teclado
        int[] vector;  // declarar un vector de numeros
        vector=new int[50]; // reservar 50 posiciones al vector

        double[] salarios;
        salarios=new double[30];

        String[] palabras={"hola","como","estan","todos","ustedes"};

        char[] vocales={'a','e','i','o','u'};
     
     
     
     
     
     
     
     int[] vector;  // declarar un vector de numeros
        vector=new int[50]; // reservar 50 posiciones al vector

        // int[] vector=new int[50];

        vector[0]=10;
        vector[1]=20;
        System.out.println(vector[0]);
        System.out.println(vector[1]);*/