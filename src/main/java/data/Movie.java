package data;

public class Movie {
        private String title;
        private String year;
        private String director;
        private String actors;
        private String imdbID;
        private String poster;
        private String genre;
        private String plot;
        private int id;
        
        public Movie(
                String title, String year, String director, String actors,
                String imdbID, String poster, String genre, String plot, int id
        ) {
            this.title = title;
            this.year = year;
            this.director = director;
            this.actors = actors;
            this.imdbID = imdbID;
            this.poster = poster;
            this.genre = genre;
            this.plot = plot;
            this.id = id;
        }
        
        public Movie(){
        
        }
        
        public String getTitle() {
            return title;
        }
        
        public void setTitle(String title) {
            this.title = title;
        }
        
        public String getYear() {
            return year;
        }
        
        public void setYear(String year) {
            this.year = year;
        }
        
        public String getDirector() {
            return director;
        }
        
        public void setDirector(String director) {
            this.director = director;
        }
        
        public String getActors() {
            return actors;
        }
        
        public void setActors(String actors) {
            this.actors = actors;
        }
        
        public String getImdbID() {
            return imdbID;
        }
        
        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;
        }
        
        public String getPoster() {
            return poster;
        }
        
        public void setPoster(String poster) {
            this.poster = poster;
        }
        
        public String getGenre() {
            return genre;
        }
        
        public void setGenre(String genre) {
            this.genre = genre;
        }
        
        public String getPlot() {
            return plot;
        }
        
        public void setPlot(String plot) {
            this.plot = plot;
        }
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
}
