package exemplo1;

public class quinzeOuVinteECincoPorCento implements RegraDeCalculo {

    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
