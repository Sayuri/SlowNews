
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<News> newsList = NewsList.getNews();
        req.setAttribute("newsList", newsList);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/news.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        NewsArchive.news.add(new News(httpServletRequest.getParameter("imageLink"), httpServletRequest.getParameter("topic"),
                httpServletRequest.getParameter("body")));

        ArrayList<News> newsList = NewsList.getNews();
        httpServletRequest.setAttribute("newsList", newsList);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/news.jsp");
        dispatcher.forward(httpServletRequest, httpServletResponse);
    }

}
