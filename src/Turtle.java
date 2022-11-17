public class Turtle extends Animal{
    private char gender;

    public Turtle(String name, String breed, int age, char gender) {
        super(name, breed, age);
        this.gender = gender;
    }

    public void swim(){
        System.out.println("Turtle is swiming");
    }

    @Override
    public String toString() {
        return super.toString()+"Turtle{" +
                "gender=" + gender +
                '}';
    }
}
