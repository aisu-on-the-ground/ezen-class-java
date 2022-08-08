package ezen0803_Interface.sec07.exam02_default_method_extends;

public interface ParentInterface {
    public void method1();
    public default void method2() { /*실행문*/ }
    //default 메소드이므로 바로 {} 안에 동작내용이 기술되어야 함.
}

