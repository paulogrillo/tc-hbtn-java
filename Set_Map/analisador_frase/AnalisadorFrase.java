import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase){
        TreeMap<String, Integer> map = new TreeMap<>();

        frase = frase.replace(".", "");
        frase = frase.replace("!", "");
        frase = frase.replace("?", "");

        int count=0;
        String[] arrayList = frase.split(" ");

        for (int i=0; i<arrayList.length; i++){
            for (int x=0; x<arrayList.length; x++){
                if (arrayList[i].equalsIgnoreCase(arrayList[x])){
                    count++;
                }
            }
            map.put(arrayList[i].toLowerCase(), count);
            count = 0;
        }
        return map;
    }
}
