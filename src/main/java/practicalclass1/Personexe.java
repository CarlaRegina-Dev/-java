
package practicalclass1;

public class Personexe {
    
    public static void main(String[] args){ 
        
        Person person1=new Person(1,"Karla");
        Person person2=new Person(2,"Regina");    
        
        System.out.println("O nome do objeto Pessoa 1 é: "+person1.getName());
        
        person1.setName("Carla");
        
        System.out.println("O nome do objeto Pessoa 1 é: "+person1.getName());
    }
}

