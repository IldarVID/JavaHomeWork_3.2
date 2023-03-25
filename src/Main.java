public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        int weight = 96;

        int bmi = service.calculate(weight,height);
        System.out.println("индекс массы тела равен " + bmi);


    }
}