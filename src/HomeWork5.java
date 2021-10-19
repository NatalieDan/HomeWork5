/**
 * Java 1. HomeWork 5
 *
 * @author NatalieDan
 * @version 19.10.2021
 */
public class HomeWork5 {
    public static void main(String [] args){
        Employee[] employee = new Employee[5];
        employee[0] = new Employee();
        employee[1] = new Employee();
        employee[2] = new Employee();
        employee[3] = new Employee();
        employee[4] = new Employee();

        employee[0].setFio("Ivanov I.");
        employee[0].setJob("programmer");
        employee[0].setEmail("11@mail.ru");
        employee[0].setNumber("162-27-84");
        employee[0].setSalary(90000);
        employee[0].setAge(44);

        employee[1].setFio("Petrov P.");
        employee[1].setJob("rocket engineer");
        employee[1].setEmail("21@mail.ru");
        employee[1].setNumber("274-84-96");
        employee[1].setSalary(80000);
        employee[1].setAge(25);

        employee[2].setFio("Vasilev V.");
        employee[2].setJob("astrophysicist");
        employee[2].setEmail("33@mail.ru");
        employee[2].setNumber("122-94-00");
        employee[2].setSalary(100000);
        employee[2].setAge(50);

        employee[3].setFio("Grigoriev G.");
        employee[3].setJob("octopus trainer");
        employee[3].setEmail("main@gmail.com");
        employee[3].setNumber("534-87-48");
        employee[3].setSalary(160000);
        employee[3].setAge(41);

        employee[4].setFio("Andreev A.");
        employee[4].setJob("astronaut");
        employee[4].setEmail("52@mail.ru");
        employee[4].setNumber("546-26-37");
        employee[4].setSalary(100000);
        employee[4].setAge(30);

        for (int i=0; i<5; i++){
            if (employee[i].getAge() > 40){
                System.out.println(employee[i]);
            }
        }
    }
}
