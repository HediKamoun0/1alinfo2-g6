package animal;

import java.util.List;

//Interface created by yassine
public interface InterfaceShelter {
     void rescue(Animal a);
     void adopt(Animal a);
     void update(Animal a);
     void getAll();
     List<Animal> getByType(String s);
    void vaccinate(Animal a);

}
