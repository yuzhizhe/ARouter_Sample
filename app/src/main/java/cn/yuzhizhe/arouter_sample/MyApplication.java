package cn.yuzhizhe.arouter_sample;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @ProjectName: ARouter_Sample
 * @Package: cn.yuzhizhe.arouter_sample
 * @ClassName: MyApplication
 * @Description: 类作用描述:
 * @Author: yuzhizhe
 * @CreateDate: 2021/3/14 11:26
 * @Version: 1.0
 * *******************************
 * @UpdateUser: 无
 * @UpdateDate: 无
 * @UpdateRemark: 无
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        ARouter.init(this);//第二步，初始化
        super.onCreate();
    }
}
