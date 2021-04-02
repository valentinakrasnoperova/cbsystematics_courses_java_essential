package homework4.task3;

public class Main {
    public static void main(String[] args) {
        Playable play = new Player();
        Recodable record = new Player();

        play.play();
        play.pause();
        play.stop();
        record.record();
        record.pause();
        record.stop();


    }
}
