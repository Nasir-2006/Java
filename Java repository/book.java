public class book {
    String title;
    String author;
    int price;
    int dis;
    public book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void applyDiscount(int percent) {
        dis = (this.price * percent) / 100; 
    }

    public void display() {
        System.out.println("Discount is " + dis);
        System.out.println("New Price is " + (price - dis));
    }
    public static void main(String[] args) {
        book b1 = new book("Java Programming", "James", 500);
        book b2 = new book("Python Basics", "Guido", 400);

b1.applyDiscount(10); // 10% discount
b2.applyDiscount(20); // 20% discount

b1.display();
b2.display();
    }
}
