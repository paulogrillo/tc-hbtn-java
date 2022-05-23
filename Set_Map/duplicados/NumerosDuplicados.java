import java.util.*;
import java.util.stream.Collectors;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros){
        HashSet<Integer> hashSetNumerosUnicos = new HashSet<>();
        TreeSet<Integer> treeSetNumerosDuplicados = new TreeSet<>();

        for (Integer numero : numeros){
            Boolean duplicado = hashSetNumerosUnicos.add(numero);
            if (!duplicado){
                treeSetNumerosDuplicados.add(numero);
            }
        }
        return treeSetNumerosDuplicados;
    }
}
