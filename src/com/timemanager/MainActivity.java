package com.timemanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.timemanager.R;
import com.timemanager.model.Atividade;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void cadastrarAtividade(View v) {

		TextView horasField = (TextView) findViewById(R.id.campoHoras);
		TextView atividadeField = (TextView) findViewById(R.id.campoAtividade);

		// verifica se realmente foi digitado um float
		if (validaHora(horasField)) {
			
			float horas = Float.parseFloat(horasField.getText().toString());
			String nome = atividadeField.getText().toString();
			
			Atividade a = new Atividade(nome, horas);

			//lança alert
			Toast.makeText(MainActivity.this, a.toString(),	Toast.LENGTH_LONG).show();
		}
	}

	public boolean validaHora(TextView horasField) {
		try {
			Float.parseFloat(horasField.getText().toString());
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}