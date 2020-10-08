
# Android Kotlin Base Library

## Do you have more than one Android App?

Every android app has a lot of common code, which could be shared (platform specific code). Besides kotlin multiplatform, where the main goal is to share as much business logic code as possible, there is also a need to share common, platform specific code between apps.

**_Advantages:_**

- With every Android update, you update the code base once for all apps
- You write less code, have less bugs and do not repeat yourself (DRY)
- You can focus on the core of your app

**_Usage_**:
```
<dependency>
  <groupId>com.treslines.appbase</groupId>
  <artifactId>appbase</artifactId>
  <version>1.0</version>
</dependency>
```

## What is in V1.0.0?
- ViewExt.kt - Extensions for views
- ViewGroupExt.kt - Extensions for view groups
- FragmentExt.kt - Extensions for fragments
- ActivityExt.kt - Extensions for activities
- BaseAdapter.kt - Kotlin Generic Base Adapter for ViewTypes
- SharedPrefencesUtil.kt - Goodies for local storage
