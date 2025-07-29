public record Endereco (String logradouro, String cep, String complemento, String localidade, String uf){

    @Override
    public String toString() {
        return "Rua: " +logradouro + '\'' +
                ", CEP: " + cep +
                " Complemento: " +complemento +
                " Localidade: " +localidade +
                " UF: " + uf;
    }
}
