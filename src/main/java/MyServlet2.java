import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//        out.println("Witam! Tutaj Servlet 2 " + name + " " + surname);

        Cookie[] cookies = req.getCookies();

        for (int i = 0; i <= cookies.length; i++){
            if (cookies[i].getName().equals("cookie")) {
                out.println(cookies[i].getValue());
            }
        }
        // getCookies() zwraca tablicę Cookies
        //lub:
//        String name = Arrays.stream(req.getCookies())
//                .filter(cookie -> cookie.getName().equals("name"))
//                .findAny().get().getValue();

        out.println("Witam! Tutaj Servlet 2");


    }
}
