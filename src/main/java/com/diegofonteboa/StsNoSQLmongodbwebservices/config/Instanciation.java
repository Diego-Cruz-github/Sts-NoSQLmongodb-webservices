package com.diegofonteboa.StsNoSQLmongodbwebservices.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.diegofonteboa.StsNoSQLmongodbwebservices.domain.Post;
import com.diegofonteboa.StsNoSQLmongodbwebservices.domain.User;
import com.diegofonteboa.StsNoSQLmongodbwebservices.dto.AuthorDTO;
import com.diegofonteboa.StsNoSQLmongodbwebservices.dto.CommentDTO;
import com.diegofonteboa.StsNoSQLmongodbwebservices.repository.PostRepository;
import com.diegofonteboa.StsNoSQLmongodbwebservices.repository.UserRepository;

@Configuration
public class Instanciation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT")); // LONDON

        userRepository.deleteAll(); // zerando aqui
        postRepository.deleteAll(); // idem

        User maria = new User(null, "Maria Brown", "maria@gmail.com"); // o bd gera o id.
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO (maria));
        
        CommentDTO c1 = new CommentDTO("Boa viagem mano!", sdf.parse("21/03/2018"), new AuthorDTO(alex)); //post1
		CommentDTO c2 = new CommentDTO("Aproveite", sdf.parse("22/03/2018"), new AuthorDTO(bob));   //post1
		CommentDTO c3 = new CommentDTO("Tenha um ótimo dia!", sdf.parse("23/03/2018"), new AuthorDTO(alex));  //post 2
		
		
		post1.getComments().addAll(Arrays.asList(c1, c2));
		post2.getComments().addAll(Arrays.asList(c3));

        postRepository.saveAll(Arrays.asList(post1, post2)); // Corrigido para saveAll()
        
        maria.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(maria);
        
    }
}