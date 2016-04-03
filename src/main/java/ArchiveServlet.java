import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/archive")
public class ArchiveServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<News> newsList = NewsArchive.news;
        req.setAttribute("newsList", newsList);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/archive.jsp");
        dispatcher.forward(req, resp);
    }

}