# 홈터뷰 : ( Home + Interview )

---

![](C:\Users\multicampus\AppData\Roaming\marktext\images\2022-08-19-11-32-44-image.png)

SSAFY 2학기 공통 프로젝트

---

### 목차

- 프로젝트 소개

- 기술 스택

- 프로젝트 기능

- 프로젝트 결과물

----

### 1. 프로젝트 소개

**프로젝트 명** : 홈터뷰 ( Home + Interview )

**배경**

- 비대면 면접 스터디에 대한 수요 증가

- 일원화되어 있지 않은 비대면 면접스터디

**목적 :** 비대면 스터디를 원하는 유저들에 대한 니즈를 파악하여 기존에 있던 불편함을 해소

**기대효과** :

- 스터디 모집과 화상회의 서비스를 통시에 제공함으로써 사용자의 번거로움을 해소

- 자세 교정 기능을 활용하여 개인이 탐지하기 힘든 부분을 시각적으로 표시

- tts모드를 활용하여 실제 면접 분위기를 연출

- 녹화기능, 회고 등록, 캘린더 활용 등을 통하여 스터디가 끝난 뒤에도 자가분석 가능

---

## 2. 기술 스택

**Frontend**

- Vue3 version

- Vuex 3.4.0

- CSS3

- JavaScript(ES6)

- HTML5

**Backend**

- SpringBoot 2.7.1

- Gradle 7.4.1

- Spring Security

- Spring data JPA

- Querydsl **DB** MySQL : 8.0.29

- Redis **Server** Ubuntu 20.0

Openvidu, teachabel machine

---

## 3. 프로젝트 기능

**유저 관리**

- 로그인

- 회원가입
  
  - 이메일 인증, 아이디 비밀번호 중복검사 유효성 검사

- 회원탈퇴

- 아이디 찾기 및 비밀번호 변경

- 프로필 사진

**모집글**

- 모집글 작성, 조회, 수정, 삭제

- 모집글 필터링

- 모집글 검색

- 모집 신청

**자기소개서 관리**

- 자기소개서 작성, 조회, 수정, 삭제

- 개인 질문 작성, 조회, 수정, 삭제

**스터디 관리**

- 스터디 작성, 조회, 수정, 삭제

- 공통질문 작성, 조회, 수정, 삭제

- 썸네일 이미지

- 스터디 추방, 탈퇴

**세션 페이지**

- 채팅( + 프로필 사진 )

- 마이크,음성 ONOFF, 본인화면 mirror모드

- 자세 분석 ( 자세가 중앙에 있지 않을시 빨강불 테두리 표시)

- tts모드
  
  - 영상 레이아웃 변경( 면접관 사진 pop up )
  
  - 공통 질문 조회
  
  - 말풍선(공통질문) 클릭시 text => 음성 변환

- 면접자 지정 모드
  
  - 레이아웃 변경 (지정된 면접자 main화면 )
  
  - 등록된 면접자 자기소개서 조회
  
  - 면접자 개인 질문 조회

- 일반모드

- 녹화 기능

**나의 면접**

- d-day 표시

- 캘린더, 회고록 연동

- 녹화본 조회

**공지사항**

- 공지사항 작성 조회 수정 삭제



---



### 4. 결과물

- 스터디 모집

![](C:\Users\multicampus\AppData\Roaming\marktext\images\2022-08-19-11-24-22-image.png)





- 스터디 스페이스

<img src="file:///C:/Users/multicampus/AppData/Roaming/marktext/images/2022-08-19-11-24-54-image.png" title="" alt="" width="588">

<img title="" src="file:///C:/Users/multicampus/AppData/Roaming/marktext/images/2022-08-19-11-25-25-image.png" alt="" width="588">



- 세션

![](C:\Users\multicampus\AppData\Roaming\marktext\images\2022-08-19-11-26-22-image.png)

면접자 지정

![](C:\Users\multicampus\AppData\Roaming\marktext\images\2022-08-19-11-27-10-image.png)



tts mode

![](C:\Users\multicampus\AppData\Roaming\marktext\images\2022-08-19-11-27-46-image.png)



녹화

![](C:\Users\multicampus\AppData\Roaming\marktext\images\2022-08-19-11-28-18-image.png)
