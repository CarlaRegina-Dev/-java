
package praticalclass2;

public class clientPF extends client {
    
    private String cpf;
    
        public clientPF(String name, String address,String cpf){
            super (name,address);
            this.cpf=cpf;
        }
        public String getCPF(){
            return cpf;
        }
        public void setCPF(String cpf){
            this.cpf=cpf;               
        }
        public String toString(){
            return super.toString()+ "CPF: "+cpf;
        }
}
