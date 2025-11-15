import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Library libr = new Library();
//        Book book = new Book();
        Library.LibraryHelper search = new Library.LibraryHelper();
        int defCount = 0;

        while (true){
            System.out.println("выберите действие: ");
            byte num = scanner.nextByte();
                scanner.nextLine();
            switch (num){
                case(1):
                    libr.addBook();
                    break;
                case(2):
                    try{
                        libr.safeChangeStatus();
                    }
                    catch(BookUnavailableException e){
                        System.out.println("error" + e.getMessage());
                    }
                    break;
                case(3):
                    libr.safeReturnStatus();
                    break;
                case(4):
                    System.out.println(" введите название");
                    String name = scanner.nextLine();
                    search.searchName(name);
                    break;
                default:
                    defCount +=1;
                    if(defCount == 1){
                        System.out.println("аккуратнее");
                    }else if(defCount == 2){
                        System.out.println("я повторю АККУРТНЕЕ ");
                    }else{
                        System.out.println("ОЙ ВСЕ Я УСТАЛ, ИДИ МАТАН ПОВТОРИ");
                        System.exit(0);
                    }


            }
        }
    }
}