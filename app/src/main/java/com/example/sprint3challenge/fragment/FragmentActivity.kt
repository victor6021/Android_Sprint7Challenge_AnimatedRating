package com.example.sprint3challenge.fragment

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sprint3challenge.R

class FragmentActivity : AppCompatActivity(), RateFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(image: Image) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }
}
