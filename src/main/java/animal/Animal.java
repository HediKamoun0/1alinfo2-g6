package animal;

public class Animal {
    private int id;
    private String name;
    private String Type;
    private String gender;
    private int age;
    private boolean vaccinated;

    public Animal() {
    }

    public Animal(int id, String name, String type, String gender, int age, boolean vaccinated) {
        this.id = id;
        this.name = name;
        Type = type;
        this.gender = gender;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Type='" + Type + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", vaccinated=" + vaccinated +
                '}';
    }
}
