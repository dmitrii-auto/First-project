package HomeWork_5.task_2;

public class PetOwner {
    private Pet pet;

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void interact(){
        pet.eat();
        pet.move();
    }
}
