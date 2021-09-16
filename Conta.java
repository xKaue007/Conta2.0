public class Conta{
    
    private int numero;
    String titular;
    double saldo;

//get faz consulta e set faz alteração
    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }
}