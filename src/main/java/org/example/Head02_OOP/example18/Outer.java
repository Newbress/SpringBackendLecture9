package org.example.Head02_OOP.example18;

public class Outer {
    private static int staticValue = 100;
    private int instanceValue = 50;
    
    public static class StaticNested {
        public void printValues() {
            System.out.println("Outer.staticValue: "+ staticValue);

            //외부 클래스의 인스턴스 멤버에는 직접 접근 불가능
            //System.out.println(instanceValue);
        }
    }
}
