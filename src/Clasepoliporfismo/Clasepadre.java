
package Clasepoliporfismo;

import java.util.Scanner;

public abstract class Clasepadre {
  Scanner entrada=new Scanner (System.in);
  protected int dato1,dato2,resultado;
  
  public void pedirdatos(){
      System.out.println("Ingrese datos uno");  
      dato1=entrada.nextInt();
      
      System.out.println("Ingrese datos dos");  
      dato2=entrada.nextInt();
      
  }
  //crear metodo abstract y se lo agrego a la clase , pero no la lógica del método
  public abstract void operaciones ();
     
 public void mostrardatos(){
     System.out.println("El resultado  es :"+resultado);
 }
}
