/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

/**
 *
 * @author wilson
 */
import java.util.Scanner;
public class Main extends Usuario{
   static Usuario us = new Usuario();
   static Doctor dr= new Doctor();
   static int id=0;
   static Enfermera en= new Enfermera();
   static Paciente ps=new Paciente();
   static Scanner sc= new Scanner(System.in);
    static Scanner sc2= new Scanner(System.in);
   static void menu(){
        int op,x;
        Scanner sc= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        System.out.println("---------MENU PRINCIPAL--------");
        System.out.println("1.Crear usuario Doctor");
        System.out.println("2.Crear usuario Enfermera");
        System.out.println("3.Crear usuario Paciente");
        System.out.print("Seleccione una opcion: ");
        op=sc2.nextInt();
        switch(op){
            case 1:
                
                System.out.println("-------Doctor------");
                datos();
                System.out.println("Ingrese especialidad");
                dr.speciality= sc.nextLine();
                imprimirDatos();
                System.out.println("Especialidad: "+dr.speciality);
            break;
            case 2:
                System.out.println("-------Enfermera------");
                datos();
                System.out.println("Ingrese especialidad");
                en.speciality= sc.nextLine();
                imprimirDatos();
                System.out.println("Especialidad: "+en.speciality);
            break;
            case 3:
                System.out.println("-------Paciente------");
                datos();
                System.out.println("Fecha de nacimiento:");
                ps.birthday =sc.nextLine();
                System.out.println("Altura:");
                ps.height =sc2.nextDouble();
                System.out.println("Peso:");
                ps.weight =sc2.nextDouble();
                System.out.println("Tipo de sangre:");
                ps.blood =sc.nextLine();
                imprimirDatos();
                System.out.println("Fecha:" +ps.birthday);
                System.out.println("Tipo de sangre: "+ps.blood);
                System.out.println("Altura: "+ps.height);
                System.out.println("Peso: "+ps.weight);
            break;
            default:
                System.out.println("Opcion invalida...");
                menu();
        
        }
         System.out.println("Desea ingresar otro registro?\n1.Si 2.No");
         x=sc.nextInt();
        if(x==1){
          menu();
      }
     }
   static void imprimirDatos(){
       System.out.println("-----DATOS-----");
       System.out.println("ID: "+us.id);
       System.out.println("Nombre: "+us.name);
       System.out.println("email: "+us.email);
       System.out.println("Direccion: "+us.address);
       System.out.println("Numero: "+us.phoneNumber);
       
       
   }
       static void datos(){
          Scanner sc= new Scanner(System.in);
          id++;
          us.id=id;
          System.out.println("Ingrese nombre de usuario:");
          us.name = sc.nextLine();
          System.out.println("Ingrese email:");
          us.email = sc.nextLine();
          System.out.println("Ingrese Direccion");
          us.address = sc.nextLine();
          System.out.println("Ingrese Numero");
          us.phoneNumber=sc.nextLine();
}   
      public static void main(String[] args){
      
      menu();
     
        
    }
  
}