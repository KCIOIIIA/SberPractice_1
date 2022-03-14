import java.io.Serializable;

public class Character implements Serializable {
    String name;
    int age;
    HairColor hairColor;
    EyeColor eyeColor;

    public Character(String name){
        this.name = name;
        this.age = age;
        this.hairColor = Blond;
        this.eyeColor = Green;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public int getAge () {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
}
