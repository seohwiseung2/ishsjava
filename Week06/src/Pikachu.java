public class Pikachu extends Pokemon  {
    public Pikachu(int hp){
        super("피카츄", hp); //부모클래스 생성자 호출
        System.out.println("피카피카~");
    }

    @Override
    public void attack() {
      //  System.out.println(getName() + "->" + target.getName());
      System.out.println(name + "->" + target.getName() + "");  // name is protected

    }
}
