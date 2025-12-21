package com.example.data_structure.referrence_area;

public class Josephus_problem {
    private static int getPresident(int n,int k){
        int result=0;
        for(int i=2; i<=n;i++){
            result = (result+k)%i;
        }
        return result+1;
    }
    public static void main(String[] args) {
        int n=5;
        int k=2;
        System.out.println("Winner: "+getPresident(n,k));
    }
}
