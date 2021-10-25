public class Teacher extends Employee {
    private int experience;

    public Teacher(String name, int age, int salary, int experience){
        super(name, age, salary);
        this.experience=experience;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Experience: " +experience);
    }
}
