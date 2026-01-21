package org.example.Head05_SPRING.example01;

import java.util.List;

public class MenuServiceStub extends MenuService{

    @Override
    public List<String> getMenuList() {
        return List.of("샘플커피1", "샘플커피2");
    }
}
