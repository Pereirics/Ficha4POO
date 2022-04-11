import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FBPost {

    // variáveis de instância
    private int id;
    private String nomeUtilizador;
    private LocalDateTime dataCriacao;
    private String conteudoPost;
    private int numeroLikes;
    private List<String> comentarios;

    public FBPost() {
        id = 0;
        nomeUtilizador = "";
        dataCriacao = LocalDateTime.now();
        conteudoPost = "";
        numeroLikes = 0;
        comentarios = new ArrayList<>(0);
    }

    public FBPost(int id, String nomeUtilizador, LocalDateTime dataCriacao, String conteudoPost, int numeroLikes, List<String> comentarios) {
        this.id = id;
        this.nomeUtilizador = nomeUtilizador;
        this.dataCriacao = dataCriacao;
        this.conteudoPost = conteudoPost;
        this.numeroLikes = numeroLikes;
        this.comentarios = comentarios;
    }

    public FBPost(FBPost fbPost) {
        this.id = fbPost.id;
        this.nomeUtilizador = fbPost.nomeUtilizador;
        this.dataCriacao = fbPost.dataCriacao;
        this.conteudoPost = fbPost.conteudoPost;
        this.numeroLikes = fbPost.numeroLikes;
        this.comentarios = fbPost.comentarios;
    }

    public int getId() {
        return id;
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getConteudoPost() {
        return conteudoPost;
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setConteudoPost(String conteudoPost) {
        this.conteudoPost = conteudoPost;
    }

    public void setNumeroLikes(int numeroLikes) {
        this.numeroLikes = numeroLikes;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "FBPost{" +
                "id=" + id +
                ", nomeUtilizador='" + nomeUtilizador + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", conteudoPost='" + conteudoPost + '\'' +
                ", numeroLikes=" + numeroLikes +
                ", comentarios=" + comentarios +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FBPost fbPost = (FBPost) o;
        return id == fbPost.id && numeroLikes == fbPost.numeroLikes && Objects.equals(nomeUtilizador, fbPost.nomeUtilizador) && Objects.equals(dataCriacao, fbPost.dataCriacao) && Objects.equals(conteudoPost, fbPost.conteudoPost) && Objects.equals(comentarios, fbPost.comentarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeUtilizador, dataCriacao, conteudoPost, numeroLikes, comentarios);
    }

    public FBPost clone() {
        return new FBPost(this);
    }
}
