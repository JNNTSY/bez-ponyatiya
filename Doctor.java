public class Doctor extends Employee {
    private String workplace;

    public Doctor(String name, int age, int salary, String workplace) {
        super(name, age, salary);
        this.workplace = workplace;

    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Workplace: " +workplace+ "\n");
    }
}




