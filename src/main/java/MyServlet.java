import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();


        String cookieValue = req.getParameter("cookieValue");

        Cookie cookie = new Cookie("cookie", cookieValue);
        resp.addCookie(cookie);

        out.println(cookieValue);


//        out.println("Hello world from mvn :) " + name + " " + surname);

//        resp.sendRedirect(req.getContextPath() + "/servlet2");
//        getServletContext().getRequestDispatcher("/servlet2").forward(req, resp);
//        getServletContext().getRequestDispatcher("/servlet2").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String password = req.getParameter("password");

//        out.println("username: " + name);
//        out.println("passowrd: " + password);

        req.getSession().setAttribute("name", name);
        req.getSession().setAttribute("password", password);

        out.println("<a href=\"/servlet3\">Click to view credentials from login</a>");
    }
}