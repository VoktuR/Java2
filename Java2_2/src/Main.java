public class Main {

    public static void main(String[] args) {
        int sum;

        String[][] numbers = {
                {"1", "2", "3", "4",},
                {"5", "6", "7", "8",},
                {"9", "10", "11", "12",},
                {"13", "14", "15", "16",} };

        String[][] wrongNumbers = {
                {"1", "2", "3", "4",},
                {"5", "6", "7", "8", "17"},
                {"9", "10", "11", "12",},
                {"13", "14", "15", "16",} };

        String[][] wrongNumbers2 = {
                {"1", "2", "3", "4",},
                {"5", "a", "7", "8",},
                {"9", "10", "Bc", "12",},
                {"13", "14", "15", "16",} };

        sum = calculateArraySum(numbers);
        System.out.println(sum);

        sum = calculateArraySum(wrongNumbers);
        System.out.println(sum);

        sum = calculateArraySum(wrongNumbers2);
        System.out.println(sum);

    }

    static int calculateArraySum(String[][] numbers) {
        if (!makeAllChecks(numbers)) {
            return 0;
        }

        int arraySum = 0;
        for (String[] number : numbers) {
            for (String k : number) {
                arraySum += Integer.parseInt(k);
            }
        }
        return arraySum;
    }

    static boolean makeAllChecks(String[][] numbers) {
        try {
            new MyArray().checkArraySize(numbers);
        }
        catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            return false;
        }

        try {
            new MyArray().checkArrayMembers(numbers);
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
