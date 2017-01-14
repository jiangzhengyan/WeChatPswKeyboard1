package com.lnyp.pswkeyboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.lnyp.pswkeyboard.passwordinput.OnPasswordInputFinish;
import com.lnyp.pswkeyboard.passwordinput.PopEnterPassword;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPayKeyBoard(View view) {

        PopEnterPassword popEnterPassword = new PopEnterPassword(this);

        // 显示窗口
        popEnterPassword.showAtLocation(this.findViewById(R.id.layoutContent),
                Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0); // 设置layout在PopupWindow中显示的位置

        popEnterPassword.setOnPasswordInputFinish(new OnPasswordInputFinish() {
            @Override
            public void inputFinish(String password) {
                Toast.makeText(MainActivity.this,password+"顶顶顶顶顶顶顶",Toast.LENGTH_LONG).show();

            }
        });
    }
}
