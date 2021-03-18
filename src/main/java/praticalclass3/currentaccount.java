
package praticalclass3;

public class currentaccount { //Esse metódo se chama sobrecarga. 
    private int number,agency; 
    private float limit;
    
        public currentaccount(int number, int agency){
            this.number=number;
            this.agency=agency;
        }
        public currentaccount(int number, int agency, float limit){
            this.number=number;
            this.agency=agency;
            this.limit=limit;
        }
}
