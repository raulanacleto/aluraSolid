package exemplo1;

public enum Cargo {
    DESENVOLVEDOR(new dezOuVintePorCento()),
    DBA(new quinzeOuVinteECincoPorCento()),
    TESTER(new quinzeOuVinteECincoPorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
