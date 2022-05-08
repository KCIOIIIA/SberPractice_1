public class Traveler {
    private final Integer speed;
    private final Integer time;

    public Traveler(Integer speed, Integer time){
        this.time = time;
        this.speed = speed;
    }

    public Integer getSpeed(){
        return speed;
    }

    public Integer getTime(){
        return time;
    }

    public Integer way() {
        Integer i = speed * time;
        return i;
    }
    public String toString(){
        String str1 = String.valueOf(speed);
        String str2 = String.valueOf(time);
        return "(скорость = " + str1 + ", время = " + str2 +")";
    }
}
