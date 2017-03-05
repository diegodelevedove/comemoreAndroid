package comemore.sistema.comemore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void voltarMenu(View view) {
        Intent menu = new Intent(this,MainActivity.class);
        startActivity(menu);
    }

}
