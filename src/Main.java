import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie m1=new Movie("aaa",1999,9);
        Movie m2=new Movie("ccc",2019,5);
        Movie m3=new Movie("bbb",2023,6);
        List<Movie>list=new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        MovieRating my=new MovieRating();
        Collections.sort(list,my);
        for(Movie m:list){
            System.out.println(m.getName());
            System.out.println(m.getYear());
            System.out.println(m.getRating());
        }
    }
}