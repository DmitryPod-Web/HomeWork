package Task_9.Task_1;

public class Main {

        public static void main(String[] args) {


            Animal[] animals = new Animal[3];
            animals[0] = new Cat();
            animals[1] = new Dog();
            animals[2] = new Horse();

            Veterinarian vet = new Veterinarian();

            for (Animal animal : animals) {
                vet.treatAnimal(animal);
            }
        }


}
