package config;

import domain.Klas;
import domain.KlasManager;
import domain.Leerling;
import domain.SimpleUserManager;
import domain.User;
import domain.UserManager;
import domain.SimpleKlasManager;
import domain.Toets;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver
                = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;

    }

    @Bean
    public UserManager userManager() {
        SimpleUserManager um = new SimpleUserManager();
        List<User> users = new LinkedList<>();
        users.add(new User("user", "test"));
        um.setUsers(users);
        return um;
    }

    @Bean
    public KlasManager klasManager() {
        List<Klas> klassen = new LinkedList<>();

        //Aanmaken Testen
        //Klas 1
        //Toetsen van Leerling 1
        Toets[] toetsenL1 = {new Toets(20, 13), new Toets(20, 15), new Toets(10, 7)};
        //Toetsen van Leerling 2
        Toets[] toetsenL2 = {new Toets(20, 11), new Toets(20, 10), new Toets(10, 6)};
        //Toetsen van Leerling 3
        Toets[] toetsenL3 = {new Toets(20, 15), new Toets(20, 16), new Toets(10, 8)};

        //Klas 2
        //Toetsen van Leerling 4
        Toets[] toetsenL4 = {new Toets(20, 14), new Toets(20, 14), new Toets(10, 5)};
        //Toetsen van Leerling 5
        Toets[] toetsenL5 = {new Toets(20, 16), new Toets(20, 13), new Toets(10, 6)};
        //Toetsen van Leerling 6
        Toets[] toetsenL6 = {new Toets(20, 11), new Toets(20, 9), new Toets(10, 4)};

        //Aanmaken Leerlingen
        Leerling l1 = new Leerling(1, "Lodewijk", "Schuurs");
        l1.setToetsen(Arrays.asList(toetsenL1));
        Leerling l2 = new Leerling(2, "Kenan", "Oosterling");
        l2.setToetsen(Arrays.asList(toetsenL2));
        Leerling l3 = new Leerling(3, "Sherif", "Slooten");
        l3.setToetsen(Arrays.asList(toetsenL3));

        Leerling[] leerlingenKlas1 = {l1, l2, l3};

        Leerling l4 = new Leerling(4, "Laurens", "Smout");
        l4.setToetsen(Arrays.asList(toetsenL4));
        Leerling l5 = new Leerling(5, "Bram", "Steijger");
        l5.setToetsen(Arrays.asList(toetsenL5));
        Leerling l6 = new Leerling(6, "Luc", "Kegel");
        l6.setToetsen(Arrays.asList(toetsenL6));

        Leerling[] leerlingenKlas2 = {l4, l5, l6};

        //Aanmaken Klassen
        Klas k1 = new Klas("1ATa");
        k1.setLeerlingen(Arrays.asList(leerlingenKlas1));
        Klas k2 = new Klas("1ATb");
        k2.setLeerlingen(Arrays.asList(leerlingenKlas2));

        klassen.add(k1);
        klassen.add(k2);

        SimpleKlasManager km = new SimpleKlasManager();
        km.setKlassen(klassen);
        return km;
    }

}
