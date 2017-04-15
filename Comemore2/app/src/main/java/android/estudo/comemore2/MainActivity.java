/* TELA PRINCIPAL HOME CHAMA AS OUTRAS TELAS



*/


package android.estudo.comemore2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //********* CHAMANDO A TELA DE PEDIDO ****************//


    public void telapedido(View view1){
        Intent telapedido = new Intent(this,Main2Activity.class);
        startActivity(telapedido);
    }



}
