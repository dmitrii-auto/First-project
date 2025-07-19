package HomeWork_5.task_5;

public class Farm {

    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void manage(){
        pet.performFunction();
        pet.satisfyNeed();
    }
}
