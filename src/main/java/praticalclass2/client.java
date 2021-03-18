
package praticalclass2;

public class client {
    
    private String name;
    private String address;
    
        public client(String name, String address){
            this.name=name;
            this.address=address;
        }
        public String getName(){
            return name;
        }
        public String getAddress(){
            return address;
        }
        public void setName(String name){        
        }
        public void setAddress(String address){       
        }
        public String toString(){ //metódo do polimorfismo.
            return "Nome: "+name+ "Endereço: "+address;
        }
}
