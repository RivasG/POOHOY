
package principal;
import Operaciones.Clasehijasuma;
import Operaciones.Clasehijaresta;

public class Claseprincipal {
    public static void main(String[] args) {
     Clasehijasuma opsuma=new Clasehijasuma();
      
    opsuma.pedirdatos();
    opsuma.sumar();
    System.out.print("El resultado es :");
    opsuma.mostrardatos();
    
    Clasehijaresta opresta=new Clasehijaresta();
    opresta.pedirdatos();
    opresta.restar();
     System.out.print("La resta es  :");
    opresta.mostrardatos();
    
    
    
    }
  
    
}
