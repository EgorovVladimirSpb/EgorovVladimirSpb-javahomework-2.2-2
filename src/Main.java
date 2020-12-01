public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double height = 1.82;
        // Рост в метрах

        int weight = 77;
        // Вес в килограммах

        double bodyMassIndex = service.calculate(weight,height);

        System.out.println("Ваш Индекс Массы Тела:");
        System.out.printf(" %.2f %n", bodyMassIndex);
        }
    }
