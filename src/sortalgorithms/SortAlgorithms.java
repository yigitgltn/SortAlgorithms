

package sortalgorithms;

import java.util.Random;

public class SortAlgorithms {

    public static void bubbleSort(int[] dizi){
     int temp;
     int i, j;
     int comp = 0;
     int swap = 0;
 
     for (i=1; i<dizi.length ;i++)
     {
         for (j=0; j<dizi.length -i; j++)
         {
             comp = comp + 1;
             if(dizi[j] > dizi[j+1])
             {
                 swap=swap+1;
                        temp = dizi [j];
                        dizi [j] = dizi [j+1];
                        dizi [j+1] = temp;
                        
             }
         }
     }
        
        System.out.println("**********Bubble Sort***************");
     
        System.out.println((dizi.length )+" eleman icin swap sayisi:" +swap+""
                + " comp sayisi :" +comp ); 
       
    }
    
    public static void selectionSort(int[] dizi){

     int comp = 0;
     int swap = 0;
     
        
        for (int i = 0; i < dizi.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < dizi.length; j++){
                comp = comp + 1;
                if (dizi[j] < dizi[index])
                    index = j;
                swap=swap+1;
            int smallerNumber = dizi[index]; 
            dizi[index] = dizi[i];
            dizi[i] = smallerNumber;
        }
                   
      
    }
         System.out.println((dizi.length )+" eleman icin swap sayisi:" +swap+""
                + " comp sayisi :" +comp);
   }
  
    public static void main(String[] args) {
       
        Random rnd = new Random();
        int dizi[]=new int[10];
        for(int i=0;i<10;i++){
            dizi[i] = rnd.nextInt();
        }
        int dizi1[]=new int[50];
        for(int j=0;j<50;j++){
            dizi1[j] = rnd.nextInt();
        }
        int dizi2[]=new int[100];
        for(int k=0;k<100;k++){
            dizi2[k] = rnd.nextInt();
        }        
        int dizi3[]=new int[200];
        for(int l=0;l<200;l++){
            dizi3[l] = rnd.nextInt();
        }   
        int dizi4[]=new int[500];
        for(int m=0;m<500;m++){
            dizi4[m] = rnd.nextInt();
        }        
        
        bubbleSort(dizi);
        bubbleSort(dizi1);
       bubbleSort(dizi2);
       bubbleSort(dizi3);
        bubbleSort(dizi4);
        

        selectionSort(dizi);
        selectionSort(dizi1);
        selectionSort(dizi2);
       selectionSort(dizi3);
        selectionSort(dizi4);
        
        
    }
    
}
