package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(1);
    _jspx_dependants.add("/pages/Slideshow.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fscope_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fscope_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fscope_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_005fhtml_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005fhtml_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhtml_005f0.setParent(null);
    int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
    if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<head>\r\n");
        out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\">\r\n");
        out.write("<title>");
        if (_jspx_meth_bean_005fmessage_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("</title>\r\n");
        if (_jspx_meth_html_005fbase_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</head>\r\n");
        out.write("<body bgcolor=\"white\">\r\n");
        out.write("\r\n");
        if (_jspx_meth_logic_005fnotPresent_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/myHouse/pages/style.css\"/>\r\n");
        out.write(" <div id=\"wrapper\">\r\n");
        out.write(" <div class=\"header\"><marquee><img src='/myHouse/image/logo.jpeg' width=70px height=70px></marquee><h4><marquee>PMS Real Estate Service မွၾကိဳဆိုပါသည္</marquee></h4>\r\n");
        out.write("<marquee><h4> Phone No: 09-43098621,09-428013834,09257998588&nbsp;&nbsp;&nbsp;Email:pmsestate2009@gmail.com</h4></marquee>\r\n");
        out.write("</div>\r\n");
        out.write("<div class=\"menu\">\r\n");
        if (_jspx_meth_html_005fform_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</div>\r\n");
        out.write("<div class=\"footer\"><br>\r\n");
        out.write("<left><a href=\"/myHouse/jsp/aboutus.jsp\">About</a>&nbsp;|&nbsp;\r\n");
        out.write("    <a href=\"/myHouse/jsp/contactus.jsp\">Contact Us</a>&nbsp;|&nbsp;</left>\r\n");
        out.write("    <br><br><h2><center>\r\n");
        out.write("သင္သိခ်င္ေသာ စာရင္းကို search button ကိုနွိပ္ျပီးရွာေဖြနိုင္ပါသည္။\r\n");
        out.write("<br><br><br>\r\n");
        out.write("<form action=\"/myHouse/jsp/search.jsp\" name=\"form1\" method=\"get\">\r\n");
        out.write("<input type=\"submit\" value=\"Search\">\r\n");
        out.write("</form>\r\n");
        out.write("</center></h2>\r\n");
        out.write("<br><center>");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("<head>\r\n");
        out.write("    <meta charset=\"utf-8\">\r\n");
        out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
        out.write("    <title>Banner Rotator Demo - Jssor Slider, Carousel, Slideshow with Javascript Source Code</title>\r\n");
        out.write("</head>\r\n");
        out.write("<body style=\"background:#fff;\">\r\n");
        out.write("    <!-- Caption Style -->\r\n");
        out.write("    <style> \r\n");
        out.write("        .captionOrange, .captionBlack\r\n");
        out.write("        {\r\n");
        out.write("            color: #fff;\r\n");
        out.write("            font-size: 20px;\r\n");
        out.write("            line-height: 30px;\r\n");
        out.write("            text-align: center;\r\n");
        out.write("            border-radius: 4px;\r\n");
        out.write("        }\r\n");
        out.write("        .captionOrange\r\n");
        out.write("        {\r\n");
        out.write("            background: #EB5100;\r\n");
        out.write("            background-color: rgba(235, 81, 0, 0.6);\r\n");
        out.write("        }\r\n");
        out.write("        .captionBlack\r\n");
        out.write("        {\r\n");
        out.write("        \tfont-size:16px;\r\n");
        out.write("            background: #000;\r\n");
        out.write("            background-color: rgba(0, 0, 0, 0.4);\r\n");
        out.write("        }\r\n");
        out.write("        a.captionOrange, A.captionOrange:active, A.captionOrange:visited\r\n");
        out.write("        {\r\n");
        out.write("        \tcolor: #ffffff;\r\n");
        out.write("        \ttext-decoration: none;\r\n");
        out.write("        }\r\n");
        out.write("        a.captionOrange:hover\r\n");
        out.write("        {\r\n");
        out.write("            color: #eb5100;\r\n");
        out.write("            text-decoration: underline;\r\n");
        out.write("            background-color: #eeeeee;\r\n");
        out.write("            background-color: rgba(238, 238, 238, 0.7);\r\n");
        out.write("        }\r\n");
        out.write("        .bricon\r\n");
        out.write("        {\r\n");
        out.write("            background: url(../img/browser-icons.png);\r\n");
        out.write("        }\r\n");
        out.write("    </style>\r\n");
        out.write("    <!-- it works the same with all jquery version from 1.x to 2.x -->\r\n");
        out.write("    <script type=\"text/javascript\" src=\"/myHouse/pages/jquery-1.9.1.min.js\"></script>\r\n");
        out.write("    <!-- use jssor.slider.mini.js (40KB) instead for release -->\r\n");
        out.write("    <!-- jssor.slider.mini.js = (jssor.js + jssor.slider.js) -->\r\n");
        out.write("    <script type=\"text/javascript\" src=\"/myHouse/pages/jssor.js\"></script>\r\n");
        out.write("    <script type=\"text/javascript\" src=\"/myHouse/pages/jssor.slider.js\"></script>\r\n");
        out.write("    <script>\r\n");
        out.write("        jQuery(document).ready(function ($) {\r\n");
        out.write("            //Reference http://www.jssor.com/development/slider-with-slideshow-jquery.html\r\n");
        out.write("            //Reference http://www.jssor.com/development/tool-slideshow-transition-viewer.html\r\n");
        out.write("\r\n");
        out.write("            var _SlideshowTransitions = [\r\n");
        out.write("                //Rotate Overlap\r\n");
        out.write("                { $Duration: 1200, $Zoom: 11, $Rotate: -1, $Easing: { $Zoom: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Round: { $Rotate: 0.5 }, $Brother: { $Duration: 1200, $Zoom: 1, $Rotate: 1, $Easing: $JssorEasing$.$EaseSwing, $Opacity: 2, $Round: { $Rotate: 0.5 }, $Shift: 90 } },\r\n");
        out.write("                //Switch\r\n");
        out.write("                { $Duration: 1400, x: 0.25, $Zoom: 1.5, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Zoom: $JssorEasing$.$EaseInSine }, $Opacity: 2, $ZIndex: -10, $Brother: { $Duration: 1400, x: -0.25, $Zoom: 1.5, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Zoom: $JssorEasing$.$EaseInSine }, $Opacity: 2, $ZIndex: -10 } },\r\n");
        out.write("                //Rotate Relay\r\n");
        out.write("                { $Duration: 1200, $Zoom: 11, $Rotate: 1, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Round: { $Rotate: 1 }, $ZIndex: -10, $Brother: { $Duration: 1200, $Zoom: 11, $Rotate: -1, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Round: { $Rotate: 1 }, $ZIndex: -10, $Shift: 600 } },\r\n");
        out.write("                //Doors\r\n");
        out.write("                { $Duration: 1500, x: 0.5, $Cols: 2, $ChessMode: { $Column: 3 }, $Easing: { $Left: $JssorEasing$.$EaseInOutCubic }, $Opacity: 2, $Brother: { $Duration: 1500, $Opacity: 2 } },\r\n");
        out.write("                //Rotate in+ out-\r\n");
        out.write("                { $Duration: 1500, x: -0.3, y: 0.5, $Zoom: 1, $Rotate: 0.1, $During: { $Left: [0.6, 0.4], $Top: [0.6, 0.4], $Rotate: [0.6, 0.4], $Zoom: [0.6, 0.4] }, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1000, $Zoom: 11, $Rotate: -0.5, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Shift: 200 } },\r\n");
        out.write("                //Fly Twins\r\n");
        out.write("                { $Duration: 1500, x: 0.3, $During: { $Left: [0.6, 0.4] }, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Outside: true, $Brother: { $Duration: 1000, x: -0.3, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },\r\n");
        out.write("                //Rotate in- out+\r\n");
        out.write("                { $Duration: 1500, $Zoom: 11, $Rotate: 0.5, $During: { $Left: [0.4, 0.6], $Top: [0.4, 0.6], $Rotate: [0.4, 0.6], $Zoom: [0.4, 0.6] }, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1000, $Zoom: 1, $Rotate: -0.5, $Easing: { $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Shift: 200 } },\r\n");
        out.write("                //Rotate Axis up overlap\r\n");
        out.write("                { $Duration: 1200, x: 0.25, y: 0.5, $Rotate: -0.1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1200, x: -0.1, y: -0.7, $Rotate: 0.1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2 } },\r\n");
        out.write("                //Chess Replace TB\r\n");
        out.write("                { $Duration: 1600, x: 1, $Rows: 2, $ChessMode: { $Row: 3 }, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1600, x: -1, $Rows: 2, $ChessMode: { $Row: 3 }, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },\r\n");
        out.write("                //Chess Replace LR\r\n");
        out.write("                { $Duration: 1600, y: -1, $Cols: 2, $ChessMode: { $Column: 12 }, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1600, y: 1, $Cols: 2, $ChessMode: { $Column: 12 }, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },\r\n");
        out.write("                //Shift TB\r\n");
        out.write("                { $Duration: 1200, y: 1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1200, y: -1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },\r\n");
        out.write("                //Shift LR\r\n");
        out.write("                { $Duration: 1200, x: 1, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Brother: { $Duration: 1200, x: -1, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 } },\r\n");
        out.write("                //Return TB\r\n");
        out.write("                { $Duration: 1200, y: -1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Brother: { $Duration: 1200, y: -1, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Shift: -100 } },\r\n");
        out.write("                //Return LR\r\n");
        out.write("                { $Duration: 1200, x: 1, $Delay: 40, $Cols: 6, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Easing: { $Left: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Brother: { $Duration: 1200, x: 1, $Delay: 40, $Cols: 6, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Easing: { $Top: $JssorEasing$.$EaseInOutQuart, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2, $ZIndex: -10, $Shift: -100 } },\r\n");
        out.write("                //Rotate Axis down\r\n");
        out.write("                { $Duration: 1500, x: -0.1, y: -0.7, $Rotate: 0.1, $During: { $Left: [0.6, 0.4], $Top: [0.6, 0.4], $Rotate: [0.6, 0.4] }, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2, $Brother: { $Duration: 1000, x: 0.2, y: 0.5, $Rotate: -0.1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Top: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad }, $Opacity: 2 } },\r\n");
        out.write("                //Extrude Replace\r\n");
        out.write("                { $Duration: 1600, x: -0.2, $Delay: 40, $Cols: 12, $During: { $Left: [0.4, 0.6] }, $SlideOut: true, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Assembly: 260, $Easing: { $Left: $JssorEasing$.$EaseInOutExpo, $Opacity: $JssorEasing$.$EaseInOutQuad }, $Opacity: 2, $Outside: true, $Round: { $Top: 0.5 }, $Brother: { $Duration: 1000, x: 0.2, $Delay: 40, $Cols: 12, $Formation: $JssorSlideshowFormations$.$FormationStraight, $Assembly: 1028, $Easing: { $Left: $JssorEasing$.$EaseInOutExpo, $Opacity: $JssorEasing$.$EaseInOutQuad }, $Opacity: 2, $Round: { $Top: 0.5 } } }\r\n");
        out.write("            ];\r\n");
        out.write("\r\n");
        out.write("            var _CaptionTransitions = [\r\n");
        out.write("            //CLIP|LR\r\n");
        out.write("            {$Duration: 900, $Clip: 3, $Easing: $JssorEasing$.$EaseInOutCubic },\r\n");
        out.write("            //CLIP|TB\r\n");
        out.write("            {$Duration: 900, $Clip: 12, $Easing: $JssorEasing$.$EaseInOutCubic },\r\n");
        out.write("\r\n");
        out.write("            //DDGDANCE|LB\r\n");
        out.write("            {$Duration: 1800, x: 0.3, y: -0.3, $Zoom: 1, $Easing: { $Left: $JssorEasing$.$EaseInJump, $Top: $JssorEasing$.$EaseInJump, $Zoom: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $During: { $Left: [0, 0.8], $Top: [0, 0.8] }, $Round: { $Left: 0.8, $Top: 2.5} },\r\n");
        out.write("            //DDGDANCE|RB\r\n");
        out.write("            {$Duration: 1800, x: -0.3, y: -0.3, $Zoom: 1, $Easing: { $Left: $JssorEasing$.$EaseInJump, $Top: $JssorEasing$.$EaseInJump, $Zoom: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $During: { $Left: [0, 0.8], $Top: [0, 0.8] }, $Round: { $Left: 0.8, $Top: 2.5} },\r\n");
        out.write("\r\n");
        out.write("            //TORTUOUS|HL\r\n");
        out.write("            {$Duration: 1500, x: 0.2, $Zoom: 1, $Easing: { $Left: $JssorEasing$.$EaseOutWave, $Zoom: $JssorEasing$.$EaseOutCubic }, $Opacity: 2, $During: { $Left: [0, 0.7] }, $Round: { $Left: 1.3} },\r\n");
        out.write("            //TORTUOUS|VB\r\n");
        out.write("            {$Duration: 1500, y: -0.2, $Zoom: 1, $Easing: { $Top: $JssorEasing$.$EaseOutWave, $Zoom: $JssorEasing$.$EaseOutCubic }, $Opacity: 2, $During: { $Top: [0, 0.7] }, $Round: { $Top: 1.3} },\r\n");
        out.write("\r\n");
        out.write("            //ZMF|10\r\n");
        out.write("            {$Duration: 600, $Zoom: 11, $Easing: { $Zoom: $JssorEasing$.$EaseInExpo, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 },\r\n");
        out.write("\r\n");
        out.write("            //ZML|R\r\n");
        out.write("            {$Duration: 600, x: -0.6, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2 },\r\n");
        out.write("            //ZML|B\r\n");
        out.write("            {$Duration: 600, y: -0.6, $Zoom: 11, $Easing: { $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2 },\r\n");
        out.write("\r\n");
        out.write("            //ZMS|B\r\n");
        out.write("            {$Duration: 700, y: -0.6, $Zoom: 1, $Easing: { $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2 },\r\n");
        out.write("\r\n");
        out.write("            //ZM*JDN|LB\r\n");
        out.write("            {$Duration: 1200, x: 0.8, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseOutCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },\r\n");
        out.write("            //ZM*JUP|LB\r\n");
        out.write("            {$Duration: 1200, x: 0.8, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },\r\n");
        out.write("            //ZM*JUP|RB\r\n");
        out.write("            {$Duration: 1200, x: -0.8, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },\r\n");
        out.write("\r\n");
        out.write("            //ZM*WVR|LT\r\n");
        out.write("            {$Duration: 1200, x: 0.5, y: 0.3, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInWave }, $Opacity: 2, $Round: { $Rotate: 0.8} },\r\n");
        out.write("            //ZM*WVR|RT\r\n");
        out.write("            {$Duration: 1200, x: -0.5, y: 0.3, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInWave }, $Opacity: 2, $Round: { $Rotate: 0.8} },\r\n");
        out.write("            //ZM*WVR|TL\r\n");
        out.write("            {$Duration: 1200, x: 0.3, y: 0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Top: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Round: { $Rotate: 0.8} },\r\n");
        out.write("            //ZM*WVR|BL\r\n");
        out.write("            {$Duration: 1200, x: 0.3, y: -0.5, $Zoom: 11, $Easing: { $Left: $JssorEasing$.$EaseInWave, $Top: $JssorEasing$.$EaseLinear }, $Opacity: 2, $Round: { $Rotate: 0.8} },\r\n");
        out.write("\r\n");
        out.write("            //RTT|10\r\n");
        out.write("            {$Duration: 700, $Zoom: 11, $Rotate: 1, $Easing: { $Zoom: $JssorEasing$.$EaseInExpo, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInExpo }, $Opacity: 2, $Round: { $Rotate: 0.8} },\r\n");
        out.write("\r\n");
        out.write("            //RTTL|R\r\n");
        out.write("            {$Duration: 700, x: -0.6, $Zoom: 11, $Rotate: 1, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $Round: { $Rotate: 0.8} },\r\n");
        out.write("            //RTTL|B\r\n");
        out.write("            {$Duration: 700, y: -0.6, $Zoom: 11, $Rotate: 1, $Easing: { $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $Round: { $Rotate: 0.8} },\r\n");
        out.write("\r\n");
        out.write("            //RTTS|R\r\n");
        out.write("            {$Duration: 700, x: -0.6, $Zoom: 1, $Rotate: 1, $Easing: { $Left: $JssorEasing$.$EaseInQuad, $Zoom: $JssorEasing$.$EaseInQuad, $Rotate: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $Round: { $Rotate: 1.2} },\r\n");
        out.write("            //RTTS|B\r\n");
        out.write("            {$Duration: 700, y: -0.6, $Zoom: 1, $Rotate: 1, $Easing: { $Top: $JssorEasing$.$EaseInQuad, $Zoom: $JssorEasing$.$EaseInQuad, $Rotate: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseOutQuad }, $Opacity: 2, $Round: { $Rotate: 1.2} },\r\n");
        out.write("\r\n");
        out.write("            //RTT*JDN|RT\r\n");
        out.write("            {$Duration: 1000, x: -0.8, y: 0.5, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseOutCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },\r\n");
        out.write("            //RTT*JDN|LB\r\n");
        out.write("            {$Duration: 1000, x: 0.8, y: -0.5, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseOutCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },\r\n");
        out.write("            //RTT*JUP|RB\r\n");
        out.write("            {$Duration: 1000, x: -0.8, y: -0.5, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseLinear, $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Top: [0, 0.5]} },\r\n");
        out.write("            {$Duration: 1000, x: -0.5, y: 0.8, $Zoom: 11, $Rotate: 1, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Top: $JssorEasing$.$EaseLinear, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Left: [0, 0.5] }, $Round: { $Rotate: 0.5 } },\r\n");
        out.write("            //RTT*JUP|BR\r\n");
        out.write("            {$Duration: 1000, x: -0.5, y: -0.8, $Zoom: 11, $Rotate: 0.2, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Top: $JssorEasing$.$EaseLinear, $Zoom: $JssorEasing$.$EaseInCubic }, $Opacity: 2, $During: { $Left: [0, 0.5]} },\r\n");
        out.write("\r\n");
        out.write("            //R|IB\r\n");
        out.write("            {$Duration: 900, x: -0.6, $Easing: { $Left: $JssorEasing$.$EaseInOutBack }, $Opacity: 2 },\r\n");
        out.write("            //B|IB\r\n");
        out.write("            {$Duration: 900, y: -0.6, $Easing: { $Top: $JssorEasing$.$EaseInOutBack }, $Opacity: 2 },\r\n");
        out.write("\r\n");
        out.write("            ];\r\n");
        out.write("\r\n");
        out.write("            var options = {\r\n");
        out.write("                $AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false\r\n");
        out.write("                $AutoPlaySteps: 1,                                  //[Optional] Steps to go for each navigation request (this options applys only when slideshow disabled), the default value is 1\r\n");
        out.write("                $AutoPlayInterval: 4000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000\r\n");
        out.write("                $PauseOnHover: 1,                               //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1\r\n");
        out.write("\r\n");
        out.write("                $ArrowKeyNavigation: true,   \t\t\t            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false\r\n");
        out.write("                $SlideDuration: 500,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500\r\n");
        out.write("                $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20\r\n");
        out.write("                //$SlideWidth: 600,                                 //[Optional] Width of every slide in pixels, default value is width of 'slides' container\r\n");
        out.write("                //$SlideHeight: 300,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container\r\n");
        out.write("                $SlideSpacing: 0, \t\t\t\t\t                //[Optional] Space between each slide in pixels, default value is 0\r\n");
        out.write("                $DisplayPieces: 1,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1\r\n");
        out.write("                $ParkingPosition: 0,                                //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.\r\n");
        out.write("                $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).\r\n");
        out.write("                $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1\r\n");
        out.write("                $DragOrientation: 3,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)\r\n");
        out.write("\r\n");
        out.write("                $SlideshowOptions: {                                //[Optional] Options to specify and enable slideshow or not\r\n");
        out.write("                    $Class: $JssorSlideshowRunner$,                 //[Required] Class to create instance of slideshow\r\n");
        out.write("                    $Transitions: _SlideshowTransitions,            //[Required] An array of slideshow transitions to play slideshow\r\n");
        out.write("                    $TransitionsOrder: 1,                           //[Optional] The way to choose transition to play slide, 1 Sequence, 0 Random\r\n");
        out.write("                    $ShowLink: true                                    //[Optional] Whether to bring slide link on top of the slider when slideshow is running, default value is false\r\n");
        out.write("                },\r\n");
        out.write("\r\n");
        out.write("                $CaptionSliderOptions: {                            //[Optional] Options which specifies how to animate caption\r\n");
        out.write("                    $Class: $JssorCaptionSlider$,                   //[Required] Class to create instance to animate caption\r\n");
        out.write("                    $CaptionTransitions: _CaptionTransitions,       //[Required] An array of caption transitions to play caption, see caption transition section at jssor slideshow transition builder\r\n");
        out.write("                    $PlayInMode: 1,                                 //[Optional] 0 None (no play), 1 Chain (goes after main slide), 3 Chain Flatten (goes after main slide and flatten all caption animations), default value is 1\r\n");
        out.write("                    $PlayOutMode: 3                                 //[Optional] 0 None (no play), 1 Chain (goes before main slide), 3 Chain Flatten (goes before main slide and flatten all caption animations), default value is 1\r\n");
        out.write("                },\r\n");
        out.write("\r\n");
        out.write("                $BulletNavigatorOptions: {                                //[Optional] Options to specify and enable navigator or not\r\n");
        out.write("                    $Class: $JssorBulletNavigator$,                       //[Required] Class to create navigator instance\r\n");
        out.write("                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always\r\n");
        out.write("                    $AutoCenter: 0,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0\r\n");
        out.write("                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1\r\n");
        out.write("                    $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1\r\n");
        out.write("                    $SpacingX: 10,                                   //[Optional] Horizontal space between each item in pixel, default value is 0\r\n");
        out.write("                    $SpacingY: 10,                                   //[Optional] Vertical space between each item in pixel, default value is 0\r\n");
        out.write("                    $Orientation: 1                                 //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1\r\n");
        out.write("                },\r\n");
        out.write("\r\n");
        out.write("                $ArrowNavigatorOptions: {\r\n");
        out.write("                    $Class: $JssorArrowNavigator$,              //[Requried] Class to create arrow navigator instance\r\n");
        out.write("                    $ChanceToShow: 2                                //[Required] 0 Never, 1 Mouse Over, 2 Always\r\n");
        out.write("                }\r\n");
        out.write("            };\r\n");
        out.write("\r\n");
        out.write("            var jssor_slider1 = new $JssorSlider$(\"slider1_container\", options);\r\n");
        out.write("            //responsive code begin\r\n");
        out.write("            //you can remove responsive code if you don't want the slider scales while window resizes\r\n");
        out.write("            function ScaleSlider() {\r\n");
        out.write("                var parentWidth = jssor_slider1.$Elmt.parentNode.clientWidth;\r\n");
        out.write("                if (parentWidth)\r\n");
        out.write("                    jssor_slider1.$ScaleWidth(Math.min(parentWidth, 600));\r\n");
        out.write("                else\r\n");
        out.write("                    window.setTimeout(ScaleSlider, 30);\r\n");
        out.write("            }\r\n");
        out.write("            ScaleSlider();\r\n");
        out.write("\r\n");
        out.write("            $(window).bind(\"load\", ScaleSlider);\r\n");
        out.write("            $(window).bind(\"resize\", ScaleSlider);\r\n");
        out.write("            $(window).bind(\"orientationchange\", ScaleSlider);\r\n");
        out.write("            //responsive code end\r\n");
        out.write("        });\r\n");
        out.write("    </script>\r\n");
        out.write("    <!-- Jssor Slider Begin -->\r\n");
        out.write("    <!-- To move inline styles to css file/block, please specify a class name for each element. --> \r\n");
        out.write("    <div id=\"slider1_container\" style=\"position: relative; top: 0px; left: 0px; width: 600px;\r\n");
        out.write("        height: 300px; overflow: hidden;\">\r\n");
        out.write("\r\n");
        out.write("        <!-- Loading Screen -->\r\n");
        out.write("        <div u=\"loading\" style=\"position: absolute; top: 0px; left: 0px;\">\r\n");
        out.write("            <div style=\"filter: alpha(opacity=70); opacity:0.7; position: absolute; display: block;\r\n");
        out.write("                background-color: #000; top: 0px; left: 0px;width: 100%;height:100%;\">\r\n");
        out.write("            </div>\r\n");
        out.write("            <div style=\"position: absolute; display: block; background: url(../img/loading.gif) no-repeat center center;\r\n");
        out.write("                top: 0px; left: 0px;width: 100%;height:100%;\">\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("        \r\n");
        out.write("        <!-- Slides Container -->\r\n");
        out.write("        <div u=\"slides\" style=\"cursor: move; position: absolute; left: 0px; top: 0px; width: 600px; height: 300px;\r\n");
        out.write("            overflow: hidden;\">\r\n");
        out.write("            <div>\r\n");
        out.write("                <a u=image href=\"#\"><img src=\"/myHouse/pages/a1.jpg\" /></a>\r\n");
        out.write("                <div u=caption t=\"*\" class=\"captionOrange\"  style=\"position:absolute; left:20px; top: 30px; width:300px; height:30px;\"> \r\n");
        out.write("                House Slide Show\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div>\r\n");
        out.write("                <a u=image href=\"#\"><img src=\"/myHouse/pages/a2.jpg\" /></a>\r\n");
        out.write("                <div u=caption t=\"*\" class=\"captionOrange\"  style=\"position:absolute; left:20px; top: 30px; width:300px; height:30px;\"> \r\n");
        out.write("                House Slide Show\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div>\r\n");
        out.write("                <a u=image href=\"#\"><img src=\"/myHouse/pages/a3.jpg\" /></a>\r\n");
        out.write("                <div u=caption t=\"*\" class=\"captionOrange\"  style=\"position:absolute; left:20px; top: 30px; width:300px; height:30px;\"> \r\n");
        out.write("               House Slide Show\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div>\r\n");
        out.write("                <a u=image href=\"#\"><img src=\"/myHouse/pages/a4.jpg\" /></a>\r\n");
        out.write("                <div u=caption t=\"*\" class=\"captionOrange\"  style=\"position:absolute; left:20px; top: 30px; width:300px; height:30px;\"> \r\n");
        out.write("                House Slide Show\r\n");
        out.write("                </div>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("        \r\n");
        out.write("        <!--#region Bullet Navigator Skin Begin -->\r\n");
        out.write("        <!-- Help: http://www.jssor.com/development/slider-with-bullet-navigator-jquery.html -->\r\n");
        out.write("        <style>\r\n");
        out.write("            /* jssor slider bullet navigator skin 01 css */\r\n");
        out.write("            /*\r\n");
        out.write("            .jssorb01 div           (normal)\r\n");
        out.write("            .jssorb01 div:hover     (normal mouseover)\r\n");
        out.write("            .jssorb01 .av           (active)\r\n");
        out.write("            .jssorb01 .av:hover     (active mouseover)\r\n");
        out.write("            .jssorb01 .dn           (mousedown)\r\n");
        out.write("            */\r\n");
        out.write("            .jssorb01 {\r\n");
        out.write("                position: absolute;\r\n");
        out.write("            }\r\n");
        out.write("            .jssorb01 div, .jssorb01 div:hover, .jssorb01 .av {\r\n");
        out.write("                position: absolute;\r\n");
        out.write("                /* size of bullet elment */\r\n");
        out.write("                width: 12px;\r\n");
        out.write("                height: 12px;\r\n");
        out.write("                filter: alpha(opacity=70);\r\n");
        out.write("                opacity: .7;\r\n");
        out.write("                overflow: hidden;\r\n");
        out.write("                cursor: pointer;\r\n");
        out.write("                border: #000 1px solid;\r\n");
        out.write("            }\r\n");
        out.write("            .jssorb01 div { background-color: gray; }\r\n");
        out.write("            .jssorb01 div:hover, .jssorb01 .av:hover { background-color: #d3d3d3; }\r\n");
        out.write("            .jssorb01 .av { background-color: #fff; }\r\n");
        out.write("            .jssorb01 .dn, .jssorb01 .dn:hover { background-color: #555555; }\r\n");
        out.write("        </style>\r\n");
        out.write("        <!-- bullet navigator container -->\r\n");
        out.write("        <div u=\"navigator\" class=\"jssorb01\" style=\"bottom: 16px; right: 10px;\">\r\n");
        out.write("            <!-- bullet navigator item prototype -->\r\n");
        out.write("            <div u=\"prototype\"></div>\r\n");
        out.write("        </div>\r\n");
        out.write("        <!--#endregion Bullet Navigator Skin End -->\r\n");
        out.write("        \r\n");
        out.write("        <!--#region Arrow Navigator Skin Begin -->\r\n");
        out.write("        <!-- Help: http://www.jssor.com/development/slider-with-arrow-navigator-jquery.html -->\r\n");
        out.write("        <style>\r\n");
        out.write("            /* jssor slider arrow navigator skin 05 css */\r\n");
        out.write("            /*\r\n");
        out.write("            .jssora05l                  (normal)\r\n");
        out.write("            .jssora05r                  (normal)\r\n");
        out.write("            .jssora05l:hover            (normal mouseover)\r\n");
        out.write("            .jssora05r:hover            (normal mouseover)\r\n");
        out.write("            .jssora05l.jssora05ldn      (mousedown)\r\n");
        out.write("            .jssora05r.jssora05rdn      (mousedown)\r\n");
        out.write("            */\r\n");
        out.write("            .jssora05l, .jssora05r {\r\n");
        out.write("                display: block;\r\n");
        out.write("                position: absolute;\r\n");
        out.write("                /* size of arrow element */\r\n");
        out.write("                width: 40px;\r\n");
        out.write("                height: 40px;\r\n");
        out.write("                cursor: pointer;\r\n");
        out.write("                background: url(/myHouse/pages/a17.png) no-repeat;\r\n");
        out.write("                overflow: hidden;\r\n");
        out.write("            }\r\n");
        out.write("            .jssora05l { background-position: -10px -40px; }\r\n");
        out.write("            .jssora05r { background-position: -70px -40px; }\r\n");
        out.write("            .jssora05l:hover { background-position: -130px -40px; }\r\n");
        out.write("            .jssora05r:hover { background-position: -190px -40px; }\r\n");
        out.write("            .jssora05l.jssora05ldn { background-position: -250px -40px; }\r\n");
        out.write("            .jssora05r.jssora05rdn { background-position: -310px -40px; }\r\n");
        out.write("        </style>\r\n");
        out.write("        <!-- Arrow Left -->\r\n");
        out.write("        <span u=\"arrowleft\" class=\"jssora05l\" style=\"top: 123px; left: 8px;\">\r\n");
        out.write("        </span>\r\n");
        out.write("        <!-- Arrow Right -->\r\n");
        out.write("        <span u=\"arrowright\" class=\"jssora05r\" style=\"top: 123px; right: 8px;\">\r\n");
        out.write("        </span>\r\n");
        out.write("        <a style=\"display: none\" href=\"http://www.jssor.com\">Bootstrap Slider</a>\r\n");
        out.write("    </div>\r\n");
        out.write("    <!-- Jssor Slider End -->\r\n");
        out.write("</body>\r\n");
        out.write("</html>");
        out.write("</center>\r\n");
        out.write("</div>\r\n");
        out.write("<div class=\"bottom\"><h2><center>Thank you for visiting my website</center></h2></div>\r\n");
        out.write("</div>\r\n");
        out.write("</body>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/Welcome.jsp(26,7) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f0.setKey("welcome.title");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fbase_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_005fbase_005f0 = (org.apache.struts.taglib.html.BaseTag) _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fbase_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    int _jspx_eval_html_005fbase_005f0 = _jspx_th_html_005fbase_005f0.doStartTag();
    if (_jspx_th_html_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.reuse(_jspx_th_html_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.reuse(_jspx_th_html_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotPresent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f0 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fscope_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_005fnotPresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotPresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/Welcome.jsp(31,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotPresent_005f0.setName("org.apache.struts.action.MESSAGE");
    // /pages/Welcome.jsp(31,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_logic_005fnotPresent_005f0.setScope("application");
    int _jspx_eval_logic_005fnotPresent_005f0 = _jspx_th_logic_005fnotPresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  <font color=\"red\">\r\n");
        out.write("    ERROR:  Application resources not loaded -- check servlet container\r\n");
        out.write("    logs for error messages.\r\n");
        out.write("  </font>\r\n");
        int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fscope_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fscope_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    // /pages/Welcome.jsp(44,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setAction("/admi");
    // /pages/Welcome.jsp(44,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setMethod("post");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("Email:");
        if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("Password");
        if (_jspx_meth_html_005fpassword_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        if (_jspx_meth_html_005fsubmit_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /pages/Welcome.jsp(45,6) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005ftext_005f0.setProperty("email");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_005fpassword_005f0 = (org.apache.struts.taglib.html.PasswordTag) _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /pages/Welcome.jsp(46,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fpassword_005f0.setProperty("psw");
    int _jspx_eval_html_005fpassword_005f0 = _jspx_th_html_005fpassword_005f0.doStartTag();
    if (_jspx_th_html_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /pages/Welcome.jsp(47,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f0.setProperty("Sign Up");
    // /pages/Welcome.jsp(47,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f0.setValue("Sign Up House Information");
    int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
    if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f0);
    return false;
  }
}
