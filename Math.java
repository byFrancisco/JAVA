public class Math {
    int Numero1;
    int Numero2;
    int Resultado;

    public void setNumero1(int Numero1){
        this.Numero1 = Numero1;
    }

    public int getNumero1(){
        return this.Numero1;
    }

    public void setNumero2(int Numero2){
        this.Numero2 = Numero2;
    }

    public void multiplicar(int a, int b){
        this.Resultado= a * b ;
    }
    public void dividir(int a, int b){
        this.Resultado= a / b ;
    }
    public void imprimirResultado(){
        System.out.println("Resultado: " + this.Resultado);
    }
}
