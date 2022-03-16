import java.io.Serializable;

public class Pets implements Serializable {
    String name;
    int age;
    CoatColor coatColor;
    EyeColor eyeColor;

    public Pets(String name, int age, CoatColor coatColor, EyeColor eyeColor){
        this.name = name;
        this.age = age;
        this.coatColor = coatColor;
        this.eyeColor = eyeColor;
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
        this.age = age;}

    public String toString() {
        return "Pets{" +
                "name = " + name +
                ", age = "+ age +
                ", coatColor = " + coatColor +
                ", eyeColor = " + eyeColor +
                "}";
    }
}
