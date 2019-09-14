package com.app.medicalapp.extentions

import android.app.Activity
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun <T : ViewDataBinding> Activity.setDataBindingContentView(@LayoutRes res: Int): T {
    return DataBindingUtil.setContentView(this, res)
}
