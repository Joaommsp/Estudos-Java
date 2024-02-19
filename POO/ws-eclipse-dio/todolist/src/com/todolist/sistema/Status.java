package com.todolist.sistema;

public enum Status {
	PENDENTE ("Pendente"),
    EM_ANDAMENTO ("em andamento"),
    CONCLUIDO ("concluído");
	
	private String nomeTarefa;

	private Status(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	
}
