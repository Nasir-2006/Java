class BOOK{
    private String title;
    private String author;
    private boolean isAvailable;
    BOOK(String title,String author)
    {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void borrowBOOK()
    {
        if(isAvailable){
        System.out.println("You have successfully borrowed "+title);
        isAvailable = false;
        }
        else
        System.out.println("Sorry,"+title+" is already borrowed");
    }
    public void returnBOOK()
    {
        isAvailable = true;
        System.out.println("ou have returned "+title);
    }
    public void showDetail()
    {
        System.out.println("Title"+title);
        System.out.println("Author:"+author);
        System.out.println("Status:"+isAvailable);
    }
}
public class oop_LMS {
    public static void main(String[] args) {
        BOOK nasir = new BOOK("Harry Potter", "Pata Nahi");
        nasir.showDetail();
        nasir.borrowBOOK();
        nasir.borrowBOOK();
        nasir.borrowBOOK();
        nasir.returnBOOK();
        nasir.showDetail();
    }
}
