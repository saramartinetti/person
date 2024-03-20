package eserciziRipassoOO;

public class Es5_book {
    public static void main(String[] args) {
        Book b1 = new Book("Come anima mai", "Rossana Soldano", "134567456775");
        Book b2 = new Book( "Due cuori in affitto", "Felicia Kingsley", "23848474848");

        Book.aggiungiLibro(b1);
        Book.aggiungiLibro(b2);
        for (Book book : Libreria) {
            System.out.println(book.getAuthor(), book.getTitle(), book.getCode());
        }
        System.out.println("Stampa lista dei libri");
        
    }
    
    
}
