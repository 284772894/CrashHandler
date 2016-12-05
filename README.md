# ��Ŀ�������
* ��Ҫ�Ǽ��android��crash��Ϣ������һ��http�����ҵ�[�Զ���app���Կ��](https://github.com/284772894/appiumn_auto)

# �÷�

## ������Ŀֱ�ӿ�Դ�뼴��

```
git clone git@github.com:284772894/CrashHandler.git
```

## ���jar

![1.png](img/1.png "1.png")

## ����app����
* AndroidManifest��Ȩ��

```
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
<uses-permission android:name="android.permission.INTERNET"></uses-permission>
```

* AndroidManifest����application��ֵ

```
<application android:allowBackup="true" 
      android:icon="@drawable/ic_launcher" 
      android:label="@string/app_name" 
      android:name=".CrashApplication">
```

* ��Ҫ���Լ���application����

```
import android.app.Application;
import com.shikun.crashhandler.*;  #���ô����jar
public class CrashApplication extends Application  {
    @Override  
    public void onCreate() { 
     super.onCreate();  
     CrashHandler mCrashHandler = CrashHandler.getInstance();  
     mCrashHandler.setCustomCrashHanler(getApplicationContext()); 
    }
}
```

# ��־����
* �Լ��������һ���������г�����ᷢ��һ����Ѻõġ��ܱ�Ǹ�����������쳣�������˳���������������ľ����
* ���Ǵ�DDMS����mnt/sdcard/Crash/Ŀ¼���淢������һ���ļ������ļ������ǿ��Կ���

```
versionCode = 1  
PRODUCT = sdk  
MODEL = sdk  
versionName = 1.0  
SDK_INT = 8  
java.lang.RuntimeException: Unable to start activity ComponentInfo{com.example.customcrash/com.example.customcrash.MainActivity}: java.lang.NullPointerException  
  at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2663)  
  at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2679)  
  at android.app.ActivityThread.access$2300(ActivityThread.java:125)  
  at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2033)  
  at android.os.Handler.dispatchMessage(Handler.java:99)  
  at android.os.Looper.loop(Looper.java:123)  
  at android.app.ActivityThread.main(ActivityThread.java:4627)  
  at java.lang.reflect.Method.invokeNative(Native Method)  
  at java.lang.reflect.Method.invoke(Method.java:521)  
  at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:868)  
  at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:626)  
  at dalvik.system.NativeStart.main(Native Method)  
Caused by: java.lang.NullPointerException  
  at com.example.customcrash.MainActivity.onCreate(MainActivity.java:15)  
  at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1047)  
  at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2627)  
  ... 11 more
```





