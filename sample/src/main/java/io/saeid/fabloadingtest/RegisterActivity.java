package io.saeid.fabloadingtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by MAHESH on 2/2/2016.
 */
public class RegisterActivity  extends Activity{
    EditText name,email,password,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        name=(EditText)findViewById(R.id.reg_userName);
        email=(EditText)findViewById(R.id.reg_email);
        password=(EditText)findViewById(R.id.reg_password);
        number=(EditText)findViewById(R.id.reg_number);
    }
}
