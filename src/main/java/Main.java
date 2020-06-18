import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Film> films = new HashMap<>();
        films.put("Szczęki",new Film("Szczęki","Steven Spielberg"));
        films.put("Kler", new Film("Kler","Wojciech Smarzowski"));
        films.put("Pitbull", new Film("Pitbull","Patryk Vega"));
        films.put("Matrix", new Film("Matrix","Lilly Wachowski"));
        films.put("Volver", new Film("Volver","Pedro Almodovar"));
        FilmUser filmUser = new FilmUser();
        String title = "Matrix";
        // 1. pierwszy przykład gdy dostarczamy implementacje interfajsu przy pomocy lambdy. _title jest nową zmienną typu
        // String. Do niej trafi wartość ze zmiennej title ale dlatego ze tak to jest zaimplementowane w createFilm. _title może być dowolnie nazwane .np abc.
        // wynika to z tego jakie parametry i jaki typ zwraca metoda map w interfejsie. Tak naprawdę nie interesuje nas nazwa map
        // tylko to jaki parametr trzyjmuje i co zwraca. Z definicji interfejs funkcyjny posiada tylko jedną metodę.
        Film film1 = filmUser.createFilm(_title -> films.get(_title), title);
        // abc działa tak samo jak _title.
        // Film film1 = filmUser.createFilm(abc -> films.get(abc), title);
        print(film1);

        // 2. przykład drugi z zastosowaniem implementacji interfejsu. funkcjonalnie ta dwa podejścia sa równoważne.
        FilmMapper fm = new FilmMapperImpl(films);
        Film film2 = filmUser.createFilm(fm, title);
        print(film2);
        /*
            https://dzone.com/articles/functional-interface-and-lambda-expression-in-java
            https://www.javatpoint.com/java-lambda-expressions
         */
    }

    private static void print(Film film){
        if(film != null) {
            System.out.println(film.toString());
        }
    }
}
