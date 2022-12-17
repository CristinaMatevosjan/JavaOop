
public class Film {
    int id;
    int creatorId;
    private  String filmName;
    private  int  genreId;
    private  int producerId;
    private  int year;


    public String getFilmName() {
        return filmName;
    }

      public int getGenreId() {
        return genreId;
    }

        public int getProducerId() {
        return producerId;
    }

       public int getYear() {
        return year;
    }

       public Film(int id, int creatorId, String filmName, int genreId, int producerId, int year ) {
        this.id=id;
        this.creatorId=creatorId;
        this.filmName = filmName;
        this.genreId = genreId;
        this.producerId = producerId;
        this.year = year;

    }


}
