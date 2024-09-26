public class Author {

    private String authorFirstName ;
    private String AuthorSecondName;

    public  Author (String authorFirstName, String AuthorSecondName ){
        this.authorFirstName = authorFirstName;
        this.AuthorSecondName = AuthorSecondName;
    }
    public String getAuthorFirstName(){
        return this.authorFirstName;
    }
    public  String getAuthorSecondName (){
        return this.AuthorSecondName;
    }
}
