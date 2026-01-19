package org.example.Head04_Algorithm.example01.shape;

import java.util.ArrayList;
import java.util.List;

public class WildCardConsumerExample {
    public static void addDefaultShpapes(List<? super Shape>list) {
        list.add(new Circle(1.0));
        list.add(new Rectangle(2.0, 5.0));

        Object obj = list.get(0);
    }

    public static void main(String[] args) {
        // List<Shape>, List<Object> 등 Shape의 상위 타입 리스트가 인수로 전달 가능
        List<Object> objList = new ArrayList<>();
        addDefaultShapes(objList); // List<Object>는 ? super Shape로 매칭

        // 넣은 후에도 instanceof 로 타입체크 필요
        for (Object o : objList) {
            if (o instanceof Circle circle) {
                System.out.println("circle.getArea() :" + circle.getArea());
            }
            if (o instanceof Rectangle rectangle) {
                System.out.println("rectangle.getArea() :" + rectangle.getArea());
            }
        }
    }

    private static void addDefaultShapes(List<Object> objList) {

    }
}
