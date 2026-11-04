public class TesteProduto {
    public static void main (String[] args) {

        produto prod = new produto();

        prod.setNome("aaa");
        System.out.println (prod.getNome());

        prod.setPreco(-23);
        System.out.println (prod.getPreco());

    }
}