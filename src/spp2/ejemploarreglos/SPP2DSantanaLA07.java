/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ejemploarreglos;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author diego
 */
public class SPP2DSantanaLA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Long[] telefonos=new Long[10];
        
        for(int i=0; i<telefonos.length; i++){
            telefonos[i]= tel("El número telefónico "+(i+1));
        }
        int consulta = con("El número que quiere consultar");
        System.out.println("Número de la persona" + consulta + "es:" +telefonos[consulta]);
        }
    public static long tel(String mensaje){
        Scanner sc=new Scanner(System.in);
        long varEnter=0;
        boolean flag;
        
        do{
            System.out.println("Introduzca"+mensaje);
            try{
                varEnter=sc.nextLong();
                flag=false;
            }
            catch (Exception ex){
                System.out.println("Introduzca un número válido");
                flag=true;
                sc.next();
            }
        }while (flag);
        return varEnter;
        }
    public static int con(String mensaje){
        Scanner sc=new Scanner(System.in);
        int varEnter=0;
        boolean flag;
    
        do{
        System.out.println("Introduzca "+mensaje);
        try{
        varEnter = sc.nextInt();
        flag=false;
        }
        catch (Exception ex){
            System.out.println("Introdujo alguna variable incorrecta " + ex);
            flag=true;
            sc.nextLine();
            } 
        } while (flag); 
        return varEnter;
    }
}
    
    