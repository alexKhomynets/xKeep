package MVC.servlet;

import MVC.PageParts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 1 on 19.07.2017.
 */
@WebServlet(name = "NodeServlet", value={"/note/*"})
public class NodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(PageParts.getPageTop());
        out.println("<h1>Форма відіслана</h1>");
        String memo = new String(request.getParameter("textInputMemo").getBytes("iso-8859-1"),
                "UTF-8");
        String[] memoList = memo.split("\\n");
        for (String line : memoList)
            out.println("<p>" + line + "</p>");
        out.println(PageParts.getPageBottom());
//        response.sendRedirect("/");
        // save data in session
        HttpSession session = request.getSession();
        session.setAttribute("memo", memoList);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println(PageParts.getPageTop());

        switch (request.getPathInfo()){

            case "/info":
                out.println(showInfo(request));
                break;
            case "/add":
                out.println(add());
                break;
            case "/recycle":
                out.println(recycle());
                break;
        }

        out.println(PageParts.getPageBottom());
    }


    private String showInfo(HttpServletRequest request){
        return "<h1>НФОРМАЦІЯ ПРО СЕРВЛЕТ</h1>"+
                "<h3>getContextParth "+request.getContextPath() +
                "<h3>getServletPath "+request.getServletPath()+ "</h3>"+
                "<h3>getPathInfo "+request.getPathInfo()+ "</h3>";
    }

    private String add() {
        return "<div class=\"row marginmenu\">" +
                "<div class=\"col-xs-12 col-sm-12 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4\">" +
                "<form method=\"POST\">" +
                "\t\t<div class=\"form-group\">\n" +
                "\t\t\t<label for=\"textInputMemo\">Введіть текст</label>\n" +
                "\t\t\t <textarea class=\"form-control\" id=\"textInputMemoID\" name=\"textInputMemo\" rows=\"5\"></textarea>\n" +
                "\t\t</div>\n"+
                "\t\t<div class=\"form-group\">\n" +
                "\t\t\t<button type=\"submit\" class=\"btn btn-default btn-block\">Відіслати</button>\n" +
                "\t\t</div>\n" +
                "</form>"+
                "</div>"+
                "</div>";
    }

    private String recycle() {
        return "<div class=\"row marginmenu\">" +
                "<div class=\"col-xs-12 col-sm-12 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4\">" +
                "<form method=\"POST\">" +
                "\t\t<div class=\"form-group\">\n" +
                "\t\t\t<label for=\"textInputMemo\">Введіть текст</label>\n" +
                "\t\t\t <textarea class=\"form-control\" id=\"textInputMemoID\" name=\"textInputMemo\" rows=\"5\"></textarea>\n" +
                "\t\t</div>\n"+
                "\t\t<div class=\"form-group\">\n" +
                "\t\t\t<button type=\"submit\" class=\"btn btn-default btn-block\">Відіслати</button>\n" +
                "\t\t</div>\n" +
                "</form>"+
                "</div>"+
                "</div>";
    }

}
