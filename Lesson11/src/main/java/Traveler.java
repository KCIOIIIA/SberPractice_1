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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Traveler other = (Traveler) obj;
        if (speed != other.speed)
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        return true;
    }

    public String toString(){
        String str1 = String.valueOf(speed);
        String str2 = String.valueOf(time);
        return "(скорость = " + str1 + ", время = " + str2 +")";
    }
}
