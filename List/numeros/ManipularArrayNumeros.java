import java.util.List;
public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> numberList, int searchNumbers) {
            return numberList.indexOf(searchNumbers);
    }
    public static List<Integer> adicionarNumero(List<Integer> numberList, int numberAdd) throws Exception {
        int index = buscarPosicaoNumero(numberList, numberAdd);
        if (index != -1){
            throw new Exception("Numero jah contido na lista");
        }
        numberList.add(numberAdd);
        return numberList;
    }
    public static List<Integer> removerNumero(List<Integer> numberList, int numberRemove) throws Exception {
        int index = buscarPosicaoNumero(numberList, numberRemove);
        if (index <0){
            throw new Exception("Numero nao encontrado na lista");
        }
        numberList.remove(index);
        return numberList;
    }

    public static List<Integer> substituirNumero(List<Integer> numberList, int numberRemove, int numberAdd){
        int index = buscarPosicaoNumero(numberList, numberRemove);
        if (index <0){
            numberList.add(numberAdd);
        }else {
            numberList.set(index, numberAdd);
        }
        return numberList;
    }
}
