package ies.vdm.examen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Util {

     /**
     * Comprueba si dos cadenas son anagramas, ignorando espacios,
     * signos de puntuación y diferencias entre mayúsculas y minúsculas.
     * @param cadena1 primera cadena
     * @param cadena2 segunda cadena
     * @return true si cadena1 y cadena2 son anagramas, false en caso contrario
     */
    public static boolean esAnagrama(String cadena1, String cadena2) {
        // 1. Normalizar: solo dejar letras y pasar a minúsculas
        String s1 = "";
        for (int i = 0; i < cadena1.length(); i++) {
            char c = cadena1.charAt(i);
            if (Character.isLetter(c)) {
                s1 = s1 + Character.toLowerCase(c);
            }
        }
        String s2 = "";
        for (int i = 0; i < cadena2.length(); i++) {
            char c = cadena2.charAt(i);
            if (Character.isLetter(c)) {
                s2 = s2 + Character.toLowerCase(c);
            }
        }

        // 2. Si las longitudes difieren, no son anagramas
        if (s1.length() != s2.length()) {
            return false;
        }

        // 3. Ordenar y comparar arrays de caracteres
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
    
    /**
     * Intercala caracteres de dos cadenas. Si una cadena es más larga,
     * añade el resto al final, usando concatenación de cadenas.
     * @param s1 primera cadena
     * @param s2 segunda cadena
     * @return cadena intercalada
     */
    public static String intercalarCadenas(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        String result = "";
        int i = 0;
        while (i < n1 && i < n2) {
            result = result + s1.charAt(i) + s2.charAt(i);
            i++;
        }
        if (i < n1) {
            result = result + s1.substring(i);
        }
        if (i < n2) {
            result = result + s2.substring(i);
        }
        return result;
    }
    
    /**
     * Rota los elementos de una lista hacia la derecha k posiciones.
     * @param lista lista de elementos
     * @param k número de rotaciones
     * @return lista rotada
     */
    public static <T> List<T> rotarLista(List<T> lista, int k) {
        int n = lista.size();
        if (n == 0 || k <= 0) {
            return new ArrayList<>(lista);
        }
        int d = k % n;
        List<T> resultado = new ArrayList<>();
        // Añadir últimos d elementos al inicio
        resultado.addAll(lista.subList(n - d, n));
        // Añadir el resto
        resultado.addAll(lista.subList(0, n - d));
        return resultado;
    }
    
    /**
     * Intersección de lista1 y lista2:
     * conserva orden de lista1 y omite duplicados.
     */
    public static <T> List<T> interseccionListas(List<T> lista1, List<T> lista2) {
        Set<T> conjunto2 = new HashSet<>(lista2);
        Set<T> yaAgregados = new HashSet<>();
        List<T> resultado = new ArrayList<>();

        for (T elemento : lista1) {
            if (conjunto2.contains(elemento) && !yaAgregados.contains(elemento)) {
                resultado.add(elemento);
                yaAgregados.add(elemento);
            }
        }
        return resultado;
    }

}
    


    
    
