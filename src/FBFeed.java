import java.time.LocalDateTime;
import java.util.*;

public class FBFeed {

    ArrayList<FBPost> FBFeed = new ArrayList<>();
    Iterator<FBPost> iterator = FBFeed.iterator();

    public FBFeed(FBFeed fbFeed) {
        this.FBFeed = fbFeed.FBFeed;
    }

    public FBFeed() {
        this.FBFeed = new ArrayList<>();
    }

    public void addPost(FBPost post) {
        this.FBFeed.add(post.clone());
    }

    @Override
    public String toString() {
        return "FBFeed{" +
                "FBFeed=" + FBFeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FBFeed fbFeed = (FBFeed) o;
        return Objects.equals(FBFeed, fbFeed.FBFeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FBFeed);
    }

    public FBFeed clone() {
        return new FBFeed(this);
    }

    public ArrayList<FBPost> getFBFeed() {
        return FBFeed;
    }

    public void setFBFeed(ArrayList<FBPost> FBFeed) {
        this.FBFeed = FBFeed;
    }

    public Iterator<FBPost> getIterator() {
        return iterator;
    }

    public void setIterator(Iterator<FBPost> iterator) {
        this.iterator = iterator;
    }

    public int nrPosts(String user) {
        iterator = FBFeed.iterator();
        int cont = 0;
        while (iterator.hasNext()) {
            if (Objects.equals(iterator.next().getNomeUtilizador(), user)) cont += 1;
        }
        return cont;
    }

    public List<FBPost> postsOf(String user) {
        iterator = FBFeed.iterator();
        List<FBPost> result = new ArrayList<>();
        while (iterator.hasNext()) {
            FBPost post = iterator.next();
            if (Objects.equals(post.getNomeUtilizador(), user)) {
                result.add(post);
            }
        }
        return result;
    }

    public List<FBPost> postsOf(String user, LocalDateTime inicio, LocalDateTime fim) {
        iterator = FBFeed.iterator();
        List<FBPost> result = new ArrayList<>();
        while (iterator.hasNext()) {
            FBPost post = iterator.next();
            if (!Objects.equals(post.getNomeUtilizador(), user) && post.getDataCriacao().isAfter(inicio) && post.getDataCriacao().isBefore(fim)) {
                result.add(post);
            }
        }
        return result;
    }

    public FBPost getPost(int id) {
        iterator = FBFeed.iterator();
        while (iterator.hasNext()) {
            FBPost post = iterator.next();
            if (post.getId() == id) return post;
        }
        return iterator.next(); //Não sei o que por aqui, se ele encontrar já terá devolvido
    }

    public void comment(FBPost post, String comentario) {
        iterator = FBFeed.iterator();
        while (iterator.hasNext()) {
            FBPost postI = iterator.next();
            if (postI.equals(post)) {
                ArrayList<String> comentarios = (ArrayList<String>) post.getComentarios();
                comentarios.add(comentario);
                postI.setComentarios(comentarios);
            }
        }
    }

    public void comment(int postid, String comentario) {
        iterator = FBFeed.iterator();
        while (iterator.hasNext()) {
            FBPost post = iterator.next();
            if (post.getId() == postid) {
                ArrayList<String> comentarios = (ArrayList<String>) post.getComentarios();
                comentarios.add(comentario);
                post.setComentarios(comentarios);
            }
        }
    }

    public void like(FBPost post) {
        iterator = FBFeed.iterator();
        while (iterator.hasNext()) {
            FBPost postI = iterator.next();
            if (postI.equals(post)) {
                int likes = postI.getNumeroLikes();
                postI.setNumeroLikes(likes + 1);
            }
        }
    }

    public void like(int postid) {
        iterator = FBFeed.iterator();
        while (iterator.hasNext()) {
            FBPost post = iterator.next();
            if (post.getId() == postid) {
                int likes = post.getNumeroLikes();
                post.setNumeroLikes(likes + 1);
            }
        }
    }

    public List<Integer> top5Comments() {
        List<Integer> result = new ArrayList<Integer>();
        iterator = FBFeed.iterator();
        while (iterator.hasNext()) {
            FBPost post = iterator.next();
            result.add(post.getId());
        }

        while (result.size() > 5) {
            int min = Collections.min(result);
            result.remove(min);
        }
        return result;
    }
}
