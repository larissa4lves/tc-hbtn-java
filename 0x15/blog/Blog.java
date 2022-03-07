
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
	
	private List<Post> posts;
	
	
	public Blog() {
		posts = new ArrayList<>();
	}
	
	public void adicionarPostagem(Post postagem ) {
		posts.add(postagem);
	}

	public Set<String> obterTodosAutores() {
		Set<String> autores = new TreeSet<>();
		
		for(Post post : posts) {
			String nome = post.getAutor();
			autores.add(nome);
		}
		return autores;
	}
	
	public Map<String, Integer> obterContagemPorCategoria() {
		 Map<String, Integer> map = new TreeMap<>();
		 
		 int total = 0;
			
			for(int i=0; i< posts.size(); i++) {
				for(int x=0; x<posts.size(); x++) {
					if(posts.get(i).getCategoria().equals(posts.get(x).getCategoria())) {
						total++;
					}
				}
				map.put(posts.get(i).getCategoria(), total);
				total = 0;
			}
		
		return map;
	}
}