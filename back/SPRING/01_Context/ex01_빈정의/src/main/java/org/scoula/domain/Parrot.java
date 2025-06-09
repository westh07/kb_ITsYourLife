package org.scoula.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component // 3하면서 추가
public class Parrot {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 3하면서 추가
    @PostConstruct
    public void q3(){
        this.name = "Kiki";
    }
}
