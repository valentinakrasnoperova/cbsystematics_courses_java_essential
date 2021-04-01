package homework3.task2;

public class ClassRoom {
    Pupil[] pupils;

    public ClassRoom(Pupil[] pupils) {
        this.pupils = pupils;
    }

    public void showActivity() {
        for (Pupil ppl : pupils) {
            ppl.read();
            ppl.write();
            ppl.study();
            ppl.relax();

        }
    }
}
