public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payments = {10_456, 45_650, 13_080, 34_987, 56_231};
        int sum = 0;
        for (int element : payments) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача 2");
        int[] payments1 = {12_836, 15_688, 19_440, 37_777, 66_666};
        int maxPayment = -1;
        for (final int current : payments1) {
            if (current > maxPayment) {
                maxPayment = current;
            }
        }
        int minPayment = maxPayment;
        for (final int current : payments1) {
            if (current < minPayment) {
                minPayment = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");
        System.out.println("Задача 3");
        int[] payments2 = {11_557, 34_128, 27_987, 45_333, 62_663};
        int sumPayment = 0;
        for (int element : payments2) {
            sumPayment += element;
        }
        double averageAmount = (double) sumPayment / payments2.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}