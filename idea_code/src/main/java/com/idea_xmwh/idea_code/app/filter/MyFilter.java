package com.idea_xmwh.idea_code.app.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description
 * @ClassName MyFilter
 * @Author Mengjw
 * @date 2020.09.12 15:51
 */
@WebFilter(filterName = "myFilter",urlPatterns = {"/login.do"})
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("MyFilter init ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("MyFilter doFilter"+req.getParameter("name"));
        chain.doFilter(request, response);
        return ;
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("MyFilter destroy");
    }
}
