public class character {
    String name, specialAtk;
    int health, mana, defense, specialAtkDmg;
    char advantage;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getSpecialAtk(){
        return specialAtk;
    }
    public void setSpecialAtk(String newAtk){
        name = newAtk;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int hp){
        health = hp;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int nManaVal){
        mana = nManaVal;
    }
    public int getDefense(){
        return defense;
    }
    public void setDefense(int nDefence){
        defense = nDefence;
    }
    public int getSpecialAtkDmg(){
        return specialAtkDmg;
    }
    public void setSpecialAtkDmg(int nAtk){
        specialAtkDmg = nAtk;
    }
    public char getAdvantage(){
        return advantage;
    }
    public void setAdvantage(char nAdvantage){
        advantage = nAdvantage;
    }
}
