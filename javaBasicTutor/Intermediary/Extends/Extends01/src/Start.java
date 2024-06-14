public class Start {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAlimenta("Todos os animais se alimentam!");
        animal.setLocomove("Todos os animais se locomovem!");

        //É possivel acessar os metodos pai através da classe filha
        Dog dog = new Dog();
        dog.setAlimenta("Cachorro come ração");
        dog.setLocomove("Cachorro usa 4 patas!");
        dog.setLatido("O Cachorro faz au au");

        //Não é possivel acessar a classe filha apenas com o acesso ao pai
        Animal pug = new Animal();
        pug.setAlimenta("Cachorro come ração!");
        pug.setLocomove("Cachorro usa 4 patas!");
    }
}
