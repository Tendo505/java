import javax.swing.JOptionPane;

public class APC1Q1{
     public static void main (String[]args){

          int[][] TwoArray = getArray();
          DisplayArray(TwoArray);
          TOTALAVERAGE(TwoArray);
          MAXMIN(TwoArray);
          POSITIVENEGATIVE(TwoArray);
          ABOVE80BELOW20(TwoArray);

         }

         public static int[][] getArray(){
           int[][] NLIST = new int[3][4];
           for(int i=0;i<NLIST.length;i++)
           for(int j=0;j<NLIST[i].length;j++)
           {
   String num=JOptionPane.showInputDialog(null," Enter twelve number: ");
                          NLIST[i][j]=Integer.parseInt(num);
                  }
                  return NLIST;
         }

         public static void DisplayArray(int[][]M)
         {
                 for(int i=0;i<M.length;i++)
                 { for(int j=0;j<M[i].length;j++)
                  {
                          System.out.print(M[i][j]);

                  }
                  System.out.println("");
             }


    }

    //Process for MAX
    public static void MAXMIN(int[][]A)
    {
    	int Max = A[0][0];
    	for (int i=0;i<A.length;i++){
    	for (int j=0;j<A[i].length;j++)
    	 {
    		if (A[i][j]>Max)
    			Max=A[i][j];
    	}
    	}
    	 System.out.println("Highest value: "+Max);
    	//Process for MIN
         int Min = A[0][0];
    	for (int i=0;i<A.length;i++){
    	for (int j=0;j<A[i].length;j++)
    	 {
    		if (A[i][j]<Min)
    			Min=A[i][j];
    	}
    	}
    	 System.out.println("Lowest value: "+Min);
    }

     //Process for TOTAL
      public static void TOTALAVERAGE(int[][]B)
         {
         	     int total=0;
                 for(int i=0;i<B.length;i++)
                 { for(int j=0;j<B[i].length;j++)
                  {
                          total+=B[i][j];

                  }
             }
                 System.out.println(" Total value: "+total);
             //Process for AVERAGE

         double Average = total / 12.0;

         System.out.println("Average value: "+Average);

    }
    	//Process for POSITIVE
    	public static void POSITIVENEGATIVE(int[][]C)
    {
    	int Positive = 0;
    	for (int i=0;i<C.length;i++){
    	for (int j=0;j<C[i].length;j++)
    	 {
    		if (C[i][j]>0)
    			Positive++;
    	}
    	}
    	 System.out.println("Positive value: "+Positive);
    	    //Process for NEGATIVE
    		int Negative = 0;
    	for (int i=0;i<C.length;i++){
    	for (int j=0;j<C[i].length;j++)
    	 {
    		if (C[i][j]<0)
    			Negative++;
    	}
    	}
    	 System.out.println("Negative value: "+Negative);
     }

     //Process for Above 80
     public static void ABOVE80BELOW20(int[][]D)
     {

    	int Above80 = 0;
    	for (int i=0;i<D.length;i++){
    	for (int j=0;j<D[i].length;j++)
    	 {
    		if (D[i][j]>80)
    			Above80++;
    	 }

     }
     System.out.println("Above 80 value: "+Above80);

       //Process for Below 20
    	int Below20 = 0;
    	for (int i=0;i<D.length;i++){
    	for (int j=0;j<D[i].length;j++)
    	 {
    		if (D[i][j]<20)
    			Below20++;
    	 }
     }
     System.out.println("Below 20 value: "+Below20);
     }

}

