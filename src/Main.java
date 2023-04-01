public class Main {
    
    public static int[] countSalary() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5000) + 5000;
        }
        return arr;

        }
    public static void main(String[] args) {
        int[] arr = countSalary();
        int monthSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            monthSpending = monthSpending + current;
        }
        System.out.println("Сумма трат на зарплаты составила " + monthSpending + " рублей");

        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > maxArr) {
                maxArr = current;
            }
        }

        System.out.println("Максимальная сумма трат на зарплаты составила " + maxArr + " рублей");
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < minArr) {
                minArr = current;
            }
        }
        System.out.println("Минимальная сумма трат на зарплаты составила " + minArr + " рублей");

        int middleSpending = 0;
        int day = 30;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            monthSpending = monthSpending + current;
            middleSpending = monthSpending / day;
        }
        System.out.println("Средняя сумма трат на зарплаты составила " + middleSpending + " рублей");
    }

}