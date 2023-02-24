/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

/**
 *
 * @author Rene
 */
public abstract class Gui {
    public final static Console console=System.console();
    public final static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    
    public static String[] input(String name,String []msgs){
        String input[]=new String[msgs.length];
        outLn("=== "+name+" ===");
        for (int i = 0; i < msgs.length; i++) {
            input[i]=input(msgs[i]);
            
        }
    return input;
    }
     public static String input(String name,String msg){
          outLn("=== "+name+" ===");
     return input(msg);
     }
      public static String input(String msg){
          outLn(msg);
          String line=readLine();
          Boolean out=null;
          do{
              outLn("estas seguro? y/n");
              String yn=readLine();
              if(yn.startsWith("y"))out=true;
              if(yn.startsWith("n"))out=false;
          }while(out==null);
          newLine();
          
     return out?line:null;
     }
      
      public static int menu(String name,String entradas[]){
          outLn("=== "+name+" ===");
          outLn("seleccione la opcion");
          for (int i = 0; i < entradas.length; i++) {
            outLn((i+1)+".-"+entradas[i]);  
          }
      int out=-1;
       do{

           String entrada=readLine().trim();
                      System.out.println("entrada="+entrada);
              out=Integer.parseInt(entrada);
              System.out.println("out="+out);
              //String yn=readLine();
              System.out.println("entradas.length="+entradas.length);
              System.out.println("out-1>=entradas.length="+(out-1>=entradas.length));
              System.out.println("out<=0="+(out<=0));
             if(out-1>=entradas.length||out<=0){
                 outLn("Ingrese la opcion del 1 al "+entradas.length);
             }
          }while(out==-1);
         newLine();
          System.out.println("re out-1="+(out-1));
         return out-1;
      }
      
      public static void outLn(String msg){
          System.out.println(msg);
      }
      public static void newLine(){
          System.out.println();
      }
      public static void out(String msg){
          System.out.print(msg);
      }
      public static String readLine(){
        if(console!=null){
        return console.readLine();
        }
        try{
            return reader.readLine();
        }catch(Exception ex){
        throw new RuntimeException(ex);
        }
      }
}
