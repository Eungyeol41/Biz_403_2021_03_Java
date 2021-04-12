# 나만의 JDK
* 프로젝트를 수행하는 과정에서 생성된(만든) 클래스 중에 다른 프로젝트에서도 활용할 수 있는 코드가 생성되었다

* 내가 만든 클래스를 JDK처럼 만들어두고 다른 프로젝트에서 활용할 수 있도록 한 번 구현해보자

* JDK처럼 클래스 모음을 만들어두고, 다른 프로젝트에서 연결하여 사용할 수 있도록 만든 프로젝트를 '라이브러리' 라고 한다

## InputService
* since 2021.04
* 키보드(Scanner)를 사용하여 정수를 입력받는 JDK
* 문자열 prompt를 보여주고 정수 입력받기
* 입력 중 QUIT를 누르면 입력 취소(return null)
* 범위를 지정하여 입력받는 정수 유효성 검사

## InputServicImplV1
* since 2021.04
* InputService interface 구현체

## MenuService
* since 2021.04
* 사용자에게 Charactor 메뉴를 보여주고 업무 번호를 입력하면 해당하는 업무 번호를 return하고 QUIT를 입력하면 null을 return

## MenuServiceImpl
* since 2021.04
* MenuService interface 구현체