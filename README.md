# sample_android_pattern
mvc -> mvp -> mvvm 
<br/>
<br/>
<br/>
MVP 가 나온 이유 - View와 Model을 완전한 분리해서 사용하기 위해서
<br/>
(MVC 일때는 Activity 에서 모델객체를 생성하고 사용했으나 MVP 일때는 Activity 가아닌 Presenter 에서 모델객체를 생성해서 사용)
<br/>
- MVC.MVP 차이 정리  
- MVC는 Activity 한곳애 뷰 + 컨트롤러 모두 있음 반면, MPV는 Activity + xml 을 뷰 로 취급, presenter 가 컨트롤러 역할 
- 모델은 둘다 동일 ( 비즈니스 로직 담당 )
<br/>

```
MVP 단점으로는 하나의 화면을 생성 시 View, Model, Presenter, Interface 를 생성해야하는 불편함. 
하나의 뷰가 하나의 프리젠터를 가짐 ( 1:1 매칭 재사용성 x )
테스트를 위한 가상 뷰를 만들어야함 불편 ( mvvm 에서 이문제는 해결 )
또한 프로젝트가 커질 수록 Presenter의 자원이 많아질 수 있음. 
패턴으로 코드의 가독성 및 유지보수에 도움을 줄 수 있으나 프로젝트에 따른 코드 자원의 증가를 어떻게 관리 할 것인지 연구가 필요해 보임. 
```


<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
참고한 블로그

## [MVC, MVP, MVVM 샘플](https://academy.realm.io/kr/posts/eric-maxwell-mvc-mvp-and-mvvm-on-android)

## [MVVM 개념](https://velog.io/@jojo_devstory/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%95%84%ED%82%A4%ED%85%8D%EC%B2%98-%ED%8C%A8%ED%84%B4-MVVM%EC%9D%B4-%EB%AD%98%EA%B9%8C)

## [구글에서 제공하는 공식 샘플](https://github.com/android/architecture-samples)

## [MVVM 예제 - KOTLIN](https://github.com/AgustaRC/MVVMArchitecture/tree/master/app/src/main/java/com/leopold/mvvm)

## [MVVM 예제 - JAVA](https://github.com/MindorksOpenSource/android-mvvm-architecture/tree/master/app/src/main/java/com/mindorks/framework/mvvm)

## [MVP 예제 - JAVA](https://github.com/dlwls5201/MyAndroidArchitecture/tree/MVP-Basic-Java/app/src/main/java/com/tistory/black_jin0427/myandroidarchitecture)## [MVP 설명](https://black-jin0427.tistory.com/149)

## [비즈니스로직이란?](https://mommoo.tistory.com/67)
