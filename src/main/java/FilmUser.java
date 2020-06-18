public class FilmUser {
    Film createFilm(FilmMapper fm, String title){
        return fm.map(title);
    }
}