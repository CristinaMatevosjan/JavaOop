public class FilmManager {
    DataBase db;
    public FilmManager(){
        init();
    }

    public DataBase getDb(){
        return db;
    }


    public String getNewFilm(int id){
        Film f=db.films.get(id-1);

        return String.format("%d %s %d %s %s %s",
                f.id,
                f.getFilmName(),
                f.getYear(),
                db.genres.get(f.getGenreId()-1).getGenreName(),
                db.producers.get(f.getProducerId()-1).getFullName(),
                db.studios.get(f.creatorId-1).getName());

    }

    DataBase init(){
        db=new DataBase();

        Film f1=new Film(1,1,"Wednesday",1,1,2022);
        Film f2=new Film(2,2,"Dragon House",1,2,2022);
        Film f3=new Film(3,4,"White Lotus",2,3,2022);
        Film f4=new Film(4,3,"gossip girl",3,4,2022);

        db.films.add(f1);
        db.films.add(f2);
        db.films.add(f3);
        db.films.add(f4);

        db.genres.add(new Genre(1,"fantastic"));
        db.genres.add(new Genre(2,"comedy"));
        db.genres.add(new Genre(3, "melodrama"));

        db.producers.add(new Producer("Тим Бертон",1));
        db.producers.add(new Producer("Райан Кондал",2));
        db.producers.add(new Producer("Майк Уайт",3));
        db.producers.add(new Producer("Эшли Вигфилд",4));
        StudioCreator cs=new StudioCreator();
        db.addStudios(cs.getCreatorStudio("Amazon Studios"));
        db.addStudios(cs.getCreatorStudio("HBO"));
        db.addStudios(cs.getCreatorStudio("HBO"));
        db.addStudios(cs.getCreatorStudio("HBO MAx"));

        return db;
    }


}
