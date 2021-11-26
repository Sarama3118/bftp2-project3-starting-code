package net.filmcity.app.repositories;

import net.filmcity.app.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private final MovieRepository movieRepository;

    @Autowired
    public SampleDataLoader(MovieRepository movieRepository){

        this.movieRepository = movieRepository;
    }

    @PostConstruct
    public void addSampleMovies() {
        if (movieRepository.findAll().isEmpty()) {
            List<Movie> movies = List.of(
                    new Movie("Jurassic Park",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oU7Oq2kFAAlGqbU4VoAE36g4hoI.jpg",
                            "Steven Spielberg",
                            1993, "Adventure",
                            "A wealthy entrepreneur secretly creates a theme park featuring living dinosaurs drawn from prehistoric DNA."),
                    new Movie("Ratatouille",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/npHNjldbeTHdKKw28bJKs7lzqzj.jpg",
                            "Brad Bird",
                            2007,
                            "Remy, a resident of Paris, appreciates good food and has quite a sophisticated palate. He would love to become a chef so he can create and enjoy culinary masterpieces to his heart's delight. The only problem is, Remy is a rat."),
                    new Movie("Cruella",
                            "https://pics.filmaffinity.com/Cruella-196211257-large.jpg",
                            "Craig Gillespie",
                            2021,
                            "Set in London during the punk rock movement of the 1970s, the film revolves around Estella Miller, an aspiring fashion designer, as she explores the path that will lead her to become a notorious up-and-coming fashion designer known as Cruella de Vil."
                            ),
                    new Movie("Mean Girls",
                            "https://images-na.ssl-images-amazon.com/images/I/71eQtET-kmL._RI_.jpg",
                            "Mark Waters",
                            2004,
                            "Lindsay Lohan stars as Cady Heron, a 16 year old homeschooled girl who not only makes the mistake of falling for Aaron Samuels (Jonathan Bennett), the ex-boyfriend of queenbee Regina George (Rachel McAdams), but also unintentionally joins The Plastics, led by Regina herself."
                            ),
                    new Movie("Lady Bird",
                            "https://pics.filmaffinity.com/Lady_Bird-546261513-large.jpg",
                            "Greta Gerwig",
                            2017,
                            "Christine 'Lady Bird' McPherson (Saoirse Ronan) is a senior at a Catholic high school in Sacramento, California in 2002. She longs to attend a prestigious college in 'a city with culture'."
                            ),
                    new Movie("Suffragette",
                            "https://musicart.xboxlive.com/7/b81f2600-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080",
                            "Sarah Gavron",
                            2015,
                            "Inspired by true events, Suffragette movingly explores the passion and heartbreak of those who risked all they had for women's right to vote – their jobs, their homes, their children, and even their lives."
                            ),
                    new Movie("On the basis of sex",
                            "https://m.media-amazon.com/images/I/71TuUvNkS4L._SL1500_.jpg",
                            "Mimi Leder",
                            2018,
                            "On the Basis of Sex is inspired by the true story of a young Ruth Bader Ginsburg – then a struggling attorney and new mother – who faces adversity and numerous obstacles in her fight for equal rights throughout her career."
                            ),
                    new Movie("The Father",
                            "https://www.senderi.org/admin/magatzem/blocfot/thefather-273045718-large.jpg",
                            "Florian Zeller",
                            2020,
                            "Anne (Olivia Colman) is losing patience with her 80-year-old father, Anthony (Anthony Hopkins), whose grip on reality is fading but who refuses to allow a carer to look after him. She's moving to Paris and needs to ensure his safety while she is away so before she leaves she must find someone who will endure him. "
                            ),

                    new Movie("The Perks of Being a Wallflower",
                            "https://m.media-amazon.com/images/I/71fLFQge1hL._SY606_.jpg",
                             "Stephen Chbosky",
                            2012,
                            "Based on the novel written by Stephen Chbosky, this is about 15-year-old Charlie (Logan Lerman), an endearing and naive outsider, coping with first love (Emma Watson), the suicide of his best friend, and his own mental illness while struggling to find a group of people with whom he belongs. The introvert freshman is taken under the wings of two seniors, Sam and Patrick, who welcome him to the real world. "
                    ),

                    new Movie("The Color Purple",
                            "http://prodimage.images-bn.com/pimages/0085391163107_p0_v4_s1200x630.jpg",
                            "Steven Spielberg",
                            1985,
                            "Early 20th century. It tells the story of Celie, a fourteen-year-old black teenager who is pregnant with her own father, a despotic and cruel man. From then on his life will be full of pain and humiliation."
                    ),
                    new Movie("Coraline",
                    "http://image.tmdb.org/t/p/original/sYXXUeSrx9TBbFpbgtLklW5kmVR.jpg",
                    "Henry Selick",
                    1985,
                    "Based on a novel by Neil Gaiman, it tells the story of a girl who, when crossing a wall of her house, finds an improved version of her life: her parents are more considerate of her, but the wonderful sensations will give way to fear and anguish."
            )
            );

            movieRepository.saveAll(movies);
        }
    }
}
