public class Squirtle extends Pokemon {
    public Squirtle(int hp, int attackPower, NoFly noFly){
        super("꼬부기", hp, attackPower, noFly);  // 부모클래스의 생성자 호출
        System.out.println("꼬북꼬북!");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 2;
        System.out.println(getName() + " -> " + target.getName() + "에게 '물대포' 사용" + "(데미지: " + damage + ")"); // name is private
        //target.setHp(target.getHp()-damage);;
        target.receiveDamage(damage);
//        System.out.println(name + " -> " + target.getName() + "에게 '물대포' 사용");  // name is protected
        System.out.println(target.getHp() + "남은 hp" + target.getHp());
    }
}