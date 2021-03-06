public class Pattern {
    
    //Right Angle Triangle
    public void pattern1(int n){
        for (int i = 1; i<= n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //Inverted Right Angle Triangle
    public void pattern2(int n){
        for (int i = 1; i<= n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 180 Degree Rotated Right Angle riangle
    public void pattern3(int n){
        for (int i = 1; i<= n; i++){
            for (int k = 0; k<= n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted 180 Degree Rotated Right Angle riangle
    public void pattern4(int n){
        for (int i = 1; i<= n; i++){
            for (int k = 1; k<i; k++){
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // Simple Pyramid
    public void pattern5(int n){
        for (int i = 1; i<= n; i++){
            for (int k = 0; k<= n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Invereted Simple Pyramid
    public void pattern6(int n){
        for (int i = 1; i<= n; i++){
            for (int k = 1; k<= i; k++){
                System.out.print(" ");
            }
            for (int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Hollow Pyramid
    public void pattern7(int n){
        for (int i = 1; i<= n; i++){
            for (int k = 1; k<= n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++){
                
                if(j == 1 || j==i*2-1 || i == n ){
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");                    
                }
            }           
            System.out.println();
        }
    }


    // Diamond Pattern
    public void pattern8(int n){
        for (int i = 1; i<= n; i++){
            for (int k = 1; k<= n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");     
            }  
            System.out.println();
        }
        for (int i = 1; i<= n-1; i++){
            for (int k = 1; k<= i; k++){
                System.out.print(" ");
            }
            for (int j=i; j<=n-1; j++){
                System.out.print("* ");     
            }  
            System.out.println();
        }
    }

    // Hollow Diamond Pattern
    public void pattern9(int n){
        for (int i = 1; i<= n; i++){
            for (int k = 1; k<= n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<= 2*i-1; j++){
                if (j==1 || j == 2*i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
                     
            }  
            System.out.println();
        }
        for (int i = 1; i<= n-1; i++){
            for (int k = 1; k< i; k++){
                System.out.print(" ");
            }
            for (int j=i; j<=(2*n-1)-i; j++){
                if(j==(2*n-1)-i || j==i){
                    System.out.print("* ");   
                } else {
                    System.out.print(" ");   
                }
                  
            }  
            System.out.println();
        }
    }


    // Hollow Inverted Pyramid
    public void pattern10(int n){
        for (int i = 1; i<=n; i++){
            for(int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            for (int j=i; j<=2*n-i;j++){
                if(j == i || j == 2*n-i  || i==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Numbers 1, 21, 312, 4123, 51234
    public void pattern11(int n){                                  //     1
        for (int i=1; i<=n; i++){                                  //     21
            System.out.print(i);                                   //     312
            for (int j = 1; j<i; j++){                             //     4123
                System.out.print(j);;                              //     51234
            }
            System.out.println();
        }
    }


    //print number 3
    public void pattern12(int n){
        for (int i = 1; i<=2*n-1; i++){                           //           *****
            for (int j = 1; j<=n; j++){                           //               *
                if(i == 1 || i == 2*n-1 || i == n || j==n){       //           *****
                    System.out.print("*");                        //               *
                } else {                                          //           *****
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
    }
    

    //Number inline recursive
    public void pattern13(int n){                                 //                 1
        for (int i=1; i<=n; i++){                                 //                212
            for(int k = 1; k<=n-i; k++){                          //               32123
                System.out.print(" ");                            //              4321234
            }                                                     //             543212345
            for (int j = i; j>1; j--){
                System.out.print(j);
            }
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //print number 2 and 5 are same just a little change in inner if Statements,
    // swap j == n to j == 1 accordingly in inner if's
    public void pattern14(int n){
        for (int i = 1; i<=2*n-1; i++){                            //           *****            *****
            for (int j = 1; j<=n; j++){                            //               *            *
                if(i<n){                                           //           *****            *****
                    if(i == 1 || i == 2*n-1 || i == n || j==n){    //           *                    *
                        System.out.print("*");                     //           *****            *****
                    } else {                                          
                        System.out.print(" ");                        
                    }
                } else {
                    if(i == 1 || i == 2*n-1 || i == n || j==1){       
                        System.out.print("*");                        
                    } else {                                      
                        System.out.print(" ");
                    } 
                    }
        }
        System.out.println();
    }
}


//print number 0, 4, 6, 8, 9 all are same, just have to do minor changes in if conditions,
// and a little value change in inner if conditions
    public void pattern15(int n){
        for (int i = 1; i<=2*n-1; i++){                            //           *****            *****
            for (int j = 1; j<=n; j++){                            //           *                *   *
                if(i<n){                                           //           *****            *****
                    if(i == 1 || i == 2*n-1 || i == n || j==1){    //           *   *                *
                        System.out.print("*");                     //           *****            *****
                    } else {                                          
                        System.out.print(" ");                        
                    }
                } else {
                    if(i == 1 || i == 2*n-1 || i == n || j==1 || j==n){       
                        System.out.print("*");                        
                    } else {                                      
                        System.out.print(" ");
                    } 
                    }
        }
        System.out.println();
    }
}

    // Hollow Rectangle or Square shape
    public void pattern16(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n*2; j++){
                if (i == 1 || i == n || j==1 || j==n*2) {
                System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern17(int n){
    /**    
    5 5 5 5 5 5 5 5 5 
    5 4 4 4 4 4 4 4 5
    5 4 3 3 3 3 3 4 5
    5 4 3 2 2 2 3 4 5
    5 4 3 2 1 2 3 4 5
    5 4 3 2 2 2 3 4 5 
    5 4 3 3 3 3 3 4 5
    5 4 4 4 4 4 4 4 5
    5 5 5 5 5 5 5 5 5
    */
   
    int s=2*n-1;
	//Upper half
	for(int i=0;i<(s/2)+1;i++){
		int m=n;
		//Decreasing part
		for(int j=0;j<i;j++){
			System.out.printf("%d ",m);
			m--;
		}
		//Constant part
		for(int k=0;k<s-2*i;k++){
			System.out.printf("%d ",n-i);
		}
		//Increasing part
		m=n-i+1;
		for(int l=0;l<i;l++){
			System.out.printf("%d ",m);
			m++;
		}
		System.out.println();
	}
	//Lower half
	for(int i=s/2-1;i>=0;i--){
		//Decreasing part
		int m=n;
		for(int j=0;j<i;j++){
			System.out.printf("%d ",m);
			m--;
		}
		for(int k=0;k<s-2*i;k++){
			System.out.printf("%d ",n-i);
		}
		m=n-i+1;
		for(int l=0;l<i;l++){
			System.out.printf("%d ",m);
			m++;
		}
		System.out.println();
	}	    
    }

    /**
     Floyd's Triangle Pattern
      1
      2  3
      4  5  6
      7  8  9  10
      11 12 13 14 15
     */
    public void pattern18(int n){
        int a = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }



    public void pattern19(int n){
        for (int i =1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j + " ");
            }
        
            System.out.println();
        }
    }

    public static void main(String arga[]){
        Pattern p = new Pattern();
        p.pattern19(5);
    }
}

