package javaStudy5;

public class BizException extends RuntimeException{
    public BizException(String msg){
        super(msg);
    }
    public BizException(Exception ex){
        super(ex);
    }
}
// Exception 이나 Exception의 후손을 상속받아 만들어진 클래스
// 클래스의 이름만으로 어떤 오류가 발생했는지 알려주어 코드의 직관성을 높인다.