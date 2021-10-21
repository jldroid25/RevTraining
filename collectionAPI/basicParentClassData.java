public class BasicParentClassData {
    protected  String title;
    protected  int id;
    protected  long ISBN;
    protected  String publisher;
    
    //Constructor
    public BasicParentClassData(String title, int id, int ISBN, String publisher){
        super();
        this.title = title;
        this.id = id;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }
    //Getters
    public String getTitle(){
        return title;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getId(){
        return id;
    }
    public long getISBN(){
        return ISBN;
    }
     // Setters //Don't return anything , pass an argument
     public void setTitle(String title){
         this.title = title;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setISBN(long ISBN){
        this.ISBN = ISBN;
    }
}