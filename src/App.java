public class App {
    public static void main(String[] args) {
        int numeroInicial = 1;
        int numeroFinal = 5;

        for(int i = numeroInicial; i <= numeroFinal; i++){
            String imprimirLinha = "";
            for(int j = 0; j < i; j++){
                imprimirLinha += i;
            }
            System.out.println(imprimirLinha);
            
        }
    }
}
