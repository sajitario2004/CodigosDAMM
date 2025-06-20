package ies.vdm;

public class EjercicioB {

    
    private static String numeroConDosDecimales(double valor) {

        int entero = (int) valor;
        int decimales = (int) ((valor - entero) * 100 + 0.5); 
        //+0.5 para redondear correctamente

        String strDecimales = "" + decimales;
        if (decimales < 10) {
            strDecimales = "0" + strDecimales;
        }

        return entero + "." + strDecimales;
    }

    public static String Main(double baseImponible, String tipoIVA, String codPromo) {
        tipoIVA = tipoIVA.toLowerCase();
        codPromo = codPromo.toLowerCase();

        double porcentajeIVA = 0;
        switch (tipoIVA) {
            case "general":
                porcentajeIVA = 0.21;
                break;
            case "reducido":
                porcentajeIVA = 0.10;
                break;
            case "superreducido":
                porcentajeIVA = 0.04;
                break;
            default:
                return "Tipo de IVA no válido.";
        }

        double iva = baseImponible * porcentajeIVA;
        double precioConIVA = baseImponible + iva;

        double descuento = 0;
        switch (codPromo) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = precioConIVA / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioConIVA * 0.05;
                break;
            default:
                return "Código promocional no válido.";
        }

        double total = precioConIVA - descuento;

        String resultado = "";
        resultado += "Base imponible        " + numeroConDosDecimales(baseImponible) + "\n";
        resultado += "IVA (" + (int)(porcentajeIVA * 100) + "%)             " + numeroConDosDecimales(iva) + "\n";
        resultado += "Precio con IVA        " + numeroConDosDecimales(precioConIVA) + "\n";
        resultado += "Cód. promo. (" + codPromo + "): -" + numeroConDosDecimales(descuento) + "\n";
        resultado += "TOTAL                 " + numeroConDosDecimales(total) + "\n";

        return resultado;
    }
    public static void main(String[] args) {
    	double baseImponible = 100.32;
    	String tipoIVA = "general";
    	String codPromo = "meno5";
		String respuesta = Main(baseImponible, tipoIVA, codPromo);
		System.out.println(respuesta);
		
		String resultado1 = Main(100, "general", "nopro");
		String resultado2 = Main(100, "reducido", "mitad");
		String resultado3 = Main(100, "superreducido", "meno5");
		String resultado4 = Main(200, "general", "5porc");
		String resultado5 = Main(100, "invalido", "nopro");
		String resultado6 = Main(100, "general", "desconocido");
		System.out.println(resultado4);
		
	}
}
