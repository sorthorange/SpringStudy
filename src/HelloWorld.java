public class HelloWorld {

    private String name;

    public HelloWorld(){
        System.out.println("construct");
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

}
