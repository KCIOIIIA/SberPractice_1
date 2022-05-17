public class Lunch {
    public static void main(String[] args){
        Philosophers[] philosophers = new Philosophers[5];
        Object[] forks = new Object[5];

        for (int i = 0; i < 5; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < 5; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % 5];

            philosophers[i] = new Philosophers(leftFork, rightFork);

            Thread thread
                    = new Thread(philosophers[i], "Философ № " + (i + 1));
            thread.start();
        }
    }
}
