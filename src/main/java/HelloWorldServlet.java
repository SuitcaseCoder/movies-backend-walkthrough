import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        try{
            PrintWriter out = response.getWriter();
            out.println("ayooo I appeared on the browser");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
//
    }
}
