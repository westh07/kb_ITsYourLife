package org.scoula.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
* 웹 요청 처리, 정적 자원 매핑, 뷰 리졸버 설정 등등...
*
* */
@EnableWebMvc // -> spring Web MVC를 사용하겠다는 선언 (= 디스패쳐 서블릿을 동작하겠다)
@Configuration // spring MVC 용 컴포넌트 등으록을 위한 스캔 패키지
public class RootConfig {

    // db사용 -- > googgle mybatis 사용 설정
    // 트랜젝션 설정

}
