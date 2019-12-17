package com.balag.learnandroid.recyclerview

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.balag.learnandroid.R

abstract class SingleFragmentActivity : AppCompatActivity() {
    private val layoutResId : Int
    @LayoutRes
    get() = R.layout.activity_fragment

    protected abstract fun createFragment(): Fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)

        val fragmentManager = supportFragmentManager
        var fragment = fragmentManager.findFragmentById(R.id.fragment_container)

        if(fragment == null) {
            fragment = createFragment()

            //create and commit a fragmetn transactions
            fragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
    }

}