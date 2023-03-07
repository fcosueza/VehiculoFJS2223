
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoSuezaRguezFco2223 miVehiculoSuezaRguezFco2223;
        int stockActual;
        
        miVehiculoSuezaRguezFco2223 = new VehiculoSuezaRguezFco2223("Seat",18000,100);
        operativaVehiculoSuezaRguezFco2223(miVehiculoSuezaRguezFco2223, 50); 
    }

    public static void operativaVehiculoSuezaRguezFco2223(VehiculoSuezaRguezFco2223 miVehiculoSuezaRguezFco2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoSuezaRguezFco2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoSuezaRguezFco2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoSuezaRguezFco2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
