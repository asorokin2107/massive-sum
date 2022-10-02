public class Main {
    public static void main(String[] args) {
        int myArray[] = {21, 14, 11, 22};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
