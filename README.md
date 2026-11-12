# KGTech Android 앱

`android/` 폴더의 Android Studio 프로젝트에서 기존 대학 포털 페이지를 앱으로 실행할 수 있습니다. 앱은 `index.html`과 학과 상세 페이지 `code1.html`을 WebView로 표시하고, 외부 웹 링크는 Android 브라우저에서 엽니다.

## 실행

1. Android Studio에서 `android/` 폴더를 엽니다.
2. Android SDK 35를 설치하고 Gradle 동기화가 끝나면 앱을 실행합니다.
3. 명령줄 빌드: `cd android && ./gradlew assembleDebug`
4. APK 위치: `android/app/build/outputs/apk/debug/app-debug.apk`

페이지의 Tailwind CSS와 글꼴이 외부 CDN에서 로드되므로 최초 표시에는 인터넷 연결이 필요합니다.