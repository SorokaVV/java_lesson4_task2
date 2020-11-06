public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
                float bmi = service.calculate(90, 183);
        System.out.println(bmi);
    }
}
