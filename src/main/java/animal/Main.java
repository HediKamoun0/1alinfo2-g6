package animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal(1,"bob","dog","male",5,false);
        Animal a2 = new Animal(2,"tony","cat","male",2,false);
        Animal a3 = new Animal(3,"jaw","dog","male",5,true);
        List<Animal> lstAnimal = new ArrayList<>();
        Shelter s = new Shelter("loving pets",1,lstAnimal);
        s.rescue(a1);
        s.rescue(a2);
        s.rescue(a3);
        s.getAll();

    }
}
