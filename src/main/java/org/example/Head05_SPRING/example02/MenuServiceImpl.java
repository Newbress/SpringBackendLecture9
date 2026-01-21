package org.example.Head05_SPRING.example02;

import java.util.List;

public class MenuServiceImpl implements MenuService{
    @Override
    public List<String> getMenuList() {
        return List.of("아메리카노", "카페라떼");
    }
}
