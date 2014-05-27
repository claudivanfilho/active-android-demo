package com.timemanager;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.timemanager.R;
import com.timemanager.model.Atividade;

public class MainActivity extends Activity {

	ListView listView;
	TextView horasField;
	TextView atividadeField;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		atualizaListagem(); // atualiza o lista com as atividades do BD
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void atualizaListagem() {
		List<Atividade> atividades = Atividade.getAll(); // pega todas as tividade do BD
		listView = (ListView) findViewById(R.id.list);
		String[] atvs = new String[atividades.size()];
		
		int i = 0;
		for(Atividade a: atividades) {
			atvs[i] = a.toString();
			i++;
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	              android.R.layout.simple_list_item_1, android.R.id.text1, atvs);
		
		listView.setAdapter(adapter);
	}

	public void cadastrarAtividade(View v) {

		horasField = (TextView) findViewById(R.id.campoHoras);
		atividadeField = (TextView) findViewById(R.id.campoAtividade);
		
		// verifica se realmente foi digitado um float
		if (validaHora()) {
			float horas = Float.parseFloat(horasField.getText().toString());
			String nome = atividadeField.getText().toString();
			
			Atividade a = new Atividade(nome, horas);
			a.save(); // salva a atividade já no BD
			
			atualizaListagem();
			Log.d("create", "atividade criada");
		}
	}

	public boolean validaHora() {
		try {
			Float.parseFloat(horasField.getText().toString());
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}