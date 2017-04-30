/* TELA DE PEDIDO CHAMA AS OUTRAS TELAS



*/


package android.estudo.comemore2;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.DatePicker;


import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;

import android.os.Bundle;

import android.view.Menu;
import android.view.View;

import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.util.Calendar.getInstance;

public class Main2Activity extends AppCompatActivity {

    //Declarando as variáveis do formulário a DATA e o HORÁRIO

    private EditText nome, cpf, endereco, email, telefone, obspedido; //Ver como é a saida do datapicker e do horario




    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // CAlENDARIO
        /************************************************************************************************/

        //Associando os Botões

        dateView = (TextView) findViewById(R.id.dataver);
        calendar = getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);



















    }//Fim do ONCREATE



    @SuppressWarnings("deprecation")
    public void setDate(View viewdata) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }









    /*********************************************************************/
    // CHAMANDO TELA HOME


    public void telahome(View view2) {
        Intent telahome = new Intent(this, MainActivity.class);
        startActivity(telahome);
    }

    // CHAMANDO TELA TEMA

    public void telatema(View view3) {
        Intent telatema = new Intent(this, Main3Activity.class);
        startActivity(telatema);
    }





}//fim da classe
