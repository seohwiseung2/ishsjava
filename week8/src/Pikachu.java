public class Pikachu extends Pokemon{
    public Pikachu(int hp, int attackPower, NoFly noFly){
        super("피카츄", hp, attackPower, noFly);  // 부모클래스의 생성자 호출
        System.out.println("피카피카~");
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 5;
        System.out.println(getName() + " -> " + target.getName() + "에게 '전기충격' 사용! (데미지: " + damage + ")"); // name is private
        //target.setHp(target.getHp()-damage);;
        target.receiveDamage(damage);
//        System.out.println(name + " -> " + target.getName() + "에게 '전기충격' 사용");  // name is protected
        System.out.println(target.getHp() + "남은 hp" + target.getHp());

    }
}