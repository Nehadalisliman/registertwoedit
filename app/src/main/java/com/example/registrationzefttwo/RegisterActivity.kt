package com.example.register.views
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import com.example.register.R
import com.example.register.databinding.ActivityRegisterBinding

import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class registerActivity : AppCompatActivity() , View.OnClickListener , View.OnFocusChangeListener , View.OnKeyListener {
    private lateinit var nBinding: ActivityRegisterBinding


    lateinit var phonenumber: EditText
    lateinit var name: EditText
    lateinit var passworrd: EditText
    lateinit var conpassworrd: EditText
    lateinit var tvRedirectLogin: ImageButton
    private lateinit var btnSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        nBinding = ActivityRegisterBinding.inflate(getLayoutInflater())

        // View Bindings
        phonenumber = findViewById(R.id.editTextPhone005)
        name = findViewById(R.id.editTextPhone006)
        passworrd = findViewById(R.id.editTextPhone007)
        conpassworrd = findViewById(R.id.editTextPhone008)
        btnSignUp = findViewById(R.id.button0011)
        tvRedirectLogin = findViewById(R.id.imageButton004)


        // switching from signUp Activity to Login Activity
        tvRedirectLogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

    }

    private fun signUpUser() {
        val phonenumber = phonenumber.text.toString()
        val pass = passworrd.text.toString()
        val confirmPassword = conpassworrd.text.toString()

        // check pass
        if (phonenumber.isBlank() || pass.isBlank() || confirmPassword.isBlank()) {
            Toast.makeText(this, " Password can't be blank", Toast.LENGTH_SHORT).show()
            return
        }

        if (pass != confirmPassword) {
            Toast.makeText(this, "Password and Confirm Password do not match", Toast.LENGTH_SHORT)
                .show()
            return
        }



        // If all credential are correct
        // We call createUserWithEmailAndPassword
        // using auth object and pass the
        // email and pass in it.

        auth.createUserWithEmailAndPassword(phonenumber, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully Singed Up", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Singed Up Failed!", Toast.LENGTH_SHORT).show()
            }
        }

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


// private  fun validatefullname () : Boolean {
// var errormessage : String? = null
// val value : String = nBinding.editTextPhone006.text.toString()
// if (value.isEmpty()){
// errormessage ="full name please"
// }
// if ( errormessage != null){
// nBinding.editTextPhone006.apply {
// error = errormessage
// }
// }
// return errormessage == null
// }
//
//
// private  fun validmobnumber () : Boolean {
// var errormessage : String? = null
// val value : String = nBinding.editTextPhone005.text.toString()
// if (value.isEmpty()){
// errormessage ="full name please"
// }
// return errormessage == null
// }
//
// private  fun valipassword () : Boolean {
// var errormessage : String? = null
// val value : String = nBinding.editTextPhone007.text.toString()
// if (value.isEmpty()){
// errormessage ="password please"
// }else if (value.length<6 ){
// errormessage ="password should be more than 6"
// }
// if ( errormessage != null){
// nBinding.editTextPhone007.apply {
// errormessage = errormessage
// }
// }
// return errormessage == null
// }
//
// private  fun valiconfirmpassword () : Boolean {
// var errormessage : String? = null
// val value : String = nBinding.editTextPhone008.text.toString()
// if (value.isEmpty()){
// errormessage ="confirmpassword please"
// }else if (value.length<6 ){
// errormessage ="password should be more than 6"
// }
// if ( errormessage != null){
// nBinding.editTextPhone008.apply {
// error = errormessage
// }
// }
// return errormessage == null
// }
//
// private  fun valiasswordandconfirmpassword () : Boolean {
// var errormessage : String? = null
// val password : String = nBinding.editTextPhone007.text.toString()
// val confirmpassword : String = nBinding.editTextPhone008.text.toString()
// if (password !=confirmpassword){
// errormessage ="match password"
// }
// if ( errormessage != null){
// nBinding.editTextPhone008.apply {
// error = errormessage
// }
// }
// return errormessage == null
// }
//
//
//
//
//
// override fun onClick(view: View?) {
// TODO("Not yet implemented")
// }
//
// override fun onFocusChange(view: View?, hasFocus: Boolean) {
// if ( view != null){
//
// when(view.id){
//
//
//
//
// }
// }
// }
//
// override fun onKey(view: View?, event: Int, KeyEvent: KeyEvent?): Boolean {
// return false
// }
// }