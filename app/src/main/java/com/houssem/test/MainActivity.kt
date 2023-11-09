package com.houssem.test


import Interview
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.github.gcacace.signaturepad.views.SignaturePad
import com.houssem.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)
        initView()
        setClickListener()
    }


    private fun initView() {

        mViewBinding.signaturePad.setOnSignedListener(object : SignaturePad.OnSignedListener {
            override fun onStartSigning() {
                //Event triggered when the pad is touched
                Toast.makeText(this@MainActivity, "onStartSigning() triggered!", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onSigned() {
                //Event triggered when the pad is signed
                Toast.makeText(this@MainActivity, "onStartSigning() triggered!", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onClear() {
                //Event triggered when the pad is cleared
                Toast.makeText(this@MainActivity, "onStartSigning() triggered!", Toast.LENGTH_SHORT)
                    .show()
            }
        })
    }

    private fun setClickListener() {
        mViewBinding.btnComplete.setOnClickListener {
            //Set the captured signature in Imageview
            mViewBinding.ivSignature.setImageBitmap(mViewBinding.signaturePad.signatureBitmap)
        }
        mViewBinding.btnClear.setOnClickListener {
            //Clear captured signature
            mViewBinding.signaturePad.clear()
        }

        mViewBinding.btnInterview.setOnClickListener {
            // Lorsque le bouton "button_interview" est cliqué, lancez l'activité InterviewActivity
            var intent = Intent(this,Interview::class.java)
            startActivity(intent)
        }

    }

}