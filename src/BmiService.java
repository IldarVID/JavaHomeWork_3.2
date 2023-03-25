public class BmiService {

    public int calculate(int weight, double height) {
        double index = height * height;
        int bmi = (int) (weight / index);
        return bmi;
    }
}
