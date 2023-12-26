package homework_5.task_02_03;

import java.util.Arrays;

public class NewEmployee extends Employee{
    public static void main(String[] args) {
        Employee newEmployee = new Employee();
        newEmployee.setName("Stanislav");
        newEmployee.setAge(18);
        newEmployee.setEmail("st.yashnov@gmail.com");
        newEmployee.setJobPosition("General MD");
        newEmployee.setPhone("+380560000000");

        System.out.println(newEmployee.getAge());
        for (String s : Arrays.asList(newEmployee.getEmail(), newEmployee.getJobPosition(), newEmployee.getPhone())) {
            System.out.println(s);
        }
    }
}
