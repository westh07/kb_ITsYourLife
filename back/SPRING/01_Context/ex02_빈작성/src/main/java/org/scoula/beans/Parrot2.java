package org.scoula.beans;

import org.springframework.stereotype.Component;

@Component // 자동 등록되도록 지정
public class Parrot2 {
    private String name = "Koko";

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot2{" +
                "name='" + name + '\'' +
                '}';
    }
}
