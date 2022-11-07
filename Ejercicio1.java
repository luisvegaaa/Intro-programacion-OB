package introob;

public class Ejercicio1{
    public static void main(String[] args) {
        int result;
        result = suma(24,32,89);
        System.out.println(result);
         
     Coche miCoche = new Coche();
     
     miCoche.agregarPuertas();
     miCoche.agregarPuertas();
     System.out.println("El numero de puertas es:" + miCoche.nroPuertas);
    }

    
    public static int suma(int a, int b, int c){
      return a + b + c;
    }
}
    
    class Coche{
        public int nroPuertas = 2;
        public void agregarPuertas(){
            this.nroPuertas++;
        }
    }

    
  


