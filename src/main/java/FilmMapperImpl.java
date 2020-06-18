import java.util.Map;

public class FilmMapperImpl implements FilmMapper {

    private final Map<String,Film> films;

    public FilmMapperImpl(Map<String, Film> films) {
        this.films = films;
    }

    @Override
    public Film map(String title) {
        return films.get(title);
    }
}
