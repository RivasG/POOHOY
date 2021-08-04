
package Clasepoliporfismo;

public class Claseprincipal {
    public static void main(String[] args) {
    Clasepadre opsuma=new Clasehijasuma();
    opsuma.pedirdatos();
    opsuma.operaciones();
    opsuma.mostrardatos();
    
    Clasepadre opresta=new Clasehijaresta();
    opresta.pedirdatos();
    opresta.operaciones();
    opresta.mostrardatos();
    } 
}
