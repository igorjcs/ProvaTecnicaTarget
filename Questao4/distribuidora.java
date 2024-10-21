package Questao4;

public class distribuidora{
    public static void main(String[] args) {
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        Double valorTotal = SP + RJ + MG + ES + Outros;

        double faturamentoSP = (SP*100)/valorTotal;
        System.out.println("SP representa " + faturamentoSP + " do faturamento mensal.");

        double faturamentoRJ = (RJ*100)/valorTotal;
        System.out.println("RJ representa " + faturamentoRJ + " do faturamento mensal.");

        double faturamentoMG = (MG*100)/valorTotal;
        System.out.println("MG representa " + faturamentoMG + " do faturamento mensal.");

        double faturamentoES = (ES*100)/valorTotal;
        System.out.println("ES representa " + faturamentoES + " do faturamento mensal.");

        double faturamentoOutros = (Outros*100)/valorTotal;
        System.out.println("Outros representa " + faturamentoOutros + " do faturamento mensal.");
    }
}