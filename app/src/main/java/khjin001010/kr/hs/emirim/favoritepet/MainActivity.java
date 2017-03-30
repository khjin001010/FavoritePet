package khjin001010.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    CheckBox checkboxselect;
    RadioGroup rg;
    RadioButton radio_dog, radio_cat, radio_rabbit;
    Button but_ok;
    ImageView imgv_pet;
    TextView txt_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxselect = (CheckBox)findViewById(R.id.checkbox_select);
        txt_1 = (TextView)findViewById(R.id.text_1);
        rg = (RadioGroup)findViewById(R.id.rg);
        radio_dog = (RadioButton)findViewById(R.id.radio_dog);
        radio_cat = (RadioButton)findViewById(R.id.radio_cat);
        radio_rabbit = (RadioButton)findViewById(R.id.radio_rabbit);
        but_ok = (Button)findViewById(R.id.but_ok);
        imgv_pet = (ImageView)findViewById(R.id.imgv_pet);
        checkboxselect.setOnCheckedChangeListener(this);
        but_ok.setOnClickListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (checkboxselect.isChecked()) {
            txt_1.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            radio_dog.setVisibility(View.VISIBLE);
            radio_cat.setVisibility(View.VISIBLE);
            radio_rabbit.setVisibility(View.VISIBLE);
            but_ok.setVisibility(View.VISIBLE);
            imgv_pet.setVisibility(View.VISIBLE);
        } else {
            txt_1.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            radio_dog.setVisibility(View.INVISIBLE);
            radio_cat.setVisibility(View.INVISIBLE);
            radio_rabbit.setVisibility(View.INVISIBLE);
            but_ok.setVisibility(View.INVISIBLE);
            imgv_pet.setVisibility(View.INVISIBLE);
        }
    }

    public void onClick(View v) {
        switch (rg.getCheckedRadioButtonId()) {
            case R.id.radio_dog:
                imgv_pet.setImageResource(R.drawable.dog);
                break;
            case R.id.radio_cat:
                imgv_pet.setImageResource(R.drawable.cat);
                break;
            case R.id.radio_rabbit:
                imgv_pet.setImageResource(R.drawable.rabbit);
                break;
            default:
                Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요.", Toast.LENGTH_SHORT).show();
        }
    }
}
