package eecs1022.lab2;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab2Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
    }


    private void setTextView(int id, String text){
        View v= findViewById(id);
        TextView tv = (TextView)v;
        tv.setText(text);//tv ???   text?= newcontents?
    }

    private String getTextContent(int id){//int id???   no string??
        View v = findViewById(id);
        EditText et = (EditText) v;
        String s = et.getText().toString();
        return s;
    }
    private String getItemselected(int id){
        View v =findViewById(id);
        Spinner spinner = (Spinner) v;
        String s = spinner.getSelectedItem().toString();
        return s;
    }
    public void buttonClicked(View v){

        String name = getTextContent(R.id.NameText);
        String income = getTextContent(R.id.IncomeText);
        String stutas = getTextContent(R.id.Status);
        Taxpayer tx = new Taxpayer(name, income,stutas);
        String result = tx.getResult();
        setTextView(R.id.Result,result);
    }
}
