package br.com.m2sys.ar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.layar.sdk.LayarSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String oauthKey = "ECJVcdAQSjYnToua";

        String oauthSecret = "svrjAKZLMJWobyfOlhXpgVaqzdEDkwUS";

        LayarSDK.initialize(this, oauthKey, oauthSecret);

        LayarSDK.startLayarActivity(this);
    }

}
