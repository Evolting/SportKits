package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCRUD_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/footer_header/header.jsp");
    _jspx_dependants.add("/footer_header/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <script src=\"js/mycode.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                color: #566787;\n");
      out.write("                background: #f5f5f5;\n");
      out.write("                font-family: 'Varela Round', sans-serif;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .table-responsive {\n");
      out.write("                margin: 30px 0;\n");
      out.write("            }\n");
      out.write("            .table-wrapper {\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 20px 25px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                min-width: 1000px;\n");
      out.write("                box-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .table-title {        \n");
      out.write("                padding-bottom: 15px;\n");
      out.write("                background: #435d7d;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 16px 30px;\n");
      out.write("                min-width: 100%;\n");
      out.write("                margin: -20px -25px 10px;\n");
      out.write("                border-radius: 3px 3px 0 0;\n");
      out.write("            }\n");
      out.write("            .table-title h2 {\n");
      out.write("                margin: 5px 0 0;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn-group {\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .table-title .btn {\n");
      out.write("                color: #fff;\n");
      out.write("                float: right;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border: none;\n");
      out.write("                min-width: 50px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                border: none;\n");
      out.write("                outline: none !important;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn i {\n");
      out.write("                float: left;\n");
      out.write("                font-size: 21px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn span {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 2px;\n");
      out.write("            }\n");
      out.write("            table.table tr th, table.table tr td {\n");
      out.write("                border-color: #e9e9e9;\n");
      out.write("                padding: 12px 15px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("            }\n");
      out.write("            table.table tr th:first-child {\n");
      out.write("                width: 60px;\n");
      out.write("            }\n");
      out.write("            table.table tr th:last-child {\n");
      out.write("                width: 100px;\n");
      out.write("            }\n");
      out.write("            table.table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("                background-color: #fcfcfc;\n");
      out.write("            }\n");
      out.write("            table.table-striped.table-hover tbody tr:hover {\n");
      out.write("                background: #f5f5f5;\n");
      out.write("            }\n");
      out.write("            table.table th i {\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\t\n");
      out.write("            table.table td:last-child i {\n");
      out.write("                opacity: 0.9;\n");
      out.write("                font-size: 22px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("            }\n");
      out.write("            table.table td a {\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #566787;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-decoration: none;\n");
      out.write("                outline: none !important;\n");
      out.write("            }\n");
      out.write("            table.table td a:hover {\n");
      out.write("                color: #2196F3;\n");
      out.write("            }\n");
      out.write("            table.table td a.edit {\n");
      out.write("                color: #FFC107;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #F44336;\n");
      out.write("            }\n");
      out.write("            table.table td i {\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            table.table .avatar {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .pagination {\n");
      out.write("                float: right;\n");
      out.write("                margin: 0 0 5px;\n");
      out.write("            }\n");
      out.write("            .pagination li a {\n");
      out.write("                border: none;\n");
      out.write("                font-size: 13px;\n");
      out.write("                min-width: 30px;\n");
      out.write("                min-height: 30px;\n");
      out.write("                color: #999;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                line-height: 30px;\n");
      out.write("                border-radius: 2px !important;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 0 6px;\n");
      out.write("            }\n");
      out.write("            .pagination li a:hover {\n");
      out.write("                color: #666;\n");
      out.write("            }\t\n");
      out.write("            .pagination li.active a, .pagination li.active a.page-link {\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .pagination li.active a:hover {        \n");
      out.write("                background: #0397d6;\n");
      out.write("            }\n");
      out.write("            .pagination li.disabled i {\n");
      out.write("                color: #ccc;\n");
      out.write("            }\n");
      out.write("            .pagination li i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding-top: 6px\n");
      out.write("            }\n");
      out.write("            .hint-text {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }    \n");
      out.write("            /* Custom checkbox */\n");
      out.write("            .custom-checkbox {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"] {    \n");
      out.write("                opacity: 0;\n");
      out.write("                position: absolute;\n");
      out.write("                margin: 5px 0 0 3px;\n");
      out.write("                z-index: 9;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox label:before{\n");
      out.write("                width: 18px;\n");
      out.write("                height: 18px;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox label:before {\n");
      out.write("                content: '';\n");
      out.write("                margin-right: 10px;\n");
      out.write("                display: inline-block;\n");
      out.write("                vertical-align: text-top;\n");
      out.write("                background: white;\n");
      out.write("                border: 1px solid #bbb;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("                content: '';\n");
      out.write("                position: absolute;\n");
      out.write("                left: 6px;\n");
      out.write("                top: 3px;\n");
      out.write("                width: 6px;\n");
      out.write("                height: 11px;\n");
      out.write("                border: solid #000;\n");
      out.write("                border-width: 0 3px 3px 0;\n");
      out.write("                transform: inherit;\n");
      out.write("                z-index: 3;\n");
      out.write("                transform: rotateZ(45deg);\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:before {\n");
      out.write("                border-color: #03A9F4;\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("                border-color: #fff;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:disabled + label:before {\n");
      out.write("                color: #b8b8b8;\n");
      out.write("                cursor: auto;\n");
      out.write("                box-shadow: none;\n");
      out.write("                background: #ddd;\n");
      out.write("            }\n");
      out.write("            /* Modal styles */\n");
      out.write("            .modal .modal-dialog {\n");
      out.write("                max-width: 400px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-header, .modal .modal-body, .modal .modal-footer {\n");
      out.write("                padding: 20px 30px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-content {\n");
      out.write("                border-radius: 3px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-footer {\n");
      out.write("                background: #ecf0f1;\n");
      out.write("                border-radius: 0 0 3px 3px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-title {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .modal .form-control {\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: none;\n");
      out.write("                border-color: #dddddd;\n");
      out.write("            }\n");
      out.write("            .modal textarea.form-control {\n");
      out.write("                resize: vertical;\n");
      out.write("            }\n");
      out.write("            .modal .btn {\n");
      out.write("                border-radius: 2px;\n");
      out.write("                min-width: 100px;\n");
      out.write("            }\t\n");
      out.write("            .modal form label {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\t\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // Activate tooltip\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\n");
      out.write("                // Select/Deselect checkboxes\n");
      out.write("                var checkbox = $('table tbody input[type=\"checkbox\"]');\n");
      out.write("                $(\"#selectAll\").click(function () {\n");
      out.write("                    if (this.checked) {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = true;\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = false;\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                checkbox.click(function () {\n");
      out.write("                    if (!this.checked) {\n");
      out.write("                        $(\"#selectAll\").prop(\"checked\", false);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            header{\n");
      out.write("                position: -webkit-sticky;\n");
      out.write("                position: sticky;\n");
      out.write("                top: 0;\n");
      out.write("                z-index: 100    ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-dark pt-2 pb-2 pl-1 pr-1\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <nav class=\"navbar navbar-expand-sm navbar-dark\">\n");
      out.write("                            <a class=\"navbar-brand\" href=\"home\"><h4>sport<span style=\"color: yellow\">KITS</span></h4></a>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("                                <ul class=\"navbar-nav \">\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link text-light\" href=\"home\"><i class=\"fas fa-home\"></i><span class=\"sr-only\">(current)</span></a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item dropdown\">\n");
      out.write("                                        <a class=\"nav-link dropdown-toggle text-light\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                            <i class=\"fas fa-tshirt\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=*&page=1\">Tất cả</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Premier+League&page=1\">Áo đấu Premier League</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=La+Liga&page=1\">Áo đấu La Liga</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Series+A&page=1\">Áo đấu Series A</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Bundesliga&page=1\">Áo đấu Bundesliga</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"catalog?league=Ligue+1&page=1\">Áo đấu Ligue 1</a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <form class=\"form-inline my-2 my-lg-0\" action=\"search\" method=\"get\">\n");
      out.write("                                            <input class=\"form-control mr-sm-2\" type=\"search\" name=\"query\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\"><img src=\"image/link-ico.png\"></button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container-xl\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Manage <b>Employees</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <a href=\"#addEmployeeModal\" class=\"btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Employee</span></a>\n");
      out.write("                                <a href=\"#deleteEmployeeModal\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete</span></a>\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>\n");
      out.write("                                    <span class=\"custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" id=\"selectAll\">\n");
      out.write("                                        <label for=\"selectAll\"></label>\n");
      out.write("                                    </span>\n");
      out.write("                                </th>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Season</th>\n");
      out.write("                                <th>League</th>\n");
      out.write("                                <th>Price</th>\n");
      out.write("                                <th>Descript</th>\n");
      out.write("                                <th>Supplier</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"clearfix\">\n");
      out.write("                        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("                        <ul class=\"pagination\">\n");
      out.write("                            <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
      out.write("                            <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
      out.write("                            <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("        </div>\n");
      out.write("        <!-- Edit Modal HTML -->\n");
      out.write("        <div id=\"addEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Add Employee</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Address</label>\n");
      out.write("                                <textarea class=\"form-control\" required></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Phone</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Edit Modal HTML -->\n");
      out.write("        <div id=\"editEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Edit Employee</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Address</label>\n");
      out.write("                                <textarea class=\"form-control\" required></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Phone</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Delete Modal HTML -->\n");
      out.write("        <div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Delete Employee</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <p>Are you sure you want to delete these Records?</p>\n");
      out.write("                            <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>\n");
      out.write("            .site-footer\n");
      out.write("            {\n");
      out.write("                background-color:#26272b;\n");
      out.write("                padding:45px 0 20px;\n");
      out.write("                font-size:15px;\n");
      out.write("                line-height:24px;\n");
      out.write("                color:#737373;\n");
      out.write("            }\n");
      out.write("            .site-footer hr\n");
      out.write("            {\n");
      out.write("                border-top-color:#bbb;\n");
      out.write("                opacity:0.5\n");
      out.write("            }\n");
      out.write("            .site-footer hr.small\n");
      out.write("            {\n");
      out.write("                margin:20px 0\n");
      out.write("            }\n");
      out.write("            .site-footer h6\n");
      out.write("            {\n");
      out.write("                color:#fff;\n");
      out.write("                font-size:16px;\n");
      out.write("                text-transform:uppercase;\n");
      out.write("                margin-top:5px;\n");
      out.write("                letter-spacing:2px\n");
      out.write("            }\n");
      out.write("            .site-footer a\n");
      out.write("            {\n");
      out.write("                color:#737373;\n");
      out.write("            }\n");
      out.write("            .site-footer a:hover\n");
      out.write("            {\n");
      out.write("                color:#3366cc;\n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("            .footer-links\n");
      out.write("            {\n");
      out.write("                padding-left:0;\n");
      out.write("                list-style:none\n");
      out.write("            }\n");
      out.write("            .footer-links li\n");
      out.write("            {\n");
      out.write("                display:block\n");
      out.write("            }\n");
      out.write("            .footer-links a\n");
      out.write("            {\n");
      out.write("                color:#737373\n");
      out.write("            }\n");
      out.write("            .footer-links a:active,.footer-links a:focus,.footer-links a:hover\n");
      out.write("            {\n");
      out.write("                color:#3366cc;\n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("            .footer-links.inline li\n");
      out.write("            {\n");
      out.write("                display:inline-block\n");
      out.write("            }\n");
      out.write("            .site-footer .social-icons\n");
      out.write("            {\n");
      out.write("                text-align:right\n");
      out.write("            }\n");
      out.write("            .site-footer .social-icons a\n");
      out.write("            {\n");
      out.write("                width:40px;\n");
      out.write("                height:40px;\n");
      out.write("                line-height:40px;\n");
      out.write("                margin-left:6px;\n");
      out.write("                margin-right:0;\n");
      out.write("                border-radius:100%;\n");
      out.write("                background-color:#33353d\n");
      out.write("            }\n");
      out.write("            .copyright-text\n");
      out.write("            {\n");
      out.write("                margin:0\n");
      out.write("            }\n");
      out.write("            @media (max-width:991px)\n");
      out.write("            {\n");
      out.write("                .site-footer [class^=col-]\n");
      out.write("                {\n");
      out.write("                    margin-bottom:30px\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (max-width:767px)\n");
      out.write("            {\n");
      out.write("                .site-footer\n");
      out.write("                {\n");
      out.write("                    padding-bottom:0\n");
      out.write("                }\n");
      out.write("                .site-footer .copyright-text,.site-footer .social-icons\n");
      out.write("                {\n");
      out.write("                    text-align:center\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .social-icons\n");
      out.write("            {\n");
      out.write("                padding-left:0;\n");
      out.write("                margin-bottom:0;\n");
      out.write("                list-style:none\n");
      out.write("            }\n");
      out.write("            .social-icons li\n");
      out.write("            {\n");
      out.write("                display:inline-block;\n");
      out.write("                margin-bottom:4px\n");
      out.write("            }\n");
      out.write("            .social-icons li.title\n");
      out.write("            {\n");
      out.write("                margin-right:15px;\n");
      out.write("                text-transform:uppercase;\n");
      out.write("                color:#96a2b2;\n");
      out.write("                font-weight:700;\n");
      out.write("                font-size:13px\n");
      out.write("            }\n");
      out.write("            .social-icons a{\n");
      out.write("                background-color:#eceeef;\n");
      out.write("                color:#818a91;\n");
      out.write("                font-size:16px;\n");
      out.write("                display:inline-block;\n");
      out.write("                line-height:44px;\n");
      out.write("                width:44px;\n");
      out.write("                height:44px;\n");
      out.write("                text-align:center;\n");
      out.write("                margin-right:8px;\n");
      out.write("                border-radius:100%;\n");
      out.write("                -webkit-transition:all .2s linear;\n");
      out.write("                -o-transition:all .2s linear;\n");
      out.write("                transition:all .2s linear\n");
      out.write("            }\n");
      out.write("            .social-icons a:active,.social-icons a:focus,.social-icons a:hover\n");
      out.write("            {\n");
      out.write("                color:#fff;\n");
      out.write("                background-color:#29aafe\n");
      out.write("            }\n");
      out.write("            .social-icons.size-sm a\n");
      out.write("            {\n");
      out.write("                line-height:34px;\n");
      out.write("                height:34px;\n");
      out.write("                width:34px;\n");
      out.write("                font-size:14px\n");
      out.write("            }\n");
      out.write("            .social-icons a.facebook:hover\n");
      out.write("            {\n");
      out.write("                background-color:#3b5998\n");
      out.write("            }\n");
      out.write("            .social-icons a.twitter:hover\n");
      out.write("            {\n");
      out.write("                background-color:#00aced\n");
      out.write("            }\n");
      out.write("            .social-icons a.linkedin:hover\n");
      out.write("            {\n");
      out.write("                background-color:#007bb6\n");
      out.write("            }\n");
      out.write("            .social-icons a.dribbble:hover\n");
      out.write("            {\n");
      out.write("                background-color:#ea4c89\n");
      out.write("            }\n");
      out.write("            @media (max-width:767px)\n");
      out.write("            {\n");
      out.write("                .social-icons li.title\n");
      out.write("                {\n");
      out.write("                    display:block;\n");
      out.write("                    margin-right:0;\n");
      out.write("                    font-weight:600\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Site footer -->\n");
      out.write("        <footer class=\"site-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-6\">\n");
      out.write("                        <h6>Giới thiệu</h6>\n");
      out.write("                        <p class=\"text-justify\">\n");
      out.write("                            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt \n");
      out.write("                            ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco \n");
      out.write("                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in \n");
      out.write("                            voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non \n");
      out.write("                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-6 col-md-3\">\n");
      out.write("                        <h6>Mặt hàng</h6>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"http://scanfcode.com/category/c-language/\">Áo đấu Premier League</a></li>\n");
      out.write("                            <li><a href=\"http://scanfcode.com/category/front-end-development/\">Áo đấu La Liga</a></li>\n");
      out.write("                            <li><a href=\"http://scanfcode.com/category/back-end-development/\">Áo đấu Series A</a></li>\n");
      out.write("                            <li><a href=\"http://scanfcode.com/category/java-programming-language/\">Áo đấu Bundesliga</a></li>\n");
      out.write("                            <li><a href=\"http://scanfcode.com/category/android/\">Áo đấu Ligue 1</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-6 col-md-3\">\n");
      out.write("                        <h6>Nhà phân phối</h6>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"http://scanfcode.com/about/\">Nike</a></li>\n");
      out.write("                            <li><a href=\"http://scanfcode.com/contact/\">Adidas</a></li>\n");
      out.write("                            <li><a href=\"http://scanfcode.com/contribute-at-scanfcode/\">Puma</a></li>\n");
      out.write("                            <li><a href=\"http://scanfcode.com/privacy-policy/\">Kappa</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("                        <ul class=\"social-icons\" style=\"float: left\">\n");
      out.write("                            <li><a class=\"facebook\" href=\"https://www.facebook.com/PES\" target=\"_blank\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                            <li><a class=\"twitter\" href=\"https://twitter.com/officialpes\" target=\"_blank\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a class=\"instagram\" href=\"https://www.instagram.com/officialpes/\" target=\"_blank\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                            <li><a class=\"youtube\" href=\"https://www.youtube.com/user/officialpes\" target=\"_blank\"><i class=\"fab fa-youtube\"></i></a></li>   \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a class=\"nav-link text-light\" href=\"#\"><i class=\"fas fa-plus-circle\"></i></a>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li class=\"nav-item\">\n");
        out.write("                                            <a class=\"nav-link text-light\" href=\"login\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li class=\"nav-item\">\n");
        out.write("                                            <a class=\"nav-link text-light\" href=\"login\"><i class=\"fas fa-user\"></i></a>\n");
        out.write("                                        </li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                          \n");
        out.write("                                        <li class=\"nav-item\">\n");
        out.write("                                            <a class=\"nav-link text-light\" href=\"cart.jsp\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
        out.write("                                        </li>\n");
        out.write("                                        <li class=\"nav-item\">\n");
        out.write("                                            <a class=\"nav-link text-light\" href=\"logout\"><i class=\"fas fa-sign-out-alt\"></i></i></a>\n");
        out.write("                                        </li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <h3 class=\"text-center\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" - ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>\n");
          out.write("                                        <span class=\"custom-checkbox\">\n");
          out.write("                                            <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
          out.write("                                            <label for=\"checkbox1\"></label>\n");
          out.write("                                        </span>\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pkitID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.kitName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.season}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.league}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.descript}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.supplier}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <a href=\"#editEmployeeModal\" class=\"edit\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
          out.write("                                        <a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
