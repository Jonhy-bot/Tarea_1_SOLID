package ISP.fixed;

public class DemoFixed {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Robot robot = new Robot();

        employee.work();
        employee.eat();
        employee.sleep();

        robot.work();
    }
}
