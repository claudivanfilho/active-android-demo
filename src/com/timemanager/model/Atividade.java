package com.timemanager.model;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

@Table(name="atividades")
public class Atividade extends Model{

	@Column
	String nome;
	@Column
	float horas;
	
	public Atividade() {
	}
	
	public Atividade(String nome, float horas) {
		this.nome = nome;
		this.horas = horas;
	}
	
	public void setHoras(float horas) {
		this.horas = horas;
	}
	public float getHoras() {
		return horas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static List<Atividade> getAll() {
	    return new Select()
	        .from(Atividade.class)
	        .orderBy("nome ASC")
	        .execute();
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + "Horas Gastas: " +  horas +  "\n";
	}
}
