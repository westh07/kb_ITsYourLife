package org.scoula.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/*
* Web 설정
* -> 기존 자바 웹 어플리케이션의 핵심 설정 파일
* -> 서블릿 컨테이너(톰캣)가 웹어플리케이션을 실행할 때 가장 먼저 읽는 파일
* */
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    // DispatcherServlet 이 담당할 Url 매핑 패턴
    // "/" : 모든 요청에 대한 매핑
    @Override
    protected String[] getServletMappings() { // 프론트컨트롤러 언제 적용할지
        return new String[]{"/"};
    }

    // http의 body로 전송되는 post 방식의 데이터는
    // 프론트컨트롤러가 받기 전에 미리 utf-8로 인코딩을 먼저 한 후 받게 설정
    // -> 한글 안 깨지게 하는 설정
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        return super.getServletFilters();
    }

}
