abstract class Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    protected Status status;

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.status = Status.REGULAR;
    }

    @Override
    public void receiveDamage(int damage){
            this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            this.status = Status.DEAD;
        }
    }

    @Override
    public boolean isAlive() {
        if (this.health <= 0) {
            this.status = Status.DEAD;
            System.out.println(this.name + " is dead");
            return false;
        } else{
            System.out.println(this.name + " is alive");
            return true;
        }
    }

    @Override
    public int getCurrentHealth(){
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getStatus(){
        return this.status.toString() ;
    }
}