import java.util.*;

public class Blog {

    private ArrayList<Post> posts = new ArrayList<>();
    private Set<String> autores = new TreeSet<>();

    //private String autores;

    public void adicionarPostagem(Post postagem){
        this.posts.add(postagem);
    }

    public TreeSet<String> obterTodosAutores(){
        for(Post post : posts){
            autores.add(post.getAutor());
            //autores = post.getAutor();
        }
        return (TreeSet<String>) autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        ArrayList<String> categorias = new ArrayList<>();
        Map<String, Integer> countCategorias = new TreeMap<>();

        for(Post post : posts){
            categorias.add(post.getCategoria());
        }

        for (String categoria : categorias){
            if (!countCategorias.containsKey(categoria)){
                countCategorias.put(categoria, 1);
            }else {
                countCategorias.put(categoria, countCategorias.get(categoria)+1);
            }
        }
        return countCategorias;
    }
}
