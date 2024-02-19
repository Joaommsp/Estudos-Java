package com.todolist.sistema;

public class App {
	public static void main(String[] args) {
		GerenciadorDeTarefas tarefas = new GerenciadorDeTarefas();
		
		tarefas.adicionarTarefa("Acordar cedo", "acordar as 8h todo dia", "2024-02-18", Status.PENDENTE);
		tarefas.adicionarTarefa("lavar banheiro", "lavar banheiro todo dia", "2024-02-13", Status.CONCLUIDO);
		tarefas.adicionarTarefa("estudar", "estudar 8h por dia", "2024-04-13", Status.EM_ANDAMENTO);
		tarefas.adicionarTarefa("lavar banheiro", "lavar banheiro todo dia", "2024-02-13", Status.CONCLUIDO);
		tarefas.adicionarTarefa("lavar banheiro1", "lavar banheiro todo dia1", "2024-02-13", Status.CONCLUIDO);
		tarefas.adicionarTarefa("lavar banheiro2", "lavar banheiro todo dia2", "2024-02-13", Status.CONCLUIDO);
		tarefas.adicionarTarefa("lavar banheiro3", "lavar banheiro todo dia3", "2024-02-13", Status.CONCLUIDO);
		tarefas.adicionarTarefa("lavar banheiro4", "lavar banheiro todo dia4", "2024-02-13", Status.CONCLUIDO);
		tarefas.adicionarTarefa("lavar banheiro5", "lavar banheiro todo dia5", "2024-02-13", Status.CONCLUIDO);
		
		tarefas.listarTarefas();
		
		tarefas.removerTarefa("Acordar cedo");

		tarefas.listarTarefas();

		tarefas.atualizarStatus("estudar", Status.CONCLUIDO);
		
		tarefas.listarTarefas();
		
		tarefas.listarPorStatus(Status.CONCLUIDO);
	}
}
