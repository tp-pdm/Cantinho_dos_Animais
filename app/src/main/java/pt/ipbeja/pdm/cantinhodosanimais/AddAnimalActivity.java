package pt.ipbeja.pdm.cantinhodosanimais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animal);

        //SchoolSpinner
        Spinner generoSpinner = findViewById(R.id.spinner_genero);
        ArrayAdapter<CharSequence> generoSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.spinnerGenero, android.R.layout.simple_spinner_item);
        generoSpinner.setPrompt("Gênero");
        generoSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        generoSpinner.setAdapter(generoSpinnerAdapter);
        generoSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


    }


}