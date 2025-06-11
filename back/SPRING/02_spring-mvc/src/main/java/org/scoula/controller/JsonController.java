package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.dto.LoginRequestDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/json")
@Log4j2
public class JsonController {

    /*
    * @ResponseBody
    * - 리턴되는 객체가 View가 아니라 "Http Response Body(JSON)"로 직렬화 되어 전송됨
    * - Jackson 라이브러리를 통해 JSON으로 변환
    *
    * - 직렬화를 위해
    * */
    @ResponseBody
    @GetMapping("/ex01")
    public LoginRequestDTO example(){
        log.info("/json/ex01 GET 요청 진행 =========");
        LoginRequestDTO dto = new LoginRequestDTO("user","1234");
        return dto;
    }

    /*
    * @RequestBody
    * - 클라이언트가 보낸 JSON 형식의 데이터를 자바 객체로 자동 변환 (역직렬화)
    * - 주로 JSON 데이터가 Body에 포함된 격우 사용 (POST, PUT)
    *
    * @ResponseEntity
    * - 응답 본문, 상태코드, 헤더를 직접 제엏라 수 있는 응답 방식
    * */
    @PostMapping("/ex02")
    public ResponseEntity<String> example2(@RequestBody LoginRequestDTO dto){

        log.info("받은 데이터 ===================== {}", dto.getId());
        log.info("받은 데이터 ===================== {}", dto.getPassword());

        return ResponseEntity.ok("ID : " + dto.getId() + ", PW : " + dto.getPassword()); // 상태코드, 헤더가 고정 -> 본문(body)만 개발자가 작성하면됨
    }

    /*
    * ResponseEntity 직접 구성하기
    * - 본문, 헤더, 상태코드 -> 모두 직접 지정하고 싶을때
    * - responsebody보다 자세히 사용한 것
    * */
    @GetMapping("/ex03")
    public ResponseEntity<String> example3(){

        // 바디
        String body = "BODYBODYBODYBODYBODYBODYBODY";

        // 헤더
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type","application/json");

        return new ResponseEntity<>(body,header, HttpStatus.CREATED); // HttpStatus.OK는 200을 의미
    }
}
