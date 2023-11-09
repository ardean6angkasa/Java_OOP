class Player01{
    String name;
    double health;
    int level;

    Weapon1 weapon;
    Armor1 armor;

    Player01(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player01 opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    void defence(double attackPower){

        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    void equipWeapon(Weapon1 weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor1 armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}


class Weapon1{
    double attackPower;
    String name;

    Weapon1(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}


class Armor1{
    double defencePower;
    String name;

    Armor1(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}
public class palyer1_vs_player2_v2 {
    public static void main(String[] args) {


        Player01 player1 = new Player01("ucup",100);
        Player01 player2 = new Player01("otong",50);

        Weapon1 pedang = new Weapon1("pedang",15);
        Weapon1 ketapel = new Weapon1("ketapel",1);


        Armor1 bajuBesi = new Armor1("baju besi",10);
        Armor1 kaos = new Armor1("kaos",0);

        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();

        System.out.println("\nPERTEMPURAAAN");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
