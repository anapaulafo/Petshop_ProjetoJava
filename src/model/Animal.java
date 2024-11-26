package model;

public class Animal {
    private int idAnimal;
    private String nomeAnimal;
    private String especie;

    public Animal(int idAnimal, String nomeAnimal, String especie) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
    }

    public Animal() {
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", nomeAnimal='" + nomeAnimal + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

}
