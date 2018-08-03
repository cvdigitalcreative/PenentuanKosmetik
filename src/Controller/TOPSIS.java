/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Aris
 */
public class TOPSIS {
    double[][] matriksV;
    double[] matriksAplus;
    double[] matriksAmin;
    double[] matriksDplus;
    double[] matriksDmin;
    double[] matriksVAlt;
    
    public TOPSIS(){
    
    }
    
    public void inisialisasiMatriksBobotTernomalisasi(double[][] matriksV){
        int i,j;
        
        this.matriksV = new double[matriksV.length][matriksV[0].length];
        
        for(i=0; i<matriksV.length; i++){
            for(j=0; j<matriksV[i].length; j++){
                this.matriksV[i][j] = matriksV[i][j];
            }
        }
    }
    
    public void setSolusiIdealPositive(){
        int i,j;
        double max, min;
        
        matriksAplus = new double[matriksV[0].length];
        
        for(i=0; i<matriksV[0].length; i++){
            max = 0.0;
            min = 1000.0;
            
            if(i < 4){
                for(j=0; j<matriksV.length; j++){
                    if(max < matriksV[j][i]){
                        max = matriksV[j][i];
                    }
                }
                
                matriksAplus[i] = max;
            }
            else{
                for(j=0; j<matriksV.length; j++){
                    if(min > matriksV[j][i]){
                        min = matriksV[j][i];
                    }
                }
                
                matriksAplus[i] = min;
            }
        }
        
//        System.out.println("Matriks A plus : ");
//        for(i=0; i<matriksAplus.length; i++){
//            System.out.print(matriksAplus[i]+" ");
//        }
//        System.out.println();
    }
    
    public void setSolusiIdealNegative(){
        int i,j;
        double max, min;
        
        matriksAmin = new double[matriksV[0].length];
        
        for(i=0; i<matriksV[0].length; i++){
            max = 0.0;
            min = 1000.0;
            
            if(i < 4){
                for(j=0; j<matriksV.length; j++){
                    if(min > matriksV[j][i]){
                        min = matriksV[j][i];
                    }
                }
                
                matriksAmin[i] = min;
            }
            else{
                for(j=0; j<matriksV.length; j++){
                    if(max < matriksV[j][i]){
                        max = matriksV[j][i];
                    }
                }
                
                matriksAmin[i] = max;
            }
        }
        
//        System.out.println("Matriks A min : ");
//        for(i=0; i<matriksAmin.length; i++){
//            System.out.print(matriksAmin[i]+" ");
//        }
//        System.out.println();
    }
    
    public void setJarakAlternatifPositive(){
        int i,j;
        double sum;
        
        matriksDplus = new double[matriksV.length];
        
        for(i=0; i<matriksV.length; i++){
            sum = 0;
            for(j=0; j<matriksV[i].length; j++){
                sum = sum+Math.pow((matriksV[i][j] - matriksAplus[j]), 2.0);
            }
            matriksDplus[i] = Math.sqrt(sum);
        }
    }
    
    public void setJarakAlternatifNegative(){
        int i,j;
        double sum;
        
        matriksDmin = new double[matriksV.length];
        
        for(i=0; i<matriksV.length; i++){
            sum = 0;
            for(j=0; j<matriksV[i].length; j++){
                sum = sum+Math.pow((matriksV[i][j] - matriksAmin[j]), 2.0);
            }
            matriksDmin[i] = Math.sqrt(sum);
        }
    }
    
    public int setNilaiPreferensiAlternative(){
        int i, altValue;
        double max;
        matriksVAlt  = new double[matriksV.length];
        
        for(i=0; i<matriksV.length; i++){
            matriksVAlt[i] = matriksDmin[i]/(matriksDmin[i]+matriksDplus[i]);
        }
        
        max = 0.0;
        altValue = -1;
        for(i=0; i<matriksV.length; i++){
            if(max < matriksVAlt[i]){
                max = matriksVAlt[i];
                altValue = i;
            }
        }
        
        return altValue;
    }
    
    public ArrayList<ArrayList> getNilaiPreferensiAlternativeRanking(){
        int i,j,k, isRanked;
        ArrayList<Integer> AltRanking;
        ArrayList<Double> AltValRanking;
        ArrayList<ArrayList> AltInfo;
        double[] altValue;
        int[] altRank;
        double temp, tempValue;
        
        AltRanking = new ArrayList<>();
        AltValRanking = new ArrayList<>();
        AltInfo = new ArrayList<>();
        
        for(i=0; i<matriksVAlt.length; i++){
             AltRanking.add(i);
//             System.out.println("value ke-"+(i+1)+" : "+matriksVAlt[i]);
        }
//        System.out.println();
        
        for(i=0; i<matriksVAlt.length; i++){
            temp = matriksVAlt[i];
            tempValue = i;

            for(j=i; j<matriksVAlt.length; j++){
                if(temp < matriksVAlt[j]){
                    temp = matriksVAlt[j];
                    tempValue = j;
                }
            }
            
            matriksVAlt[(int)tempValue] = matriksVAlt[i];
            matriksVAlt[i] = temp;

            int simpan = AltRanking.get(i);
            AltRanking.set(i, AltRanking.get((int)tempValue));
            AltRanking.set((int)tempValue, simpan);
            
            AltValRanking.add(temp);
        }
        
        altValue = new double[AltValRanking.size()];
        altRank = new int[AltRanking.size()];
        
        for(i=0; i<AltRanking.size(); i++){
            altValue[i] = AltValRanking.get(i);
            altRank[i] = AltRanking.get(i);
        }
        
        AltRanking = new ArrayList<>();
        AltValRanking = new ArrayList<>();
        
        for(i=0; i<altValue.length; i++){
            AltValRanking.add(altValue[i]);
            AltRanking.add(altRank[i]);
        }
        
        AltInfo.add(AltValRanking);
        AltInfo.add(AltRanking);
        
        return AltInfo;
    }
}
