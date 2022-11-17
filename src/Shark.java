public class Shark extends Animal{
    private String color;

    public Shark(String name, String breed, int age, String color) {
        super(name, breed, age);
        this.color = color;
    }

    public void Attack(){
        System.out.println("is attaking");
    }

    @Override
    public String toString() {
        return super.toString()+"Shark{" +
                "color='" + color + '\'' +
                '}';
    }
}
