# 引入
## Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
## Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sinothk:TipView:1.0.0913'
	}

# 使用
## xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:padding="10dp">

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="8dp"
            android:layout_height="8dp"
            android:gravity="center"
            android:textColor="#FFF"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="1"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="99+"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="···"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="1234"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="123467"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00"
            app:lib_pub_badgev_radius="6dp" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:padding="10dp">

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="8dp"
            android:layout_height="8dp"
            android:gravity="center"
            android:textColor="#FFF"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:id="@+id/style1TipView"
            android:layout_width="wrap_content"
            android:layout_height="16dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="16dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="8"
            android:textColor="#FFF"
            android:textSize="12sp"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="16dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="16dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="69"
            android:textColor="#FFF"
            android:textSize="12sp"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="99+"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="···"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="1234"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00" />

        <com.sinothk.widget.tipView.style1.BadgeView
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:layout_marginLeft="24dp"
            android:gravity="center"
            android:minWidth="20dp"
            android:paddingLeft="4dp"
            android:paddingRight="4dp"
            android:text="123467"
            android:textColor="#FFF"
            android:textSize="10dp"
            app:lib_pub_badgev_circle="false"
            app:lib_pub_badgev_color="#F00"
            app:lib_pub_badgev_radius="6dp" />
    </LinearLayout>
</LinearLayout>

# 效果图
   https://github.com/sinothk/TipView/blob/master/art/style1.png
