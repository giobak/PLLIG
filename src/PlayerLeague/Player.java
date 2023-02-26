
package PlayerLeague;

import java.util.UUID;

import lombok.Setter;
import lombok.Getter;


public class Players {

    private UUID id;
    private String name;
    private String surname;
    int age;


    public Players() {
        this.name = "Giorgi";
        this.surname = "Bakradze";
        this.age = 46;
    }

    public Players(String name, String surname, int age) {
        this.id = new;
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
}

