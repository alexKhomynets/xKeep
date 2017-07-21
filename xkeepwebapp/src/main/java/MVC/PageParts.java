package MVC;

/**Creates static parts for HTML page
 */
public class PageParts {
    public static String getPageTop() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"utf-8\">\n" +
                "\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "\t\t<title>xKeep</title>\n" +
                "\t\t<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "\t\t<link href=\"/css/myStyles.css\" rel=\"stylesheet\">\n" +
                "\t\t <!--[if lt IE 9]>\n" +
                "\t\t\t<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n" +
                "\t\t\t<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n" +
                "\t\t<![endif]-->\n" +
                "\t</head>\n" +
                "<body>\n" +
                getMenubar() +
                "<div class=\"container marginmenu\" role=\"main\">\n";
    }

    public static String getPageBottom() {
        return "\n</div>\n" +
                "<script src=\"/js/jquery.min.js\"></script>\n" +
                "<script src=\"/js/bootstrap.min.js\"></script>\t" +
                "</body>\n" +
                "</html>";
    }

    private static String getMenubar() {
        return "\n<!-- Fixed navbar -->\n" +
                "<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n" +
                "\t<div class=\"container\">\n" +
                "\t\t<div class=\"navbar-header\">\n" +
                "\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n" +
                "\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n" +
                "\t\t\t\t<span class=\"icon-bar\"></span>\n" + "\t\t\t\t<span class=\"icon-bar\"></span>\n" + "\t\t\t\t<span class=\"icon-bar\"></span>\n" +
                "\t\t\t</button>\n" +
                "\t\t\t<a class=\"navbar-brand\" href=\"/\">xKeep</a>\n" +
                "\t\t</div>\n" +
                "\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\n" +
                "\t\t\t<ul class=\"nav navbar-nav\">\n" +
                "\t\t\t\t<li class=\"active\"><a href=\"/\">Home</a></li>\n" +

                "\t\t\t\t<li class=\"dropdown\">\n" +
                "\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Замітка <span class=\"caret\"></span></a>\n" +
                "\t\t\t\t<ul class=\"dropdown-menu\">\n" +
                "\t\t\t\t\t<li><a href=\"/note/add\">Додати</a></li>\n" +
                "\t\t\t\t\t<li><a href=\"/note/show\">Показати</a></li>\n" +
                "\t\t\t\t\t<li><a href=\"/note/info\">Інфо</a></li>\n" +
                "\t\t\t\t\t<li><a href=\"/note/recycle\">Корзина</a></li>\n" +
                "\t\t\t\t</ul>\n" +

                "\t\t\t</ul>\n" +
                "\t\t</div><!--/.nav-collapse -->\n" +
                "\t\t</div>\n" +
                "</nav>\n\n";
    }
}
