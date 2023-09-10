package by.teachmeskills.c23onl.alexeishchurko.task17;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/servlet2")
public class FilterToSecondServlet implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            if (cookies[0].getValue().equals("1")) {
                chain.doFilter(request, response);
            }
        } else {
            //throw new RuntimeException("No acces! Visit servlet1 page before!");
            try (PrintWriter writer = response.getWriter()) {
                writer.println("No acces! Visit servlet1 page before!");
            }
        }
    }
}