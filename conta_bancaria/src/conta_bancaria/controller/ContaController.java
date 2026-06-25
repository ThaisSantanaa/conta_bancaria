package conta_bancaria.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository {

    private List<Conta> listarContas = new ArrayList<>();
    private int numero = 0;

    @Override
    public void listarTodas() {

        for (var conta : listarContas) {
            conta.visualizar();
        }

    }

    @Override
    public void cadastrar(Conta conta) {

        listarContas.add(conta);
        System.out.printf("A conta número %d foi criada com sucesso!%n",
                conta.getNumero());

    }

    public void procurarPorNumero(int numero) {

        Optional<Conta> conta = buscarNaCollection(numero);

        if (conta.isPresent())
            conta.get().visualizar();
        else
            System.out.printf("\nA conta %d não foi encontrada!", numero);

    }

    @Override
    public void atualizar(Conta conta) {

        Optional<Conta> buscaConta = buscarNaCollection(conta.getNumero());

        if (buscaConta.isPresent()) {

            listarContas.set(
                    listarContas.indexOf(buscaConta.get()),
                    conta);

            System.out.printf(
                    "\nA conta número %d foi atualizada com sucesso!",
                    conta.getNumero());

        } else {

            System.out.printf(
                    "\nA conta número %d não foi encontrada!",
                    conta.getNumero());

        }

    }
    

    @Override
    public void deletar(int numero) {

        Optional<Conta> conta = buscarNaCollection(numero);

        if (conta.isPresent()) {

            if (listarContas.remove(conta.get()))
                System.out.printf("\nA conta número %d foi deletada com sucesso!",numero);

        } else {

            System.out.printf("\nA conta número %d não foi encontrada!",numero);

        }

    }
    

    @Override
    public void sacar(int numero, float valor) {

    }

    @Override
    public void depositar(int numero, float valor) {

    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {

    }

    // Método auxiliar
    public int gerarNumero() {
        return ++numero;
    }

    public Optional<Conta> buscarNaCollection(int numero) {

        for (var conta : listarContas) {

            if (conta.getNumero() == numero)
                return Optional.of(conta);

        }

        return Optional.empty();
   

	
	}
}