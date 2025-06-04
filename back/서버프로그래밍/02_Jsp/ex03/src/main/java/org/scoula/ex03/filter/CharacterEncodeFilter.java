package org.scoula.ex03.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/*"}) // 필터 거치는 조건
public class CharacterEncodeFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 필터가 생성이 될때


    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("필터 동작 시작");
        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
