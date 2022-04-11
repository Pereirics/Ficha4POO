import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FBFeedTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Test1() {
        FBFeed fbFeed = new FBFeed();
        FBPost fbPost = new FBPost();
        fbPost.setId(0);
        fbPost.setNumeroLikes(23);
        fbPost.setComentarios(List.of("Oh meu deus adoro", "Que giro!"));
        fbPost.setConteudoPost("Foto de um cãozinho");
        fbPost.setDataCriacao(LocalDateTime.now());
        fbPost.setNomeUtilizador("Pereirics");
        fbFeed.addPost(fbPost);

        assertEquals(1, fbFeed.nrPosts("Pereirics"));
    }

    @Test
    void Test2() {
        FBFeed fbFeed = new FBFeed();
        FBPost fbPost = new FBPost();
        fbPost.setId(0);
        fbPost.setNumeroLikes(23);
        fbPost.setComentarios(List.of("Oh meu deus adoro", "Que giro!"));
        fbPost.setConteudoPost("Foto de um cãozinho");
        fbPost.setDataCriacao(LocalDateTime.of(2022, 4, 11, 17, 15));
        fbPost.setNomeUtilizador("Pereirics");

        fbFeed.addPost(fbPost);

        List<FBPost> posts = new ArrayList<>();
        posts.add(fbPost);

        assertEquals(posts, fbFeed.postsOf("Pereirics"));
    }

    @Test
    void Test3() {
        FBFeed fbFeed = new FBFeed();
        FBPost fbPost = new FBPost();
        fbPost.setId(0);
        fbPost.setNumeroLikes(23);
        fbPost.setComentarios(List.of("Oh meu deus adoro", "Que giro!"));
        fbPost.setConteudoPost("Foto de um cãozinho");
        fbPost.setDataCriacao(LocalDateTime.now());
        fbPost.setNomeUtilizador("Pereirics");

        fbFeed.addPost(fbPost);

        assertEquals(fbPost, fbFeed.getPost(0));
    }
}