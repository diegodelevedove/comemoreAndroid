/* TELA DE PEDIDO CHAMA AS OUTRAS TELAS



*/


package android.estudo.comemore2;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.text.DateFormat;
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
import android.widget.TimePicker;
import android.widget.Toast;

import static android.icu.util.Calendar.getInstance;

public class Main2Activity extends AppCompatActivity {

    //Declarando as variáveis do formulário a DATA e o HORÁRIO

    private EditText nome, cpf, endereco, email, telefone, obspedido; //Ver como é a saida do datapicker e do horario

    //Aqui vem o set da data

    DateFormat formatDateTime = DateFormat.getDateTimeInstance();
    Calendar dateTime = getInstance();
    private TextView text;
    private Button btn_time;
    private Button btn_date;



    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // CAlENDARIO
        /************************************************************************************************/

        text = (TextView) findViewById(R.id.dataver);
        btn_date = (Button) findViewById(R.id.btn_date);
        btn_time = (Button) findViewById(R.id.btn_time);

        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDate();
            }
        });

        btn_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTime();
            }
        });


        updateTextLabel();

    }//Fim do ONCREATE

    private void updateDate(){
        new DatePickerDialog(this,date,dateTime.get(Calendar.YEAR),dateTime.get(Calendar.MONTH),dateTime.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void updateTime(){
        new TimePickerDialog(this,time,dateTime.get(Calendar.HOUR_OF_DAY),dateTime.get(Calendar.MINUTE),true).show();
    }

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dateTime.set(Calendar.YEAR,year);
                dateTime.set(Calendar.MONTH,month);
                dateTime.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                updateTextLabel();
        }
    };

    TimePickerDialog.OnTimeSetListener time = new TimePickerDialog.OnTimeSetListener(){
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            dateTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
            dateTime.set(Calendar.MINUTE, minute);
            updateTextLabel();
        }


    };





    @RequiresApi(api = Build.VERSION_CODES.N)
        private void updateTextLabel(){
        text.setText(formatDateTime.format(dateTime.getTime()));
        }











    /*********************************************************************/
    // CHAMANDO TELA HOME


    public void telahome(View view) {
        Intent telahome = new Intent(this, MainActivity.class);
        startActivity(telahome);
    }

    // CHAMANDO TELA TEMA

    public void telatema(View view) {
        Intent telatema = new Intent(this, Main3Activity.class);
        startActivity(telatema);
    }





}//fim da classe
