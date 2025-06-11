package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// mvc 관련된 설정이나 객체 생성 + 주입
//@Configuration // 설정 파일
@EnableWebMvc // @Configuration 이면서 Mvc 관련된 설정을 할 수 있는 파일로 등록
@ComponentScan(basePackages = "org.scoula") // 싱글톤으로 만들 클래스 주소
public class ServletConfig implements WebMvcConfigurer {
    // 어떤 함수를 써서 설정해야할지 이미 WebMvcConfigurer에 정의 되어 있음
    // -> override해서 개발 상황에 맞게 정의해주면됨



    // 프론트 파일(css, js, img)의 위치를 지정해주는 함수
    // /resources/img/a.png라고 요정이 드러오면
    // /resources/ 밑에서 찾겠다라는 설정
    // <img src="/resouces/img.a.png">

    // 정적 자원 설정
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")     // url이 /resources/로 시작하는 모든 경로
                .addResourceLocations("/resources/");    // webapp/resources/경로로 매핑
    }

    // jsp view resolver 설정
    // 컨트롤러에서 받은 결과를 어떤 jsp 파일을 불러서 넣어줄지 위치를 설정하고 뒤에 jsp를 붙여서 만들어주는 기능의 함수
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // view resolver를 생성하고

        // 앞 -> 위치 지정

        // 뒤 -> jsp 지정

        // 이 객체를 등록
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        registry.viewResolver(bean);
    }
}
