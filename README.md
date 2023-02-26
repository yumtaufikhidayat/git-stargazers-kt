# Git Stargazers
Git Stargazers is a simple Github application to see the most starred repository. You can see most starred repository from various programming language. This application also using pagination, so you can scroll to see more starred repository infinitely. This application using MVVM architecture approach based on Google's recommendation. You can see the tech stack details below.

### App Screenshot
| <img src=infinite-pagination.gif  align="center" height="400" width="248" ></a> | <img src=infinite-pagination_no-connection.gif  align="center" height="400" width="248" ></a> |
|:-------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------:|
|                              *Infinite Pagination*                              |                        *Infinite Pagination + No Internet Connection*                         |

### Tech Stacks
- Kotlin
- ViewBinding for Binding View
- Dagger Hilt for Dependency Injection
- Material Design for UI Design
- Glide for Image Loader
- Circle Imageview from hdodenhof for Circle Image
- Retrofit from Square for API consume
- OkHttp Interceptor from Square for Network logging interceptor
- Coroutine for Concurrency
- ViewModel & LiveData
- Paging3 for Pagination
- Navigation Component
- MVVM Architecture

### Libraries
- ## Core
  - implementation 'androidx.core:core-ktx:1.9.0'
  - implementation 'androidx.appcompat:appcompat:1.6.1'

- ## UI
  - implementation 'com.google.android.material:material:1.8.0'
  - implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
  - implementation 'androidx.navigation:navigation-fragment-ktx:2.5.3'
  - implementation 'androidx.navigation:navigation-ui-ktx:2.5.3'

- ## Testing
  - testImplementation 'junit:junit:4.13.2'
  - androidTestImplementation 'androidx.test.ext:junit:1.1.5'
  - androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'

- ## Hilt
  - def hiltVersion = '2.44'
  - implementation "com.google.dagger:hilt-android:$hiltVersion"
  - kapt "com.google.dagger:hilt-compiler:$hiltVersion"

- ## Glide
  - implementation 'com.github.bumptech.glide:glide:4.14.2'

- ## Android KTX
  - implementation 'androidx.activity:activity-ktx:1.6.1'
  - implementation 'androidx.fragment:fragment-ktx:1.5.5'

- ## Circle Image
  - implementation 'de.hdodenhof:circleimageview:3.1.0'

- ## Network
  - def okHttpVersion = '4.10.0'
  - def retrofitVersion = '2.9.0'
  - implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"
  - implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"
  - implementation "com.squareup.okhttp3:okhttp:$okHttpVersion"
  - implementation "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"

- ## Coroutine
  - def coroutineVersion = '1.6.4'
  - implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
  - implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion"

- ## ViewModel
  - def lifeCycleVersion = '2.5.1'
  - implementation "androidx.lifecycle:lifecycle-runtime-ktx:$lifeCycleVersion"
  - implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycleVersion"
  - implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifeCycleVersion"

- ## Pagination
  - def pagingVersion = "3.1.1"
  - implementation "androidx.paging:paging-runtime:pagingVersion"
  - implementation "androidx.paging:paging-common:pagingVersion"

### Run Project
You can simply run the project by using Android Studio, than follow these steps.
1. In the toolbar, select your app from the run configurations menu.
2. In the target device menu, select the device that you want to run your app on.

Also, you can run the project by clicking Menu Bar > Run > Run 'app'. See the https://developer.android.com/studio/run for the details how to run Android app on Android Studio.

### Generate APK
1. First, open up your project or application that you want to import into an APK file. Then, select Build > Build Bundle(s)/APK(s) > Build APK(s) from the toolbar menu. Android Studio will take a few moments to generate an APK file.
2. Once the APK build is complete, you’ll receive a notification on the bottom right corner of your screen. From that notification, select Locate and you will be led to the APK file location.
3. If you miss the notification, you can still locate the APK file in the following path within your project folder: app/build/outputs/apk/debug. The file is named app-debug.apk by default.