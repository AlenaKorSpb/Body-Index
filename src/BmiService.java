public class BmiService {
    public double calculate (int weight, int growth){
        double index = 10000.0 * weight / growth / growth;
        return index;
    }
}
