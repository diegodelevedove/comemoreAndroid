/* TELA DE TEMAS ESCOLHER TEMA MENINOS OU MENINAS



*/

package android.estudo.comemore2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    //Chamando a tela home

    public void telahome(View view1){
        Intent telahome = new Intent(this,MainActivity.class);
        startActivity(telahome);
    }

    //Chamando tela MENINOS

    public void telameninos(View view2){
        Intent telameninos = new Intent(this,Main4Activity.class);
        startActivity(telameninos);
    }

    //Chamando tela MENINAS

    public void telameninas(View view3){
        Intent telameninas = new Intent(this,Main5Activity.class);
        startActivity(telameninas);
    }


}
