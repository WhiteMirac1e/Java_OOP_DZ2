package Java_OOP_DZ2;

public class Animal {

    private double height;
    private double weight;
    private String eye_color;
    private String voice;
  
    public Animal(double height, double weight, String eye_color, String voice) {
        this.height = height;
        this.weight = weight;
        this.eye_color = eye_color;
        this.voice = voice;

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public String getEyeColor() {
        return this.eye_color;
    }

    public String getVoice() {
        return this.voice;
    }

    public void roar() {
        System.out.println("Голос: " + this.voice);
    }

    @Override
    public String toString() {
        String result = String.format("Рост: %d см\nВес: %d кг\nЦвет глаз: %s", this.height, this.weight, this.eye_color);
        return result;
    }
}
