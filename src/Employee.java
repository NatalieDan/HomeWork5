public class Employee {

    private String fio;
    private String job;
    private String email;
    private String number;
    private int salary;
    private int age;

    public String toString(){
        return fio + " " + job + " " + email + " " + number + " " + salary + " " + age;
    }

    int getAge(){
        return age;
    }

    void setFio(String fio){
        this.fio = fio;
    }
    void setJob(String job){
        this.job = job;
    }
    void setEmail(String email){
        this.email = email;
    }
    void setNumber(String number){
        this.number = number;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setAge(int age){
        this.age = age;
    }
}
