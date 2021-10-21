public class setInterfaceExample {
    protected  String title;
    protected  int id;
    protected  long ISBN;
    protected  String publisher;
    //Constructor
    public setInterfaceExample(String title, int id, int ISBN, String publisher){
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
     // Setters
     public String setTitle(){
        return "Boston in Winter";
    }
    public String setPublisher(){
        return "Penguin Globe House";
    }
    public int setId(){
        return 123;
    }
    public long setISBN(){
        return 8765123;
    }
}