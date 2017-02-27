package com.bq2015.xfinal.viewmodel;

import android.support.annotation.NonNull;

import com.bq2015.bqhttp.net.NetRequest;
import com.bq2015.bqlib.mvvm.AbstractViewModel;
import com.bq2015.xfinal.model.BaseNetList;
import com.bq2015.xfinal.model.DishCategory;
import com.bq2015.xfinal.model.StockInfo;
import com.bq2015.xfinal.view.activity.NewActivity;

/**
 * ViewModel层  业务逻辑
 * Created by bq2015 on 2016/6/24.
 */
public class NewActivityVM extends AbstractViewModel<NewActivity> {

    private NewActivity mView;
    private NetRequest<BaseNetList<DishCategory>> mBaidu;
    private NetRequest<StockInfo> mStockInfoNetRequest;

    @Override
    public void onBindView(@NonNull NewActivity view) {
        super.onBindView(view);
        mView = getView();
    }

    @Override
    public void onStart() {
        super.onStart();

    }

}
