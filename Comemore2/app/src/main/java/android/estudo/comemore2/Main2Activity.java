/* TELA DE PEDIDO CHAMA AS OUTRAS TELAS



*/


package android.estudo.comemore2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    // CHAMANDO TELA DE HOME


    public void telahome(View view2){
        Intent telahome = new Intent(this,MainActivity.class);
        startActivity(telahome);
    }

    // CHAMANDO TELA TEMA

    public void telatema(View view3){
        Intent telatema = new Intent(this,Main3Activity.class);
        startActivity(telatema);
    }

}
