package Java_OOP_DZ2;

public class Cat extend Pets {

    private boolean the_presence_of_wool;

    public Cat(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day, boolean the_presence_of_wool) {
        super(height, weight, eyeColor, voice, name, breed, isVaccinated, woolColor, year, month, day);
        this.the_presence_of_wool = the_presence_of_wool;

    public int getThe_presence_of_wool() {
        return this.the_presence_of_wool;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n", this.getClass().getSimpleName(), super.toString());
    }
}
