/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicacasa;

/**
 *
 * @author Admin
 */
public class tomaValores {
    private int A;
    private  int B;
    private  int C;
    private  int D;
    public tomaValores(int pA,int pB,int pC,int pD){
        this.A=pA;
        this.B=pB;
        this.C=pC;
        this.D=pD;
    }
    public int toma1(int B, int C){
        int x=0;
        x=(this.B=this.C);
        return x;
    }
        public int toma2(int C, int A){
            int y=0;
            y=(this.C=this.A);
            return y;
        }
    public int toma3(int A, int D){
        int r =0;
        r= (this.A=this.D);
        return r;
        
    }
    public int toma4(int D, int B){
        int z=0;
        z=(this.D=this.B);
        return z;
    }
}
