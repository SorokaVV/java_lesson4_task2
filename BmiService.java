public class BmiService {
    public float calculate(int weightKg, int heightCm) {
        float height = (float) heightCm / 100;
                float bmi = (float) weightKg / (height * height);
                        return bmi;
    }
}
