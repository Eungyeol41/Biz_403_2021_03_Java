/*
여러 줄의 주석을 입력하는 영역

클래스와 파일이름 이름짓기 (명령규칙)
무조건 첫 글자는 대문자

가급적 2개 이상의 단어를 조합하여 이름을 짓자
사전(DIC)에 있는 단어들을 1개만 사용할 경우 Java에 기본적으로 있는 Key word와 겹쳐서
문제를 일으키기도 한다.
그러한 문제를 피하기 위해 사전에 있는 단어를 
사용하고자 하면 2개 이상의 단어를 조합하는 것이 좋다


public class Class {
	불/ 가/ 능	
}
-> public class MyClass {
	가/ 능
}

단어 2개 이상을 조합하여 사용할 경우
첫 글자는 무조건 대문자
이후 시작되는 단어 첫글자도 대문자로 사용하자
또는 중간에 under bar, under score(_)를 넣어서 사용하기도 한다
Nation_korea : snake case 명명법 
NationKorea : Camel Case 명명법 (Case는 대문자 소문자 나타내기도 함.)
(둘 다 가능은 하지만 후자를 더 권장)
Nation Korea : 단어 중간에 빈칸, 특수문자 등 사용금지(불가능)
Nation1, Nation 1 : 숫자들을 조합하여 사용 가능
1Nation : 불가 / 숫자로 시작하는 것 금지

*/
public class NationKorea {

}