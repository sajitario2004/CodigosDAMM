import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RETO3{
    public static void main(String[] args) {
        ArrayList<Integer> listaPrueba1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int target = 5;

        ArrayList<ArrayList<Integer>> result1 = findNumber(listaPrueba1, target);

    }

    public static ArrayList<ArrayList<Integer>> findNumber(ArrayList<Integer> listNumbers, int target) {

        int contJumps = 0;

        ArrayList<ArrayList<Integer>> results = new ArrayList<>();

        Iterator<Integer> iterator = listNumbers.iterator();
        while (iterator.hasNext()) {
            int it = iterator.next();

            ArrayList<Integer> listaAux = new ArrayList<Integer>(listNumbers.subList(2, listNumbers.size()));

            Iterator<Integer> iteratorAux = listaAux.iterator();
            while (iteratorAux.hasNext()) {
                int itAux = iteratorAux.next();

            }
           // int 
        }
        return null;
    }
}