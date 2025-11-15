public abstract class Book  {

    private String name;
    private String author;
    private int years;
    private String type;
    Boolean status = false;
public Book(){}
public String getName(){
    return  name;
}
public void setName(String name){
this.name=name;
}
public String getAuthor(){
    return author;
}
public void setAuthor(String author){
    this.author=author;
}
public int getYears(){
    return years;
}
public void setYears(int years){
    this.years=years;
}
public Boolean getStatus(){
    return status;
}
public void setStatus(boolean status){
    this.status=status;
}
public String getType() {
        return type;
    }
public void setType(String type){this.type=type;}

//    public String status(){
//        String status = "прочитано";
//        return status;
//    }



public String toString(){return "name" + getName() + "author" + getAuthor() + "years" + getYears();}



}

