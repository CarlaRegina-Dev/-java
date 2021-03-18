
package praticalclass2;

public class clientPJ extends client{ //com esse metódo estou dizendo que minhas classe herda os atributos da classe client.
    
    private String cnpj;
        
        public clientPJ(String name, String address, String cnpj){
            super (name,address);//Estou utilizando os atributos do metódo pai. 
            this.cnpj=cnpj;
        }
        public String getCNPJ(String cnpj){
            return cnpj;
        }
        public void setCNPJ(String cnpj){      
        }
        public String toString(){
            return super.toString()+ "CNPJ: "+cnpj;
        }
}
