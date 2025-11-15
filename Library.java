import java.util.ArrayList;

public class Library  {
 static ArrayList<Book> bibl;
 Library(){
bibl = new ArrayList<>();
 }
// Book book = new Book();

 public void addBook(){
     System.out.println("выбор жанра");
     byte type = Main.scanner.nextByte();
     Main.scanner.nextLine();
     switch (type){
         case(1):
             System.out.println(" заполни данные: ");
             FICTION fiction = new FICTION();
             fiction.setType("FICTION");
             System.out.println(type + "fk");
             System.out.print("name: ");
             fiction.setName(Main.scanner.nextLine());
             System.out.print("author: ");
             fiction.setAuthor(Main.scanner.nextLine());
             System.out.print("years: ");
             fiction.setYears(Main.scanner.nextInt());
             fiction.status();
             System.out.print("");
             bibl.add(fiction);
             break;
         case(2):
             System.out.println(" заполни данные: ");
             NON_FICTION non_fiction = new NON_FICTION();
             System.out.print("name: ");
             non_fiction.setName(Main.scanner.nextLine());
             System.out.print("author: ");
             non_fiction.setAuthor(Main.scanner.nextLine());
             System.out.print("years: ");
             non_fiction.setYears(Main.scanner.nextInt());
             System.out.print("");

             break;
         default:
             System.out.println(" вибири Адин или Два!!!");
     }
 }

//    public class checkTestType implements InterGerge {
//     static Library libar = new Library();
//        public static void chekTypeBook(byte hb) {
//           if( bibl[hb].equalsIgnoreCase(Gerge.FICTION) == true){
//               System.out.println("нига вна2ре ху дожника");
//           }else{
//               System.out.println("Нигер научный");
//           }
//
//        }
//    }

    public void safeChangeStatus() throws BookUnavailableException{
        for(int i = 0; i < bibl.size(); i++){
            System.out.println(bibl.get(i) +" "+ i);
        }
        System.out.println(" какую книгу хотите взять");
        byte hb = Main.scanner.nextByte();
        if (bibl.get(hb).getType().equals(Gerge.FICTION)==true) {
            System.out.println(" это художественная литература");
        }

        if(bibl.get(hb).getStatus()!=false){
            throw new BookUnavailableException(" нет книги в наличии");
        }else{

            System.out.println(" книга взята");
            bibl.get(hb).setStatus(true);
        }

    }
    public void safeReturnStatus(){
        for(int i = 0; i < bibl.size(); i++){
            if(bibl.get(i).getStatus()==true){
                System.out.println(bibl.get(i) +" "+ i);
            }
        }
        System.out.println(" Хотить вернут Книжка: а?");
        byte backBook = Main.scanner.nextByte();
        switch (backBook){
            case(1):
                System.out.println(" молодца какой книга вернешь");
                byte back = Main.scanner.nextByte();
                bibl.get(back).setStatus(false);
                break;
            case(2):
                System.out.println("ай не хороший");
                break;
        }
    }


//    public void haveBook(){
//     for(int i = 0; i < bibl.size(); i++){
//         System.out.println(bibl.get(i) +" "+ i);
//     }
//        System.out.println(" какую книгу хотите взять");
//        Byte hb = Main.scanner.nextByte();
//        libr.bibl.get(hb).setStatus(true);
//
//
//
//    }
//    public  void giveBook(){
//        for(int i = 0; i < bibl.size(); i++){
//            System.out.println(bibl.get(i) +" "+ i);
//        }
//
//    }

    static class LibraryHelper{
        public void searchName(String name){
            for(int i = 0; i < bibl.size(); i++){
                if(bibl.get(i).getName().equals(name)){
                    System.out.println(bibl.get(i) +" "+ i);
                }
            }
        }
    }
}


//изучить enum
