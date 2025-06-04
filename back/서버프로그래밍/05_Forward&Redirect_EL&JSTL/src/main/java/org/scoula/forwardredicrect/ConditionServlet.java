package org.scoula.forwardredicrect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// controller 부분 만들어보기
@WebServlet(name = "jstl", value="/jstl")
public class ConditionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("score", 85);

        // forward 방식으로 jstl 요청
        req.getRequestDispatcher("jstl/condition.jsp").forward(req,resp);


    }
}
