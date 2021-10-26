public class MyArray {

    public void checkArraySize(String[][] numbers) throws MyArraySizeException {
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i].length != 4) || (numbers.length != 4)) {
                throw new MyArraySizeException("Wrong size of array");
            }
        }
    }

    public void checkArrayMembers(String[][] numbers) throws MyArrayDataException {
       for (int i = 0; i < numbers.length; i++) {
           for (int j = 0; j < numbers[i].length; j++) {
                if (!isNumeric(numbers[i][j])) {
                    throw new MyArrayDataException("Wrong type of data at [" + i + "] [" + j + "] place");
                }
           }
       }
    }

    public boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
