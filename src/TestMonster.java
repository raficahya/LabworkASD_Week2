public class TestMonster {
    public static void main(String[] args) {
        //create instances of three monsters (m1,m2,m3) and initialize their fields
        Monster m1 = new Monster();
		m1.name = "Arthos";
        m1.hp = 22000;
        m1.mp = 10000;
        Monster m2 = new Monster();
        m2.name = "Porthos";
        m2.hp = 18000;
        m2.mp = 15000;
        Monster m3 = new Monster();
        m3.name = "Aramis";
        m3.hp = 15000;
        m3.mp = 80000;

        //declare an array monsters with type Monster and size = 3
        Monster[] monsters = new Monster[3];

        //initialize the array with m1,m2,m3
        monsters[0] = m1;
        monsters[1] = m2;
        //monsters[2] = m3;

        //print all monsters in the array
        for(int i = 0; i < monsters.length; i++) {
            System.out.println("A monster has appeared! " + monsters[i].name + " HP:" + monsters[i].hp + " MP:" + monsters[i].mp);
        }
    }
}