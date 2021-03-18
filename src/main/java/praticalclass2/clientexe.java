
package praticalclass2;

public class clientexe {
    
    public static void main(String[]args){
        
        clientPF clientpf1 = new clientPF("Carla","Bairro Cajazeiras","xxx.xxx.xxx-xx");
        clientPJ clientpj1 = new clientPJ("Regina","Bairro Jaguaripe","yyyyyyyyyyyy");
       
        System.out.println(clientpf1.toString());
        System.out.println(clientpj1.toString());
    }
}

