public class Animal {
    private String nome;
    private String raca;


    //Constutor
    /*Construtores ficam explicitos no diagrama*/
    /*Objeto animal pode ser criada sem um nome*/
    public Animal() {

    }
    /*Objeto animal tem que ser criada com um nome*/
    public Animal(String nome){
        this.nome = nome;
    }

    //metodo Publico
    /**Principio de encapsulamento
     * define que se tenha acesso publico
     * no diagrama fica implicito, quando o atributo é privado,
     * que sejam criados o método public*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String caminha(){
        return "Caminha...";
    }
}
