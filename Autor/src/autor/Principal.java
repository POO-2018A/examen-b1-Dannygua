
package autor;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        Biblioteca libros []= new Biblioteca [10];
        Autor auto [] = new Autor [10];
        int contarfavoritos [] = new int [100];
        boolean favorito =false;
        String contadorauto [] = new String [10] ;
        int contador =0;
        int i =0;
        int j =0;

        int opcion = 0;
        
        while (opcion!=4){
            

        System.out.println("\tMenu");
        System.out.println("1.- Ingresar un nuevo libro ");
        System.out.println("2.- Imprimir la lista de libros favoritos ");
        System.out.println("3.- Contar libros de autor ");
        System.out.println("4.- Salir ");
        opcion = scan.nextInt();            
        
        favorito =false;
        

        switch (opcion){
            
            case 1:
   
                
                if (i!=10){
            System.out.println("\tLibros");
            scan.nextLine();
            System.out.println("Titulo: ");
            String titulo = scan.nextLine();
            System.out.println("Anio: ");
            int ano = scan.nextInt(); 
            System.out.println("Si desea ingresar este libro a favoritos digite : Si ");
            String respuesta = scan.next();
                
            if (respuesta.equals("Si")|| respuesta.equals("si")){
                
                favorito =true;
                contarfavoritos [j]= i;
                j++;
            }
               
      
                System.out.println("\tAutor");
                scan.nextLine();
                System.out.println("Nombre: ");
                String nombreauto = scan.nextLine();
                contadorauto [i]= nombreauto;
                System.out.println("Pais: ");
                String pais = scan.nextLine();
                
                auto [i] = new Autor (nombreauto, pais );

                libros[i]= new Biblioteca (titulo, ano, auto );            
            
            i++;
            
                }else{
                    System.out.println(" Numero maximo de libros 10 ");
                }
                
                break;
            case 2:
                
                
                for (int h = 0; h < j; h++) {
                    
                    System.out.println("\tFavoritos");
                    System.out.println(libros [contarfavoritos [h]]);
                    
                }

                break;
                
            case 3:
                
                System.out.println("\t Biblioteca ");
                
                for (int k = 0; k < i; k++) {
                    
                    System.out.println(libros [k]);
                           
                }    
                
                for (int k = 0; k < i; k++) {
                    
                    if (contadorauto [k].equals(contadorauto [i])){
                       contador++;
                    }
                    
                    System.out.println("Libros del mismo autor ");
                    System.out.println(contador);
                       
                    
                }
                
                break;
                
            case 4:
                
                System.out.println("Adios");
                
                break;
                
            default:
                
                System.out.println("No es una opcion");
                
                break;
       
            
        }
        
        }
            
        
        
    }
    
}
