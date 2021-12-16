package animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    	  Animal a1 = new Animal(1,"bob","dog","male",5,false);
          Animal cat1 = new Animal(3,"lame","cat","male",2,false);
          Animal cat2 = new Animal(1,"dog","cat","male",4,true);
          Animal a2 = new Animal(2,"tony","cat","male",2,false);
          Animal a3 = new Animal(3,"jaw","dog","male",5,true);
          List<Animal> Animals = new ArrayList<>();
          List<Animal> lstAnimal = new ArrayList<>();
          Shelter s = new Shelter("loving petss",1,lstAnimal);
          Shelter s2 = new Shelter("Good pets",2,Animals);
          
          s2.rescue(cat1);
          s.rescue(a1);
          s2.rescue(cat2);
          s.rescue(a2);
          s.rescue(a3);
          s.getAll();
          s2.getAll();
          System.out.println("--- after adoption ---");
          s.adopt(a2);
          s.getAll();
    }
}
