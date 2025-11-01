import java.util.Scanner;

class books{
    String name;
    String author;
    int price;
    int numpages;

    books(String name, String author, int price, int numpages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.numpages=numpages;
    }

    public String toString(){
        String name, author, price, numpages;
        
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numpages = "Number of pages: " + this.numpages + "\n";

        return name + author + price + numpages;
    }

}

class BookDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numpages;

        System.out.println("Number of books to enter: ");
        n=sc.nextInt();
        sc.nextLine();

        books[] b = new books[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter book name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter author name: ");
            author=sc.nextLine();
            System.out.println("Enter book price: ");
            price=sc.nextInt();
            System.out.println("Enter total number of pages: ");
            numpages=sc.nextInt();
            b[i]= new books(name,author,price,numpages);
        }

        for (int i=0; i<n; i++){
            String s="Book "+(i+1)+" details are :"+b[i];
            System.out.println(s);
        }

    }
}