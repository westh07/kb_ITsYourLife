package org.scoula.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 빈으로 자동 등록되도록 지정
public class Person2 {
    private String name= "Ella";

    @Autowired // Parrot2를 오토와이어를 이용해 의존성 주입 지정
    private Parrot2 parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot2 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot2 parrot) {
        this.parrot = parrot;
    }
}
