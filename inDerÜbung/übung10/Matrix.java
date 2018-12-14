class Matrix {
  public Matrix(int m, int n) {
    this.value = new double[m][n];
    this.m = m;
    this.n = n;
  }
  public Matrix transposed(){
    Matrix mat = new Matrix(this.n, this.m);
    for (int i = 0; i < this.m; i++)
      for (int j = 0; j < this.n; j++)
        mat.value[j][i] = this.value[i][j];
    return mat;
  }
  public void print(){
    for (int i = 0; i < this.m; i++){
      for (int j = 0; j < this.n; j++)
        System.out.print(this.value[i][j] + " ");
      System.out.println();
    }
  }
  public double[][] value;
  public int m;
  public int n;
} 
