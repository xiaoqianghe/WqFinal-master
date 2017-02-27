package com.bq2015.xfinal.view.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.bq2015.bqlib.mvvm.base.BaseActivity;
import com.bq2015.xfinal.R;
import com.bq2015.xfinal.viewmodel.NewActivityVM;

import butterknife.ButterKnife;

/**
 * @包名: com.bq2015.xfinal.view.activity
 * @类名: NewActivity
 * @创建人: xiaoqianghe
 * @创建时间 : 2017/2/27 20:07
 * @描述 : TODO
 */

public class NewActivity extends BaseActivity<NewActivity,NewActivityVM> {

    private NewActivityVM mViewModel;


    @Override
    protected void getBundleExtras(@NonNull Bundle extras) {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {

        mViewModel=getViewModel();

    }

    @Override
    protected int tellMeLayout() {
        return R.layout.activity_new;
    }

    @Override
    protected View getStatusTargetView() {
        return null;
    }

    @Override
    public Class<NewActivityVM> getViewModelClass() {
        return NewActivityVM.class;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.bind(this);
    }
}
