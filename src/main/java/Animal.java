import java.util.List;

public class Animal {
    private String name;
    private int age;
    private boolean isFly;
    List<String> animalList;
    private Sound sound;

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public String shout() {
        return this.sound.shout();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getFly() {
        return isFly;
    }

    public void setFly(Boolean fly) {
        isFly = fly;
    }

    public List getAnimalList() {
        return animalList;
    }

}
