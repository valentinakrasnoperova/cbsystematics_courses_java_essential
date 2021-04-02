package homework4.task3;

public class Player implements Playable, Recodable {
    public void play() {
        System.out.println("melody is playing");
    }

    public void record() {
        System.out.println("melody is recording");
    }

    public void pause() {
        System.out.println("melody is paused");
    }

    public void stop() {
        System.out.println("melody is stopped");
        System.out.print("\n");
    }
}

