package dio.course;

public class Conta {
    
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void pagarBoleto(double valorApagar){
        
    }

    public void validaSaldo(double valorApagar){
        if(valorApagar > saldo){
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(double valorApagar){
        this.saldo += valorApagar;
    }

    public void enviarCreditoParaEmissor(int valorApagar){
        //enviaria o valor para o orgão emisso do boleto
    }
   
    
}
