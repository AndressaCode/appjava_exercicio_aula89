/*A dona de um pensionato possui dez quartos para alugar para estrudantes,
 * sendo esses quartos identificados pelos números de 0 a 9.

 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N
 * representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10).
 * Em seguida, registr o aluguel dos N estudantes. Para cada registro de aluguel, informar o 
 * nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de
 * todas ocupações do pensionato, por ordem de quarto, conforme exemplo.
 * How many rooms will be rented? 3

 * Rent #1
 * Name: Maria Green
 * Email: maria@gmail.com
 * Room: 5

 * Rent #2
 * Name: Marco Antonio
 * Email: marco@gmail.com
 * Room: 1

 * Rent #3
 * Name: Alex Brown
 * Email: alex@gmail.com
 * Room: 8

 * Busy rooms:
 * 1: Marco Antonio, marco@gmail.com
 * 5: Maria Green, maria@gmail.com
 * 8: Alex Brown, alex@gmail.com 
 */
package application;

import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("How many rooms will be rented? ");
        int r = sc.nextInt();
        
        Rent[] vect = new Rent[r];
        
        for(int i=0; i<r; i++){
            sc.nextLine(); // para consumir o enter acima
            System.out.printf("Rent #%d %n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println();
            vect[i] = new Rent(name, email);
        }
        
        System.out.println("Busy rooms: ");
        System.out.println();
        for(int i=0; i<vect.length; i++){
            System.out.print(vect[i].getRoom() + ": " +
                             vect[i].getName() + ", " +  
                             vect[i].getEmail());
            System.out.println();
        }
        sc.close();
    }
    
}
