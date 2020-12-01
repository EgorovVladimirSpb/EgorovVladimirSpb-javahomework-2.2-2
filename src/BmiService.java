public class BmiService {

    public double calculate (int weight, double height) {

        double bodyMassIndex = weight/(height*height);

        return bodyMassIndex;
    }
}
