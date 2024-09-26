public class Main {
    public static void main(String[] args) {
        Author Tolstoy = new Author("Лев","Толстой");
        System.out.println("Автор книги - " + Tolstoy.getAuthorFirstName()+ Tolstoy.getAuthorSecondName());
        Author Lermontov = new Author("Юрий ","Лермонтов");
        System.out.println("Автор книги - " + Lermontov.getAuthorFirstName() + Lermontov.getAuthorSecondName());
        System.out.println();
        Book AnnaKarenina = new Book("Анна Каренина","",1873);
        System.out.println("Книга - "+ AnnaKarenina.getName());
        System.out.println("Aвтор - "+ Tolstoy.getAuthorFirstName()+Tolstoy.getAuthorSecondName());
        System.out.println("Дата написания-"+ AnnaKarenina.getDatee() );
        System.out.println();
        Book GeroiNashegoVremeni = new Book("Герой нашего времени","",1838);
        System.out.println("Книга - "+ GeroiNashegoVremeni.getName());
        System.out.println("Aвтор - "+ Lermontov.getAuthorFirstName()+Lermontov.getAuthorSecondName());
        System.out.println("Дата написания-"+ GeroiNashegoVremeni.getDatee() );
        AnnaKarenina.setDate(1840);
        System.out.println("Дата написания-"+ AnnaKarenina.getDatee());
    }
}