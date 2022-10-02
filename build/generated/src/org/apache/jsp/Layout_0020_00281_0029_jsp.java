package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Layout_0020_00281_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Home Page FPT Library</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./fontawesome/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/stylehome.css\">\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Page Loader--> \n");
      out.write("        <div id=\"loader-wrapper\">\n");
      out.write("            <div id=\"loader\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"loader-section section-left\"></div>\n");
      out.write("            <div class=\"loader-section section-right\"></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"home\">\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"\" class=\"fas fa-film mr-2\" style=\"width: 50px; height:50px;\">\n");
      out.write("                    FPT Library\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\">\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-1 active\" aria-current=\"page\" href=\"home\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-2\" href=\"print\">Cart</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-3\" href=\"about.jsp\">About</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-4\" href=\"#\">Manage Order</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-5\" href=\"#\">Manage Book</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">                            \n");
      out.write("                            <a class=\"nav-link nav-link-6\" href=\"#\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link nav-link-7\" href=\"#\" style=\"padding-top: 0px\"><img src=\"./img/user_ava.jpg\" style=\"width: 70px;\"></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">                            \n");
      out.write("                            <a class=\"nav-link nav-link-8\" href=\"#\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"tm-hero d-flex justify-content-center align-items-center\" data-parallax=\"scroll\" data-image-src=\"img/background.jpg\">\n");
      out.write("            <form class=\"d-flex tm-search-form\" action=\"SearchControl\">\n");
      out.write("                <input class=\"form-control tm-search-input\" id=\"lookingfor\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" name=\"search\">\n");
      out.write("                <button class=\"btn btn-outline-success tm-search-btn\" type=\"submit\">\n");
      out.write("                    <i class=\"fas fa-search\"></i>\n");
      out.write("                </button>\n");
      out.write("            </form>\n");
      out.write("        </div>        \n");
      out.write("        <div>\n");
      out.write("<!--        code from here-->\n");
      out.write("<main>\n");
      out.write("                <div class=\"container-fluid px-4\">\n");
      out.write("                    <h1 class=\"mt-4\">Manage Book</h1>\n");
      out.write("                    <ol class=\"breadcrumb mb-4\">\n");
      out.write("                        <li class=\"breadcrumb-item active\"></li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <div class=\"card mb-4\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <i class=\"fas fa-table me-1\"></i>\n");
      out.write("                            Book Information\n");
      out.write("                            <a href=\"insertBook.jsp\"><button type=\"submit\" class=\"btn btn-outline-primary\">Add new book</button></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <table id=\"datatablesSimple\" style=\"border: 1px solid black\">\n");
      out.write("                                <tr style=\"border: 1px solid black \">\n");
      out.write("                                    <td style=\"border: 1px solid black;text-align: center;\">ID</td>\n");
      out.write("                                    <td style=\"border: 1px solid black;text-align: center;\">IMAGE</td>\n");
      out.write("                                    <td style=\"border: 1px solid black;text-align: center;\">NAME</td>\n");
      out.write("                                    <td style=\"border: 1px solid black;text-align: center;\">AUTHOR</td>\n");
      out.write("                                    <td style=\"border: 1px solid black;text-align: center;\">LANGUAGE</td>\n");
      out.write("                                    <td style=\"border: 1px solid black;text-align: center;\">TYPE</td>                                      \n");
      out.write("                                    <td style=\"border: 1px solid black;text-align: center;\">PUBLISHER</td>\n");
      out.write("\n");
      out.write("                                    <td style=\"border: 1px solid black;padding: 0 15px; text-align: center;\">AMOUNT</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("<!--        code sau dòng này tao quánh bỏ bữa ah-->        \n");
      out.write("        </div>\n");
      out.write("        <footer class=\"tm-bg-gray pt-5 pb-3 tm-text-gray tm-footer\">\n");
      out.write("            <div class=\"container-fluid tm-container-small\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-12 col-12 px-5 mb-5\">\n");
      out.write("                        <h3 class=\"tm-text-primary mb-4 tm-footer-title\">About FPT Library</h3>\n");
      out.write("                        <p><a rel=\"sponsored\" href=\"https://v5.getbootstrap.com/\">FPT</a> Officially established on September 8, 2006 under the Prime Minister's Decision, FPT University became the first university in Vietnam established by an enterprise with 100% investment capital from the Corporation.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\n");
      out.write("                        <h3 class=\"tm-text-primary mb-4 tm-footer-title\" id=\"contact\">Contact</h3>\n");
      out.write("                        <ul class=\"tm-footer-links pl-0\">\n");
      out.write("                            <li><a href=\"cart\">Cart</a></li>\n");
      out.write("                            <li><a href=\"#\">Support</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-sm-6 col-12 px-5 mb-5\">\n");
      out.write("                        <ul class=\"tm-social-links d-flex justify-content-end pl-0 mb-5\">\n");
      out.write("                            <li class=\"mb-2\"><a href=\"https://facebook.com\"><i class=\"fab fa-facebook\"></i></a></li>\n");
      out.write("                            <li class=\"mb-2\"><a href=\"https://twitter.com\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                            <li class=\"mb-2\"><a href=\"https://instagram.com\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                            <li class=\"mb-2\"><a href=\"https://pinterest.com\"><i class=\"fab fa-pinterest\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-gray text-right d-block mb-2\">Terms of Use</a>\n");
      out.write("                        <a href=\"#\" class=\"tm-text-gray text-right d-block\">Privacy Policy</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-md-7 col-12 px-5 mb-3\">\n");
      out.write("                        Copyright 2022 FPT Company. All rights reserved .\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-5 col-12 px-5 text-right\">\n");
      out.write("                        Designed by <a href=\"https://templatemo.com\" class=\"tm-text-gray\" rel=\"sponsored\" target=\"_parent\">Taind and Group2</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("            function JSalert() {\n");
      out.write("                    swal({\n");
      out.write("                    title: \"Are you sure?\",\n");
      out.write("                            text: \"Do you really want to log out this book? Click OK to log out.\",\n");
      out.write("                            buttons: true,\n");
      out.write("        })\n");
      out.write("        .then((willDelete) => {\n");
      out.write("                            if (willDelete) {\n");
      out.write("                    window.location.href = \"firstpage.jsp\";         } else {\n");
      out.write("                            swal(\"You still stay in the PR library!\");\n");
      out.write("        }\n");
      out.write("        });\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function JSDelete() {\n");
      out.write("                            swal({\n");
      out.write("                            title: \"Are you sure?\",\n");
      out.write("            text: \"Do you really want to log out this book? Click OK to log out.\",\n");
      out.write("            buttons: true,\n");
      out.write("                    })\n");
      out.write("                    .then((deleteBook) => {\n");
      out.write("                                    if (deleteBook) {\n");
      out.write("                            swal(\"deleted!\");\n");
      out.write("            } else {\n");
      out.write("                                    swal(\"Book still availible!\");\n");
      out.write("                    }\n");
      out.write("                    });\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    $(window).on(\"load\", function () {\n");
      out.write("                                    $('body').addClass('loaded');\n");
      out.write("                });\n");
      out.write("                </script>\n");
      out.write("        <script>\n");
      out.write("            $(window).on(\"load\", function () {\n");
      out.write("                $('body').addClass('loaded');\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listB}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr style=\"border: 1px solid black;\" >\n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 15px;text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>                                        \n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 auto;text-align: center;\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 100px;\"></td>\n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 15px;text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 15px;text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 15px;text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.language}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 15px;text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 15px;text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.publisher}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                                        <td style=\"border: 1px solid black;padding: 0 15px;text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <a href=\"update?bid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button type=\"submit\" class=\"btn btn-outline-primary\" >Update</button></a></a> <br>\n");
          out.write("                                            <a href=\"delete?bid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button type=\"submit\" class=\"btn btn-outline-primary\" onclick=\"JSDelete()\" style=\"width: 100%;\">Delete</button></a></a>\n");
          out.write("                                            <!--                                                <li><a class=\"dropdown-item\" onclick=\"return JSDelete()\">Delete</a></li>-->\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
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
