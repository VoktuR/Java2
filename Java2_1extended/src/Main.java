public class Main {

    public static void main(String[] args) {
        Participant[] participants = {
                new Human(),
                new Cat(),
                new Robot()
        };
        Barrier[] barriers = {
                new Treadmill(),
                new Wall(),
                new Treadmill()
        };

        System.out.println("-------------------------------");
        for (Participant participant : participants) {
            for (Barrier barrier : barriers) {
                participant.doAction(barrier);
                barrier.showResult(barrier.getResult());
                if (!barrier.getResult()) break;
            }
            System.out.println("-------------------------------");
        }
    }
}