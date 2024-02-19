package com.todolist.sistema;

public class Tarefa {
	private String nomeTarefa;
	private String descricaoTarefa;
	private String dataVencimento;
	private Status status;
	
	public Tarefa(String nomeTarefa, String descricaoTarefa, String dataVencimento, Status status) {
		this.nomeTarefa = nomeTarefa;
		this.descricaoTarefa = descricaoTarefa;
		this.dataVencimento = dataVencimento;
		this.status = status;
	}
	
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}
	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
 
	public String toString() {
	    return "Tarefa: " + nomeTarefa + "\n" 
	    		+ "Descrição: " + descricaoTarefa + "\n"
	    		+ "Data de vencimento: " + dataVencimento + "\n"
	    		+ "Status: " + status
	    		;
	}
	
}
