package com.java;

public class AccessObj { // 캡슐화 : 관련된 내용을 모아서 가지고 있는 것
    public int p = 3; // 접근제한자 : public -> 전체공개 느낌, 다른패키지에서도 가능
    protected int p2 = 4; // protected -> 같은 패키지인 경우 접근 가능
    // 다른 패키지라도 상속을 받은 경우 접근 가능
    private  int i = 1; // private -> 자기 자신만 접근 가능
    int k = 2; // default 접근지정자 : 자기 자신과 같은 패키지 내에서 접근 가능
    // public > protected > default > private
}
