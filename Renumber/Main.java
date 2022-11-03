//Leonardo Preczevski Ramos
public class Main {
    public static void main(String[] args) {
        //Foi utilizado código do site Stack OverFlow
        //E consulta nos documentos de API no oracle
        //Os arquivos localizados na pasta ".bas alterados" estão vazios, assim que o programa for iniciado será feito a alteração do Renumber nos arquivos Prog1 e Prog 2,
        //passados por parâmetro nos métodos abaixo.
        Renumber renumber = new Renumber();
        renumber.loadProgram("Prog1.bas");
        renumber.loadProgram("Prog2.bas");
    }
}
