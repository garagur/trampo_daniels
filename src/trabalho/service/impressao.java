package trabalho;

public class impressao implements interface_impressao {

    @Override
    public void imprimir(Funcionario_construtor funcionario, Cargo_holerite holerite) {
        System.out.println("========================================");
        System.out.println("          RECIBO DE PAGAMENTO           ");
        System.out.println("========================================");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo().getNomeCargo());
        System.out.println("Salário Base: R$ " + funcionario.getCargo().getSalarioBruto());
        System.out.println("----------------------------------------");

        System.out.println("ACRÉSCIMOS:");
        if (holerite.getExtratoAcrecimos().isEmpty()) {
            System.out.println("  Nenhum acréscimo no período.");
        } else {
            for (String acrecimo : holerite.getExtratoAcrecimos()) {
                System.out.println("  + " + acrecimo);
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("DESCONTOS:");
        if (holerite.getExtratoDescontos().isEmpty()) {
            System.out.println("  Nenhum desconto no período.");
        } else {
            for (String desconto : holerite.getExtratoDescontos()) {
                System.out.println("  - " + desconto);
            }
        }

        System.out.println("========================================");
        System.out.println("LÍQUIDO A RECEBER: R$ " + holerite.getSalarioLiquido());
        System.out.println("========================================");
    }
}