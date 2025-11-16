import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     TaskManager TaskWork = new TaskManager();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("введите: ");
            byte deiv = sc.nextByte();
            switch (deiv){
                case(1):
                    TaskWork.addTask();
                    break;
                case(2):
                    TaskWork.getTask();
                    break;
                case(3):
                    TaskWork.removeTask();
                    break;
                case(0):
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}