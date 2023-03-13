public class Wolf extends Wild{

    protected boolean isAlpha;

    public Wolf(int height, int weight, String eye_color, String voice, String areal, int year, int month, int day,
            boolean isAlpha) {
        super(height, weight, eye_color, voice, areal, year, month, day);
        this.isAlpha = isAlpha;
    }

    public Wolf() {
        super(35, 85, "Серый", "А-у-у-у", "Казахстан", 1890, 2, 21);
        this.isAlpha = true;
    }  

    @Override
    public String toString() {
        return String.format("%s\n%s\nВожак: %b\n", this.getClass().getSimpleName(), super.toString(), this.isAlpha);
    }
}
