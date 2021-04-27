package id.ac.upnyk.tugas4;

import java.util.ArrayList;

public class FilmData {
    private static String[] title = new String[] {"Conan", "Shadow", "Mortal", "Kungfu", "Unholy", "Kong", "Raya"};
    private static int[] thumbnail = new int[] {R.drawable.conan, R.drawable.shadow, R.drawable.mortal, R.drawable.kungfu, R.drawable.unholy, R.drawable.kong, R.drawable.raya};
    public static ArrayList<FilmModel> getFilmList(){
        FilmModel filmModel = null;
        ArrayList<FilmModel> list = new ArrayList<FilmModel>();
        for ( int i = 0; i < title.length; i++){
        filmModel = new FilmModel();
        filmModel.setGambarFilm(thumbnail[i]);
        filmModel.setNamaFilm(title[i]);
        list.add(filmModel);
        }
        return list;
    }
}
