# 변수나 객체의 생명주기 (Life cycle)
* 변수나 객체는 선언하고 초기화 할 때 사용할 준비가 된다
* 변수나 객체를 선언만 하였을 경우 아직 실체가 존재하지 않는다
* 변수나 객체는 선언 후 반드시 초기화(생성) 과정을 수행해야 실체가 존재하게 된다

## 변수의 선언과 초기화
* 변수 선언 : int num;
* 선언된 변수의 초기화 : num = 100;
* 변수의 선언과 초기화 : int num = 100;

## 객체의 선언과 초기화
* 객체의 선언 : ClassNme className; // 객체 선언의 일반 패턴
* 객체의 초기화 : className = new ClassName(); // 생성자 호출하여...
* 객체의 생성(선언과 초기화) : ClassName className = new ClassName();

## 다른 클래스에 선언된 변수나 객체의 초기화
* 즉시 선언과 생성을 같이 하는 것이 좋다
* main() method에서 변수가 객체를 사용하기 위한 선언, 초기화 하는 것과 같은 원리

## 선언되고 생성된 변수나 객체의 소멸(Destroy)
* 전통적(구조적) 프로그래밍이나 오래된 객체지향 프로그래밍에서는 선언되고 생성된 변수나 객체가 사용이 종료되면 소멸하는 코드가 있어야 한다.
* Java의 GC(Gabage Collection) : Java는 생성된 변수나 객체의 사용이 종료되면 자동으로 소멸하는 코드가 내부적으로 실행된다.

## GC의 작동 시기에 대한 고찰
* 멤버 영역에 선언된 변수나 객체는 변수나 객체를 포함한 객체가 사용이 종료되면 같이 소멸된다
* method의 지역변수영역에 선언된 변수나 객체는 method가 종료되면 같이 소멸된다
* Code block( { } ) 내에서 선언된 변수나 객체는 Code Block이 종료되면 같이 소멸된다

## 변수의 scope
* Code Block ( { } ) 변수의 scope 영역이라고 하며 변수에 접근(읽기, 쓰기)를 할 수 있는 영역