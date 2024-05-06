/*package com.example.register.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.register.R

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}

 */
package com.example.register.views
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.register.R
import android.view.KeyEvent
import android.view.View
import com.example.register.databinding.ActivityLoginBinding
import com.example.register.databinding.ActivityRegisterBinding

class login : AppCompatActivity() , View.OnClickListener , View.OnFocusChangeListener , View.OnKeyListener {
    private lateinit var nBinding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nBinding = ActivityLoginBinding.inflate(getLayoutInflater())
        setContentView(nBinding.root)
        nBinding.editTextPhone2.onFocusChangeListener = this
        nBinding.editTextPhone7.onFocusChangeListener = this
        nBinding.textView6.onFocusChangeListener = this
        nBinding.textView4.onFocusChangeListener = this

    }
   private  fun validmobnumber () : Boolean {
        var errormessage : String? = null
        val value : String = nBinding.editTextPhone2.text.toString()
        if (value.isEmpty()){
            errormessage ="full name please"
        }
        return errormessage == null
    }

    private  fun valipassword () : Boolean {
        var errormessage : String? = null
        val value : String = nBinding.editTextPhone7.text.toString()
        if (value.isEmpty()){
            errormessage ="password please"
        }else if (value.length<6 ){
            errormessage ="password should be more than 6"
        }
        if ( errormessage != null){
            nBinding.editTextPhone7.apply {
                errormessage = errormessage
            }
        }
        return errormessage == null
    }

     override fun onClick(view: View?) {
        TODO("Not yet implemented")
    }

    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if ( view != null){

            when(view.id){




            }
        }
    }

    override fun onKey(view: View?, event: Int, KeyEvent: KeyEvent?): Boolean {
        return false
    }
}