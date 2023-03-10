package Java_OOP_DZ2;

import java.time.LocalDate;

public abstract class Pets extend Animal {

    private String name;
    private String breed;
    private boolean graft;
    private String color_wool;
    private LocalDate data_birthday;
  
    public Pets(int height, int weight, String eye_color, String voice, String name, String breed, boolean graft,
            String color_wool, int year, int month, int day) {
        this.name = name;
        this.breed = breed;
        this.graft = graft;
        this.color_wool = color_wool;
        this.data_birthday = LocalDate.of(year, month, day);
    }

    public String getName() {
      return this.name;
    }

    public String getBreed() {
      return this.breed;
    }

    public boolean graft() {
      return this.graft;
    }

    public String getColorWool() {
      return this.color_wool;
    }

    public LocalDate getBirthDay() {
      return this.data_birthday;
    }

    @Override
    public String toString() {
        String result = String.format("Кличка: %s\nПорода: %s\nПривит: %b\nЦвет шерсти: %s\nДата рождения: %s\n%s",
                this.name, this.breed, this.graft, this.color_wool, this.data_birthday, super.toString());
        return result;
    }
}
