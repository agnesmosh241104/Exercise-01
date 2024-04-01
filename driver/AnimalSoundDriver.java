package driver;

import java.util.Scanner;
import model.*;

public class AnimalSoundDriver{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Animal cat = new Cat("Meow, meow, meow");
        Animal dog = new Dog("Bark, bark, bark");
        Animal cow = new Cow("Moo, moo, moo");
        Animal wolf = new Wolf("Howl, howl, howl");


        System.out.println("Choose type animal you like (1: Cat, 2: Dog, 3:Cow, 4:Wolf): ") ;
        int choice = sc.nextInt();
        AnimalType animalType = null;

        switch(choice){
            case 1:
                animalType = AnimalType.CAT;
                break;
            case 2:
                animalType = AnimalType.DOG;
                break;
            case 3:
                animalType =  AnimalType.COW;
                break;
            case 4:
                animalType = AnimalType.WOLF;
                break;
            default:
                System.out.println("Invalid choice!");
                
        }

      if(animalType == AnimalType.CAT){
          System.out.println("SoundLike : " + makesound(cat));
        }else if(animalType == AnimalType.DOG){
            System.out.println("SoundLike : "+ makesound(dog));
        }else if(animalType == AnimalType.COW){
            System.out.println("SoundLike : " + makesound(cow));
        }else if(animalType == AnimalType.WOLF){
            System.out.println("SoundLike : " + makesound(wolf));
        }
        sc.close();
    }

    private static String makesound(Animal animal){
        return animal.makesound();
    }
}