package MVC.servlet;

import MVC.PageParts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Start servlet
 */
@WebServlet(name = "Start", urlPatterns = {"/"})
public class Start extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        PageParts pageParts = new PageParts();

        try {
            out.println(pageParts.getPageTop());
            out.write("<H1 align = center>Welcome to the xKeep.</H1>");
            out.println(registration());
            out.println(pageParts.getPageBottom());

        } finally {
            out.close();
        }
    }
    private String registration() {
        return "<div>" +
                "<div class=\"col-xs-12 col-sm-12 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4\">" +
                "<form method=\"POST\">" +
                "\t\t<div class=\"form-group\">\n" +
                "\t\t\t<label align=\"center\" for=\"textInputMemo\">Заповніть поле для регістрації.</label>\n" +
                "\t\t\t <input class=\"form-control\" id=\"loginInputMemoID\" name=\"login\" rows=\"3\"></input>\n" +
                "\t\t\t <input class=\"form-control\" id=\"passwordInputMemoID\" name=\"password\" type=\"password\" rows=\"3\"></input>\n" +
                "\t\t</div>\n"+
                "\t\t<div class=\"form-group\">\n" +
                "\t\t\t<button type=\"submit\" class=\"btn btn-default btn-block\">Підтвердити</button>\n" +
                "\t\t</div>\n" +
                "</form>"+
                "</div>"+
                "</div>";
    }
}