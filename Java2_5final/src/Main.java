public class Main {

    static final int size = 20000000;
    static final int halfOfSize = size / 2;
    static long timer;

    public static void main(String[] args) {
	    calculateArrayWithoutThreads();
	    calculateArrayUsingThreads();
    }

    static void calculateArrayWithoutThreads() {
        float[] fullArray = new float[size];
        for (float i : fullArray) {
            i = 1;
        }

        System.out.println("Стартовое время: " + System.currentTimeMillis());
        timer = System.currentTimeMillis();

        for (float i : fullArray) {
            fullArray[(int) i] = (float) (fullArray[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время окончания обработки без потоков: " + System.currentTimeMillis());
        System.out.println("Работа заняла: " + (System.currentTimeMillis() - timer + " ms"));
    }

    static synchronized void calculateArrayUsingThreads() {
        float[] fullArray = new float[size];
        float[] firstHalfOfArray = new float[size];
        float[] secondHalfOfArray = new float[size];

        for (float i : fullArray) {
            i = 1;
        }

        System.out.println("Стартовое время: " + System.currentTimeMillis());
        timer = System.currentTimeMillis();
        System.arraycopy(fullArray, 0, firstHalfOfArray, 0, halfOfSize);
        System.arraycopy(fullArray, halfOfSize, secondHalfOfArray, 0, halfOfSize);

        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (float i : firstHalfOfArray) {
                    firstHalfOfArray[(int) i] = (float) (firstHalfOfArray[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (float i : secondHalfOfArray) {
                    secondHalfOfArray[(int) i] = (float) (secondHalfOfArray[(int) i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.arraycopy(firstHalfOfArray, 0, fullArray, 0, halfOfSize);
        System.arraycopy(secondHalfOfArray, 0, fullArray, halfOfSize, halfOfSize);
        System.out.println("Время окончания обработки с использованием потоков: " + System.currentTimeMillis());
        System.out.println("Работа заняла: " + (System.currentTimeMillis() - timer + " ms"));

    }

}
