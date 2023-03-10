package Java_OOP_DZ2;

import java.time.LocalDate;

public abstract class Wild extend Animal {

    private String habitat;
    private LocalDate date_of_finding;

    public Wild(int height, int weight, String eye_color, String voice, String habitat, int year, int month, int day) {
        super(height, weight, eyeColor, voice);
        this.habitat = habitat;
        this.date_of_finding = LocalDate.of(year, month, day);

    public int getHabitat() {
        return this.habitat;
    }

    public int getDate_of_finding() {
        return this.date_of_finding;
    }

    @Override
    public String toString() {
        String result = String.format("Место обитания: %s\nДата нахождения: %s\n%s",
                this.habitat, this.date_of_finding, super.toString());
        return result;
    }
}
