# sample_android_pattern
mvc -> mvp -> mvvm 



MVP 가 나온 이유 - View와 Model을 완전한 분리해서 사용하기 위해서

(MVC 일때는 Activity 에서 모델객체를 생성하고 사용했으나 MVP 일때는 Activity 가아닌 Presenter 에서 모델객체를 생성해서 사용)

- MVC.MVP 차이 정리  
- MVC Activity 한곳애 뷰 + 컨트롤러 모두 있음 / MPV Activity + xml 을 뷰 로 취급, presenter 가 컨트롤러 역할 
- 모델은 둘다 동일 ( 비즈니스 로직 담당 )


참고한 블로그

https://academy.realm.io/kr/posts/eric-maxwell-mvc-mvp-and-mvvm-on-android



구글에서 제공하는 공식 샘플 

https://github.com/android/architecture-samples



## [MVVM 예제 - KOTLIN](https://github.com/AgustaRC/MVVMArchitecture/tree/master/app/src/main/java/com/leopold/mvvm)

## [MVVM 예제 - JAVA](https://github.com/MindorksOpenSource/android-mvvm-architecture/tree/master/app/src/main/java/com/mindorks/framework/mvvm)


## [MVP 예제 - JAVA](https://github.com/dlwls5201/MyAndroidArchitecture/tree/MVP-Basic-Java/app/src/main/java/com/tistory/black_jin0427/myandroidarchitecture)## [MVP 설명](https://black-jin0427.tistory.com/149)

## [비즈니스로직이란?](https://mommoo.tistory.com/67)
