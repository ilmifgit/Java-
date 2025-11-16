import java.util.Calendar;

public class DeadlineTask extends Task{
    // полем: дата дедлайна.
    public String dateDeadline = "dateDeadline";
    public DeadlineTask(String title, String opisanie, Calendar dateCreate, String dateDeadline){
        setTitle(title);
        setOpisanie(opisanie);
        setDateCreate();
        this.dateDeadline=dateDeadline;
    }
    public DeadlineTask(){}
    public String getDateDeadline(){
        return dateDeadline;
    }
    public void setDateDeadline(String dateDeadline){
        this.dateDeadline=dateDeadline;
    }
}
