package com.lester.lesterplayer.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lester.lesterplayer.utils.StatusBarUtil;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    /**
     * 设置状态栏文字高亮显示
     *
     * @param isDark
     */
    public void setStausBarTextDeep(boolean isDark) {
        if (isDark == true) {
            StatusBarUtil.setStatusBarTextColor(this, true);
        } else {
            StatusBarUtil.setStatusBarTextColor(this, false);
        }

    }

    /**
     * 设置状态栏颜色
     *
     * @param color
     */

    public void setStatusColor(int color) {
        StatusBarUtil.setColor(this, color);
    }

    /**
     * 设置全屏模式透明
     */
    public void setTranslucentStatus(boolean on) {
        StatusBarUtil.setTranslucentStatus(this, on);
    }

    /**
     * 设置全屏模式透明内容padding
     */
    public void setTranslucentStatusPadding() {
        StatusBarUtil.setTransparent(this);
    }
}
