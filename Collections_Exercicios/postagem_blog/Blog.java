import java.util.*;

public class Blog {

    private List<Post> posts;


    public Blog(){
        this.posts = new ArrayList<Post>();
    }


/*    public void adicionarPostagem(Post post) throws IllegalArgumentException{
        if(this.posts.stream().filter(p -> p.getAutor().equals(post.getAutor()) && p.getTitulo().equals(post.getTitulo())).count() > 0)
            throw new IllegalArgumentException("Postagem jah existente");

        this.posts.add(post);
    }*/

    public void adicionarPostagem(Post newPostagem) throws IllegalArgumentException{
        for (Post posts : posts){
            if (posts.getAutor().equals(newPostagem.getAutor()) && posts.getTitulo().contains(newPostagem.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(newPostagem);
    }

    public TreeSet<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<>();
        for(Post post : posts){
            autores.add(post.getAutor());
        }
        return (TreeSet<Autor>) autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> countCategorias = new TreeMap<>();

        this.posts.forEach(postagem -> {
            countCategorias.compute(postagem.getCategoria(), (key, value) -> {
                if(value == null)
                    return 1;
                else
                    return value + 1;
            });
        });
        return countCategorias;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postAutor = new TreeSet<Post>();
        posts.sort(Comparator.comparing(Post::getTitulo));
        this.posts.forEach(postagem -> {
            if (postagem.getAutor().equals(autor)){
                postAutor.add(postagem);
            }
        });
        return postAutor;
    }

    public  Set<Post> obterPostsPorCategoria(Categorias categorias){
        Set<Post> postCategorias = new TreeSet<>();
        posts.sort(Comparator.comparing(Post::getTitulo));

        this.posts.forEach(x -> {
            if (x.getCategorias().equals(categorias)){
                postCategorias.add(x);
            }
        });
        return postCategorias;
    }
    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> findAllPosts = new TreeMap<>();
        for (Post post : posts) {
            Set<Post> postagem;
            if (!findAllPosts.containsKey(post.getCategoria())) {
                postagem = new TreeSet<>();
            } else {
                postagem = findAllPosts.get(post.getCategoria());
            }
            postagem.add(post);
            findAllPosts.put(post.getCategoria(), postagem);
        }

        return findAllPosts;

    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPosts = new TreeMap<>();
        for (Post post : posts) {
            Set<Post> postagem;
            if (todosPosts.containsKey(post.getAutor())) {
                postagem = todosPosts.get(post.getAutor());
            } else {
                postagem = new TreeSet<>();
            }

            postagem.add(post);
            todosPosts.put(post.getAutor(), postagem);
        }

        return todosPosts;
    }
}
