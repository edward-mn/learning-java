package moreira.company;

import java.util.Scanner;

public class ContaBancaria {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBancaria(){
        this.status = false;
        this.saldo = 0f;
        extrato();
    }

    public void extrato(){
        System.out.printf("\nExtrato cliente %s \n", getDono());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipoConta());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Aberta? " + getStatus());
        System.out.println();
    }

    public void setDono(String namePerson) {
        this.dono = namePerson;
    }

    public String getDono() {
        return dono;
    }

    public void setNumConta(int numConta) {
        this.numConta += numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void abrirConta(){
        setStatus(true);
        Scanner insert = new Scanner(System.in);

        do {
            System.out.print("Escolha um tipo de conta por favor \n [ 1 ] - Conta Corrente - CC \n [ 2 ] - Conta Poupança - CP\n");
            setTipoConta(insert.next());
            if(getTipoConta().equals("1")){
                setTipoConta("CC");
                setSaldo(50f);
            } else if(getTipoConta().equals("2")){
                setTipoConta("CP");
                setSaldo(150f);
            } else {
                System.out.println("Selecione uma opção válida\n");
            }
        } while (getTipoConta().equals("CC") ^ !getTipoConta().equals("CP"));
        System.out.print("Nome do Dono da conta: ");
        setDono(insert.next());
        setNumConta(1);
        extrato();
    }

    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.printf("Conta não pode se fechada pois há R$ %.2f de saldo", getSaldo());
        } else if(getSaldo() < 0){
            System.out.printf("Conta não pode se fechada pois há um débito de R$ %.2f", getSaldo());
        } else {
            setStatus(false);
            System.out.printf("Conta de %s - Fechada com sucesso!", getDono());
        }
        extrato();
    }

    public void zerarConta(){
        if(getSaldo() > 0){
            System.out.printf("Inicio do fechamento da conta - Saldo R$ %.2f\n", getSaldo());
            setSaldo(-getSaldo());
            System.out.printf("Fechamento da conta concluída - Saldo R$ %.2f", getSaldo());
            setStatus(false);
        }
        extrato();
    }

    public void depositar(double valor){
        if(getStatus()){
            setSaldo(valor);
            System.out.printf("Você depositou R$ %.2f e em sua conta totalizando R$ %.2f", valor, getSaldo());
        } else {
            System.out.println("Não pode despositar pois a conta está desativada");
        }
        extrato();
    }

    public void sacar(double valor){
        if(getStatus() && getSaldo() > 0 || getSaldo() < valor){
            setSaldo(-valor);
            System.out.printf("Você sacou R$ %.2f da sua conta totalizando R$ %.2f", valor, getSaldo());
        } else {
            System.out.printf("Não é possível sacar R$ .2f, pois em sua conta possui apenas R$ % .2f", valor, getSaldo());
        }
        extrato();
    }

    public void pagarMensalidade(){
        double taxas[] = {12f, 20f};
        double valor = 0f;
        if(getStatus()){
            if(getTipoConta().equals("CC")){
                setSaldo(-taxas[0]);
                valor = taxas[0];
            } else {
                setSaldo(-taxas[1]);
                valor = taxas[1];
            }
            System.out.printf("Taxa de serviço do banco R$ %.2f -> Totalizando R$ %.2f", valor, getSaldo());
        } else {
            System.out.println("Não é possível pagar mensalidade com a conta fechada");
        }
        extrato();
    }
}
