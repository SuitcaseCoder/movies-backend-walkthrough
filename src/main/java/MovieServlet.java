import com.google.gson.Gson;
import data.Movie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet(name = "MovieServlet", urlPatterns = "/movies")
public class MovieServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
      response.setContentType("application/json");
    
        try {
            PrintWriter out = response.getWriter();
            Movie movie = new Movie( "The Parent Trap", "1997", "Nobody Knows", "Lindsey Lohan", "12345", "would use as decoration", "the best", "Girl finds out she's a twin. Switches places. Best movie ever.", 4);
            
            String movieString = new Gson().toJson(movie);
            out.println(movieString);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
