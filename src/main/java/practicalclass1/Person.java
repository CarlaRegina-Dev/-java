
package practicalclass1;

public class Person {
    
    private int code; //Aqui eu estou privando o atributo, estou utilizando emcapsulamento
    private String name;
    
        public Person (int code,String name){ //metódo construtor
            this.code=code;
            this.name=name;
        }
        public int getCode(){ //Com o metódo Get eu consigo acessar o atributo de uma classe. 
            return code; 
        }
        public void setCode(int code){
            this.code=code;
        }
        public String getName(){ 
            return name; 
        }
        public void setName(String name){ //Utilizando esse metódo eu consigo modificar o valor de um atributo no valor da classe. 
            this.name=name;
        }
}
