public class Zadanie2 {

    private boolean search(int[] numbers, int x) {

        if (x > numbers[0] || x < numbers[numbers.length - 1]) {
            return false;
        }

        int startPoint = 0;
        int endPoint = numbers.length - 1;
        int middle = numbers.length / 2;

        while (startPoint <= endPoint) {

            if (x > numbers[middle]) {
                endPoint = middle - 1;
            } else  if (x < numbers[middle]) {
                startPoint = middle + 1;
            } else {
                return true;
            }

            middle = (startPoint + endPoint) / 2;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        Zadanie2 zadanie = new Zadanie2();

        System.out.println(String.valueOf(zadanie.search(numbers, 8)).toUpperCase());
    }
}
