package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 빈으로 자동 등록되도록 지정
public class Person3 {
    private String name = "Ella";

    // Parrot2를 생성자 주입을 통해 자동 설정
    private final Parrot2 parrot;

    @Autowired
    public Person3(Parrot2 parrot){
        this.parrot = parrot;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot2 getParrot() {
        return parrot;
    }
}
