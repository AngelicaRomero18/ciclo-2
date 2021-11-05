import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.List;

public class reto1{
public static void main(String[] args) {
    int nfilas;   //declarar variable entera cantidad de pacientes
    int count1=0;   //Contador Staphylococcus aureus
    int count2=0;   //Contador Bacillus cereus
    int count3=0;   // Contador Taenia saginata
    int count4=0;   // Contador Norovirus
    int count5=0;   // Contador Rotavirus
    int count6=0;   // Contador Sin diagnostico
    Scanner input = new Scanner(System.in);// leer dato consola
    nfilas = Integer.parseInt(input.nextLine());//Pedir dato cantidad de pacientes y guardarlo en filas de matriz
    String pacientes[][]= new String [nfilas][7];//Declarar la matriz pacientes con nfilas y 7 columnas.


    for (int i=0; i<nfilas;i++){   //For para pasar por cada fila--- cada paciente
            String data = input.nextLine();   // Lee los datos introducidos por consola y los guarda en la variable data.
            String[] split = data.split("-"); // Se define un vector SPLIT, y se separan los datos que vienen separados por guion y este se le quita.
            for(int j=0; j<split.length;j++){ // Con este for se recorre cada columna de la matriz pacientes y se le almacena cada columna del vector split.
                pacientes[i][j]= split[j];    
            }
    }
    for (int i=0; i<nfilas;i++){
        if (pacientes[i][2].equals("si") && pacientes[i][3].equals("si") && pacientes[i][4].equals("si") && pacientes[i][5].equals("si") && pacientes[i][6].equals("si")){
            System.out.println(pacientes[i][1]+" Staphylococcus aureus");
            count1 += 1;
        }
        else if (pacientes[i][2].equals("si") && pacientes[i][3].equals("si") && pacientes[i][4].equals("no") && pacientes[i][5].equals("no") && pacientes[i][6].equals("no")){
            System.out.println(pacientes[i][1]+" Bacillus cereus");
            count2 += 1;
        }
        else if (pacientes[i][2].equals("no") && pacientes[i][3].equals("no") && pacientes[i][4].equals("si") && pacientes[i][5].equals("no") && pacientes[i][6].equals("si")){
            System.out.println(pacientes[i][1]+" Taenia saginata");
            count3 += 1;
        }
        else if (pacientes[i][2].equals("si") && pacientes[i][3].equals("si" ) && pacientes[i][4].equals("no") && pacientes[i][5].equals("si") && pacientes[i][6].equals("si")){
            System.out.println(pacientes[i][1]+" Norovirus");
            count4 += 1;
        }
        else if (pacientes[i][2].equals("no") && pacientes[i][3].equals("si") && pacientes[i][4].equals("no") && pacientes[i][5].equals("si") && pacientes[i][6].equals("no")){
            System.out.println(pacientes[i][1]+" Rotavirus");
            count5 += 1;
        }
        else{
            System.out.println(pacientes[i][1]+" Sin diagnostico");
            count6+=1;
        }
    }

    Map<String, Integer> contadores= new HashMap<String,Integer>();
    contadores.put( "Staphylococcus aureus", count1 );
    contadores.put( "Bacillus cereus", count2 );
    contadores.put( "Taenia saginata", count3 );
    contadores.put( "Norovirus", count4 );
    contadores.put( "Rotavirus", count5 );

    Map<String, Integer> result = contadores.entrySet().stream()
                .sorted(Entry.comparingByValue())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    List<String> keys = new ArrayList<String>(result.keySet());
    System.out.println(keys.get(4));
    System.out.println(count6); 
    }
}