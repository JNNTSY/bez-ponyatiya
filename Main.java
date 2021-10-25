public class Main {
    public static void main(String[] args){
        Doctor doctor=new Doctor("Sam ", 34, 4, "Hospital");
        Chef chef=new Chef("Bob ", 25,5, "Restaurant");
        Teacher teacher=new Teacher("Tom ", 50, 6, 20);

        doctor.getInfo();
        chef.getInfo();
        teacher.getInfo();
    }
}
