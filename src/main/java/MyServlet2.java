import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        //PARAMETRY:
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        out.println("Witam! Tutaj Servlet 2 " + name + " " + surname);

//        out.println("Witam! Tutaj Servlet 2");


    }
}
