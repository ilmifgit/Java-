import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
//    содержит список задач и позволяет добавлять, удалять и просматривать задачи.
//    Реализуйте методы для добавления задач разных типов в список задач.
//    Реализуйте методы для просмотра всех задач, сортированных по дате создания.
//    Инкапсуляция и геттеры/сеттеры:
ArrayList<Task> Tasklist;// = new ArrayList<>();
    TaskManager(){
        Tasklist = new ArrayList<>();
    }
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    public void addTask(){
        System.out.println(" тип: \n 1 - с повтором \n 2 - с дедлайном");
          byte type = sc.nextByte();
          switch (type){
              case(1):
                  System.out.println(" какой повтор: \n 1 - everyDay \n 2 - everyWeek");
                  System.out.print(" напишите:");
                  byte every = sc.nextByte();
                  switch (every){
                      case(1):
                          RecurringTask recurringTaskDay = new RecurringTask();
                          System.out.println(" введите данные: ");
                          recurringTaskDay.setEveryDay("everyDay");
                          System.out.print(" title:     ");
                          recurringTaskDay.setTitle(sc2.nextLine());
                          System.out.print(" opisanie:  ");
                          recurringTaskDay.setOpisanie(sc2.nextLine());
                          System.out.print(" dateStart: ");
                          recurringTaskDay.setDateStart(sc2.nextLine());
                          Tasklist.add(recurringTaskDay);
                          break;
                      case(2):
                          RecurringTask recurringTaskWeek = new RecurringTask();
                          System.out.println(" введите данные: ");
                          recurringTaskWeek.setEveryWeek("everyWeek");
                          System.out.print(" title:     ");
                          recurringTaskWeek.setTitle(sc2.nextLine());
                          System.out.print(" opisanie:  ");
                          recurringTaskWeek.setOpisanie(sc2.nextLine());
                          System.out.println(" dateCreate:");
                          recurringTaskWeek.setDateCreate();
                          System.out.print(" dateStart: ");
                          recurringTaskWeek.setDateStart(sc2.nextLine());
                          Tasklist.add(recurringTaskWeek);
                          break;
                  }
                  break;
              case(2):
                  DeadlineTask deadlineTask =new DeadlineTask();
                  System.out.println(" введите данные: ");
                  deadlineTask.setDateDeadline("dateDeadline");
                  System.out.print(" title:     ");
                  deadlineTask.setTitle(sc2.nextLine());
                  System.out.print(" opisanie:  ");
                  deadlineTask.setOpisanie(sc2.nextLine());
                  System.out.println(" dateCreate:");
                  deadlineTask.setDateCreate();
                  System.out.print(" dateStart: ");
                 // deadlineTask.setDateStart(sc2.nextLine());
                  Tasklist.add(deadlineTask);
                  break;
          }

    }

    public void removeTask(){
        int del =sc.nextInt();
        Tasklist.remove(del);

    }
    public void getTask(){
        System.out.println("выбор ");
        byte vib = sc.nextByte();
        switch (vib){
            case(1):
                for(int i = 0; i<Tasklist.size();i++){
                    Tasklist.contains("recurringTaskDay");
                    if(true){
                        System.out.println(Tasklist.get(i));
                        System.out.println("1 . 2");
                        byte del = sc.nextByte();
                        if(del==1){
                            Tasklist.remove(i);
                        }
                    }
                }
                break;
            case(2):
                for(int i = 0; i<Tasklist.size();i++){
                Tasklist.contains("recurringTaskWeek");
                if(true){
                    System.out.println(Tasklist.get(i));
                    System.out.println("1 . 2");
                    byte del = sc.nextByte();
                    if(del==1){
                        Tasklist.remove(i);
                    }
                }
                }
                break;
            case(3):
                for(int i = 0; i<Tasklist.size();i++){
                    Tasklist.contains("deadlineTask");
                    if(true){
                        System.out.println(Tasklist.get(i));
                        System.out.println("1 . 2");
                        byte del = sc.nextByte();
                        if(del==1){
                            Tasklist.remove(i);
                        }
                    }
                }
                break;
        }
    }
}
