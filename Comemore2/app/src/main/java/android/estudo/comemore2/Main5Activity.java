//TELA DE TEMA DE MENINAS


package android.estudo.comemore2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    //Chamando Menu Principal

    public void telahome(View view1){
        Intent telahome = new Intent(this,MainActivity.class);
        startActivity(telahome);
    }
}
