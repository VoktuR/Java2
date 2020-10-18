public class Main {

    public static void main(String[] args) {
        boolean result;
        Object[] creatures = {
                new Human(),
                new Cat(),
                new Robot()
        };
        Object[] barriers = {
                new Treadmill(),
                new Wall(),
                new Treadmill()
        };

        System.out.println("-------------------------------");
        for (Object creature : creatures) {
            for (Object barrier : barriers) {
                if (barrier instanceof Treadmill) {
                    Treadmill treadmill = (Treadmill) barrier;
                    if (creature instanceof Human) {
                        Human human = (Human) creature;
                        human.run();
                        result = treadmill.checkActionPossibility(human.RUN_DISTANCE_LIMIT);
                        treadmill.makeAMove(result);
                        if (!result) break;
                        human.setWinCounter(human.getWinCounter() + 1);
                        human.winCheck(human.getWinCounter(), barriers.length);
                    } else if (creature instanceof Cat) {
                        Cat cat = (Cat) creature;
                        cat.run();
                        result = treadmill.checkActionPossibility(cat.RUN_DISTANCE_LIMIT);
                        treadmill.makeAMove(result);
                        if (!result) break;
                        cat.setWinCounter(cat.getWinCounter() + 1);
                        cat.winCheck(cat.getWinCounter(), barriers.length);
                    } else {
                        Robot robot = (Robot) creature;
                        robot.run();
                        result = treadmill.checkActionPossibility(robot.RUN_DISTANCE_LIMIT);
                        treadmill.makeAMove(result);
                        if (!result) break;
                        robot.setWinCounter(robot.getWinCounter() + 1);
                        robot.winCheck(robot.getWinCounter(), barriers.length);
                    }
                }
                if (barrier instanceof Wall) {
                    Wall wall = (Wall) barrier;
                    if (creature instanceof Human) {
                        Human human = (Human) creature;
                        human.jump();
                        result = wall.checkActionPossibility(human.JUMP_HEIGHT_LIMIT);
                        wall.makeAMove(result);
                        if (!result) break;
                        human.setWinCounter(human.getWinCounter() + 1);
                        human.winCheck(human.getWinCounter(), barriers.length);
                    } else if (creature instanceof Cat) {
                        Cat cat = (Cat) creature;
                        cat.jump();
                        result = wall.checkActionPossibility(cat.JUMP_HEIGHT_LIMIT);
                        wall.makeAMove(result);
                        if (!result) break;
                        cat.setWinCounter(cat.getWinCounter() + 1);
                        cat.winCheck(cat.getWinCounter(), barriers.length);
                    } else {
                        Robot robot = (Robot) creature;
                        robot.jump();
                        result = wall.checkActionPossibility(robot.JUMP_HEIGHT_LIMIT);
                        wall.makeAMove(result);
                        if (!result) break;
                        robot.setWinCounter(robot.getWinCounter() + 1);
                        robot.winCheck(robot.getWinCounter(), barriers.length);
                    }
                }
            }
            System.out.println("-------------------------------");
        }
    }
}