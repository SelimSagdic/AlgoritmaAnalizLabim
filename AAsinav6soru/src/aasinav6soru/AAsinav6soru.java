/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aasinav6soru;

/**
 *
 * @author user
 */
public class AAsinav6soru {

    public static void sifir(int [] dizi){
        int max=0;
        int startseq=0;
        int endseq=0;
        
        for(int i=0;i<dizi.length;i++){
            int simdiki=0;
            int j=i;
            
            while(j<dizi.length && dizi[j]==0){
                simdiki++;
                
                if(simdiki>max){
                    startseq=i;
                    max=simdiki;
                    endseq=j;
                }
                j++;
            }
            i=j;
        }
        System.out.println(max+" "+startseq+" "+endseq);
    }
    
    public static void main(String[] args) {
        int [] dizi={1,1,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,1};
        sifir(dizi);
    }
}
