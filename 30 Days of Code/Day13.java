class MyBook extends Book {
    
    long price;
    
    MyBook(String t,String a,long p){
        super(t,a);
        price = p;
    }
    
    public void display() {
        
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        
    }
    
}