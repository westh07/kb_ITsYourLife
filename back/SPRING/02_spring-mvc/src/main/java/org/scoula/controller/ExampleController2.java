package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.dto.LoginRequestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@Log4j2
public class ExampleController2 {
    /*
    * @ModelAttribute
    * @RequestParam
    * @PathVariable
    *
    * - ?names=bear&names=tiger : 쿼리스트링
    * */

    // 컨트롤러 메서드가 void 형태면 요청 URL 기준으로 뷰 이름을 추론하여 해당 뷰를 찾음
    @GetMapping("/index")
    public void get(){
        log.info("get ===========> 호출됨");
    }

    /*
    * @ModelAttribute
    * - 클라이언트의 요청 파라미터를 자바 객체에 바인딩하는 역할 (dto같이 데이터를 바인딩해서 가져올 수 있음)
    * - 객체의 Setter를 통해 값이 자동 주입
    * - Model 객체에도 자동으로 추가됨
    * - 생략 가능
    * */
    // http://localhost:8080/example01?id=user&password=1234
    @GetMapping("/example01")
    public String example01( /*@ModelAttribute*/LoginRequestDTO dto, Model model){ // 매개변수는 유효성 검사가 따로 없음

        log.info("example01 =============> id : {} ",dto.getId());
        log.info("example01 =============> pw : {} ",dto.getPassword());

        model.addAttribute("dto",dto);
        return "page/dtoMappingResult";

    }

    /*
    * @RequestParam
    * - 클라이언트의 요청 파라미터를 개별 변수에 바인딩할 때 사용
    * - 이름이 일치하는 요청 파라미터를 개별 변수에 바인딩
    * - 기본적으로 해당 파라미터가 없으면 예외가 발생 (있는지 없는지에 대한 유효성 검사도 진행함)
    *
    * - 옵션 설정 가능
    * + defaultValue : 기본값 설정
    * + required : 존재 여부 확인 설정 기본(true)
    * */
    // http://localhost:8080/example02?id=user&password=1234
    @GetMapping("/example02")
    public String example02(@RequestParam(name="id",defaultValue = "defaultUser") String id, @RequestParam(name="password",required = true) String password, Model model){ // RequestParam을 이용해서 하나하나 가져옴

        log.info("example02 =============> id : {} ",id);
        log.info("example02 =============> pw : {} ", password);

        model.addAttribute("dto", new LoginRequestDTO(id, password));
        return "page/dtoMappingResult";
    }

    // 리스트, 배열 형태로도 받을 수 있다.
    // @RequestParam(name = "names") ArrayList<String> names,
    // http://localhost:8080/example03?names=bear&names=tiger
    @GetMapping("/example03")
    public String example03(@RequestParam(name="names") String[] names, Model model){

        log.info("example03 =============> names : {} ", Arrays.asList(names));

        model.addAttribute("message", Arrays.asList(names));
        return "page/mappingResult";

    }

    /*
    * @PathVariable ==> 많이 사용할 예정
    * - URL 경로에 포함된 값을 추출해서 변수에 바인딩할 때 사용
    * - Restfull 스타일 url에서 많이 사용됨.
    * - url의 중괄호로 표시한 경로 변수 값을 메서드의 매개변수에 바인딩
    * */
    // http://localhost:8080/example04/11
    @GetMapping("/example04/{id}")
    public String example04(@PathVariable("id") int id, Model model){

        log.info("example04 =============> id : {} ",id);

        model.addAttribute("message", id);
        return "page/mappingResult";

    }
}
