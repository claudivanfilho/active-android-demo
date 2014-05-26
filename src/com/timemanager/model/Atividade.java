package com.timemanager.model;

public class Atividade {

	protected String nome;
	protected float horas;
	
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
	
	@Override
	public String toString() {
		return "Nome: " + nome +  "\n" + "Horas: " +  horas;
	}
}
