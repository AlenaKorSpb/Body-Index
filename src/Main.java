public class Main {
    public static void main(String[] args) {
    BmiService bmiService = new BmiService();
    double index = bmiService.calculate(70,156);

        System.out.println(index);
    }
}
