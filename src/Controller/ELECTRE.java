/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Aris
 */
public class ELECTRE {
    double[][] matriksV;
    double[][] matriksKeputusan;
    double[][] matriksBobot;
    
    public ELECTRE(){
    
    }
    
    public void inisialisasiData(double[][] matriksX){
        int i,j;
        
        matriksKeputusan = new double[matriksX.length][matriksX[0].length];
        
        for(i=0; i<matriksX.length; i++){
            for(j=0; j<matriksX[i].length; j++){
                matriksKeputusan[i][j] = matriksX[i][j];
            }
        }
        
//        System.out.println("Matriks Keputusan : ");
//        for(i=0; i<matriksKeputusan.length; i++){
//            for(j=0; j<matriksKeputusan[i].length; j++){
//                System.out.print(matriksKeputusan[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
    
    public void inisialisasiBobot(int[] bobotKriteria){        
        int i,j;
        
        matriksBobot = new double[bobotKriteria.length][bobotKriteria.length];
        
        for(i=0; i<matriksBobot.length; i++){
            for(j=0; j<matriksBobot.length; j++){
                if(i==j){
                    matriksBobot[i][j] = bobotKriteria[i];
                }
                else{
                    matriksBobot[i][j] = 0.0;
                }
            }
        }
        
//        System.out.println("Matriks bobot : ");
//        for(i=0; i<matriksBobot.length; i++){
//            for(j=0; j<matriksBobot[i].length; j++){
//                System.out.print(matriksBobot[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
    
    public void normalisasiData(){
        int i,j;
        double[] teta;
        double sum;
        
        teta = new double[matriksKeputusan[0].length];
        for(i=0; i<matriksKeputusan[0].length; i++){
            sum = 0;
            for(j=0; j<matriksKeputusan.length; j++){
                sum = sum + Math.pow(matriksKeputusan[j][i], 2.0) ;
            }
            teta[i] = Math.sqrt(sum);
        }
        
        for(i=0; i<matriksKeputusan[0].length; i++){
            for(j=0; j<matriksKeputusan.length; j++){
                matriksKeputusan[j][i] = matriksKeputusan[j][i]/teta[i]; 
            }
        }
        
//        System.out.println("x mutlak : ");
//        for(i=0; i<matriksKeputusan[0].length; i++){
//            System.out.print(teta[i]+" ");
//        }
//        
//        System.out.println("Matriks Normaslisasi : ");
//        for(i=0; i<matriksKeputusan.length; i++){
//            for(j=0; j<matriksKeputusan[i].length; j++){
//                System.out.print(matriksKeputusan[i][j]+" "); 
//            }
//            System.out.println();
//        }
    }
    
    public void pembobotanMatriksNormalisasi(){
        int i,j,k;
        matriksV = new double[matriksKeputusan.length][matriksKeputusan[0].length];
        
        for(i=0; i<matriksKeputusan.length; i++){
            for(j=0; j<matriksKeputusan[i].length; j++){
                matriksV[i][j] = 0.0;
            }
        }
        
        for(i=0; i<matriksKeputusan.length; i++){
            for(j=0; j<matriksKeputusan[i].length; j++){
                for(k=0; k<matriksKeputusan[i].length; k++){
                    matriksV[i][j] = matriksV[i][j] + matriksKeputusan[i][k]*matriksBobot[k][j];
                }
            }
        }
    }
    
    public double[][] getMatriksV(){
        return matriksV;
    }
}
