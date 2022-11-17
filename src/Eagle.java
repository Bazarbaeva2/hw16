public class Eagle extends Animal{
    private String eat;


    public Eagle(String name, String breed, int age, String eat) {
        super(name, breed, age);
        this.eat = eat;
    }
    public void Fly(){
        System.out.println("eagli is flying so far");
    }

    @Override
    public String toString() {
        return super.toString()+"Eagle{" +
                "eat='" + eat + '\'' +
                '}';
    }
}

