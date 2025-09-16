package ejercicios.actividad2;

public class Cambio {
   final double monedas[] = {500, 200, 100, 50, 20, 10, 5, 2, 1, 
                             0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
   private double importe;
   
   public Cambio(double importe) {
      setImporte(importe);
   }
   
   public void setImporte(double importe) {
      if (importe > 0) {
         this.importe = importe;
      } else {
         this.importe = 0;
      }
   }
 
   public  void mostrarCambio() {
      int unidades;
      System.out.println("Cambio de: " + importe);
      
      for(double moneda: monedas) {
         unidades = (int)(importe/moneda);
         if (unidades > 0) {
            System.out.println(unidades + " x " + moneda);
         }
         importe -= unidades*moneda;
      }
   }
}
