package homework3.task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(15);
        classRoom.addPupil(new BadPupil());
        classRoom.addPupil(new GoodPupil());
        classRoom.addPupil(new ExcelentPupil());
        classRoom.addPupil(new BadPupil());





        classRoom.showActivity();
    }
}
