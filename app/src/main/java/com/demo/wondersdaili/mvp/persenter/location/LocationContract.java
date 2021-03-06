package com.demo.wondersdaili.mvp.persenter.location;


import com.baidu.location.BDLocation;
import com.demo.wondersdaili.mvp.persenter.base.BasePersenter;
import com.demo.wondersdaili.mvp.persenter.base.BaseView;

/**
 * Created by daili on 2017/3/9.
 */

public interface LocationContract {

    interface View extends BaseView {
        void loadLocation(BDLocation location);
        void loadLocationError(BDLocation location);
    }

    interface Persenter extends BasePersenter {
        void queryLocation();

        void queryLateKnownLocation();

    }
}
