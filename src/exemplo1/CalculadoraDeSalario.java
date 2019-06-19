package exemplo1;

public class CalculadoraDeSalario {


    public double calcula(Funcionario funcionario) {

        //return funcionario.getCargo().getRegra().calcula(funcionario);
        // ou:
        return funcionario.calculaSalario();

    }

}