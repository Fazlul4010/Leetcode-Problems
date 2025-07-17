class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix=new int[n][n];
        int rs=0, re=n-1;
        int cls=0, cle=n-1;
        int x=1;

      while(cls<=cle && rs<=re){
            for(int i=cls;i<=cle;i++,x++){
                matrix[rs][i]=x;
            }
            rs++;

            for(int i=rs;i<=re;i++,x++){
            matrix[i][cle]=x;
            }
            cle--;

            if(rs<=re){
                for(int i=cle;i>=cls;i--,x++){
                    matrix[re][i]=x;
                }
                re--;

                if(cls<=cle){
                    for(int i=re;i>=rs;i--,x++){
                        matrix[i][cls]=x;
                    }
                    cls++;
                }
            }
        }
            return matrix;
        }
    }
  