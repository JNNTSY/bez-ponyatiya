public class Chef extends Employee {
    private String workplace;

    public Chef(String name, int age, int salary, String workplace) {
        super(name, age, salary);
        this.workplace = workplace;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Workplace: " +workplace+ "\n");
    }
}
