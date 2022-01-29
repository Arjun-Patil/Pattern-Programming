public class DiamondPattern{
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<n;i++){
      for(int j=i+1; j<=n;j++){
        System.out.print("  ");
      }
      for(int k=1;k<i;k++){
        System.out.print("* ");
      }
      for(int l=1; l<=i; l++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int m=1;m<=n;m++){
      for(int o=2; o<=m;o++){
        System.out.print("  ");
      }
      for(int p=m;p<n;p++){
        System.out.print("* ");
      }
      for(int q=m; q<=n; q++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

/*Output:
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/
