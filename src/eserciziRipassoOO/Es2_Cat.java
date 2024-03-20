package eserciziRipassoOO;

public class Es2_Cat {
    public static void main(String[] args) {

    Cat cat1 = new Cat ("ramiro", "Main Coon");
    Cat cat2 = new Cat("miso", "Certosino");
      
    System.out.println(cat1.getName() + " " + cat1.getBreed() + " ");
    System.out.println(cat2.getName() + " " + cat2.getBreed() + " ");

    System.out.println();
    cat1.setBreed("Main Coon");
    cat2.setName("Ramiro");
    
}
}
