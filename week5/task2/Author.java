package p;

public class Author {
    private String name;
    private String nationality;
    Author(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }
    String getName(){
        return this.name;
    }
    String getNationality(){
        return this.nationality;
    }
}
