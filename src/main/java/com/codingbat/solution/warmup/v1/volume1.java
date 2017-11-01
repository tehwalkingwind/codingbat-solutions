package com.codingbat.solution.warmup.v1;

public class volume1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (vacation||!weekday);
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile==bSmile;
    }

    public int sumDouble(int a, int b) {
        if (a==b) return 2*(a+b);
        else return a+b;
    }

    public int diff21(int n) {
        if (n>21) return 2*(n-21);  
        else return 21-n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking&&(hour<7||hour>20));
    }

    public boolean makes10(int a, int b) {
        return ((a==10||b==10)||(a+b==10));
    }

    public boolean nearHundred(int n) {
        return (Math.abs(100-n)<11)||(Math.abs(200-n)<11);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if  (negative)  return a<0&&b<0;
        else            return a*b<0;
    }

    public String notString(String str) {
        if (str.length()>=3 && str.substring(0,3).equals("not")) return str;
        return "not "+str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1,str.length());
    }

    public String frontBack(String str) {
        if (str.length()>1) {
            String mid = str.substring(1,str.length()-1);
            return str.charAt(str.length()-1)+mid+str.charAt(0);
        } else return str;
    }

    public String front3(String str) {
        if (str.length()>3) str = str.substring(0,3);
        return str+str+str;
    }

    public String backAround(String str) {
        char ch = str.charAt(str.length()-1);
        return ch+str+ch;
    }

    public boolean or35(int n) {
        return ((n%3==0)||(n%5==0));
    }

    public String front22(String str) {
        if (str.length()>1) {
            String sub = str.substring(0,2);
            return sub+str+sub;
        } else return str+str+str;
    }

    public boolean startHi(String str) {
        if (str.length()>1) return (str.substring(0,2).equals("hi"));
        else return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        return ((temp1>100&&temp2<0)||(temp2>100&&temp1<0));
    }

    public boolean in1020(int a, int b) {
        return ((a>9&&a<21)||(b>9&&b<21));
    }

    public boolean hasTeen(int a, int b, int c) {
        return (20>a&&a>12)||(20>b&&b>12)||(20>c&&c>12);
    }

    public boolean loneTeen(int a, int b) {
        return (20>a&&a>12)^(20>b&&b>12);
    }

    public String delDel(String str) {
        if (str.length()>3) {
            if (str.substring(1,4).equals("del")) return str.substring(0,1)+str.substring(4,str.length());
        }
        return str;
    }

    public boolean mixStart(String str) {
        return (str.length()>2&&str.substring(1,3).equals("ix"));
    }

    public String startOz(String str) {
        String ret = "";
        if (str.length()>0&&str.charAt(0)=='o') ret += "o";
        if (str.length()>1&&str.charAt(1)=='z') ret += "z";
        return ret;
    }

    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }

    public int close10(int a, int b) {
        int aabs = Math.abs(a-10);
        int babs = Math.abs(b-10);
        if (aabs==babs) return 0;
        else if (Math.max(aabs,babs)==aabs) return b;
        else return a;
    }

    public boolean in3050(int a, int b) {
        return ((a>29&&a<41&&b>29&&b<41)||(a>39&&a<51&&b>39&&b<51));
    }

    public int max1020(int a, int b) {
        if (a>9&&a<21) {
            if (b>9&&b<21) return Math.max(a,b);
            else return a;
        } else if (b>9&&b<21) return b;
        else return 0;
    }

    public boolean stringE(String str) {
        int j = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') j+=1;
        }
        return (j>0&&j<4);
    }

    public boolean lastDigit(int a, int b) {
        return (a%10==b%10);
    }

    public String endUp(String str) {
        int l = str.length();
        String ret = "";
        if (l<4) ret += str.toUpperCase();
        else {
            ret += str.substring(0,l-3);
            ret += str.substring(l-3,l).toUpperCase();
        }
        return ret;
    }

    public String everyNth(String str, int n) {
        String ret="";
        for (int i=0;i<str.length();i+=n) {
            ret = str + str.charAt(i);
        }
        return ret;
    }
}
