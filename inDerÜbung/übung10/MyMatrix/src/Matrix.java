class Matrix {
    public Matrix(int m, int n) {
        this.value = new double[m][n];
        this.m = m;
        this.n = n;
    }
    public Matrix transposed() {
        Matrix mat = new Matrix(this.n, this.m);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                mat.value[j][i] = this.value[i][j];
            }
        }
        return mat;
    }
    public void print() {
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.print(this.value[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix mult(Matrix b) {
        Matrix c = new Matrix(this.m, b.n);
        for (int i = 0; i < this.value.length; i++) {
            for (int j = 0; j < b.value[i].length; j++) {
                for (int k = 0; k < b.value[i].length; k++) {
                    c.value[i][j] += this.value[i][k] * b.value[k][j];
                }
            }
        }
        return c;
    }
    
    public double[][] value;
    public int m;
    public int n;
}
