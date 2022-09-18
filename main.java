public class Main{
  
  public static void main(String [] args){
    suma(1, 2, 3);
    coche miCoche = new coche();
    miCoche.masPuertas();
    System.out.println(miCoche.puertas);
  }
  
  
  
  public static int suma(int a, int b, int c){
    return a + b + c;
  }
    
}

 class coche{
    public int puertas = 4;
    
    public void masPuertas(){
       this.puertas++;
    }
    
  }
