package Tamagotchi;

public class Tamagotchi {
 
    private int hunger;  
    private int energy; 
    private int mood;   

 
    public Tamagotchi() {
        hunger = 4; 
        energy = 4; 
        mood = 4;   
    }

    public String play() {
        hunger++; 
        mood++;   
        energy--;
        return getState(); 
    }

 
    public String eat() {
        hunger -= 2; 
        energy--;   
        if (hunger < 0) {
            hunger = 0; 
        }
        return getState(); 
    }

  
    public String sleep() {
        energy += 2; 
        return "(-_-) zZZ"; 
    }


    private String getState() {
        if (mood > 8) {
            return ":-)"; 
        } else if (energy < 3 && energy > 0) {
            return "(-_-)";
        } else if (energy == 0) {
            return "(-_-) zZZ"; 
        } else if (mood < 2) {
            return "ఠ_ఠ"; 
        } else {
            return ":-|"; 
        }
    }

  
    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMood() {
        return mood;
    }
}
