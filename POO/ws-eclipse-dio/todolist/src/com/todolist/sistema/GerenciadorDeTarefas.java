package com.todolist.sistema;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
	private List<Tarefa> listaDeTarefas;

	public GerenciadorDeTarefas() {
		listaDeTarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String titulo, String descricao, String dataVencimento, Status status) {
		Tarefa novaTarefa = new Tarefa(titulo, descricao, dataVencimento, status);
		listaDeTarefas.add(novaTarefa);
	}
	
	public void removerTarefa(String tituloDaTarefa) {
		listaDeTarefas.removeIf(tarefas -> tarefas.getNomeTarefa() == tituloDaTarefa);
	}
	
	public void listarTarefas() {
		for(Tarefa tarefa: listaDeTarefas) {
			System.out.println("Tarefa: " + (listaDeTarefas.indexOf(tarefa) + 1) );
			System.out.println(tarefa.toString()  + "\n");
		}
	}
	
	public void atualizarStatus(String titulo, Status novoStatus) {
		for(Tarefa tarefa: listaDeTarefas) {
			if(tarefa.getNomeTarefa() == titulo) {
				tarefa.setStatus(novoStatus);
			}
		}
	}
	
	public void listarPorStatus(Status status) {
		for(Tarefa tarefa: listaDeTarefas) {
			if(tarefa.getStatus() == status) {
				System.out.println("Tarefa com status: " + status + " " + tarefa.getNomeTarefa() + "\n");
			}
		}
	}
}