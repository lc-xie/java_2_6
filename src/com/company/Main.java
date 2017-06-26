package com.company;

public class Main {
    private static int LABLE=0;
    private static boolean IFFOUND=true;

    public static void main(String[] args) {
	    int[] a={10,2,8,22,16,4,10,6,14,20};
        int[] b={0,0,0,0,0,0,0,0,0,0};
	    while (IFFOUND){
	        if(a[0]==0){
	            exchange(a,b);
            } else {
                exchange(b,a);
            }
        }

    }

    public static boolean ifEqual(int a[],int n){
        for(int i=1;i<n;i++){
            if (a[0]!=a[i]) return false;
        }
        return true;
    }
    public static void clean(int a[],int n){
        for(int i=0;i<n;i++){
           a[i]=0;
        }
    }
    public static void print(int a[]){
        for (int i=0;i<10;i++)System.out.print(a[i]+"  ");
    }
    public static void exchange(int a[],int b[]){
        a[0]=(b[0]+b[9])/2;
        if(a[0]%2!=0)a[0]+=1;
        for(int i=1;i<10;i++){
            a[i]=(b[i]+b[i-1])/2;
            if(a[i]%2!=0)a[i]+=1;
        }
        LABLE++;
        System.out.print("di "+LABLE+"ci:");
        print(a);
        System.out.println();

        if (ifEqual(a,10)){
            System.out.print("after "+LABLE+" exchange,we got the output:"+a[0]);
            IFFOUND=false;
        }else {
            clean(b,10);
        }
    }
}
