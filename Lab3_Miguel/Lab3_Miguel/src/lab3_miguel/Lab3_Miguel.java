/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_miguel;
import java.util.Scanner;

/**
 *
 * @author flash
 */
public class Lab3_Miguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Serie Euclidiana");
        System.out.println("2.Pokebola");
        System.out.println("3.OK Boomer!");
        System.out.println("4.Salir");
        System.out.println("Ingrese una opcion");
        int opcion = sc.nextInt();
        while(opcion != 4){
            switch(opcion){
                
                case 1:
                    System.out.println("Puntos a ingresar");
                    int cant =  sc.nextInt();
                    double suma = 0;
                    for(int i = 1; i <= cant; i++){
                        System.out.println("x:");
                        float x = sc.nextInt();
                        System.out.println("y:");
                        float y = sc.nextInt();
                        suma = suma + (x-y)*(x-y);
                    }
                    double result = Math.sqrt(suma);
                    System.out.println("La distancia euclidiana es de: "+result);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el tamaño de la pokebola");
                    int size = sc.nextInt();
                    while(size <= 4){
                        System.out.println("Porfavor ingrese un numero mayor que cuatro");
                        System.out.println("Ingrese el tamaño de la pokebola");
                        size = sc.nextInt();
                    }
                    if(size%2 == 1){
                        for(int y = 1; y <= (size-1)/2-1; y++){
                            for(int x = 1; x <= size*2-1; x++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                    else{
                        for(int y = 1; y <= (size-1)/2; y++){
                            for(int x = 1; x <= size*2-1; x++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                    for(int x = 1; x <= (size*2)-1; x++){
                        if(x >= size*2/3+1){
                            for(x = x; x <= size*1.3; x++){
                                System.out.print("#");
                            }
                        }
                        System.out.print("*");
                    }
                    System.out.println("");
                    System.out.print("*");
                    for(int x = 2; x <= size*2-2; x++){
                        if(x >= size*2/3+1){
                            for(x = x; x <= size*1.3; x++){
                                System.out.print(" ");
                            }
                        }
                        System.out.print("#");
                    }
                    System.out.print("*");
                    System.out.println("");
                    System.out.print("*");
                    for(int x = 2; x <= (size*2)-2; x++){
                        if(x >= size*2/3+1){
                            for(x = x; x <= size*1.3; x++){
                                System.out.print("#");
                            }
                        }
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println("");
                    for(int y = 1; y <= (size-1)/2-2; y++){
                        for(int x = 1; x <= size*2-1; x++){
                            if(x > 1 & x < size*2-1){
                                for(x = x; x <= size*2-2; x++){
                                    System.out.print(" ");
                                }
                            }
                            System.out.print("*");   
                        }
                        System.out.println("");
                    }
                    for(int x = 1; x <= size*2-1; x++){
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;
                
                case 3:
                    System.out.println("Ingrese su año de nacimiento");
                    int year = sc.nextInt();
                    while(year <= 0){
                        System.out.println("Porfavor ingrese un numero mayor que cero");
                        System.out.println("Ingrese su año de nacimiento");
                        year = sc.nextInt();
                    }
                    if(year>=1946 & year<1960){
                        System.out.println("Felicidades usted es Baby Boomer Gen!");
                    }
                    else if(year>=1960 & year<1975){
                        System.out.println("Felicidades usted es Generacion X!");
                    }
                    else if(year>=1975 & year<1980){
                        System.out.println("Felicidades usted es generacion Xennial!");
                    }
                    else if(year>=1980 & year<1990){
                        System.out.println("Felicidades usted es generacion Millenial!");
                    }
                    else if(year>=1990 & year<2013){
                        System.out.println("Felicidades usted es Gen Z!");
                    }
                    else if(year>=2013){
                        System.out.println("Felicidades usted es Gen Alpha!");
                    }
                    break;
                    
                default: System.out.println("Porfavor ingrese una opcion valida");
            }
        System.out.println("");
        System.out.println("1.Serie Euclidiana");
        System.out.println("2.Pokebola");
        System.out.println("3.OK Boomer!");
        System.out.println("4.Salir");
        System.out.println("Ingrese una opcion");
        opcion = sc.nextInt();    
        }
    }    
}
