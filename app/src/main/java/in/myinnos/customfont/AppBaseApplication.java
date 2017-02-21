package in.myinnos.customfont;

import android.app.Application;

import in.myinnos.customfontlibrary.TypefaceUtil;

/**
 * Created by 10 on 21-02-2017.
 */

public class AppBaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // custom font for entire App
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Montserrat-Regular.ttf");
    }
}
