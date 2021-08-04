
package Operaciones;

import java.util.Scanner;

public class Clasepadre {
  Scanner entrada=new Scanner(System.in);
  protected int dato1,dato2,resultado;
  
  public void pedirdatos(){
      System.out.println("Ingrese el primer valor");
      dato1=entrada.nextInt();
      System.out.println("Ingrese el segundo valor ");
      dato2=entrada.nextInt();  
  }
  
  public void mostrardatos() {
      System.out.println(resultado);
  }
}
