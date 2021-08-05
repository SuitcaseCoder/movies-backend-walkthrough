import com.google.gson.Gson;
import data.Movie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.PrintWriter;


@WebServlet(name = "MovieServlet", urlPatterns = "/movies")
public class MovieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
      response.setContentType("application/json");
      PrintWriter out;
    
        try {
            out = response.getWriter();
            Movie movie = new Movie( "The Parent Trap", "1997", "Nobody Knows", "Lindsey Lohan", "12345", "would use as decoration", "the best", "Girl finds out she's a twin. Switches places. Best movie ever.", 4);
            
            String movieString = new Gson().toJson(movie);
            out.println(movieString);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        response.setContentType(("application/json"));
        PrintWriter out = null;
        try{
            out = response.getWriter();
//        get the reader off the request
//            get reader returns a BufferedReader object
//            BufferedReader is an existing class
//            BufferedReader:a class which simplifies reading text from a character input stream. It buffers the characters in order to enable efficient reading of text data.
//            reading a character or a byte
            BufferedReader reader = request.getReader();
            
//            Gson().fromJson...
            Movie[] movies = new Gson().fromJson(reader, Movie[].class);
            
            // loop over movies array and sout out every part of the movie to be printed out just to see that it came through
            for(Movie movie: movies){
                System.out.println(movie.getId());
                System.out.println(movie.getTitle());
                System.out.println(movie.getActors());
                System.out.println(movie.getDirector());
                System.out.println(movie.getGenre());
                System.out.println(movie.getPoster());
                System.out.println(movie.getImdbID());
                System.out.println(movie.getPlot());
                System.out.println("*************************");
    
    
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        // write a meaningful response body and set the status code to 200
        out.println(new Gson().toJson("{message: \"Movies PoST was successful\"}"));
    }
}
