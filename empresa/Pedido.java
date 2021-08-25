package empresa;

import java.util.HashSet;

public class Pedido {

    public enum StatusPedido {
        CANCELADO, ENTREGUE, PROCESSANDO
    }

    private StatusPedido statusPedido;
    private final HashSet<Integer> produtos = new HashSet<>();

    Pedido(int[] produtos) {
        inicializaProdutos(produtos);
        this.statusPedido = StatusPedido.PROCESSANDO;
    }

    private void inicializaProdutos(int[] produtos) {
        for (int produto : produtos) {
            this.produtos.add(produto);
        }
    }

    public boolean adicionarProduto(int codProduto) {
        if (!produtos.contains(codProduto) || produtos.size() > 4) {
            return false;
        }
        produtos.add(codProduto);
        return true;
    }

    public int[] entregar() {
        if (produtos.size() < 1 || statusPedido == StatusPedido.CANCELADO) {
            return null;
        }
        int[] arrayProdutos = new int[produtos.size()];
        int i = 0;
        for (Integer produto : produtos) {
            arrayProdutos[i] = produto;
            i++;
        }
        statusPedido = StatusPedido.ENTREGUE;
        return arrayProdutos;
    }

    public boolean cancelar() {
        if (statusPedido == StatusPedido.ENTREGUE) {
            return false;
        }
        statusPedido = StatusPedido.CANCELADO;
        return true;
    }

    public boolean somarPedido(Pedido p) {
        if (p.produtos.size() + produtos.size() > 5) {
            return false;
        }
        produtos.addAll(p.produtos); //Como é um hash set essa operação de adição irá eliminar as duplicações.
        return true;
    }

}
